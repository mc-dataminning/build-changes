import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class akw<R extends der<?>> {
   private static final int a = -1;
   private final cry b;
   private final akw.a<R> c;
   private final boolean d;
   private final int e;
   private final int f;
   private final List<cxp> g;
   private final List<cxp> h;

   public static <I extends dex, R extends der<I>> cxh.a a(
      akw.a<R> $$0, int $$1, int $$2, List<cxp> $$3, List<cxp> $$4, cry $$5, dew<R> $$6, boolean $$7, boolean $$8
   ) {
      akw<R> $$9 = new akw<>($$0, $$5, $$7, $$1, $$2, $$3, $$4);
      if (!$$8 && !$$9.b()) {
         return cxh.a.a;
      } else {
         csf $$10 = new csf();
         $$5.a($$10);
         $$0.a($$10);
         return $$9.a($$6, $$10);
      }
   }

   private akw(akw.a<R> $$0, cry $$1, boolean $$2, int $$3, int $$4, List<cxp> $$5, List<cxp> $$6) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   private cxh.a a(dew<R> $$0, csf $$1) {
      if ($$1.a($$0.b(), null)) {
         this.b($$0, $$1);
         this.b.e();
         return cxh.a.a;
      } else {
         this.a();
         this.b.e();
         return cxh.a.b;
      }
   }

   private void a() {
      for (cxp $$0 : this.h) {
         daa $$1 = $$0.g().v();
         this.b.a($$1, false);
         $$0.f($$1);
      }

      this.c.a();
   }

   private void b(dew<R> $$0, csf $$1) {
      boolean $$2 = this.c.a($$0);
      int $$3 = $$1.b($$0.b(), null);
      if ($$2) {
         for (cxp $$4 : this.g) {
            daa $$5 = $$4.g();
            if (!$$5.f() && Math.min($$3, $$5.k()) < $$5.M() + 1) {
               return;
            }
         }
      }

      int $$6 = this.a($$3, $$2);
      List<jg<czw>> $$7 = new ArrayList<>();
      if ($$1.a($$0.b(), $$6, $$7::add)) {
         int $$8 = a($$6, $$7);
         if ($$8 != $$6) {
            $$7.clear();
            if (!$$1.a($$0.b(), $$8, $$7::add)) {
               return;
            }
         }

         this.a();
         akv.a(this.e, this.f, $$0.b(), $$0.b().ap_().a(), ($$2x, $$3x, $$4x, $$5) -> {
            if ($$2x != -1) {
               cxp $$6x = this.g.get($$3x);
               jg<czw> $$7x = $$7.get($$2x);
               int $$8x = $$8;

               while ($$8x > 0) {
                  $$8x = this.a($$6x, $$7x, $$8x);
                  if ($$8x == -1) {
                     return;
                  }
               }
            }
         });
      }
   }

   private static int a(int $$0, List<jg<czw>> $$1) {
      for (jg<czw> $$2 : $$1) {
         $$0 = Math.min($$0, $$2.a().g());
      }

      return $$0;
   }

   private int a(int $$0, boolean $$1) {
      if (this.d) {
         return $$0;
      } else if ($$1) {
         int $$2 = Integer.MAX_VALUE;

         for (cxp $$3 : this.g) {
            daa $$4 = $$3.g();
            if (!$$4.f() && $$2 > $$4.M()) {
               $$2 = $$4.M();
            }
         }

         if ($$2 != Integer.MAX_VALUE) {
            $$2++;
         }

         return $$2;
      } else {
         return 1;
      }
   }

   private int a(cxp $$0, jg<czw> $$1, int $$2) {
      daa $$3 = $$0.g();
      int $$4 = this.b.a($$1, $$3);
      if ($$4 == -1) {
         return -1;
      } else {
         daa $$5 = this.b.a($$4);
         daa $$6;
         if ($$2 < $$5.M()) {
            $$6 = this.b.a($$4, $$2);
         } else {
            $$6 = this.b.b($$4);
         }

         int $$8 = $$6.M();
         if ($$3.f()) {
            $$0.f($$6);
         } else {
            $$3.g($$8);
         }

         return $$2 - $$8;
      }
   }

   private boolean b() {
      List<daa> $$0 = Lists.newArrayList();
      int $$1 = this.c();

      for (cxp $$2 : this.g) {
         daa $$3 = $$2.g().v();
         if (!$$3.f()) {
            int $$4 = this.b.f($$3);
            if ($$4 == -1 && $$0.size() <= $$1) {
               for (daa $$5 : $$0) {
                  if (daa.b($$5, $$3) && $$5.M() != $$5.k() && $$5.M() + $$3.M() <= $$5.k()) {
                     $$5.g($$3.M());
                     $$3.e(0);
                     break;
                  }
               }

               if (!$$3.f()) {
                  if ($$0.size() >= $$1) {
                     return false;
                  }

                  $$0.add($$3);
               }
            } else if ($$4 == -1) {
               return false;
            }
         }
      }

      return true;
   }

   private int c() {
      int $$0 = 0;

      for (daa $$1 : this.b.i()) {
         if ($$1.f()) {
            $$0++;
         }
      }

      return $$0;
   }

   public interface a<T extends der<?>> {
      void a(csf var1);

      void a();

      boolean a(dew<T> var1);
   }
}
