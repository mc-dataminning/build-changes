import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dka extends die implements dju, dkf {
   public static final MapCodec<dka> c = b(dka::new);
   private static final dqy d = dqx.C;
   private final dif e = new dif(new dka.a(dif.a));
   private final dif f = new dif(new dka.a(dif.e.a));

   @Override
   public MapCodec<dka> a() {
      return c;
   }

   public dka(dqg.d $$0) {
      super($$0);
      this.k(this.n().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dif c() {
      return this.e;
   }

   public dif k() {
      return this.f;
   }

   public static boolean a(dae $$0, in $$1, dqh $$2, Collection<is> $$3) {
      boolean $$4 = false;
      dqh $$5 = ddg.qT.n();

      for (is $$6 : $$3) {
         in $$7 = $$1.a($$6);
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
   public void a(dae $$0, dqh $$1, in $$2, ayg $$3) {
      if ($$1.a(this)) {
         for (is $$4 : b) {
            dqy $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(ddg.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            ema $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? ddg.a : ddg.G).n();
         }

         $$0.a($$2, $$1, 3);
         dju.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(djz.a $$0, dae $$1, in $$2, ayg $$3, djz $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? axz.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(djz $$0, dae $$1, in $$2, ayg $$3) {
      dqh $$4 = $$1.a_($$2);
      awg<dde> $$5 = $$0.c();

      for (is $$6 : is.a($$3)) {
         if (a($$4, $$6)) {
            in $$7 = $$2.a($$6);
            dqh $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dqh $$9 = ddg.qS.n();
               $$1.a($$7, $$9, 3);
               dde.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, avc.vF, avd.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               is $$10 = $$6.g();

               for (is $$11 : b) {
                  if ($$11 != $$10) {
                     in $$12 = $$7.a($$11);
                     dqh $$13 = $$1.a_($$12);
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

   public static boolean a(dae $$0, dqh $$1, in $$2) {
      if (!$$1.a(ddg.qT)) {
         return false;
      } else {
         for (is $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(avr.bS)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dqh $$0, cwi $$1) {
      return !$$1.n().a(ctc.gi) || super.a($$0, $$1);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(d) ? emb.c.a(false) : super.b_($$0);
   }

   class a extends dif.a {
      private final dif.e[] c;

      public a(dif.e... $$0) {
         super(dka.this);
         this.c = $$0;
      }

      @Override
      public boolean a(czj $$0, in $$1, in $$2, is $$3, dqh $$4) {
         dqh $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(ddg.qS) && !$$5.a(ddg.qU) && !$$5.a(ddg.bQ)) {
            if ($$1.k($$2) == 2) {
               in $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            ema $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(emb.c)) {
               return false;
            } else {
               return $$4.a(avr.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dif.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dqh $$0) {
         return !$$0.a(ddg.qT);
      }
   }
}
