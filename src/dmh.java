import com.mojang.serialization.MapCodec;

public class dmh extends dlu {
   public static final MapCodec<dmh> a = b(dmh::new);
   public static final int b = 6;
   public static final eao c = eae.aB;
   public static final int d = b(0);
   private static final feq[] e = dlu.a(6, $$0 -> dlu.a((double)(1 + $$0 * 2), 0.0, 1.0, 15.0, 8.0, 15.0));

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   protected dmh(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      cyo $$7 = $$0.h();
      if ($$0.a(axi.aN) && $$1.c(c) == 0 && dlu.a($$7) instanceof dmk $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awl.dt, awm.e, 1.0F, 1.0F);
         $$2.b($$3, dml.a($$8));
         $$2.a($$4, eeo.c, $$3);
         $$4.b(awv.c.b($$7));
         return bty.a;
      } else {
         return bty.f;
      }
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bty.a;
         }

         if ($$3.b(btx.a).f()) {
            return bty.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bty a(diq $$0, iu $$1, dzo $$2, cqs $$3) {
      if (!$$3.t(false)) {
         return bty.e;
      } else {
         $$3.a(awv.U);
         $$3.gt().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, eeo.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, eeo.f, $$1);
         }

         return bty.a;
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
