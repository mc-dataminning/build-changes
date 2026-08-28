import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class euo extends esb {
   public static final MapCodec<euo> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               euo.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, euo::new)
   );
   public final euo.a e;
   public final float f;
   public final float g;

   public euo(esb.c $$0, euo.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      return a($$0, ehd.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(est $$0, esb.a $$1) {
      iv $$2 = new iv($$1.h().d(), 90, $$1.h().e());
      dtw $$3 = dtw.a($$1.f());
      eun.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public esk<?> e() {
      return esk.k;
   }

   public static enum a implements bam {
      a("warm"),
      b("cold");

      public static final Codec<euo.a> c = bam.a(euo.a::values);
      @Deprecated
      public static final Codec<euo.a> d = ayw.c(euo.a::valueOf);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
