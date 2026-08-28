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

public record fnu(ale c, float d, float e, fnu.a f, String g) implements fnr {
   private static final Codec<String> h = Codec.withAlternative(Codec.STRING, Codec.STRING.listOf(), $$0 -> String.join("", $$0));
   public static final MapCodec<fnu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ale.a.fieldOf("file").forGetter(fnu::c),
               Codec.FLOAT.optionalFieldOf("size", 11.0F).forGetter(fnu::d),
               Codec.FLOAT.optionalFieldOf("oversample", 1.0F).forGetter(fnu::e),
               fnu.a.b.optionalFieldOf("shift", fnu.a.a).forGetter(fnu::f),
               h.optionalFieldOf("skip", "").forGetter(fnu::g)
            )
            .apply($$0, fnu::new)
   );

   @Override
   public fns a() {
      return fns.b;
   }

   @Override
   public Either<fnr.b, fnr.c> b() {
      return Either.left(this::a);
   }

   private fbh a(auv $$0) throws IOException {
      FT_Face $$1 = null;
      ByteBuffer $$2 = null;

      try {
         fbk var20;
         try (InputStream $$3 = $$0.open(this.c.f("font/"))) {
            $$2 = TextureUtil.readResource($$3);
            $$2.flip();
            synchronized (fnq.a) {
               MemoryStack $$4 = MemoryStack.stackPush();

               try {
                  PointerBuffer $$5 = $$4.mallocPointer(1);
                  fnq.a(FreeType.FT_New_Memory_Face(fnq.a(), $$2, 0L, $$5), "Initializing font face");
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

               fnq.a(FreeType.FT_Select_Charmap($$1, FreeType.FT_ENCODING_UNICODE), "Find unicode charmap");
               var20 = new fbk($$2, $$1, this.d, this.e, this.f.c, this.f.d, this.g);
            }
         }

         return var20;
      } catch (Exception var17) {
         synchronized (fnq.a) {
            if ($$1 != null) {
               FreeType.FT_Done_Face($$1);
            }
         }

         MemoryUtil.memFree($$2);
         throw var17;
      }
   }

   public static record a(float c, float d) {
      public static final fnu.a a = new fnu.a(0.0F, 0.0F);
      public static final Codec<fnu.a> b = Codec.floatRange(-512.0F, 512.0F)
         .listOf()
         .comapFlatMap($$0 -> ad.a($$0, 2).map($$0x -> new fnu.a((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.c, $$0.d));

      public float a() {
         return this.c;
      }

      public float b() {
         return this.d;
      }
   }
}
