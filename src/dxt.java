import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxt extends dvk {
   public static final Codec<dxt> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, dxt::new)
   );
   public final boolean e;

   public dxt(dvk.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dvk.b> a(dvk.a $$0) {
      dku.a $$1 = this.e ? dku.a.a : dku.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dwc $$0, dvk.a $$1) {
      czj $$2 = czj.a($$1.f());
      gw $$3 = new gw($$1.h().d(), 90, $$1.h().e());
      dxs.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dvt<?> e() {
      return dvt.m;
   }
}
