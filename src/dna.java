import com.mojang.serialization.MapCodec;

public class dna extends dmm {
   public static final MapCodec<dna> a = b(dna::new);
   public static final int b = 6;
   public static final ebo c = ebe.aB;
   public static final int d = b(0);
   private static final ffr[] e = dmm.a(6, $$0 -> dmm.a((double)(1 + $$0 * 2), 0.0, 1.0, 15.0, 8.0, 15.0));

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   protected dna(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      czg $$7 = $$0.h();
      if ($$0.a(axk.aO) && $$1.c(c) == 0 && dmm.a($$7) instanceof dnd $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awn.dv, awo.e, 1.0F, 1.0F);
         $$2.b($$3, dne.a($$8));
         $$2.a($$4, efo.c, $$3);
         $$4.b(awx.c.b($$7));
         return bug.a;
      } else {
         return bug.f;
      }
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bug.a;
         }

         if ($$3.b(buf.a).f()) {
            return bug.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bug a(dji $$0, iv $$1, eao $$2, crj $$3) {
      if (!$$3.t(false)) {
         return bug.e;
      } else {
         $$3.a(awx.U);
         $$3.gt().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, efo.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, efo.f, $$1);
         }

         return bug.a;
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4 == jb.a && !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
