import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dtj extends drm implements dtd {
   public static final MapCodec<dtj> e = b(dtj::new);
   private final drn f = new drn(new dtj.a(drn.a));
   private final drn g = new drn(new dtj.a(drn.e.a));

   @Override
   public MapCodec<dtj> a() {
      return e;
   }

   public dtj(eag.d $$0) {
      super($$0);
   }

   @Override
   public drn c() {
      return this.f;
   }

   public drn q() {
      return this.g;
   }

   public static boolean a(djb $$0, iu $$1, eah $$2, Collection<ja> $$3) {
      boolean $$4 = false;
      eah $$5 = dmh.rB.m();

      for (ja $$6 : $$3) {
         if (a($$0, $$1, $$6)) {
            $$5 = $$5.b(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.y().c()) {
            $$5 = $$5.b(drl.c, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(djb $$0, eah $$1, iu $$2, azv $$3) {
      if ($$1.a(this)) {
         for (ja $$4 : d) {
            eay $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dmh.rA)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            ewo $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dmh.a : dmh.J).m();
         }

         $$0.a($$2, $$1, 3);
         dtd.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dti.a $$0, djb $$1, iu $$2, azv $$3, dti $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azm.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dti $$0, djb $$1, iu $$2, azv $$3) {
      eah $$4 = $$1.a_($$2);
      axr<dmf> $$5 = $$0.c();

      for (ja $$6 : ja.a($$3)) {
         if (a($$4, $$6)) {
            iu $$7 = $$2.a($$6);
            eah $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               eah $$9 = dmh.rA.m();
               $$1.a($$7, $$9, 3);
               dmf.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awn.wJ, awo.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               ja $$10 = $$6.g();

               for (ja $$11 : d) {
                  if ($$11 != $$10) {
                     iu $$12 = $$7.a($$11);
                     eah $$13 = $$1.a_($$12);
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

   public static boolean a(djb $$0, eah $$1, iu $$2) {
      if (!$$1.a(dmh.rB)) {
         return false;
      } else {
         for (ja $$3 : d) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(axc.bW)) {
               return true;
            }
         }

         return false;
      }
   }

   class a extends drn.a {
      private final drn.e[] b;

      public a(final drn.e... $$0) {
         super(dtj.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dig $$0, iu $$1, iu $$2, ja $$3, eah $$4) {
         eah $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dmh.rA) && !$$5.a(dmh.rC) && !$$5.a(dmh.ca)) {
            if ($$1.k($$2) == 2) {
               iu $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            ewo $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(ewp.c)) {
               return false;
            } else {
               return $$4.a(axc.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public drn.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(eah $$0) {
         return !$$0.a(dmh.rB);
      }
   }
}
