import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dug extends dsj implements dua {
   public static final MapCodec<dug> e = b(dug::new);
   private final dsk f = new dsk(new dug.a(dsk.a));
   private final dsk g = new dsk(new dug.a(dsk.e.a));

   @Override
   public MapCodec<dug> a() {
      return e;
   }

   public dug(ebd.d $$0) {
      super($$0);
   }

   @Override
   public dsk c() {
      return this.f;
   }

   public dsk q() {
      return this.g;
   }

   public static boolean a(djy $$0, iv $$1, ebe $$2, Collection<jb> $$3) {
      boolean $$4 = false;
      ebe $$5 = dne.rB.m();

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
            $$5 = $$5.b(dsi.c, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(djy $$0, ebe $$1, iv $$2, azx $$3) {
      if ($$1.a(this)) {
         for (jb $$4 : d) {
            ebv $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dne.rA)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            exo $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dne.a : dne.J).m();
         }

         $$0.a($$2, $$1, 3);
         dua.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(duf.a $$0, djy $$1, iv $$2, azx $$3, duf $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azo.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(duf $$0, djy $$1, iv $$2, azx $$3) {
      ebe $$4 = $$1.a_($$2);
      axt<dnc> $$5 = $$0.c();

      for (jb $$6 : jb.a($$3)) {
         if (a($$4, $$6)) {
            iv $$7 = $$2.a($$6);
            ebe $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               ebe $$9 = dne.rA.m();
               $$1.a($$7, $$9, 3);
               dnc.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awp.wJ, awq.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               jb $$10 = $$6.g();

               for (jb $$11 : d) {
                  if ($$11 != $$10) {
                     iv $$12 = $$7.a($$11);
                     ebe $$13 = $$1.a_($$12);
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

   public static boolean a(djy $$0, ebe $$1, iv $$2) {
      if (!$$1.a(dne.rB)) {
         return false;
      } else {
         for (jb $$3 : d) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(axe.bW)) {
               return true;
            }
         }

         return false;
      }
   }

   class a extends dsk.a {
      private final dsk.e[] b;

      public a(final dsk.e... $$0) {
         super(dug.this);
         this.b = $$0;
      }

      @Override
      public boolean a(djb $$0, iv $$1, iv $$2, jb $$3, ebe $$4) {
         ebe $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dne.rA) && !$$5.a(dne.rC) && !$$5.a(dne.ca)) {
            if ($$1.k($$2) == 2) {
               iv $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            exo $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(exp.c)) {
               return false;
            } else {
               return $$4.a(axe.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dsk.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(ebe $$0) {
         return !$$0.a(dne.rB);
      }
   }
}
