import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class akg<R extends dbv<?>> {
   private static final int a = -1;
   private final cpq b;
   private final akg.a<R> c;
   private final boolean d;
   private final int e;
   private final int f;
   private final List<cut> g;
   private final List<cut> h;

   public static <I extends dcb, R extends dbv<I>> cul.a a(
      akg.a<R> $$0, int $$1, int $$2, List<cut> $$3, List<cut> $$4, cpq $$5, dca<R> $$6, boolean $$7, boolean $$8
   ) {
      akg<R> $$9 = new akg<>($$0, $$5, $$7, $$1, $$2, $$3, $$4);
      if (!$$8 && !$$9.b()) {
         return cul.a.a;
      } else {
         cpw $$10 = new cpw();
         $$5.a($$10);
         $$0.a($$10);
         return $$9.a($$6, $$10);
      }
   }

   private akg(akg.a<R> $$0, cpq $$1, boolean $$2, int $$3, int $$4, List<cut> $$5, List<cut> $$6) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   private cul.a a(dca<R> $$0, cpw $$1) {
      if ($$1.a($$0.b(), null)) {
         this.b($$0, $$1);
         this.b.e();
         return cul.a.a;
      } else {
         this.a();
         this.b.e();
         return cul.a.b;
      }
   }

   private void a() {
      for (cut $$0 : this.h) {
         cxh $$1 = $$0.g().v();
         this.b.a($$1, false);
         $$0.f($$1);
      }

      this.c.a();
   }

   private void b(dca<R> $$0, cpw $$1) {
      boolean $$2 = this.c.a($$0);
      int $$3 = $$1.b($$0.b(), null);
      if ($$2) {
         for (cut $$4 : this.g) {
            cxh $$5 = $$4.g();
            if (!$$5.f() && Math.min($$3, $$5.k()) < $$5.M() + 1) {
               return;
            }
         }
      }

      int $$6 = this.a($$3, $$2);
      List<jr<cxd>> $$7 = new ArrayList<>();
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
               cut $$6x = this.g.get($$3x);
               jr<cxd> $$7x = $$7.get($$2x);
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

   private static int a(int $$0, List<jr<cxd>> $$1) {
      for (jr<cxd> $$2 : $$1) {
         $$0 = Math.min($$0, $$2.a().h());
      }

      return $$0;
   }

   private int a(int $$0, boolean $$1) {
      if (this.d) {
         return $$0;
      } else if ($$1) {
         int $$2 = Integer.MAX_VALUE;

         for (cut $$3 : this.g) {
            cxh $$4 = $$3.g();
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

   private int a(cut $$0, jr<cxd> $$1, int $$2) {
      cxh $$3 = $$0.g();
      int $$4 = this.b.a($$1, $$3);
      if ($$4 == -1) {
         return -1;
      } else {
         cxh $$5 = this.b.a($$4);
         cxh $$6;
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
      List<cxh> $$0 = Lists.newArrayList();
      int $$1 = this.c();

      for (cut $$2 : this.g) {
         cxh $$3 = $$2.g().v();
         if (!$$3.f()) {
            int $$4 = this.b.e($$3);
            if ($$4 == -1 && $$0.size() <= $$1) {
               for (cxh $$5 : $$0) {
                  if (cxh.b($$5, $$3) && $$5.M() != $$5.k() && $$5.M() + $$3.M() <= $$5.k()) {
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

      for (cxh $$1 : this.b.g) {
         if ($$1.f()) {
            $$0++;
         }
      }

      return $$0;
   }

   public interface a<T extends dbv<?>> {
      void a(cpw var1);

      void a();

      boolean a(dca<T> var1);
   }
}
