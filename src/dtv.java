import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dtv extends dry implements dtp {
   public static final MapCodec<dtv> e = b(dtv::new);
   private final drz f = new drz(new dtv.a(drz.a));
   private final drz g = new drz(new dtv.a(drz.e.a));

   @Override
   public MapCodec<dtv> a() {
      return e;
   }

   public dtv(eas.d $$0) {
      super($$0);
   }

   @Override
   public drz c() {
      return this.f;
   }

   public drz q() {
      return this.g;
   }

   public static boolean a(djn $$0, iv $$1, eat $$2, Collection<jb> $$3) {
      boolean $$4 = false;
      eat $$5 = dmt.rB.m();

      for (jb $$6 : $$3) {
         if (a($$0, $$1, $$6)) {
            $$5 = $$5.b(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.y().c()) {
            $$5 = $$5.b(drx.c, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(djn $$0, eat $$1, iv $$2, azv $$3) {
      if ($$1.a(this)) {
         for (jb $$4 : d) {
            ebk $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dmt.rA)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            exa $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dmt.a : dmt.J).m();
         }

         $$0.a($$2, $$1, 3);
         dtp.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dtu.a $$0, djn $$1, iv $$2, azv $$3, dtu $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azm.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dtu $$0, djn $$1, iv $$2, azv $$3) {
      eat $$4 = $$1.a_($$2);
      axr<dmr> $$5 = $$0.c();

      for (jb $$6 : jb.a($$3)) {
         if (a($$4, $$6)) {
            iv $$7 = $$2.a($$6);
            eat $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               eat $$9 = dmt.rA.m();
               $$1.a($$7, $$9, 3);
               dmr.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awn.wJ, awo.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               jb $$10 = $$6.g();

               for (jb $$11 : d) {
                  if ($$11 != $$10) {
                     iv $$12 = $$7.a($$11);
                     eat $$13 = $$1.a_($$12);
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

   public static boolean a(djn $$0, eat $$1, iv $$2) {
      if (!$$1.a(dmt.rB)) {
         return false;
      } else {
         for (jb $$3 : d) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(axc.bW)) {
               return true;
            }
         }

         return false;
      }
   }

   class a extends drz.a {
      private final drz.e[] b;

      public a(final drz.e... $$0) {
         super(dtv.this);
         this.b = $$0;
      }

      @Override
      public boolean a(diq $$0, iv $$1, iv $$2, jb $$3, eat $$4) {
         eat $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dmt.rA) && !$$5.a(dmt.rC) && !$$5.a(dmt.ca)) {
            if ($$1.k($$2) == 2) {
               iv $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            exa $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(exb.c)) {
               return false;
            } else {
               return $$4.a(axc.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public drz.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(eat $$0) {
         return !$$0.a(dmt.rB);
      }
   }
}
