import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxp extends dvk {
   public static final Codec<dxp> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               dxp.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dxp::new)
   );
   public final dxp.a e;
   public final float f;
   public final float g;

   public dxp(dvk.c $$0, dxp.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dvk.b> a(dvk.a $$0) {
      return a($$0, dku.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dwc $$0, dvk.a $$1) {
      gw $$2 = new gw($$1.h().d(), 90, $$1.h().e());
      czj $$3 = czj.a($$1.f());
      dxo.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dvt<?> e() {
      return dvt.k;
   }

   public static enum a implements asr {
      a("warm"),
      b("cold");

      public static final Codec<dxp.a> c = asr.a(dxp.a::values);
      private final String d;

      private a(String $$0) {
         this.d = $$0;
      }

      public String a() {
         return this.d;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
