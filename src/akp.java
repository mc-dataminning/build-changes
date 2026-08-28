import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class akp<R extends dah<?>> {
   private static final int a = -1;
   private final cnt b;
   private final akp.a<R> c;
   private final boolean d;
   private final int e;
   private final int f;
   private final List<cst> g;
   private final List<cst> h;

   public static <I extends dak, R extends dah<I>> csl.a a(
      akp.a<R> $$0, int $$1, int $$2, List<cst> $$3, List<cst> $$4, cnt $$5, daj<R> $$6, boolean $$7, boolean $$8
   ) {
      akp<R> $$9 = new akp<>($$0, $$5, $$7, $$1, $$2, $$3, $$4);
      if (!$$8 && !$$9.b()) {
         return csl.a.a;
      } else {
         cnz $$10 = new cnz();
         $$5.a($$10);
         $$0.a($$10);
         return $$9.a($$6, $$10);
      }
   }

   private akp(akp.a<R> $$0, cnt $$1, boolean $$2, int $$3, int $$4, List<cst> $$5, List<cst> $$6) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   private csl.a a(daj<R> $$0, cnz $$1) {
      if ($$1.a($$0.b(), null)) {
         this.b($$0, $$1);
         this.b.e();
         return csl.a.a;
      } else {
         this.a();
         this.b.e();
         return csl.a.b;
      }
   }

   private void a() {
      for (cst $$0 : this.h) {
         cvp $$1 = $$0.g().u();
         this.b.a($$1, false);
         $$0.f($$1);
      }

      this.c.a();
   }

   private void b(daj<R> $$0, cnz $$1) {
      boolean $$2 = this.c.a($$0);
      int $$3 = $$1.b($$0.b(), null);
      if ($$2) {
         for (cst $$4 : this.g) {
            cvp $$5 = $$4.g();
            if (!$$5.f() && Math.min($$3, $$5.k()) < $$5.J() + 1) {
               return;
            }
         }
      }

      int $$6 = this.a($$3, $$2);
      List<jn<cvk>> $$7 = new ArrayList<>();
      if ($$1.a($$0.b(), $$6, $$7::add)) {
         OptionalInt $$8 = $$7.stream().mapToInt($$0x -> ((cvk)$$0x.a()).p()).min();
         if ($$8.isPresent()) {
            $$6 = Math.min($$6, $$8.getAsInt());
         }

         $$7.clear();
         if ($$1.a($$0.b(), $$6, $$7::add)) {
            this.a();
            int $$9 = $$6;
            ako.a(this.e, this.f, $$0, $$0.b().a().a(), ($$2x, $$3x, $$4x, $$5) -> {
               if (!$$2x.isEmpty()) {
                  cst $$6x = this.g.get($$3x);
                  int $$7x = ((dag.a)$$2x.get()).b();
                  int $$8x = $$9;

                  while ($$8x > 0) {
                     jn<cvk> $$9x = $$7.get($$7x);
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

         for (cst $$3 : this.g) {
            cvp $$4 = $$3.g();
            if (!$$4.f() && $$2 > $$4.J()) {
               $$2 = $$4.J();
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

   private int a(cst $$0, jn<cvk> $$1, int $$2) {
      int $$3 = this.b.a($$1);
      if ($$3 == -1) {
         return -1;
      } else {
         cvp $$4 = this.b.a($$3);
         int $$5;
         if ($$2 < $$4.J()) {
            this.b.a($$3, $$2);
            $$5 = $$2;
         } else {
            this.b.b($$3);
            $$5 = $$4.J();
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
      List<cvp> $$0 = Lists.newArrayList();
      int $$1 = this.c();

      for (cst $$2 : this.g) {
         cvp $$3 = $$2.g().u();
         if (!$$3.f()) {
            int $$4 = this.b.e($$3);
            if ($$4 == -1 && $$0.size() <= $$1) {
               for (cvp $$5 : $$0) {
                  if (cvp.b($$5, $$3) && $$5.J() != $$5.k() && $$5.J() + $$3.J() <= $$5.k()) {
                     $$5.g($$3.J());
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

      for (cvp $$1 : this.b.g) {
         if ($$1.f()) {
            $$0++;
         }
      }

      return $$0;
   }

   public interface a<T extends dah<?>> {
      void a(cnz var1);

      void a();

      boolean a(daj<T> var1);
   }
}
