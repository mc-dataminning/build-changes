import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class ald<R extends dfb<?>> {
   private static final int a = -1;
   private final csh b;
   private final ald.a<R> c;
   private final boolean d;
   private final int e;
   private final int f;
   private final List<cxz> g;
   private final List<cxz> h;

   public static <I extends dfh, R extends dfb<I>> cxq.a a(
      ald.a<R> $$0, int $$1, int $$2, List<cxz> $$3, List<cxz> $$4, csh $$5, dfg<R> $$6, boolean $$7, boolean $$8
   ) {
      ald<R> $$9 = new ald<>($$0, $$5, $$7, $$1, $$2, $$3, $$4);
      if (!$$8 && !$$9.b()) {
         return cxq.a.a;
      } else {
         cso $$10 = new cso();
         $$5.a($$10);
         $$0.a($$10);
         return $$9.a($$6, $$10);
      }
   }

   private ald(ald.a<R> $$0, csh $$1, boolean $$2, int $$3, int $$4, List<cxz> $$5, List<cxz> $$6) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   private cxq.a a(dfg<R> $$0, cso $$1) {
      if ($$1.a($$0.b(), null)) {
         this.b($$0, $$1);
         this.b.e();
         return cxq.a.a;
      } else {
         this.a();
         this.b.e();
         return cxq.a.b;
      }
   }

   private void a() {
      for (cxz $$0 : this.h) {
         dak $$1 = $$0.g().v();
         this.b.a($$1, false);
         $$0.f($$1);
      }

      this.c.a();
   }

   private void b(dfg<R> $$0, cso $$1) {
      boolean $$2 = this.c.a($$0);
      int $$3 = $$1.b($$0.b(), null);
      if ($$2) {
         for (cxz $$4 : this.g) {
            dak $$5 = $$4.g();
            if (!$$5.f() && Math.min($$3, $$5.k()) < $$5.M() + 1) {
               return;
            }
         }
      }

      int $$6 = this.a($$3, $$2);
      List<jg<dag>> $$7 = new ArrayList<>();
      if ($$1.a($$0.b(), $$6, $$7::add)) {
         int $$8 = a($$6, $$7);
         if ($$8 != $$6) {
            $$7.clear();
            if (!$$1.a($$0.b(), $$8, $$7::add)) {
               return;
            }
         }

         this.a();
         alc.a(this.e, this.f, $$0.b(), $$0.b().aq_().a(), ($$2x, $$3x, $$4x, $$5) -> {
            if ($$2x != -1) {
               cxz $$6x = this.g.get($$3x);
               jg<dag> $$7x = $$7.get($$2x);
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

   private static int a(int $$0, List<jg<dag>> $$1) {
      for (jg<dag> $$2 : $$1) {
         $$0 = Math.min($$0, $$2.a().g());
      }

      return $$0;
   }

   private int a(int $$0, boolean $$1) {
      if (this.d) {
         return $$0;
      } else if ($$1) {
         int $$2 = Integer.MAX_VALUE;

         for (cxz $$3 : this.g) {
            dak $$4 = $$3.g();
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

   private int a(cxz $$0, jg<dag> $$1, int $$2) {
      dak $$3 = $$0.g();
      int $$4 = this.b.a($$1, $$3);
      if ($$4 == -1) {
         return -1;
      } else {
         dak $$5 = this.b.a($$4);
         dak $$6;
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
      List<dak> $$0 = Lists.newArrayList();
      int $$1 = this.c();

      for (cxz $$2 : this.g) {
         dak $$3 = $$2.g().v();
         if (!$$3.f()) {
            int $$4 = this.b.f($$3);
            if ($$4 == -1 && $$0.size() <= $$1) {
               for (dak $$5 : $$0) {
                  if (dak.b($$5, $$3) && $$5.M() != $$5.k() && $$5.M() + $$3.M() <= $$5.k()) {
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

      for (dak $$1 : this.b.i()) {
         if ($$1.f()) {
            $$0++;
         }
      }

      return $$0;
   }

   public interface a<T extends dfb<?>> {
      void a(cso var1);

      void a();

      boolean a(dfg<T> var1);
   }
}
