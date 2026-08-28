import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class akq<R extends dak<?>> {
   private static final int a = -1;
   private final cnw b;
   private final akq.a<R> c;
   private final boolean d;
   private final int e;
   private final int f;
   private final List<csw> g;
   private final List<csw> h;

   public static <I extends dan, R extends dak<I>> cso.a a(
      akq.a<R> $$0, int $$1, int $$2, List<csw> $$3, List<csw> $$4, cnw $$5, dam<R> $$6, boolean $$7, boolean $$8
   ) {
      akq<R> $$9 = new akq<>($$0, $$5, $$7, $$1, $$2, $$3, $$4);
      if (!$$8 && !$$9.b()) {
         return cso.a.a;
      } else {
         coc $$10 = new coc();
         $$5.a($$10);
         $$0.a($$10);
         return $$9.a($$6, $$10);
      }
   }

   private akq(akq.a<R> $$0, cnw $$1, boolean $$2, int $$3, int $$4, List<csw> $$5, List<csw> $$6) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   private cso.a a(dam<R> $$0, coc $$1) {
      if ($$1.a($$0.b(), null)) {
         this.b($$0, $$1);
         this.b.e();
         return cso.a.a;
      } else {
         this.a();
         this.b.e();
         return cso.a.b;
      }
   }

   private void a() {
      for (csw $$0 : this.h) {
         cvs $$1 = $$0.g().u();
         this.b.a($$1, false);
         $$0.f($$1);
      }

      this.c.a();
   }

   private void b(dam<R> $$0, coc $$1) {
      boolean $$2 = this.c.a($$0);
      int $$3 = $$1.b($$0.b(), null);
      if ($$2) {
         for (csw $$4 : this.g) {
            cvs $$5 = $$4.g();
            if (!$$5.f() && Math.min($$3, $$5.k()) < $$5.K() + 1) {
               return;
            }
         }
      }

      int $$6 = this.a($$3, $$2);
      List<jo<cvn>> $$7 = new ArrayList<>();
      if ($$1.a($$0.b(), $$6, $$7::add)) {
         OptionalInt $$8 = $$7.stream().mapToInt($$0x -> ((cvn)$$0x.a()).p()).min();
         if ($$8.isPresent()) {
            $$6 = Math.min($$6, $$8.getAsInt());
         }

         $$7.clear();
         if ($$1.a($$0.b(), $$6, $$7::add)) {
            this.a();
            int $$9 = $$6;
            akp.a(this.e, this.f, $$0, $$0.b().a().a(), ($$2x, $$3x, $$4x, $$5) -> {
               if (!$$2x.isEmpty()) {
                  csw $$6x = this.g.get($$3x);
                  int $$7x = ((daj.a)$$2x.get()).b();
                  int $$8x = $$9;

                  while ($$8x > 0) {
                     jo<cvn> $$9x = $$7.get($$7x);
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

         for (csw $$3 : this.g) {
            cvs $$4 = $$3.g();
            if (!$$4.f() && $$2 > $$4.K()) {
               $$2 = $$4.K();
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

   private int a(csw $$0, jo<cvn> $$1, int $$2) {
      int $$3 = this.b.a($$1);
      if ($$3 == -1) {
         return -1;
      } else {
         cvs $$4 = this.b.a($$3);
         int $$5;
         if ($$2 < $$4.K()) {
            this.b.a($$3, $$2);
            $$5 = $$2;
         } else {
            this.b.b($$3);
            $$5 = $$4.K();
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
      List<cvs> $$0 = Lists.newArrayList();
      int $$1 = this.c();

      for (csw $$2 : this.g) {
         cvs $$3 = $$2.g().u();
         if (!$$3.f()) {
            int $$4 = this.b.e($$3);
            if ($$4 == -1 && $$0.size() <= $$1) {
               for (cvs $$5 : $$0) {
                  if (cvs.b($$5, $$3) && $$5.K() != $$5.k() && $$5.K() + $$3.K() <= $$5.k()) {
                     $$5.g($$3.K());
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

      for (cvs $$1 : this.b.g) {
         if ($$1.f()) {
            $$0++;
         }
      }

      return $$0;
   }

   public interface a<T extends dak<?>> {
      void a(coc var1);

      void a();

      boolean a(dam<T> var1);
   }
}
