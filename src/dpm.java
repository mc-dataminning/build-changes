import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dpm extends dnp implements dpg, dpr {
   public static final MapCodec<dpm> c = b(dpm::new);
   private static final dwm d = dwl.C;
   private final dnq e = new dnq(new dpm.a(dnq.a));
   private final dnq f = new dnq(new dpm.a(dnq.e.a));

   @Override
   public MapCodec<dpm> a() {
      return c;
   }

   public dpm(dvu.d $$0) {
      super($$0);
      this.l(this.m().b(d, Boolean.valueOf(false)));
   }

   @Override
   public dnq c() {
      return this.e;
   }

   public dnq q() {
      return this.f;
   }

   public static boolean a(dfn $$0, jh $$1, dvv $$2, Collection<jm> $$3) {
      boolean $$4 = false;
      dvv $$5 = dis.qT.m();

      for (jm $$6 : $$3) {
         jh $$7 = $$1.a($$6);
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
   public void a(dfn $$0, dvv $$1, jh $$2, azu $$3) {
      if ($$1.a(this)) {
         for (jm $$4 : b) {
            dwm $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dis.qS)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            erv $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dis.a : dis.G).m();
         }

         $$0.a($$2, $$1, 3);
         dpg.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dpl.a $$0, dfn $$1, jh $$2, azu $$3, dpl $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azm.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dpl $$0, dfn $$1, jh $$2, azu $$3) {
      dvv $$4 = $$1.a_($$2);
      axs<diq> $$5 = $$0.c();

      for (jm $$6 : jm.a($$3)) {
         if (a($$4, $$6)) {
            jh $$7 = $$2.a($$6);
            dvv $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dvv $$9 = dis.qS.m();
               $$1.a($$7, $$9, 3);
               diq.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awn.vS, awo.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               jm $$10 = $$6.g();

               for (jm $$11 : b) {
                  if ($$11 != $$10) {
                     jh $$12 = $$7.a($$11);
                     dvv $$13 = $$1.a_($$12);
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

   public static boolean a(dfn $$0, dvv $$1, jh $$2) {
      if (!$$1.a(dis.qT)) {
         return false;
      } else {
         for (jm $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(axc.bT)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dvv $$0, dad $$1) {
      return !$$1.n().a(cwq.gi) || super.a($$0, $$1);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(d) ? erw.c.a(false) : super.b_($$0);
   }

   class a extends dnq.a {
      private final dnq.e[] b;

      public a(final dnq.e... $$0) {
         super(dpm.this);
         this.b = $$0;
      }

      @Override
      public boolean a(der $$0, jh $$1, jh $$2, jm $$3, dvv $$4) {
         dvv $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dis.qS) && !$$5.a(dis.qU) && !$$5.a(dis.bQ)) {
            if ($$1.k($$2) == 2) {
               jh $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            erv $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(erw.c)) {
               return false;
            } else {
               return $$4.a(axc.aM) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dnq.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dvv $$0) {
         return !$$0.a(dis.qT);
      }
   }
}
