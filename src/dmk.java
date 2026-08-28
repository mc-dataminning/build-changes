import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;

public class dmk extends dqn implements dmp, dtx {
   public static final MapCodec<dmk> a = b(dmk::new);
   private static final ebf b = ebe.I;
   private static final Map<jb, ffr> c = ffo.c(dmm.b(6.0, 0.0, 16.0).a(0.0, 0.0, 0.25).d());

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   protected dmk(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(e, jb.c));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c.get($$0.c(e));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, e);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(b) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.e();
      eao $$4 = $$1.a_($$3);
      eao $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axc.bB)) && ($$5.a(this) || $$5.a(dmo.tn));
   }

   protected static boolean a(dji $$0, iv $$1, ewv $$2, jb $$3) {
      eao $$4 = dmo.to.m().b(b, Boolean.valueOf($$2.a(eww.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if (($$4 == jb.a || $$4 == jb.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(b)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      Optional<iv> $$3 = m.a($$0, $$1, $$2.b(), jb.b, dmo.tn);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iv $$4 = $$3.get().d();
         eao $$5 = $$0.a_($$4);
         return dmj.a((djj)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      Optional<iv> $$4 = m.a($$0, $$2, $$3.b(), jb.b, dmo.tn);
      if (!$$4.isEmpty()) {
         iv $$5 = $$4.get();
         iv $$6 = $$5.d();
         jb $$7 = $$3.c(e);
         a($$0, $$5, $$0.b_($$5), $$7);
         dmj.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return new czk(dmo.tn);
   }
}
