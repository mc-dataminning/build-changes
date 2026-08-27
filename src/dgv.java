import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dgv extends dez implements dgp, dha {
   public static final MapCodec<dgv> c = b(dgv::new);
   private static final dnq d = dnp.C;
   private final dfa e = new dfa(new dgv.a(dfa.a));
   private final dfa f = new dfa(new dgv.a(dfa.e.a));

   @Override
   public MapCodec<dgv> a() {
      return c;
   }

   public dgv(dmy.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dfa c() {
      return this.e;
   }

   public dfa i() {
      return this.f;
   }

   public static boolean a(cxa $$0, ib $$1, dmz $$2, Collection<ih> $$3) {
      boolean $$4 = false;
      dmz $$5 = dac.qT.o();

      for (ih $$6 : $$3) {
         ib $$7 = $$1.a($$6);
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
   public void a(cxa $$0, dmz $$1, ib $$2, axd $$3) {
      if ($$1.a(this)) {
         for (ih $$4 : b) {
            dnq $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dac.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            ein $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dac.a : dac.G).o();
         }

         $$0.a($$2, $$1, 3);
         dgp.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dgu.a $$0, cxa $$1, ib $$2, axd $$3, dgu $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? aww.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dgu $$0, cxa $$1, ib $$2, axd $$3) {
      dmz $$4 = $$1.a_($$2);
      avd<daa> $$5 = $$0.c();

      for (ih $$6 : ih.a($$3)) {
         if (a($$4, $$6)) {
            ib $$7 = $$2.a($$6);
            dmz $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dmz $$9 = dac.qS.o();
               $$1.a($$7, $$9, 3);
               daa.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, aty.vp, atz.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ih $$10 = $$6.g();

               for (ih $$11 : b) {
                  if ($$11 != $$10) {
                     ib $$12 = $$7.a($$11);
                     dmz $$13 = $$1.a_($$12);
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

   public static boolean a(cxa $$0, dmz $$1, ib $$2) {
      if (!$$1.a(dac.qT)) {
         return false;
      } else {
         for (ih $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(aun.bM)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dmz $$0, css $$1) {
      return !$$1.n().a(cqn.gh) || super.a($$0, $$1);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(d) ? eio.c.a(false) : super.c_($$0);
   }

   class a extends dfa.a {
      private final dfa.e[] c;

      public a(dfa.e... $$0) {
         super(dgv.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cwf $$0, ib $$1, ib $$2, ih $$3, dmz $$4) {
         dmz $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dac.qS) && !$$5.a(dac.qU) && !$$5.a(dac.bQ)) {
            if ($$1.k($$2) == 2) {
               ib $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            ein $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(eio.c)) {
               return false;
            } else {
               return $$4.a(aun.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dfa.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dmz $$0) {
         return !$$0.a(dac.qT);
      }
   }
}
