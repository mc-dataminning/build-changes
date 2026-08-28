import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class akt<R extends daj<?>> {
   private static final int a = -1;
   private final cog b;
   private final akt.a<R> c;
   private final boolean d;
   private final int e;
   private final int f;
   private final List<ctg> g;
   private final List<ctg> h;

   public static <I extends dam, R extends daj<I>> csy.a a(
      akt.a<R> $$0, int $$1, int $$2, List<ctg> $$3, List<ctg> $$4, cog $$5, dal<R> $$6, boolean $$7, boolean $$8
   ) {
      akt<R> $$9 = new akt<>($$0, $$5, $$7, $$1, $$2, $$3, $$4);
      if (!$$8 && !$$9.b()) {
         return csy.a.a;
      } else {
         com $$10 = new com();
         $$5.a($$10);
         $$0.a($$10);
         return $$9.a($$6, $$10);
      }
   }

   private akt(akt.a<R> $$0, cog $$1, boolean $$2, int $$3, int $$4, List<ctg> $$5, List<ctg> $$6) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   private csy.a a(dal<R> $$0, com $$1) {
      if ($$1.a($$0.b(), null)) {
         this.b($$0, $$1);
         this.b.e();
         return csy.a.a;
      } else {
         this.a();
         this.b.e();
         return csy.a.b;
      }
   }

   private void a() {
      for (ctg $$0 : this.h) {
         cvx $$1 = $$0.g().v();
         this.b.a($$1, false);
         $$0.f($$1);
      }

      this.c.a();
   }

   private void b(dal<R> $$0, com $$1) {
      boolean $$2 = this.c.a($$0);
      int $$3 = $$1.b($$0.b(), null);
      if ($$2) {
         for (ctg $$4 : this.g) {
            cvx $$5 = $$4.g();
            if (!$$5.f() && Math.min($$3, $$5.k()) < $$5.L() + 1) {
               return;
            }
         }
      }

      int $$6 = this.a($$3, $$2);
      List<jp<cvt>> $$7 = new ArrayList<>();
      if ($$1.a($$0.b(), $$6, $$7::add)) {
         OptionalInt $$8 = $$7.stream().mapToInt($$0x -> ((cvt)$$0x.a()).h()).min();
         if ($$8.isPresent()) {
            $$6 = Math.min($$6, $$8.getAsInt());
         }

         $$7.clear();
         if ($$1.a($$0.b(), $$6, $$7::add)) {
            this.a();
            int $$9 = $$6;
            aks.a(this.e, this.f, $$0, $$0.b().a().a(), ($$2x, $$3x, $$4x, $$5) -> {
               if (!$$2x.isEmpty()) {
                  ctg $$6x = this.g.get($$3x);
                  int $$7x = ((dai.a)$$2x.get()).b();
                  int $$8x = $$9;

                  while ($$8x > 0) {
                     jp<cvt> $$9x = $$7.get($$7x);
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

         for (ctg $$3 : this.g) {
            cvx $$4 = $$3.g();
            if (!$$4.f() && $$2 > $$4.L()) {
               $$2 = $$4.L();
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

   private int a(ctg $$0, jp<cvt> $$1, int $$2) {
      int $$3 = this.b.a($$1);
      if ($$3 == -1) {
         return -1;
      } else {
         cvx $$4 = this.b.a($$3);
         int $$5;
         if ($$2 < $$4.L()) {
            this.b.a($$3, $$2);
            $$5 = $$2;
         } else {
            this.b.b($$3);
            $$5 = $$4.L();
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
      List<cvx> $$0 = Lists.newArrayList();
      int $$1 = this.c();

      for (ctg $$2 : this.g) {
         cvx $$3 = $$2.g().v();
         if (!$$3.f()) {
            int $$4 = this.b.e($$3);
            if ($$4 == -1 && $$0.size() <= $$1) {
               for (cvx $$5 : $$0) {
                  if (cvx.b($$5, $$3) && $$5.L() != $$5.k() && $$5.L() + $$3.L() <= $$5.k()) {
                     $$5.g($$3.L());
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

      for (cvx $$1 : this.b.g) {
         if ($$1.f()) {
            $$0++;
         }
      }

      return $$0;
   }

   public interface a<T extends daj<?>> {
      void a(com var1);

      void a();

      boolean a(dal<T> var1);
   }
}
