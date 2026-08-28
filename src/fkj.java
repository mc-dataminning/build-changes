import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FreeType;

public record fkj(alf c, float d, float e, fkj.a f, String g) implements fkg {
   private static final Codec<String> h = Codec.withAlternative(Codec.STRING, Codec.STRING.listOf(), $$0 -> String.join("", $$0));
   public static final MapCodec<fkj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alf.a.fieldOf("file").forGetter(fkj::c),
               Codec.FLOAT.optionalFieldOf("size", 11.0F).forGetter(fkj::d),
               Codec.FLOAT.optionalFieldOf("oversample", 1.0F).forGetter(fkj::e),
               fkj.a.b.optionalFieldOf("shift", fkj.a.a).forGetter(fkj::f),
               h.optionalFieldOf("skip", "").forGetter(fkj::g)
            )
            .apply($$0, fkj::new)
   );

   @Override
   public fkh a() {
      return fkh.b;
   }

   @Override
   public Either<fkg.b, fkg.c> b() {
      return Either.left(this::a);
   }

   private eyb a(aup $$0) throws IOException {
      FT_Face $$1 = null;
      ByteBuffer $$2 = null;

      try {
         eye var20;
         try (InputStream $$3 = $$0.open(this.c.d("font/"))) {
            $$2 = TextureUtil.readResource($$3);
            $$2.flip();
            synchronized (fkf.a) {
               MemoryStack $$4 = MemoryStack.stackPush();

               try {
                  PointerBuffer $$5 = $$4.mallocPointer(1);
                  fkf.a(FreeType.FT_New_Memory_Face(fkf.a(), $$2, 0L, $$5), "Initializing font face");
                  $$1 = FT_Face.create($$5.get());
               } catch (Throwable var14) {
                  if ($$4 != null) {
                     try {
                        $$4.close();
                     } catch (Throwable var12) {
                        var14.addSuppressed(var12);
                     }
                  }

                  throw var14;
               }

               if ($$4 != null) {
                  $$4.close();
               }

               String $$6 = FreeType.FT_Get_Font_Format($$1);
               if (!"TrueType".equals($$6)) {
                  throw new IOException("Font is not in TTF format, was " + $$6);
               }

               fkf.a(FreeType.FT_Select_Charmap($$1, FreeType.FT_ENCODING_UNICODE), "Find unicode charmap");
               var20 = new eye($$2, $$1, this.d, this.e, this.f.c, this.f.d, this.g);
            }
         }

         return var20;
      } catch (Exception var17) {
         synchronized (fkf.a) {
            if ($$1 != null) {
               FreeType.FT_Done_Face($$1);
            }
         }

         MemoryUtil.memFree($$2);
         throw var17;
      }
   }

   public static record a(float c, float d) {
      public static final fkj.a a = new fkj.a(0.0F, 0.0F);
      public static final Codec<fkj.a> b = Codec.floatRange(-512.0F, 512.0F)
         .listOf()
         .comapFlatMap($$0 -> ac.a($$0, 2).map($$0x -> new fkj.a((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.c, $$0.d));

      public float a() {
         return this.c;
      }

      public float b() {
         return this.d;
      }
   }
}
