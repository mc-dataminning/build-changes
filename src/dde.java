import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dde extends dbi implements dcy, ddj {
   public static final MapCodec<dde> c = b(dde::new);
   private static final djr d = djq.C;
   private final dbj e = new dbj(new dde.a(dbj.a));
   private final dbj f = new dbj(new dde.a(dbj.e.a));

   @Override
   public MapCodec<dde> a() {
      return c;
   }

   public dde(diz.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dbj c() {
      return this.e;
   }

   public dbj g() {
      return this.f;
   }

   public static boolean a(ctj $$0, hx $$1, dja $$2, Collection<ic> $$3) {
      boolean $$4 = false;
      dja $$5 = cwl.qT.o();

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
   public void a(ctj $$0, dja $$1, hx $$2, aup $$3) {
      if ($$1.a(this)) {
         for (ic $$4 : b) {
            djr $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(cwl.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eek $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? cwl.a : cwl.G).o();
         }

         $$0.a($$2, $$1, 3);
         dcy.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(ddd.a $$0, ctj $$1, hx $$2, aup $$3, ddd $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? aui.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(ddd $$0, ctj $$1, hx $$2, aup $$3) {
      dja $$4 = $$1.a_($$2);
      asq<cwj> $$5 = $$0.c();

      for (ic $$6 : ic.a($$3)) {
         if (a($$4, $$6)) {
            hx $$7 = $$2.a($$6);
            dja $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dja $$9 = cwl.qS.o();
               $$1.a($$7, $$9, 3);
               cwj.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, arm.uW, arn.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ic $$10 = $$6.g();

               for (ic $$11 : b) {
                  if ($$11 != $$10) {
                     hx $$12 = $$7.a($$11);
                     dja $$13 = $$1.a_($$12);
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

   public static boolean a(ctj $$0, dja $$1, hx $$2) {
      if (!$$1.a(cwl.qT)) {
         return false;
      } else {
         for (ic $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(asb.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   public boolean a(dja $$0, cpa $$1) {
      return !$$1.n().a(cmu.gh) || super.a($$0, $$1);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(d) ? eel.c.a(false) : super.c_($$0);
   }

   class a extends dbj.a {
      private final dbj.e[] c;

      public a(dbj.e... $$0) {
         super(dde.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cso $$0, hx $$1, hx $$2, ic $$3, dja $$4) {
         dja $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(cwl.qS) && !$$5.a(cwl.qU) && !$$5.a(cwl.bQ)) {
            if ($$1.k($$2) == 2) {
               hx $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eek $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(eel.c)) {
               return false;
            } else {
               return $$4.a(asb.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dbj.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dja $$0) {
         return !$$0.a(cwl.qT);
      }
   }
}
