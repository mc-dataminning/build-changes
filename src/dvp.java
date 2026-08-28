import com.mojang.serialization.MapCodec;

public class dvp extends dwo implements dnf {
   public static final MapCodec<dvp> a = b(dvp::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final ece c = ebu.av;
   private static final fgk e = dnc.b(10.0, 0.0, 8.0);
   private static final fgk f = dnc.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dvp> a() {
      return a;
   }

   public dvp(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return new czy(dac.xG);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return switch ($$0.c(c)) {
         case 0 -> e;
         case 3 -> fgh.b();
         default -> f;
      };
   }

   @Override
   protected boolean f(ebe $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         ebe $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(ege.c, $$2, ege.a.a($$5));
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if ($$3 instanceof bxu && $$3.an() != bxc.ab && $$3.an() != bxc.m) {
         $$3.a($$0, new ffq(0.8F, 0.75, 0.8F));
         if ($$1 instanceof ars $$5 && $$0.c(c) != 0) {
            ffq $$7 = $$3.P_() ? $$3.ae() : $$3.bA().d($$3.dt());
            if ($$7.j() > 0.0) {
               double $$8 = Math.abs($$7.a());
               double $$9 = Math.abs($$7.c());
               if ($$8 >= 0.003F || $$9 >= 0.003F) {
                  $$3.a($$5, $$1.al().u(), 1.0F);
               }
            }

            return;
         }
      }
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bur)(!$$8 && $$0.a(dac.sG) ? bur.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new czy(dac.xG, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awp.Aw, awq.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         ebe $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(ege.c, $$2, ege.a.a($$3, $$8));
         return bur.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
