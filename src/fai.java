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

public record fai(ahg c, float d, float e, fai.a f, String g) implements faf {
   private static final Codec<String> h = atw.a(Codec.STRING, Codec.STRING.listOf(), $$0 -> String.join("", $$0));
   public static final MapCodec<fai> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ahg.a.fieldOf("file").forGetter(fai::c),
               Codec.FLOAT.optionalFieldOf("size", 11.0F).forGetter(fai::d),
               Codec.FLOAT.optionalFieldOf("oversample", 1.0F).forGetter(fai::e),
               fai.a.b.optionalFieldOf("shift", fai.a.a).forGetter(fai::f),
               h.optionalFieldOf("skip", "").forGetter(fai::g)
            )
            .apply($$0, fai::new)
   );

   @Override
   public fag a() {
      return fag.b;
   }

   @Override
   public Either<faf.a, faf.b> b() {
      return Either.left(this::a);
   }

   private eoe a(aqi $$0) throws IOException {
      STBTTFontinfo $$1 = null;
      ByteBuffer $$2 = null;

      try {
         eoh var5;
         try (InputStream $$3 = $$0.open(this.c.d("font/"))) {
            $$1 = STBTTFontinfo.malloc();
            $$2 = TextureUtil.readResource($$3);
            $$2.flip();
            if (!STBTruetype.stbtt_InitFont($$1, $$2)) {
               throw new IOException("Invalid ttf");
            }

            var5 = new eoh($$2, $$1, this.d, this.e, this.f.c, this.f.d, this.g);
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
      public static final fai.a a = new fai.a(0.0F, 0.0F);
      public static final Codec<fai.a> b = Codec.FLOAT
         .listOf()
         .comapFlatMap($$0 -> ac.a($$0, 2).map($$0x -> new fai.a((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.c, $$0.d));

      public float a() {
         return this.c;
      }

      public float b() {
         return this.d;
      }
   }
}
