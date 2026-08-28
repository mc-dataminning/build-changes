import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dou extends dmx implements doo, doz {
   public static final MapCodec<dou> c = b(dou::new);
   private static final dvu d = dvt.C;
   private final dmy e = new dmy(new dou.a(dmy.a));
   private final dmy f = new dmy(new dou.a(dmy.e.a));

   @Override
   public MapCodec<dou> a() {
      return c;
   }

   public dou(dvc.d $$0) {
      super($$0);
      this.l(this.m().b(d, Boolean.valueOf(false)));
   }

   @Override
   public dmy c() {
      return this.e;
   }

   public dmy q() {
      return this.f;
   }

   public static boolean a(dew $$0, jg $$1, dvd $$2, Collection<jl> $$3) {
      boolean $$4 = false;
      dvd $$5 = dia.qT.m();

      for (jl $$6 : $$3) {
         jg $$7 = $$1.a($$6);
         if (a($$0, $$6, $$7, $$0.a_($$7))) {
            $$5 = $$5.b(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.y().c()) {
            $$5 = $$5.b(d, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dew $$0, dvd $$1, jg $$2, azr $$3) {
      if ($$1.a(this)) {
         for (jl $$4 : b) {
            dvu $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dia.qS)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            ere $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dia.a : dia.G).m();
         }

         $$0.a($$2, $$1, 3);
         doo.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dot.a $$0, dew $$1, jg $$2, azr $$3, dot $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azj.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dot $$0, dew $$1, jg $$2, azr $$3) {
      dvd $$4 = $$1.a_($$2);
      axp<dhy> $$5 = $$0.c();

      for (jl $$6 : jl.a($$3)) {
         if (a($$4, $$6)) {
            jg $$7 = $$2.a($$6);
            dvd $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dvd $$9 = dia.qS.m();
               $$1.a($$7, $$9, 3);
               dhy.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awk.vS, awl.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               jl $$10 = $$6.g();

               for (jl $$11 : b) {
                  if ($$11 != $$10) {
                     jg $$12 = $$7.a($$11);
                     dvd $$13 = $$1.a_($$12);
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

   public static boolean a(dew $$0, dvd $$1, jg $$2) {
      if (!$$1.a(dia.qT)) {
         return false;
      } else {
         for (jl $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awz.bT)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dvd $$0, czm $$1) {
      return !$$1.n().a(cwb.gi) || super.a($$0, $$1);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(d) ? erf.c.a(false) : super.b_($$0);
   }

   class a extends dmy.a {
      private final dmy.e[] b;

      public a(final dmy.e... $$0) {
         super(dou.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dea $$0, jg $$1, jg $$2, jl $$3, dvd $$4) {
         dvd $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dia.qS) && !$$5.a(dia.qU) && !$$5.a(dia.bQ)) {
            if ($$1.k($$2) == 2) {
               jg $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            ere $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(erf.c)) {
               return false;
            } else {
               return $$4.a(awz.aL) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dmy.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dvd $$0) {
         return !$$0.a(dia.qT);
      }
   }
}
