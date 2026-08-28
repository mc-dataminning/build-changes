import com.mojang.serialization.MapCodec;

public class dna extends dfg implements dfa {
   public static final MapCodec<dna> a = b(dna::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dta c = dsq.as;
   private static final ewi e = dex.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ewi f = dex.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   public dna(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return new cun(cuq.wr);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dsa $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dsa $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dwt.c, $$2, dwt.a.a($$5));
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      if ($$3 instanceof btn && $$3.ak() != bsy.Q && $$3.ak() != bsy.h) {
         $$3.a($$0, new evp(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ad != $$3.du() || $$3.af != $$3.dA())) {
            double $$4 = Math.abs($$3.du() - $$3.ad);
            double $$5 = Math.abs($$3.dA() - $$3.af);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.aj().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cuq.ry) ? bqu.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cun(cuq.wr, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, avz.zp, awa.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dsa $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dwt.c, $$2, dwt.a.a($$3, $$8));
         return bqs.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
