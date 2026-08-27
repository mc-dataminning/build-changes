import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dcp extends dch {
   public static final MapCodec<dcp> a = b(dcp::new);
   public static final dqs b = dgr.aE;
   public static final dqy c = dqo.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dcp> a() {
      return a;
   }

   public dcp(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ir.c));
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(czu $$0, ckl $$1, im $$2, dpy $$3, @Nullable dnd $$4, csd $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dna $$6) {
         if (cxo.a(cxq.v, $$5) == 0) {
            $$6.a($$1, $$3, dna.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((aqf)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(czu $$0, im $$1) {
      eta $$2 = new eta($$1).c(8.0, 6.0, 8.0);
      List<ccu> $$3 = $$0.a(ccu.class, $$2);
      if (!$$3.isEmpty()) {
         List<ckl> $$4 = $$0.a(ckl.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (ccu $$5 : $$3) {
            if ($$5.p() == null) {
               ckl $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(czu $$0, im $$1) {
      a($$0, $$1, new csd(csg.ww, 3));
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cry $$9 = $$0.f();
         if ($$0.a(csg.rV)) {
            $$2.a($$4, $$4.ds(), $$4.du(), $$4.dy(), auz.bX, ava.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bre.d($$5));
            $$8 = true;
            $$2.a($$4, dur.M, $$3);
         } else if ($$0.a(csg.sl)) {
            $$0.g(1);
            $$2.a($$4, $$4.ds(), $$4.du(), $$4.dy(), auz.cC, ava.e, 1.0F, 1.0F);
            if ($$0.d()) {
               $$4.a($$5, new csd(csg.wz));
            } else if (!$$4.ga().e(new csd(csg.wz))) {
               $$4.a(new csd(csg.wz), false);
            }

            $$8 = true;
            $$2.a($$4, dur.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(avj.c.b($$9));
         }
      }

      if ($$8) {
         if (!ddj.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dna.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bos.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(czu $$0, im $$1) {
      return $$0.c_($$1) instanceof dna $$3 ? !$$3.c() : false;
   }

   public void a(czu $$0, dpy $$1, im $$2, @Nullable ckl $$3, dna.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dna $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(czu $$0, dpy $$1, im $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(czu $$0, im $$1, dpy $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         ety $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ir.a.b);
         if ($$4 >= 1.0 && !$$2.a(avo.ao)) {
            double $$5 = $$3.b(ir.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               im $$6 = $$1.d();
               dpy $$7 = $$0.a_($$6);
               ety $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ir.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(czu $$0, im $$1, ety $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ir.a.a), (double)$$1.u() + $$2.c(ir.a.a), (double)$$1.w() + $$2.b(ir.a.c), (double)$$1.w() + $$2.c(ir.a.c), $$3);
   }

   private void a(czu $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(kw.as, axw.d($$0.z.j(), $$1, $$2), $$5, axw.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Nullable
   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dna($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return $$0.B ? null : a($$2, dnf.H, dna::a);
   }

   @Override
   public dpy a(czu $$0, im $$1, dpy $$2, ckl $$3) {
      if (!$$0.B && $$3.f() && $$0.aa().b(czq.h) && $$0.c_($$1) instanceof dna $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            csd $$8 = new csd(this);
            $$8.a($$5.s());
            $$8.b(jz.R, cum.a.a(c, $$6));
            cgv $$9 = new cgv($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<csd> a(dpy $$0, eog.a $$1) {
      bql $$2 = $$1.b(eqt.a);
      if ($$2 instanceof cgw || $$2 instanceof chd || $$2 instanceof clr || $$2 instanceof cgj || $$2 instanceof cms) {
         dnd $$3 = $$1.b(eqt.h);
         if ($$3 instanceof dna $$4) {
            $$4.a(null, $$0, dna.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$3.a_($$5).b() instanceof dfv && $$3.c_($$4) instanceof dna $$7) {
         $$7.a(null, $$0, dna.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
