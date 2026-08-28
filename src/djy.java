import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djy extends djq {
   public static final MapCodec<djy> a = b(djy::new);
   public static final dyk<jm> b = doc.aF;
   public static final dym c = dyd.aO;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   public djy(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)).b(b, jm.c));
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dha $$0, cps $$1, jh $$2, dxn $$3, @Nullable dup $$4, cxk $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dum $$6) {
         if (!ddt.a($$5, axx.q)) {
            $$6.a($$1, $$3, dum.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         ao.L.a((asi)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, dgs $$3, BiConsumer<cxk, jh> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dha $$0, jh $$1) {
      fbn $$2 = new fbn($$1).c(8.0, 6.0, 8.0);
      List<cht> $$3 = $$0.a(cht.class, $$2);
      if (!$$3.isEmpty()) {
         List<cps> $$4 = $$0.a(cps.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cht $$5 : $$3) {
            if ($$5.O_() == null) {
               cps $$6 = ae.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dha $$0, jh $$1) {
      a($$0, $$1, new cxk(cxo.xq, 3));
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cxg $$9 = $$0.h();
         if ($$0.a(cxo.sJ)) {
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), axf.bX, axg.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bwb.d($$5));
            $$8 = true;
            $$2.a($$4, ecj.M, $$3);
         } else if ($$0.a(cxo.sY)) {
            $$0.h(1);
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), axf.cC, axg.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cxk(cxo.xt));
            } else if (!$$4.gg().f(new cxk(cxo.xt))) {
               $$4.a(new cxk(cxo.xt), false);
            }

            $$8 = true;
            $$2.a($$4, ecj.y, $$3);
         }

         if (!$$2.B_() && $$8) {
            $$4.b(axp.c.b($$9));
         }
      }

      if ($$8) {
         if (!dkt.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dum.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bte.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dha $$0, jh $$1) {
      return $$0.c_($$1) instanceof dum $$3 ? !$$3.c() : false;
   }

   public void a(dha $$0, dxn $$1, jh $$2, @Nullable cps $$3, dum.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dum $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dha $$0, dxn $$1, jh $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dha $$0, jh $$1, dxn $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fcm $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jm.a.b);
         if ($$4 >= 1.0 && !$$2.a(axu.ar)) {
            double $$5 = $$3.b(jm.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               jh $$6 = $$1.e();
               dxn $$7 = $$0.a_($$6);
               fcm $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jm.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dha $$0, jh $$1, fcm $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jm.a.a), (double)$$1.u() + $$2.c(jm.a.a), (double)$$1.w() + $$2.b(jm.a.c), (double)$$1.w() + $$2.c(jm.a.c), $$3);
   }

   private void a(dha $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ls.aw, bae.d($$0.A.j(), $$1, $$2), $$5, bae.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Nullable
   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dum($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return $$0.C ? null : a($$2, dur.I, dum::a);
   }

   @Override
   public dxn a(dha $$0, jh $$1, dxn $$2, cps $$3) {
      if ($$0 instanceof ash $$4 && $$3.b() && $$4.N().b(dgw.h) && $$0.c_($$1) instanceof dum $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            cxk $$9 = new cxk(this);
            $$9.b($$6.r());
            $$9.b(ku.am, czm.a.a(c, $$7));
            clw $$10 = new clw($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.s();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cxk> a(dxn $$0, ewk.a $$1) {
      bvf $$2 = $$1.b(ezd.a);
      if ($$2 instanceof clx || $$2 instanceof cme || $$2 instanceof cqz || $$2 instanceof clj || $$2 instanceof csf) {
         dup $$3 = $$1.b(ezd.h);
         if ($$3 instanceof dum $$4) {
            $$4.a(null, $$0, dum.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$1.a_($$5).b() instanceof dnf && $$1.c_($$3) instanceof dum $$9) {
         $$9.a(null, $$0, dum.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      super.a($$0, $$1, $$2, $$3);
      czm $$4 = $$0.a(ku.am, czm.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(ku.an, List.of()).size();
      $$2.add(xv.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(xv.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
