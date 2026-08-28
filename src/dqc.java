import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public class dqc extends dpi {
   public static final MapCodec<dqc> a = b(dqc::new);
   private static final wy b = wy.c("container.grindstone_title");
   private final Function<eao, ffr> d;

   @Override
   public MapCodec<dqc> a() {
      return a;
   }

   protected dqc(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jb.c).b(c, eaz.b));
      this.d = this.b();
   }

   private Function<eao, ffr> b() {
      ffr $$0 = ffo.a(dmm.a(2.0, 6.0, 7.0, 4.0, 10.0, 16.0), dmm.a(2.0, 5.0, 3.0, 4.0, 11.0, 9.0));
      ffr $$1 = ffo.a($$0, h.z);
      ffr $$2 = ffo.a(dmm.a(8.0, 2.0, 14.0, 0.0, 12.0), $$0, $$1);
      Map<eaz, Map<jb, ffr>> $$3 = ffo.e($$2);
      return this.a($$1x -> $$3.get($$1x.c(c)).get($$1x.c(e)));
   }

   private ffr o(eao $$0) {
      return this.d.apply($$0);
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.o($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.o($$0);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return true;
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aD);
      }

      return bug.a;
   }

   @Override
   protected bui b(eao $$0, djh $$1, iv $$2) {
      return new buo(($$2x, $$3, $$4) -> new cwc($$2x, $$3, cvp.a($$1, $$2)), b);
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
