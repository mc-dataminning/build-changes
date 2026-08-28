import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dns extends dlv implements dnm, dnx {
   public static final MapCodec<dns> c = b(dns::new);
   private static final dur d = duq.C;
   private final dlw e = new dlw(new dns.a(dlw.a));
   private final dlw f = new dlw(new dns.a(dlw.e.a));

   @Override
   public MapCodec<dns> a() {
      return c;
   }

   public dns(dtz.d $$0) {
      super($$0);
      this.l(this.o().b(d, Boolean.valueOf(false)));
   }

   @Override
   public dlw c() {
      return this.e;
   }

   public dlw m() {
      return this.f;
   }

   public static boolean a(ddt $$0, je $$1, dua $$2, Collection<jj> $$3) {
      boolean $$4 = false;
      dua $$5 = dgx.qT.o();

      for (jj $$6 : $$3) {
         je $$7 = $$1.a($$6);
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
   public void a(ddt $$0, dua $$1, je $$2, azk $$3) {
      if ($$1.a(this)) {
         for (jj $$4 : b) {
            dur $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dgx.qS)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            eqb $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dgx.a : dgx.G).o();
         }

         $$0.a($$2, $$1, 3);
         dnm.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dnr.a $$0, ddt $$1, je $$2, azk $$3, dnr $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azc.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dnr $$0, ddt $$1, je $$2, azk $$3) {
      dua $$4 = $$1.a_($$2);
      axi<dgv> $$5 = $$0.c();

      for (jj $$6 : jj.a($$3)) {
         if (a($$4, $$6)) {
            je $$7 = $$2.a($$6);
            dua $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dua $$9 = dgx.qS.o();
               $$1.a($$7, $$9, 3);
               dgv.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awd.vU, awe.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               jj $$10 = $$6.g();

               for (jj $$11 : b) {
                  if ($$11 != $$10) {
                     je $$12 = $$7.a($$11);
                     dua $$13 = $$1.a_($$12);
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

   public static boolean a(ddt $$0, dua $$1, je $$2) {
      if (!$$1.a(dgx.qT)) {
         return false;
      } else {
         for (jj $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(aws.bT)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dua $$0, cyw $$1) {
      return !$$1.n().a(cvo.gi) || super.a($$0, $$1);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(d) ? eqc.c.a(false) : super.b_($$0);
   }

   class a extends dlw.a {
      private final dlw.e[] b;

      public a(final dlw.e... $$0) {
         super(dns.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dcx $$0, je $$1, je $$2, jj $$3, dua $$4) {
         dua $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dgx.qS) && !$$5.a(dgx.qU) && !$$5.a(dgx.bQ)) {
            if ($$1.k($$2) == 2) {
               je $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            eqb $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(eqc.c)) {
               return false;
            } else {
               return $$4.a(aws.aL) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dlw.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dua $$0) {
         return !$$0.a(dgx.qT);
      }
   }
}
