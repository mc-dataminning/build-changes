import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class ddt extends dbx implements ddn, ddy {
   public static final MapCodec<ddt> c = b(ddt::new);
   private static final dkg d = dkf.C;
   private final dby e = new dby(new ddt.a(dby.a));
   private final dby f = new dby(new ddt.a(dby.e.a));

   @Override
   public MapCodec<ddt> a() {
      return c;
   }

   public ddt(djo.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dby c() {
      return this.e;
   }

   public dby g() {
      return this.f;
   }

   public static boolean a(cty $$0, hx $$1, djp $$2, Collection<ic> $$3) {
      boolean $$4 = false;
      djp $$5 = cxa.qT.o();

      for (ic $$6 : $$3) {
         hx $$7 = $$1.a($$6);
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
   public void a(cty $$0, djp $$1, hx $$2, auw $$3) {
      if ($$1.a(this)) {
         for (ic $$4 : b) {
            dkg $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(cxa.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eez $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? cxa.a : cxa.G).o();
         }

         $$0.a($$2, $$1, 3);
         ddn.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dds.a $$0, cty $$1, hx $$2, auw $$3, dds $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? aup.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dds $$0, cty $$1, hx $$2, auw $$3) {
      djp $$4 = $$1.a_($$2);
      asx<cwy> $$5 = $$0.c();

      for (ic $$6 : ic.a($$3)) {
         if (a($$4, $$6)) {
            hx $$7 = $$2.a($$6);
            djp $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               djp $$9 = cxa.qS.o();
               $$1.a($$7, $$9, 3);
               cwy.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, art.vl, aru.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ic $$10 = $$6.g();

               for (ic $$11 : b) {
                  if ($$11 != $$10) {
                     hx $$12 = $$7.a($$11);
                     djp $$13 = $$1.a_($$12);
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

   public static boolean a(cty $$0, djp $$1, hx $$2) {
      if (!$$1.a(cxa.qT)) {
         return false;
      } else {
         for (ic $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(asi.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   public boolean a(djp $$0, cpp $$1) {
      return !$$1.n().a(cnj.gh) || super.a($$0, $$1);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(d) ? efa.c.a(false) : super.c_($$0);
   }

   class a extends dby.a {
      private final dby.e[] c;

      public a(dby.e... $$0) {
         super(ddt.this);
         this.c = $$0;
      }

      @Override
      public boolean a(ctd $$0, hx $$1, hx $$2, ic $$3, djp $$4) {
         djp $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(cxa.qS) && !$$5.a(cxa.qU) && !$$5.a(cxa.bQ)) {
            if ($$1.k($$2) == 2) {
               hx $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eez $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(efa.c)) {
               return false;
            } else {
               return $$4.a(asi.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dby.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(djp $$0) {
         return !$$0.a(cxa.qT);
      }
   }
}
