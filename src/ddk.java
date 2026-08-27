import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class ddk extends dbo implements dde, ddp {
   public static final MapCodec<ddk> c = b(ddk::new);
   private static final djx d = djw.C;
   private final dbp e = new dbp(new ddk.a(dbp.a));
   private final dbp f = new dbp(new ddk.a(dbp.e.a));

   @Override
   public MapCodec<ddk> a() {
      return c;
   }

   public ddk(djf.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dbp c() {
      return this.e;
   }

   public dbp g() {
      return this.f;
   }

   public static boolean a(ctp $$0, hx $$1, djg $$2, Collection<ic> $$3) {
      boolean $$4 = false;
      djg $$5 = cwr.qT.o();

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
   public void a(ctp $$0, djg $$1, hx $$2, auu $$3) {
      if ($$1.a(this)) {
         for (ic $$4 : b) {
            djx $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(cwr.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eeq $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? cwr.a : cwr.G).o();
         }

         $$0.a($$2, $$1, 3);
         dde.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(ddj.a $$0, ctp $$1, hx $$2, auu $$3, ddj $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? aun.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(ddj $$0, ctp $$1, hx $$2, auu $$3) {
      djg $$4 = $$1.a_($$2);
      asv<cwp> $$5 = $$0.c();

      for (ic $$6 : ic.a($$3)) {
         if (a($$4, $$6)) {
            hx $$7 = $$2.a($$6);
            djg $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               djg $$9 = cwr.qS.o();
               $$1.a($$7, $$9, 3);
               cwp.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, arr.uW, ars.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ic $$10 = $$6.g();

               for (ic $$11 : b) {
                  if ($$11 != $$10) {
                     hx $$12 = $$7.a($$11);
                     djg $$13 = $$1.a_($$12);
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

   public static boolean a(ctp $$0, djg $$1, hx $$2) {
      if (!$$1.a(cwr.qT)) {
         return false;
      } else {
         for (ic $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(asg.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   public boolean a(djg $$0, cpg $$1) {
      return !$$1.n().a(cna.gh) || super.a($$0, $$1);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(d) ? eer.c.a(false) : super.c_($$0);
   }

   class a extends dbp.a {
      private final dbp.e[] c;

      public a(dbp.e... $$0) {
         super(ddk.this);
         this.c = $$0;
      }

      @Override
      public boolean a(csu $$0, hx $$1, hx $$2, ic $$3, djg $$4) {
         djg $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(cwr.qS) && !$$5.a(cwr.qU) && !$$5.a(cwr.bQ)) {
            if ($$1.k($$2) == 2) {
               hx $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eeq $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(eer.c)) {
               return false;
            } else {
               return $$4.a(asg.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dbp.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(djg $$0) {
         return !$$0.a(cwr.qT);
      }
   }
}
