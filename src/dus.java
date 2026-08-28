import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dus extends dsv implements dum {
   public static final MapCodec<dus> e = b(dus::new);
   private final dsw f = new dsw(new dus.a(dsw.a));
   private final dsw g = new dsw(new dus.a(dsw.e.a));

   @Override
   public MapCodec<dus> a() {
      return e;
   }

   public dus(ebp.d $$0) {
      super($$0);
   }

   @Override
   public dsw c() {
      return this.f;
   }

   public dsw q() {
      return this.g;
   }

   public static boolean a(dkk $$0, iw $$1, ebq $$2, Collection<jc> $$3) {
      boolean $$4 = false;
      ebq $$5 = dnq.rB.m();

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
            $$5 = $$5.b(dsu.c, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dkk $$0, ebq $$1, iw $$2, bai $$3) {
      if ($$1.a(this)) {
         for (jc $$4 : d) {
            ech $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dnq.rA)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            eya $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dnq.a : dnq.J).m();
         }

         $$0.a($$2, $$1, 3);
         dum.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dur.a $$0, dkk $$1, iw $$2, bai $$3, dur $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azz.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dur $$0, dkk $$1, iw $$2, bai $$3) {
      ebq $$4 = $$1.a_($$2);
      ayc<dno> $$5 = $$0.c();

      for (jc $$6 : jc.a($$3)) {
         if (a($$4, $$6)) {
            iw $$7 = $$2.a($$6);
            ebq $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               ebq $$9 = dnq.rA.m();
               $$1.a($$7, $$9, 3);
               dno.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awy.wJ, awz.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               jc $$10 = $$6.g();

               for (jc $$11 : d) {
                  if ($$11 != $$10) {
                     iw $$12 = $$7.a($$11);
                     ebq $$13 = $$1.a_($$12);
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

   public static boolean a(dkk $$0, ebq $$1, iw $$2) {
      if (!$$1.a(dnq.rB)) {
         return false;
      } else {
         for (jc $$3 : d) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(axn.bW)) {
               return true;
            }
         }

         return false;
      }
   }

   class a extends dsw.a {
      private final dsw.e[] b;

      public a(final dsw.e... $$0) {
         super(dus.this);
         this.b = $$0;
      }

      @Override
      public boolean a(djn $$0, iw $$1, iw $$2, jc $$3, ebq $$4) {
         ebq $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dnq.rA) && !$$5.a(dnq.rC) && !$$5.a(dnq.ca)) {
            if ($$1.k($$2) == 2) {
               iw $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            eya $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(eyb.c)) {
               return false;
            } else {
               return $$4.a(axn.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dsw.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(ebq $$0) {
         return !$$0.a(dnq.rB);
      }
   }
}
