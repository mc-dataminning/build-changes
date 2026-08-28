import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dqx extends dmm implements dtx {
   public static final MapCodec<dqx> a = b(dqx::new);
   public static final ebm<jb> b = dqn.e;
   public static final ebf c = ebe.I;
   public static final Map<jb, ffr> d = ffo.c(dmm.c(16.0, 13.0, 16.0));

   @Override
   public MapCodec<dqx> a() {
      return a;
   }

   protected dqx(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return d.get($$0.c(b));
   }

   private boolean a(din $$0, iv $$1, jb $$2) {
      eao $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      jb $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dmo.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, eww.c, eww.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      if (!$$0.c()) {
         eao $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      eao $$2 = this.m();
      djk $$3 = $$0.q();
      iv $$4 = $$0.a();
      ewv $$5 = $$0.q().b_($$0.a());

      for (jb $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == eww.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(c) ? eww.c.a(false) : super.b_($$0);
   }
}
