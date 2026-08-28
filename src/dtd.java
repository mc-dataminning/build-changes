import com.mojang.serialization.MapCodec;

public class dtd extends dle implements dkx {
   public static final MapCodec<dtd> a = b(dtd::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dzm c = dzc.av;
   private static final fdo e = dku.b(10.0, 0.0, 8.0);
   private static final fdo f = dku.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dtd> a() {
      return a;
   }

   public dtd(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return new cxy(cyc.xz);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return switch ($$0.c(c)) {
         case 0 -> e;
         case 3 -> fdl.b();
         default -> f;
      };
   }

   @Override
   protected boolean f(dym $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dym $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(edm.c, $$2, edm.a.a($$5));
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if ($$3 instanceof bwr && $$3.aq() != bwb.aa && $$3.aq() != bwb.l) {
         $$3.a($$0, new fcu(0.8F, 0.75, 0.8F));
         if ($$1 instanceof arn $$4 && $$0.c(c) != 0) {
            fcu $$6 = $$3.L_() ? $$3.ah() : $$3.bB().d($$3.dt());
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
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (btq)(!$$8 && $$0.a(cyc.sz) ? btq.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cxy(cyc.xz, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awk.Aq, awl.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dym $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(edm.c, $$2, edm.a.a($$3, $$8));
         return btq.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
