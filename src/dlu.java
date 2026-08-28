import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlu extends dlm {
   public static final MapCodec<dlu> a = b(dlu::new);
   public static final eax<ja> b = dqa.e;
   public static final eaz c = eap.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   public dlu(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)).b(b, ja.c));
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(div $$0, cqy $$1, iu $$2, dzz $$3, @Nullable dwx $$4, cyy $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dwu $$6) {
         if (!dfn.a($$5, axe.q)) {
            $$6.a($$1, $$3, dwu.b.c);
            btx.a($$3, $$0, $$2);
            this.b($$0, $$2);
         }

         ap.L.a((arr)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, dio $$3, BiConsumer<cyy, iu> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(div $$0, iu $$1) {
      fed $$2 = new fed($$1).c(8.0, 6.0, 8.0);
      List<cit> $$3 = $$0.a(cit.class, $$2);
      if (!$$3.isEmpty()) {
         List<cqy> $$4 = $$0.a(cqy.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cit $$5 : $$3) {
            if ($$5.f() == null) {
               cqy $$6 = af.a($$4, $$0.A);
               $$5.g($$6);
            }
         }
      }
   }

   public static void a(div $$0, iu $$1) {
      a($$0, $$1, new cyy(czc.xG, 3));
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cyu $$9 = $$0.h();
         if ($$0.a(czc.sY)) {
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awn.bX, awo.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bxc.d($$5));
            $$8 = true;
            $$2.a($$4, eez.M, $$3);
         } else if ($$0.a(czc.tn)) {
            $$0.h(1);
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awn.cC, awo.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cyy(czc.xJ));
            } else if (!$$4.gi().f(new cyy(czc.xJ))) {
               $$4.a(new cyy(czc.xJ), false);
            }

            $$8 = true;
            $$2.a($$4, eez.y, $$3);
         }

         if (!$$2.w_() && $$8) {
            $$4.b(awx.c.b($$9));
         }
      }

      if ($$8) {
         if (!dmp.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dwu.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bub.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(div $$0, iu $$1) {
      return $$0.c_($$1) instanceof dwu $$3 ? !$$3.c() : false;
   }

   public void a(div $$0, dzz $$1, iu $$2, @Nullable cqy $$3, dwu.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dwu $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(div $$0, dzz $$1, iu $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(div $$0, iu $$1, dzz $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         ffc $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(ja.a.b);
         if ($$4 >= 1.0 && !$$2.a(axc.ar)) {
            double $$5 = $$3.b(ja.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               iu $$6 = $$1.e();
               dzz $$7 = $$0.a_($$6);
               ffc $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(ja.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(div $$0, iu $$1, ffc $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ja.a.a), (double)$$1.u() + $$2.c(ja.a.a), (double)$$1.w() + $$2.b(ja.a.c), (double)$$1.w() + $$2.c(ja.a.c), $$3);
   }

   private void a(div $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lx.ay, azm.d($$0.A.j(), $$1, $$2), $$5, azm.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dwu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return $$0.C ? null : a($$2, dwz.I, dwu::a);
   }

   @Override
   public dzz a(div $$0, iu $$1, dzz $$2, cqy $$3) {
      if ($$0 instanceof arq $$4 && $$3.gk() && $$4.O().c(dir.h) && $$0.c_($$1) instanceof dwu $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            cyy $$9 = new cyy(this);
            $$9.b($$6.q());
            $$9.b(kj.aq, day.a.a(c, $$7));
            cnd $$10 = new cnd($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.j();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cyy> a(dzz $$0, ezc.a $$1) {
      bwd $$2 = $$1.b(fbt.a);
      if ($$2 instanceof cne || $$2 instanceof cnl || $$2 instanceof csh || $$2 instanceof cmq || $$2 instanceof cty) {
         dwx $$3 = $$1.b(fbt.h);
         if ($$3 instanceof dwu $$4) {
            $$4.a(null, $$0, dwu.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      cyy $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kj.aq, day.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$1.a_($$5).b() instanceof dpb && $$1.c_($$3) instanceof dwu $$9) {
         $$9.a(null, $$0, dwu.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
