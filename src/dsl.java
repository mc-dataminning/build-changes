import com.mojang.serialization.MapCodec;

public class dsl extends dkn implements dkg {
   public static final MapCodec<dsl> a = b(dsl::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dyn c = dye.av;
   private static final fcl e = dkd.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final fcl f = dkd.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dsl> a() {
      return a;
   }

   public dsl(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return new cxg(cxk.xv);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dxo $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dxo $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(eck.c, $$2, eck.a.a($$5));
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if ($$3 instanceof bvx && $$3.aq() != bvi.ab && $$3.aq() != bvi.l) {
         $$3.a($$0, new fbr(0.8F, 0.75, 0.8F));
         if ($$1 instanceof arx $$4 && $$0.c(c) != 0) {
            fbr $$6 = $$3.dj() ? $$3.ah() : $$3.bC().d($$3.du());
            if ($$6.j() > 0.0) {
               double $$7 = Math.abs($$6.a());
               double $$8 = Math.abs($$6.c());
               if ($$7 >= 0.003F || $$8 >= 0.003F) {
                  $$3.a($$4, $$1.ak().u(), 1.0F);
               }
            }

            return;
         }
      }
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bta)(!$$8 && $$0.a(cxk.sv) ? bta.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cxg(cxk.xv, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awv.Ah, aww.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dxo $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(eck.c, $$2, eck.a.a($$3, $$8));
         return bta.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
