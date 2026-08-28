import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class alb<R extends dbv<?>> {
   private static final int a = -1;
   private final cpn b;
   private final alb.a<R> c;
   private final boolean d;
   private final int e;
   private final int f;
   private final List<cuq> g;
   private final List<cuq> h;

   public static <I extends dcb, R extends dbv<I>> cui.a a(
      alb.a<R> $$0, int $$1, int $$2, List<cuq> $$3, List<cuq> $$4, cpn $$5, dca<R> $$6, boolean $$7, boolean $$8
   ) {
      alb<R> $$9 = new alb<>($$0, $$5, $$7, $$1, $$2, $$3, $$4);
      if (!$$8 && !$$9.b()) {
         return cui.a.a;
      } else {
         cpt $$10 = new cpt();
         $$5.a($$10);
         $$0.a($$10);
         return $$9.a($$6, $$10);
      }
   }

   private alb(alb.a<R> $$0, cpn $$1, boolean $$2, int $$3, int $$4, List<cuq> $$5, List<cuq> $$6) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   private cui.a a(dca<R> $$0, cpt $$1) {
      if ($$1.a($$0.b(), null)) {
         this.b($$0, $$1);
         this.b.e();
         return cui.a.a;
      } else {
         this.a();
         this.b.e();
         return cui.a.b;
      }
   }

   private void a() {
      for (cuq $$0 : this.h) {
         cxg $$1 = $$0.g().v();
         this.b.a($$1, false);
         $$0.f($$1);
      }

      this.c.a();
   }

   private void b(dca<R> $$0, cpt $$1) {
      boolean $$2 = this.c.a($$0);
      int $$3 = $$1.b($$0.b(), null);
      if ($$2) {
         for (cuq $$4 : this.g) {
            cxg $$5 = $$4.g();
            if (!$$5.f() && Math.min($$3, $$5.k()) < $$5.M() + 1) {
               return;
            }
         }
      }

      int $$6 = this.a($$3, $$2);
      List<jq<cxc>> $$7 = new ArrayList<>();
      if ($$1.a($$0.b(), $$6, $$7::add)) {
         OptionalInt $$8 = $$7.stream().mapToInt($$0x -> ((cxc)$$0x.a()).h()).min();
         if ($$8.isPresent()) {
            $$6 = Math.min($$6, $$8.getAsInt());
         }

         $$7.clear();
         if ($$1.a($$0.b(), $$6, $$7::add)) {
            this.a();
            int $$9 = $$6;
            ala.a(this.e, this.f, $$0.b(), $$0.b().ap_().a(), ($$2x, $$3x, $$4x, $$5) -> {
               if (!$$2x.isEmpty()) {
                  cuq $$6x = this.g.get($$3x);
                  int $$7x = ((dbu.a)$$2x.get()).a();
                  int $$8x = $$9;

                  while ($$8x > 0) {
                     jq<cxc> $$9x = $$7.get($$7x);
                     $$8x = this.a($$6x, $$9x, $$8x);
                     if ($$8x == -1) {
                        return;
                     }
                  }
               }
            });
         }
      }
   }

   private int a(int $$0, boolean $$1) {
      if (this.d) {
         return $$0;
      } else if ($$1) {
         int $$2 = Integer.MAX_VALUE;

         for (cuq $$3 : this.g) {
            cxg $$4 = $$3.g();
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

   private int a(cuq $$0, jq<cxc> $$1, int $$2) {
      int $$3 = this.b.a($$1);
      if ($$3 == -1) {
         return -1;
      } else {
         cxg $$4 = this.b.a($$3);
         int $$5;
         if ($$2 < $$4.M()) {
            this.b.a($$3, $$2);
            $$5 = $$2;
         } else {
            this.b.b($$3);
            $$5 = $$4.M();
         }

         if ($$0.g().f()) {
            $$0.f($$4.c($$5));
         } else {
            $$0.g().g($$5);
         }

         return $$2 - $$5;
      }
   }

   private boolean b() {
      List<cxg> $$0 = Lists.newArrayList();
      int $$1 = this.c();

      for (cuq $$2 : this.g) {
         cxg $$3 = $$2.g().v();
         if (!$$3.f()) {
            int $$4 = this.b.e($$3);
            if ($$4 == -1 && $$0.size() <= $$1) {
               for (cxg $$5 : $$0) {
                  if (cxg.b($$5, $$3) && $$5.M() != $$5.k() && $$5.M() + $$3.M() <= $$5.k()) {
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

      for (cxg $$1 : this.b.g) {
         if ($$1.f()) {
            $$0++;
         }
      }

      return $$0;
   }

   public interface a<T extends dbv<?>> {
      void a(cpt var1);

      void a();

      boolean a(dca<T> var1);
   }
}
