import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class djr extends dhv implements djl, djw {
   public static final MapCodec<djr> c = b(djr::new);
   private static final dqp d = dqo.C;
   private final dhw e = new dhw(new djr.a(dhw.a));
   private final dhw f = new dhw(new djr.a(dhw.e.a));

   @Override
   public MapCodec<djr> a() {
      return c;
   }

   public djr(dpx.d $$0) {
      super($$0);
      this.k(this.n().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dhw c() {
      return this.e;
   }

   public dhw k() {
      return this.f;
   }

   public static boolean a(czv $$0, im $$1, dpy $$2, Collection<ir> $$3) {
      boolean $$4 = false;
      dpy $$5 = dcx.qT.n();

      for (ir $$6 : $$3) {
         im $$7 = $$1.a($$6);
         if (a($$0, $$6, $$7, $$0.a_($$7))) {
            $$5 = $$5.a(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.u().c()) {
            $$5 = $$5.a(d, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(czv $$0, dpy $$1, im $$2, ayd $$3) {
      if ($$1.a(this)) {
         for (ir $$4 : b) {
            dqp $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dcx.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            elr $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dcx.a : dcx.G).n();
         }

         $$0.a($$2, $$1, 3);
         djl.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(djq.a $$0, czv $$1, im $$2, ayd $$3, djq $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? axw.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(djq $$0, czv $$1, im $$2, ayd $$3) {
      dpy $$4 = $$1.a_($$2);
      awd<dcv> $$5 = $$0.c();

      for (ir $$6 : ir.a($$3)) {
         if (a($$4, $$6)) {
            im $$7 = $$2.a($$6);
            dpy $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dpy $$9 = dcx.qS.n();
               $$1.a($$7, $$9, 3);
               dcv.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, auz.vE, ava.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ir $$10 = $$6.g();

               for (ir $$11 : b) {
                  if ($$11 != $$10) {
                     im $$12 = $$7.a($$11);
                     dpy $$13 = $$1.a_($$12);
                     if ($$13.a(this)) {
                        this.a($$1, $$13, $$12, $$3);
                     }
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   public static boolean a(czv $$0, dpy $$1, im $$2) {
      if (!$$1.a(dcx.qT)) {
         return false;
      } else {
         for (ir $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(avo.bM)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dpy $$0, cvl $$1) {
      return !$$1.n().a(csg.gi) || super.a($$0, $$1);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(d) ? els.c.a(false) : super.c_($$0);
   }

   class a extends dhw.a {
      private final dhw.e[] c;

      public a(dhw.e... $$0) {
         super(djr.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cza $$0, im $$1, im $$2, ir $$3, dpy $$4) {
         dpy $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dcx.qS) && !$$5.a(dcx.qU) && !$$5.a(dcx.bQ)) {
            if ($$1.k($$2) == 2) {
               im $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            elr $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(els.c)) {
               return false;
            } else {
               return $$4.a(avo.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dhw.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dpy $$0) {
         return !$$0.a(dcx.qT);
      }
   }
}
