import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class akh<R extends dbd<?>> {
   private static final int a = -1;
   private final cov b;
   private final akh.a<R> c;
   private final boolean d;
   private final int e;
   private final int f;
   private final List<cty> g;
   private final List<cty> h;

   public static <I extends dbj, R extends dbd<I>> ctq.a a(
      akh.a<R> $$0, int $$1, int $$2, List<cty> $$3, List<cty> $$4, cov $$5, dbi<R> $$6, boolean $$7, boolean $$8
   ) {
      akh<R> $$9 = new akh<>($$0, $$5, $$7, $$1, $$2, $$3, $$4);
      if (!$$8 && !$$9.b()) {
         return ctq.a.a;
      } else {
         cpb $$10 = new cpb();
         $$5.a($$10);
         $$0.a($$10);
         return $$9.a($$6, $$10);
      }
   }

   private akh(akh.a<R> $$0, cov $$1, boolean $$2, int $$3, int $$4, List<cty> $$5, List<cty> $$6) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   private ctq.a a(dbi<R> $$0, cpb $$1) {
      if ($$1.a($$0.b(), null)) {
         this.b($$0, $$1);
         this.b.e();
         return ctq.a.a;
      } else {
         this.a();
         this.b.e();
         return ctq.a.b;
      }
   }

   private void a() {
      for (cty $$0 : this.h) {
         cwo $$1 = $$0.g().v();
         this.b.a($$1, false);
         $$0.f($$1);
      }

      this.c.a();
   }

   private void b(dbi<R> $$0, cpb $$1) {
      boolean $$2 = this.c.a($$0);
      int $$3 = $$1.b($$0.b(), null);
      if ($$2) {
         for (cty $$4 : this.g) {
            cwo $$5 = $$4.g();
            if (!$$5.f() && Math.min($$3, $$5.k()) < $$5.M() + 1) {
               return;
            }
         }
      }

      int $$6 = this.a($$3, $$2);
      List<jr<cwk>> $$7 = new ArrayList<>();
      if ($$1.a($$0.b(), $$6, $$7::add)) {
         int $$8 = a($$6, $$7);
         if ($$8 != $$6) {
            $$7.clear();
            if (!$$1.a($$0.b(), $$8, $$7::add)) {
               return;
            }
         }

         this.a();
         akg.a(this.e, this.f, $$0.b(), $$0.b().ao_().a(), ($$2x, $$3x, $$4x, $$5) -> {
            if ($$2x != -1) {
               cty $$6x = this.g.get($$3x);
               jr<cwk> $$7x = $$7.get($$2x);
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

   private static int a(int $$0, List<jr<cwk>> $$1) {
      for (jr<cwk> $$2 : $$1) {
         $$0 = Math.min($$0, $$2.a().h());
      }

      return $$0;
   }

   private int a(int $$0, boolean $$1) {
      if (this.d) {
         return $$0;
      } else if ($$1) {
         int $$2 = Integer.MAX_VALUE;

         for (cty $$3 : this.g) {
            cwo $$4 = $$3.g();
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

   private int a(cty $$0, jr<cwk> $$1, int $$2) {
      int $$3 = this.b.a($$1);
      if ($$3 == -1) {
         return -1;
      } else {
         cwo $$4 = this.b.a($$3);
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
      List<cwo> $$0 = Lists.newArrayList();
      int $$1 = this.c();

      for (cty $$2 : this.g) {
         cwo $$3 = $$2.g().v();
         if (!$$3.f()) {
            int $$4 = this.b.e($$3);
            if ($$4 == -1 && $$0.size() <= $$1) {
               for (cwo $$5 : $$0) {
                  if (cwo.b($$5, $$3) && $$5.M() != $$5.k() && $$5.M() + $$3.M() <= $$5.k()) {
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

      for (cwo $$1 : this.b.g) {
         if ($$1.f()) {
            $$0++;
         }
      }

      return $$0;
   }

   public interface a<T extends dbd<?>> {
      void a(cpb var1);

      void a();

      boolean a(dbi<T> var1);
   }
}
