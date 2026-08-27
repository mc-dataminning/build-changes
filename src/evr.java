import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryUtil;

public record evr(aew c, float d, float e, evr.a f, String g) implements evo {
   private static final Codec<String> h = arf.a(Codec.STRING, Codec.STRING.listOf(), $$0 -> String.join("", $$0));
   public static final MapCodec<evr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aew.a.fieldOf("file").forGetter(evr::c),
               Codec.FLOAT.optionalFieldOf("size", 11.0F).forGetter(evr::d),
               Codec.FLOAT.optionalFieldOf("oversample", 1.0F).forGetter(evr::e),
               evr.a.b.optionalFieldOf("shift", evr.a.a).forGetter(evr::f),
               h.optionalFieldOf("skip", "").forGetter(evr::g)
            )
            .apply($$0, evr::new)
   );

   @Override
   public evp a() {
      return evp.b;
   }

   @Override
   public Either<evo.a, evo.b> b() {
      return Either.left(this::a);
   }

   private ejs a(ant $$0) throws IOException {
      STBTTFontinfo $$1 = null;
      ByteBuffer $$2 = null;

      try {
         ejv var5;
         try (InputStream $$3 = $$0.open(this.c.d("font/"))) {
            $$1 = STBTTFontinfo.malloc();
            $$2 = TextureUtil.readResource($$3);
            $$2.flip();
            if (!STBTruetype.stbtt_InitFont($$1, $$2)) {
               throw new IOException("Invalid ttf");
            }

            var5 = new ejv($$2, $$1, this.d, this.e, this.f.c, this.f.d, this.g);
         }

         return var5;
      } catch (Exception var9) {
         if ($$1 != null) {
            $$1.free();
         }

         MemoryUtil.memFree($$2);
         throw var9;
      }
   }

   public static record a(float c, float d) {
      public static final evr.a a = new evr.a(0.0F, 0.0F);
      public static final Codec<evr.a> b = Codec.FLOAT
         .listOf()
         .comapFlatMap($$0 -> ac.a($$0, 2).map($$0x -> new evr.a((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.c, $$0.d));

      public float a() {
         return this.c;
      }

      public float b() {
         return this.d;
      }
   }
}
