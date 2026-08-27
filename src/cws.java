import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cws extends cwk {
   public static final MapCodec<cws> a = b(cws::new);
   public static final dkj b = dat.aE;
   public static final dkp c = dkf.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<cws> a() {
      return a;
   }

   public cws(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ic.c));
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(ctx $$0, cfq $$1, hx $$2, djp $$3, @Nullable dhd $$4, cng $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dha $$6) {
         if (crt.a(crv.v, $$5) == 0) {
            $$6.a($$1, $$3, dha.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((anf)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(ctx $$0, hx $$1) {
      elx $$2 = new elx($$1).c(8.0, 6.0, 8.0);
      List<byd> $$3 = $$0.a(byd.class, $$2);
      if (!$$3.isEmpty()) {
         List<cfq> $$4 = $$0.a(cfq.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (byd $$5 : $$3) {
            if ($$5.q() == null) {
               cfq $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(ctx $$0, hx $$1) {
      a($$0, $$1, new cng(cnj.wq, 3));
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cnb $$9 = $$0.d();
         if ($$0.a(cnj.rU)) {
            $$2.a($$4, $$4.dq(), $$4.ds(), $$4.dw(), art.bU, aru.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, $$1x -> $$1x.d($$5));
            $$8 = true;
            $$2.a($$4, dnz.M, $$3);
         } else if ($$0.a(cnj.sk)) {
            $$0.h(1);
            $$2.a($$4, $$4.dq(), $$4.ds(), $$4.dw(), art.cu, aru.e, 1.0F, 1.0F);
            if ($$0.b()) {
               $$4.a($$5, new cng(cnj.wt));
            } else if (!$$4.fS().e(new cng(cnj.wt))) {
               $$4.a(new cng(cnj.wt), false);
            }

            $$8 = true;
            $$2.a($$4, dnz.y, $$3);
         }

         if (!$$2.y_() && $$8) {
            $$4.b(asd.c.b($$9));
         }
      }

      if ($$8) {
         if (!cxm.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dha.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bke.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(ctx $$0, hx $$1) {
      return $$0.c_($$1) instanceof dha $$3 ? !$$3.d() : false;
   }

   public void a(ctx $$0, djp $$1, hx $$2, @Nullable cfq $$3, dha.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dha $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(ctx $$0, djp $$1, hx $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(ctx $$0, hx $$1, djp $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         emv $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ic.a.b);
         if ($$4 >= 1.0 && !$$2.a(asi.an)) {
            double $$5 = $$3.b(ic.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               hx $$6 = $$1.d();
               djp $$7 = $$0.a_($$6);
               emv $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ic.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(ctx $$0, hx $$1, emv $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ic.a.a), (double)$$1.u() + $$2.c(ic.a.a), (double)$$1.w() + $$2.b(ic.a.c), (double)$$1.w() + $$2.c(ic.a.c), $$3);
   }

   private void a(ctx $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(jx.as, aup.d($$0.z.j(), $$1, $$2), $$5, aup.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c, b);
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Nullable
   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dha($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return $$0.B ? null : a($$2, dhf.H, dha::a);
   }

   @Override
   public djp a(ctx $$0, hx $$1, djp $$2, cfq $$3) {
      if (!$$0.B && $$3.f() && $$0.Z().b(ctt.h) && $$0.c_($$1) instanceof dha $$5) {
         cng $$6 = new cng(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               so $$9 = new so();
               $$9.a("Bees", $$5.l());
               cla.a($$6, dhf.H, $$9);
            }

            so $$10 = new so();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            ccb $$11 = new ccb($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.u();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cng> a(djp $$0, ehl.a $$1) {
      blw $$2 = $$1.b(ejq.a);
      if ($$2 instanceof ccc || $$2 instanceof cci || $$2 instanceof cgw || $$2 instanceof cbp || $$2 instanceof chu) {
         dhd $$3 = $$1.b(ejq.h);
         if ($$3 instanceof dha $$4) {
            $$4.a(null, $$0, dha.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$3.a_($$5).b() instanceof czy && $$3.c_($$4) instanceof dha $$7) {
         $$7.a(null, $$0, dha.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
