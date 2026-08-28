import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dlq extends dju implements dlk, dlv {
   public static final MapCodec<dlq> c = b(dlq::new);
   private static final dso d = dsn.C;
   private final djv e = new djv(new dlq.a(djv.a));
   private final djv f = new djv(new dlq.a(djv.e.a));

   @Override
   public MapCodec<dlq> a() {
      return c;
   }

   public dlq(drw.d $$0) {
      super($$0);
      this.k(this.n().a(d, Boolean.valueOf(false)));
   }

   @Override
   public djv c() {
      return this.e;
   }

   public djv m() {
      return this.f;
   }

   public static boolean a(dbu $$0, iz $$1, drx $$2, Collection<je> $$3) {
      boolean $$4 = false;
      drx $$5 = dew.qT.n();

      for (je $$6 : $$3) {
         iz $$7 = $$1.a($$6);
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
   public void a(dbu $$0, drx $$1, iz $$2, azc $$3) {
      if ($$1.a(this)) {
         for (je $$4 : b) {
            dso $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dew.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            enq $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dew.a : dew.G).n();
         }

         $$0.a($$2, $$1, 3);
         dlk.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dlp.a $$0, dbu $$1, iz $$2, azc $$3, dlp $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayu.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dlp $$0, dbu $$1, iz $$2, azc $$3) {
      drx $$4 = $$1.a_($$2);
      axb<deu> $$5 = $$0.c();

      for (je $$6 : je.a($$3)) {
         if (a($$4, $$6)) {
            iz $$7 = $$2.a($$6);
            drx $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               drx $$9 = dew.qS.n();
               $$1.a($$7, $$9, 3);
               deu.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, avw.vQ, avx.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               je $$10 = $$6.g();

               for (je $$11 : b) {
                  if ($$11 != $$10) {
                     iz $$12 = $$7.a($$11);
                     drx $$13 = $$1.a_($$12);
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

   public static boolean a(dbu $$0, drx $$1, iz $$2) {
      if (!$$1.a(dew.qT)) {
         return false;
      } else {
         for (je $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awl.bS)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(drx $$0, cxv $$1) {
      return !$$1.n().a(cun.gi) || super.a($$0, $$1);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(d) ? enr.c.a(false) : super.b_($$0);
   }

   class a extends djv.a {
      private final djv.e[] b;

      public a(final djv.e... $$0) {
         super(dlq.this);
         this.b = $$0;
      }

      @Override
      public boolean a(daz $$0, iz $$1, iz $$2, je $$3, drx $$4) {
         drx $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dew.qS) && !$$5.a(dew.qU) && !$$5.a(dew.bQ)) {
            if ($$1.k($$2) == 2) {
               iz $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            enq $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(enr.c)) {
               return false;
            } else {
               return $$4.a(awl.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public djv.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(drx $$0) {
         return !$$0.a(dew.qT);
      }
   }
}
