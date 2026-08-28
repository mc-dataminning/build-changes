import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class akg<R extends dbc<?>> {
   private static final int a = -1;
   private final cou b;
   private final akg.a<R> c;
   private final boolean d;
   private final int e;
   private final int f;
   private final List<ctx> g;
   private final List<ctx> h;

   public static <I extends dbi, R extends dbc<I>> ctp.a a(
      akg.a<R> $$0, int $$1, int $$2, List<ctx> $$3, List<ctx> $$4, cou $$5, dbh<R> $$6, boolean $$7, boolean $$8
   ) {
      akg<R> $$9 = new akg<>($$0, $$5, $$7, $$1, $$2, $$3, $$4);
      if (!$$8 && !$$9.b()) {
         return ctp.a.a;
      } else {
         cpa $$10 = new cpa();
         $$5.a($$10);
         $$0.a($$10);
         return $$9.a($$6, $$10);
      }
   }

   private akg(akg.a<R> $$0, cou $$1, boolean $$2, int $$3, int $$4, List<ctx> $$5, List<ctx> $$6) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   private ctp.a a(dbh<R> $$0, cpa $$1) {
      if ($$1.a($$0.b(), null)) {
         this.b($$0, $$1);
         this.b.e();
         return ctp.a.a;
      } else {
         this.a();
         this.b.e();
         return ctp.a.b;
      }
   }

   private void a() {
      for (ctx $$0 : this.h) {
         cwn $$1 = $$0.g().v();
         this.b.a($$1, false);
         $$0.f($$1);
      }

      this.c.a();
   }

   private void b(dbh<R> $$0, cpa $$1) {
      boolean $$2 = this.c.a($$0);
      int $$3 = $$1.b($$0.b(), null);
      if ($$2) {
         for (ctx $$4 : this.g) {
            cwn $$5 = $$4.g();
            if (!$$5.f() && Math.min($$3, $$5.k()) < $$5.M() + 1) {
               return;
            }
         }
      }

      int $$6 = this.a($$3, $$2);
      List<jr<cwj>> $$7 = new ArrayList<>();
      if ($$1.a($$0.b(), $$6, $$7::add)) {
         int $$8 = a($$6, $$7);
         if ($$8 != $$6) {
            $$7.clear();
            if (!$$1.a($$0.b(), $$8, $$7::add)) {
               return;
            }
         }

         this.a();
         akf.a(this.e, this.f, $$0.b(), $$0.b().ao_().a(), ($$2x, $$3x, $$4x, $$5) -> {
            if ($$2x != -1) {
               ctx $$6x = this.g.get($$3x);
               jr<cwj> $$7x = $$7.get($$2x);
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

   private static int a(int $$0, List<jr<cwj>> $$1) {
      for (jr<cwj> $$2 : $$1) {
         $$0 = Math.min($$0, $$2.a().h());
      }

      return $$0;
   }

   private int a(int $$0, boolean $$1) {
      if (this.d) {
         return $$0;
      } else if ($$1) {
         int $$2 = Integer.MAX_VALUE;

         for (ctx $$3 : this.g) {
            cwn $$4 = $$3.g();
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

   private int a(ctx $$0, jr<cwj> $$1, int $$2) {
      int $$3 = this.b.a($$1);
      if ($$3 == -1) {
         return -1;
      } else {
         cwn $$4 = this.b.a($$3);
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
      List<cwn> $$0 = Lists.newArrayList();
      int $$1 = this.c();

      for (ctx $$2 : this.g) {
         cwn $$3 = $$2.g().v();
         if (!$$3.f()) {
            int $$4 = this.b.e($$3);
            if ($$4 == -1 && $$0.size() <= $$1) {
               for (cwn $$5 : $$0) {
                  if (cwn.b($$5, $$3) && $$5.M() != $$5.k() && $$5.M() + $$3.M() <= $$5.k()) {
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

      for (cwn $$1 : this.b.g) {
         if ($$1.f()) {
            $$0++;
         }
      }

      return $$0;
   }

   public interface a<T extends dbc<?>> {
      void a(cpa var1);

      void a();

      boolean a(dbh<T> var1);
   }
}
