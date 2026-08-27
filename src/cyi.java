import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cyi extends cya {
   public static final MapCodec<cyi> a = b(cyi::new);
   public static final dlz b = dcj.aE;
   public static final dmf c = dlv.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<cyi> a() {
      return a;
   }

   public cyi(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ie.c));
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(cvn $$0, chh $$1, hz $$2, dlf $$3, @Nullable dit $$4, coz $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof diq $$6) {
         if (ctj.a(ctl.v, $$5) == 0) {
            $$6.a($$1, $$3, diq.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((aow)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(cvn $$0, hz $$1) {
      enn $$2 = new enn($$1).c(8.0, 6.0, 8.0);
      List<bzu> $$3 = $$0.a(bzu.class, $$2);
      if (!$$3.isEmpty()) {
         List<chh> $$4 = $$0.a(chh.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (bzu $$5 : $$3) {
            if ($$5.q() == null) {
               chh $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(cvn $$0, hz $$1) {
      a($$0, $$1, new coz(cpc.wq, 3));
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cou $$9 = $$0.d();
         if ($$0.a(cpc.rU)) {
            $$2.a($$4, $$4.dr(), $$4.dt(), $$4.dx(), atk.bU, atl.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bog.d($$5));
            $$8 = true;
            $$2.a($$4, dpp.M, $$3);
         } else if ($$0.a(cpc.sk)) {
            $$0.h(1);
            $$2.a($$4, $$4.dr(), $$4.dt(), $$4.dx(), atk.cu, atl.e, 1.0F, 1.0F);
            if ($$0.b()) {
               $$4.a($$5, new coz(cpc.wt));
            } else if (!$$4.fT().e(new coz(cpc.wt))) {
               $$4.a(new coz(cpc.wt), false);
            }

            $$8 = true;
            $$2.a($$4, dpp.y, $$3);
         }

         if (!$$2.y_() && $$8) {
            $$4.b(atu.c.b($$9));
         }
      }

      if ($$8) {
         if (!czc.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, diq.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return blw.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(cvn $$0, hz $$1) {
      return $$0.c_($$1) instanceof diq $$3 ? !$$3.d() : false;
   }

   public void a(cvn $$0, dlf $$1, hz $$2, @Nullable chh $$3, diq.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof diq $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cvn $$0, dlf $$1, hz $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cvn $$0, hz $$1, dlf $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         eol $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ie.a.b);
         if ($$4 >= 1.0 && !$$2.a(atz.an)) {
            double $$5 = $$3.b(ie.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               hz $$6 = $$1.d();
               dlf $$7 = $$0.a_($$6);
               eol $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ie.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cvn $$0, hz $$1, eol $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ie.a.a), (double)$$1.u() + $$2.c(ie.a.a), (double)$$1.w() + $$2.b(ie.a.c), (double)$$1.w() + $$2.c(ie.a.c), $$3);
   }

   private void a(cvn $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(jz.as, awh.d($$0.z.j(), $$1, $$2), $$5, awh.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Nullable
   @Override
   public dit a(hz $$0, dlf $$1) {
      return new diq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return $$0.B ? null : a($$2, div.H, diq::a);
   }

   @Override
   public dlf a(cvn $$0, hz $$1, dlf $$2, chh $$3) {
      if (!$$0.B && $$3.f() && $$0.Z().b(cvj.h) && $$0.c_($$1) instanceof diq $$5) {
         coz $$6 = new coz(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               sw $$9 = new sw();
               $$9.a("Bees", $$5.l());
               cms.a($$6, div.H, $$9);
            }

            sw $$10 = new sw();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            cds $$11 = new cds($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.u();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<coz> a(dlf $$0, ejb.a $$1) {
      bno $$2 = $$1.b(elg.a);
      if ($$2 instanceof cdt || $$2 instanceof cdz || $$2 instanceof cio || $$2 instanceof cdg || $$2 instanceof cjm) {
         dit $$3 = $$1.b(elg.h);
         if ($$3 instanceof diq $$4) {
            $$4.a(null, $$0, diq.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$3.a_($$5).b() instanceof dbo && $$3.c_($$4) instanceof diq $$7) {
         $$7.a(null, $$0, diq.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
