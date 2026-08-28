import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmg extends dly {
   public static final MapCodec<dmg> a = b(dmg::new);
   public static final ebm<jb> b = dqn.e;
   public static final ebo c = ebe.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   public dmg(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)).b(b, jb.c));
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(djh $$0, crj $$1, iv $$2, eao $$3, @Nullable dxm $$4, czk $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dxj $$6) {
         if (!dfz.a($$5, axe.q)) {
            $$6.a($$1, $$3, dxj.b.c);
            buc.a($$3, $$0, $$2);
            this.b($$0, $$2);
         }

         aq.L.a((arr)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, dja $$3, BiConsumer<czk, iv> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(djh $$0, iv $$1) {
      fes $$2 = new fes($$1).c(8.0, 6.0, 8.0);
      List<cja> $$3 = $$0.a(cja.class, $$2);
      if (!$$3.isEmpty()) {
         List<crj> $$4 = $$0.a(crj.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cja $$5 : $$3) {
            if ($$5.f() == null) {
               crj $$6 = ag.a($$4, $$0.A);
               $$5.g($$6);
            }
         }
      }
   }

   public static void a(djh $$0, iv $$1) {
      a($$0, $$1, new czk(czo.xL, 3));
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         czg $$9 = $$0.h();
         if ($$0.a(czo.td)) {
            $$2.a($$4, $$4.dz(), $$4.dB(), $$4.dF(), awn.bX, awo.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bxj.d($$5));
            $$8 = true;
            $$2.a($$4, efo.M, $$3);
         } else if ($$0.a(czo.ts)) {
            $$0.h(1);
            $$2.a($$4, $$4.dz(), $$4.dB(), $$4.dF(), awn.cC, awo.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new czk(czo.xO));
            } else if (!$$4.gi().g(new czk(czo.xO))) {
               $$4.a(new czk(czo.xO), false);
            }

            $$8 = true;
            $$2.a($$4, efo.y, $$3);
         }

         if (!$$2.w_() && $$8) {
            $$4.b(awx.c.b($$9));
         }
      }

      if ($$8) {
         if (!dnc.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dxj.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bug.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(djh $$0, iv $$1) {
      return $$0.c_($$1) instanceof dxj $$3 ? !$$3.c() : false;
   }

   public void a(djh $$0, eao $$1, iv $$2, @Nullable crj $$3, dxj.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dxj $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(djh $$0, eao $$1, iv $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(djh $$0, iv $$1, eao $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         ffr $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jb.a.b);
         if ($$4 >= 1.0 && !$$2.a(axc.ar)) {
            double $$5 = $$3.b(jb.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               iv $$6 = $$1.e();
               eao $$7 = $$0.a_($$6);
               ffr $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jb.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(djh $$0, iv $$1, ffr $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jb.a.a), (double)$$1.u() + $$2.c(jb.a.a), (double)$$1.w() + $$2.b(jb.a.c), (double)$$1.w() + $$2.c(jb.a.c), $$3);
   }

   private void a(djh $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ly.ay, azm.d($$0.A.j(), $$1, $$2), $$5, azm.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dxj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return $$0.C ? null : a($$2, dxo.I, dxj::a);
   }

   @Override
   public eao a(djh $$0, iv $$1, eao $$2, crj $$3) {
      if ($$0 instanceof arq $$4 && $$3.gk() && $$4.O().c(djd.i) && $$0.c_($$1) instanceof dxj $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            czk $$9 = new czk(this);
            $$9.b($$6.q());
            $$9.b(kk.aq, dbk.a.a(c, $$7));
            cno $$10 = new cno($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.j();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<czk> a(eao $$0, ezr.a $$1) {
      bwi $$2 = $$1.b(fci.a);
      if ($$2 instanceof cnp || $$2 instanceof cnw || $$2 instanceof cst || $$2 instanceof cnb || $$2 instanceof cuk) {
         dxm $$3 = $$1.b(fci.h);
         if ($$3 instanceof dxj $$4) {
            $$4.a(null, $$0, dxj.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      czk $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kk.aq, dbk.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$1.a_($$5).b() instanceof dpo && $$1.c_($$3) instanceof dxj $$9) {
         $$9.a(null, $$0, dxj.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
