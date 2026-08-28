import com.mojang.serialization.MapCodec;

public class dud extends dme implements dlx {
   public static final MapCodec<dud> a = b(dud::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final eao c = eae.av;
   private static final feq e = dlu.b(10.0, 0.0, 8.0);
   private static final feq f = dlu.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dud> a() {
      return a;
   }

   public dud(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return new cys(cyw.xz);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return switch ($$0.c(c)) {
         case 0 -> e;
         case 3 -> fen.b();
         default -> f;
      };
   }

   @Override
   protected boolean f(dzo $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dzo $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(eeo.c, $$2, eeo.a.a($$5));
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if ($$3 instanceof bwz && $$3.aq() != bwj.aa && $$3.aq() != bwj.l) {
         $$3.a($$0, new fdw(0.8F, 0.75, 0.8F));
         if ($$1 instanceof aro $$4 && $$0.c(c) != 0) {
            fdw $$6 = $$3.L_() ? $$3.ah() : $$3.bB().d($$3.dt());
            if ($$6.j() > 0.0) {
               double $$7 = Math.abs($$6.a());
               double $$8 = Math.abs($$6.c());
               if ($$7 >= 0.003F || $$8 >= 0.003F) {
                  $$3.a($$4, $$1.al().u(), 1.0F);
               }
            }

            return;
         }
      }
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bty)(!$$8 && $$0.a(cyw.sz) ? bty.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cys(cyw.xz, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awl.Aq, awm.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dzo $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(eeo.c, $$2, eeo.a.a($$3, $$8));
         return bty.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
