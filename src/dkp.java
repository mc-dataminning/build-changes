import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dkp extends dhs implements dhm {
   public static final MapCodec<dkp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alb.a(lv.aJ).fieldOf("feature").forGetter($$0x -> $$0x.e), lu.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dkp::new)
   );
   protected static final ezm b = dhj.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dhj d;
   private final alb<edc<?, ?>> e;

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   protected dkp(alb<edc<?, ?>> $$0, dhj $$1, dun.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.a(awt.aM) || $$0.a(dhl.fl) || $$0.a(dhl.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jn<edc<?, ?>>> a(dej $$0) {
      return $$0.F_().d(lv.aJ).b(this.e);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      duo $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      this.a($$0).ifPresent($$3x -> ((edc)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
