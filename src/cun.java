import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cun extends cuf {
   public static final MapCodec<cun> a = b(cun::new);
   public static final dhq b = cyo.aE;
   public static final dhw c = dhm.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<cun> a() {
      return a;
   }

   public cun(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, hx.c));
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(crs $$0, cdm $$1, ht $$2, dgw $$3, @Nullable der $$4, clb $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof deo $$6) {
         if (cpo.a(cpq.v, $$5) == 0) {
            $$6.a($$1, $$3, deo.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         al.K.a((amb)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(crs $$0, ht $$1) {
      ejd $$2 = new ejd($$1).c(8.0, 6.0, 8.0);
      List<bwk> $$3 = $$0.a(bwk.class, $$2);
      if (!$$3.isEmpty()) {
         List<cdm> $$4 = $$0.a(cdm.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (bwk $$5 : $$3) {
            if ($$5.q() == null) {
               cdm $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(crs $$0, ht $$1) {
      a($$0, $$1, new clb(cle.vB, 3));
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      clb $$6 = $$3.b($$4);
      int $$7 = $$0.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         ckw $$9 = $$6.d();
         if ($$6.a(cle.rh)) {
            $$1.a($$3, $$3.dq(), $$3.ds(), $$3.dw(), aqn.bI, aqo.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, dlg.M, $$2);
         } else if ($$6.a(cle.rx)) {
            $$6.h(1);
            $$1.a($$3, $$3.dq(), $$3.ds(), $$3.dw(), aqn.ci, aqo.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new clb(cle.vE));
            } else if (!$$3.fS().e(new clb(cle.vE))) {
               $$3.a(new clb(cle.vE), false);
            }

            $$8 = true;
            $$1.a($$3, dlg.y, $$2);
         }

         if (!$$1.x_() && $$8) {
            $$3.b(aqx.c.b($$9));
         }
      }

      if ($$8) {
         if (!cvh.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, deo.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return biq.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(crs $$0, ht $$1) {
      return $$0.c_($$1) instanceof deo $$3 ? !$$3.d() : false;
   }

   public void a(crs $$0, dgw $$1, ht $$2, @Nullable cdm $$3, deo.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof deo $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(crs $$0, dgw $$1, ht $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(crs $$0, ht $$1, dgw $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         ekb $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(hx.a.b);
         if ($$4 >= 1.0 && !$$2.a(arc.an)) {
            double $$5 = $$3.b(hx.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ht $$6 = $$1.d();
               dgw $$7 = $$0.a_($$6);
               ekb $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(hx.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(crs $$0, ht $$1, ekb $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(hx.a.a), (double)$$1.u() + $$2.c(hx.a.a), (double)$$1.w() + $$2.b(hx.a.c), (double)$$1.w() + $$2.c(hx.a.c), $$3);
   }

   private void a(crs $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(js.aq, ati.d($$0.z.j(), $$1, $$2), $$5, ati.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c, b);
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Nullable
   @Override
   public der a(ht $$0, dgw $$1) {
      return new deo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return $$0.B ? null : a($$2, det.H, deo::a);
   }

   @Override
   public dgw a(crs $$0, ht $$1, dgw $$2, cdm $$3) {
      if (!$$0.B && $$3.f() && $$0.X().b(cro.h) && $$0.c_($$1) instanceof deo $$5) {
         clb $$6 = new clb(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               rz $$9 = new rz();
               $$9.a("Bees", $$5.j());
               ciu.a($$6, det.H, $$9);
            }

            rz $$10 = new rz();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            caf $$11 = new caf($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.t();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<clb> a(dgw $$0, eer.a $$1) {
      bki $$2 = $$1.b(egw.a);
      if ($$2 instanceof cag || $$2 instanceof cam || $$2 instanceof cer || $$2 instanceof bzt || $$2 instanceof cfp) {
         der $$3 = $$1.b(egw.h);
         if ($$3 instanceof deo $$4) {
            $$4.a(null, $$0, deo.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$3.a_($$5).b() instanceof cxs && $$3.c_($$4) instanceof deo $$7) {
         $$7.a(null, $$0, deo.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
