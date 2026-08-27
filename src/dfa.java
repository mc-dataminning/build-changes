import com.mojang.serialization.MapCodec;

public class dfa extends cxh implements cxb {
   public static final MapCodec<dfa> a = b(dfa::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dkp c = dkf.as;
   private static final emv e = cwy.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final emv f = cwy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dfa> a() {
      return a;
   }

   public dfa(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return new cng(cnj.wl);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(djp $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         djp $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dnz.c, $$2, dnz.a.a($$5));
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if ($$3 instanceof bmo && $$3.ai() != bmc.P && $$3.ai() != bmc.i) {
         $$3.a($$0, new emc(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ac != $$3.dq() || $$3.ae != $$3.dw())) {
            double $$4 = Math.abs($$3.dq() - $$3.ac);
            double $$5 = Math.abs($$3.dw() - $$3.ae);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ai().s(), 1.0F);
            }
         }
      }
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cnj.rx) ? bke.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cng(cnj.wl, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, art.yK, aru.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         djp $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dnz.c, $$2, dnz.a.a($$3, $$8));
         return bkc.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
