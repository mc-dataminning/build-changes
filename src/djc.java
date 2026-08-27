import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class djc extends dhg implements diw, djh {
   public static final MapCodec<djc> c = b(djc::new);
   private static final dpz d = dpy.C;
   private final dhh e = new dhh(new djc.a(dhh.a));
   private final dhh f = new dhh(new djc.a(dhh.e.a));

   @Override
   public MapCodec<djc> a() {
      return c;
   }

   public djc(dph.d $$0) {
      super($$0);
      this.k(this.n().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dhh c() {
      return this.e;
   }

   public dhh k() {
      return this.f;
   }

   public static boolean a(czh $$0, id $$1, dpi $$2, Collection<ij> $$3) {
      boolean $$4 = false;
      dpi $$5 = dcj.qT.n();

      for (ij $$6 : $$3) {
         id $$7 = $$1.a($$6);
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
   public void a(czh $$0, dpi $$1, id $$2, axt $$3) {
      if ($$1.a(this)) {
         for (ij $$4 : b) {
            dpz $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dcj.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            elb $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dcj.a : dcj.G).n();
         }

         $$0.a($$2, $$1, 3);
         diw.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(djb.a $$0, czh $$1, id $$2, axt $$3, djb $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? axm.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(djb $$0, czh $$1, id $$2, axt $$3) {
      dpi $$4 = $$1.a_($$2);
      avt<dch> $$5 = $$0.c();

      for (ij $$6 : ij.a($$3)) {
         if (a($$4, $$6)) {
            id $$7 = $$2.a($$6);
            dpi $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dpi $$9 = dcj.qS.n();
               $$1.a($$7, $$9, 3);
               dch.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, auo.vx, aup.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ij $$10 = $$6.g();

               for (ij $$11 : b) {
                  if ($$11 != $$10) {
                     id $$12 = $$7.a($$11);
                     dpi $$13 = $$1.a_($$12);
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

   public static boolean a(czh $$0, dpi $$1, id $$2) {
      if (!$$1.a(dcj.qT)) {
         return false;
      } else {
         for (ij $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(ave.bM)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dpi $$0, cux $$1) {
      return !$$1.n().a(crv.gh) || super.a($$0, $$1);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(d) ? elc.c.a(false) : super.c_($$0);
   }

   class a extends dhh.a {
      private final dhh.e[] c;

      public a(dhh.e... $$0) {
         super(djc.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cym $$0, id $$1, id $$2, ij $$3, dpi $$4) {
         dpi $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dcj.qS) && !$$5.a(dcj.qU) && !$$5.a(dcj.bQ)) {
            if ($$1.k($$2) == 2) {
               id $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            elb $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(elc.c)) {
               return false;
            } else {
               return $$4.a(ave.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dhh.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dpi $$0) {
         return !$$0.a(dcj.qT);
      }
   }
}
