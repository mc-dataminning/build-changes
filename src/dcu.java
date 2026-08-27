import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dcu extends day implements dco, dcz {
   public static final MapCodec<dcu> c = b(dcu::new);
   private static final djg d = djf.C;
   private final daz e = new daz(new dcu.a(daz.a));
   private final daz f = new daz(new dcu.a(daz.e.a));

   @Override
   public MapCodec<dcu> a() {
      return c;
   }

   public dcu(dio.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public daz c() {
      return this.e;
   }

   public daz g() {
      return this.f;
   }

   public static boolean a(csz $$0, hv $$1, dip $$2, Collection<ia> $$3) {
      boolean $$4 = false;
      dip $$5 = cwb.qT.o();

      for (ia $$6 : $$3) {
         hv $$7 = $$1.a($$6);
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
   public void a(csz $$0, dip $$1, hv $$2, auf $$3) {
      if ($$1.a(this)) {
         for (ia $$4 : b) {
            djg $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(cwb.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            edz $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? cwb.a : cwb.G).o();
         }

         $$0.a($$2, $$1, 3);
         dco.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dct.a $$0, csz $$1, hv $$2, auf $$3, dct $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? aty.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dct $$0, csz $$1, hv $$2, auf $$3) {
      dip $$4 = $$1.a_($$2);
      asg<cvz> $$5 = $$0.c();

      for (ia $$6 : ia.a($$3)) {
         if (a($$4, $$6)) {
            hv $$7 = $$2.a($$6);
            dip $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dip $$9 = cwb.qS.o();
               $$1.a($$7, $$9, 3);
               cvz.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, arc.uW, ard.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ia $$10 = $$6.g();

               for (ia $$11 : b) {
                  if ($$11 != $$10) {
                     hv $$12 = $$7.a($$11);
                     dip $$13 = $$1.a_($$12);
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

   public static boolean a(csz $$0, dip $$1, hv $$2) {
      if (!$$1.a(cwb.qT)) {
         return false;
      } else {
         for (ia $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(arr.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   public boolean a(dip $$0, coq $$1) {
      return !$$1.n().a(cmk.gh) || super.a($$0, $$1);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(d) ? eea.c.a(false) : super.c_($$0);
   }

   class a extends daz.a {
      private final daz.e[] c;

      public a(daz.e... $$0) {
         super(dcu.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cse $$0, hv $$1, hv $$2, ia $$3, dip $$4) {
         dip $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(cwb.qS) && !$$5.a(cwb.qU) && !$$5.a(cwb.bQ)) {
            if ($$1.k($$2) == 2) {
               hv $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            edz $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(eea.c)) {
               return false;
            } else {
               return $$4.a(arr.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public daz.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dip $$0) {
         return !$$0.a(cwb.qT);
      }
   }
}
