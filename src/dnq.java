import com.mojang.serialization.MapCodec;

public class dnq extends dnc {
   public static final MapCodec<dnq> a = b(dnq::new);
   public static final int b = 6;
   public static final ece c = ebu.aB;
   public static final int d = b(0);
   private static final fgk[] e = dnc.a(6, $$0 -> dnc.a((double)(1 + $$0 * 2), 0.0, 1.0, 15.0, 8.0, 15.0));

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   protected dnq(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      czu $$7 = $$0.h();
      if ($$0.a(axm.aO) && $$1.c(c) == 0 && dnc.a($$7) instanceof dnt $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awp.dv, awq.e, 1.0F, 1.0F);
         $$2.b($$3, dnu.a($$8));
         $$2.a($$4, ege.c, $$3);
         $$4.b(awz.c.b($$7));
         return bur.a;
      } else {
         return bur.f;
      }
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bur.a;
         }

         if ($$3.b(buq.a).f()) {
            return bur.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bur a(djy $$0, iv $$1, ebe $$2, crx $$3) {
      if (!$$3.t(false)) {
         return bur.e;
      } else {
         $$3.a(awz.U);
         $$3.gu().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, ege.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, ege.f, $$1);
         }

         return bur.a;
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4 == jb.a && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
