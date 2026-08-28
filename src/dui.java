import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dui extends dsl implements duc {
   public static final MapCodec<dui> e = b(dui::new);
   private final dsm f = new dsm(new dui.a(dsm.a));
   private final dsm g = new dsm(new dui.a(dsm.e.a));

   @Override
   public MapCodec<dui> a() {
      return e;
   }

   public dui(ebf.d $$0) {
      super($$0);
   }

   @Override
   public dsm c() {
      return this.f;
   }

   public dsm q() {
      return this.g;
   }

   public static boolean a(dka $$0, iw $$1, ebg $$2, Collection<jc> $$3) {
      boolean $$4 = false;
      ebg $$5 = dng.rB.m();

      for (jc $$6 : $$3) {
         if (a($$0, $$1, $$6)) {
            $$5 = $$5.b(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.y().c()) {
            $$5 = $$5.b(dsk.c, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dka $$0, ebg $$1, iw $$2, azz $$3) {
      if ($$1.a(this)) {
         for (jc $$4 : d) {
            ebx $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dng.rA)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            exq $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dng.a : dng.J).m();
         }

         $$0.a($$2, $$1, 3);
         duc.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(duh.a $$0, dka $$1, iw $$2, azz $$3, duh $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azq.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(duh $$0, dka $$1, iw $$2, azz $$3) {
      ebg $$4 = $$1.a_($$2);
      axv<dne> $$5 = $$0.c();

      for (jc $$6 : jc.a($$3)) {
         if (a($$4, $$6)) {
            iw $$7 = $$2.a($$6);
            ebg $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               ebg $$9 = dng.rA.m();
               $$1.a($$7, $$9, 3);
               dne.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awr.wJ, aws.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               jc $$10 = $$6.g();

               for (jc $$11 : d) {
                  if ($$11 != $$10) {
                     iw $$12 = $$7.a($$11);
                     ebg $$13 = $$1.a_($$12);
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

   public static boolean a(dka $$0, ebg $$1, iw $$2) {
      if (!$$1.a(dng.rB)) {
         return false;
      } else {
         for (jc $$3 : d) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(axg.bW)) {
               return true;
            }
         }

         return false;
      }
   }

   class a extends dsm.a {
      private final dsm.e[] b;

      public a(final dsm.e... $$0) {
         super(dui.this);
         this.b = $$0;
      }

      @Override
      public boolean a(djd $$0, iw $$1, iw $$2, jc $$3, ebg $$4) {
         ebg $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dng.rA) && !$$5.a(dng.rC) && !$$5.a(dng.ca)) {
            if ($$1.k($$2) == 2) {
               iw $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            exq $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(exr.c)) {
               return false;
            } else {
               return $$4.a(axg.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dsm.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(ebg $$0) {
         return !$$0.a(dng.rB);
      }
   }
}
