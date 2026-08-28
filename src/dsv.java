import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dsv extends dqz implements dsp {
   public static final MapCodec<dsv> e = b(dsv::new);
   private final dra f = new dra(new dsv.a(dra.a));
   private final dra g = new dra(new dsv.a(dra.e.a));

   @Override
   public MapCodec<dsv> a() {
      return e;
   }

   public dsv(dzn.d $$0) {
      super($$0);
   }

   @Override
   public dra c() {
      return this.f;
   }

   public dra q() {
      return this.g;
   }

   public static boolean a(diq $$0, iu $$1, dzo $$2, Collection<ja> $$3) {
      boolean $$4 = false;
      dzo $$5 = dlw.rx.m();

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
            $$5 = $$5.b(dqy.c, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(diq $$0, dzo $$1, iu $$2, azt $$3) {
      if ($$1.a(this)) {
         for (ja $$4 : d) {
            eaf $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dlw.rw)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            evv $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dlw.a : dlw.J).m();
         }

         $$0.a($$2, $$1, 3);
         dsp.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dsu.a $$0, diq $$1, iu $$2, azt $$3, dsu $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azk.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dsu $$0, diq $$1, iu $$2, azt $$3) {
      dzo $$4 = $$1.a_($$2);
      axp<dlu> $$5 = $$0.c();

      for (ja $$6 : ja.a($$3)) {
         if (a($$4, $$6)) {
            iu $$7 = $$2.a($$6);
            dzo $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dzo $$9 = dlw.rw.m();
               $$1.a($$7, $$9, 3);
               dlu.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awl.wD, awm.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               ja $$10 = $$6.g();

               for (ja $$11 : d) {
                  if ($$11 != $$10) {
                     iu $$12 = $$7.a($$11);
                     dzo $$13 = $$1.a_($$12);
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

   public static boolean a(diq $$0, dzo $$1, iu $$2) {
      if (!$$1.a(dlw.rx)) {
         return false;
      } else {
         for (ja $$3 : d) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(axa.bV)) {
               return true;
            }
         }

         return false;
      }
   }

   class a extends dra.a {
      private final dra.e[] b;

      public a(final dra.e... $$0) {
         super(dsv.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dhv $$0, iu $$1, iu $$2, ja $$3, dzo $$4) {
         dzo $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dlw.rw) && !$$5.a(dlw.ry) && !$$5.a(dlw.bX)) {
            if ($$1.k($$2) == 2) {
               iu $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            evv $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(evw.c)) {
               return false;
            } else {
               return $$4.a(axa.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dra.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dzo $$0) {
         return !$$0.a(dlw.rx);
      }
   }
}
