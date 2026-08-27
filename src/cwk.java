import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cwk extends cwc {
   public static final MapCodec<cwk> a = b(cwk::new);
   public static final dkb b = dal.aE;
   public static final dkh c = djx.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<cwk> a() {
      return a;
   }

   public cwk(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ic.c));
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(ctp $$0, cfi $$1, hx $$2, djh $$3, @Nullable dgv $$4, cmy $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dgs $$6) {
         if (crl.a(crn.v, $$5) == 0) {
            $$6.a($$1, $$3, dgs.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((ane)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(ctp $$0, hx $$1) {
      elo $$2 = new elo($$1).c(8.0, 6.0, 8.0);
      List<bxz> $$3 = $$0.a(bxz.class, $$2);
      if (!$$3.isEmpty()) {
         List<cfi> $$4 = $$0.a(cfi.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (bxz $$5 : $$3) {
            if ($$5.q() == null) {
               cfi $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(ctp $$0, hx $$1) {
      a($$0, $$1, new cmy(cnb.wn, 3));
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      cmy $$6 = $$3.b($$4);
      int $$7 = $$0.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cmt $$9 = $$6.d();
         if ($$6.a(cnb.rS)) {
            $$1.a($$3, $$3.dr(), $$3.dt(), $$3.dx(), ars.bI, art.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, dnr.M, $$2);
         } else if ($$6.a(cnb.si)) {
            $$6.h(1);
            $$1.a($$3, $$3.dr(), $$3.dt(), $$3.dx(), ars.ci, art.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new cmy(cnb.wq));
            } else if (!$$3.fS().e(new cmy(cnb.wq))) {
               $$3.a(new cmy(cnb.wq), false);
            }

            $$8 = true;
            $$1.a($$3, dnr.y, $$2);
         }

         if (!$$1.y_() && $$8) {
            $$3.b(asc.c.b($$9));
         }
      }

      if ($$8) {
         if (!cxe.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, dgs.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return bkb.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(ctp $$0, hx $$1) {
      return $$0.c_($$1) instanceof dgs $$3 ? !$$3.d() : false;
   }

   public void a(ctp $$0, djh $$1, hx $$2, @Nullable cfi $$3, dgs.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dgs $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(ctp $$0, djh $$1, hx $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(ctp $$0, hx $$1, djh $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         emm $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ic.a.b);
         if ($$4 >= 1.0 && !$$2.a(ash.an)) {
            double $$5 = $$3.b(ic.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               hx $$6 = $$1.d();
               djh $$7 = $$0.a_($$6);
               emm $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ic.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(ctp $$0, hx $$1, emm $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ic.a.a), (double)$$1.u() + $$2.c(ic.a.a), (double)$$1.w() + $$2.b(ic.a.c), (double)$$1.w() + $$2.c(ic.a.c), $$3);
   }

   private void a(ctp $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(jx.as, auo.d($$0.z.j(), $$1, $$2), $$5, auo.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c, b);
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Nullable
   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dgs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return $$0.B ? null : a($$2, dgx.H, dgs::a);
   }

   @Override
   public djh a(ctp $$0, hx $$1, djh $$2, cfi $$3) {
      if (!$$0.B && $$3.f() && $$0.Z().b(ctl.h) && $$0.c_($$1) instanceof dgs $$5) {
         cmy $$6 = new cmy(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               sn $$9 = new sn();
               $$9.a("Bees", $$5.l());
               ckr.a($$6, dgx.H, $$9);
            }

            sn $$10 = new sn();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            cbu $$11 = new cbu($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.u();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cmy> a(djh $$0, ehc.a $$1) {
      blv $$2 = $$1.b(ejh.a);
      if ($$2 instanceof cbv || $$2 instanceof ccb || $$2 instanceof cgo || $$2 instanceof cbi || $$2 instanceof chm) {
         dgv $$3 = $$1.b(ejh.h);
         if ($$3 instanceof dgs $$4) {
            $$4.a(null, $$0, dgs.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$3.a_($$5).b() instanceof czq && $$3.c_($$4) instanceof dgs $$7) {
         $$7.a(null, $$0, dgs.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
