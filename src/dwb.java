import com.mojang.serialization.MapCodec;

public class dwb extends dxa implements dnr {
   public static final MapCodec<dwb> a = b(dwb::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final ecq c = ecg.av;
   private static final fgw e = dno.b(10.0, 0.0, 8.0);
   private static final fgw f = dno.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dwb> a() {
      return a;
   }

   public dwb(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return new dak(dao.xG);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return switch ($$0.c(c)) {
         case 0 -> e;
         case 3 -> fgt.b();
         default -> f;
      };
   }

   @Override
   protected boolean f(ebq $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         ebq $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(egq.c, $$2, egq.a.a($$5));
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if ($$3 instanceof byf && $$3.an() != bxn.ab && $$3.an() != bxn.m) {
         $$3.a($$0, new fgc(0.8F, 0.75, 0.8F));
         if ($$1 instanceof asb $$5 && $$0.c(c) != 0) {
            fgc $$7 = $$3.Z_() ? $$3.ad() : $$3.bA().d($$3.dt());
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
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bvc)(!$$8 && $$0.a(dao.sG) ? bvc.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new dak(dao.xG, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awy.Aw, awz.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         ebq $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(egq.c, $$2, egq.a.a($$3, $$8));
         return bvc.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
