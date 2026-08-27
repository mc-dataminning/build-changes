import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fbs {
   public static final int a = 20;
   private static final etx b = new etx(new aeu("recipe_book/page_forward"), new aeu("recipe_book/page_forward_highlighted"));
   private static final etx c = new etx(new aeu("recipe_book/page_backward"), new aeu("recipe_book/page_backward_highlighted"));
   private final List<fbu> d = Lists.newArrayListWithCapacity(20);
   @Nullable
   private fbu e;
   private final fbq f = new fbq();
   private eqq g;
   private final List<fbw> h = Lists.newArrayList();
   private List<fbv> i = ImmutableList.of();
   private etq j;
   private etq k;
   private int l;
   private int m;
   private apc n;
   @Nullable
   private cmf<?> o;
   @Nullable
   private fbv p;

   public fbs() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         this.d.add(new fbu());
      }
   }

   public void a(eqq $$0, int $$1, int $$2) {
      this.g = $$0;
      this.n = $$0.s.m();

      for (int $$3 = 0; $$3 < this.d.size(); $$3++) {
         this.d.get($$3).b($$1 + 11 + 25 * ($$3 % 5), $$2 + 31 + 25 * ($$3 / 5));
      }

      this.j = new etq($$1 + 93, $$2 + 137, 12, 17, false);
      this.j.a(b);
      this.k = new etq($$1 + 38, $$2 + 137, 12, 17, true);
      this.k.a(c);
   }

   public void a(fbr $$0) {
      this.h.remove($$0);
      this.h.add($$0);
   }

   public void a(List<fbv> $$0, boolean $$1) {
      this.i = $$0;
      this.l = (int)Math.ceil((double)$$0.size() / 20.0);
      if (this.l <= this.m || $$1) {
         this.m = 0;
      }

      this.f();
   }

   private void f() {
      int $$0 = 20 * this.m;

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         fbu $$2 = this.d.get($$1);
         if ($$0 + $$1 < this.i.size()) {
            fbv $$3 = this.i.get($$0 + $$1);
            $$2.a($$3, this);
            $$2.j = true;
         } else {
            $$2.j = false;
         }
      }

      this.g();
   }

   private void g() {
      this.j.j = this.l > 1 && this.m < this.l - 1;
      this.k.j = this.l > 1 && this.m > 0;
   }

   public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
      if (this.l > 1) {
         String $$6 = this.m + 1 + "/" + this.l;
         int $$7 = this.g.h.b($$6);
         $$0.a(this.g.h, $$6, $$1 - $$7 / 2 + 73, $$2 + 141, -1, false);
      }

      this.e = null;

      for (fbu $$8 : this.d) {
         $$8.a($$0, $$3, $$4, $$5);
         if ($$8.j && $$8.o()) {
            this.e = $$8;
         }
      }

      this.k.a($$0, $$3, $$4, $$5);
      this.j.a($$0, $$3, $$4, $$5);
      this.f.a($$0, $$3, $$4, $$5);
   }

   public void a(esa $$0, int $$1, int $$2) {
      if (this.g.y != null && this.e != null && !this.f.d()) {
         $$0.a(this.g.h, this.e.f(), $$1, $$2);
      }
   }

   @Nullable
   public cmf<?> a() {
      return this.o;
   }

   @Nullable
   public fbv b() {
      return this.p;
   }

   public void c() {
      this.f.b(false);
   }

   public boolean a(double $$0, double $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      this.o = null;
      this.p = null;
      if (this.f.d()) {
         if (this.f.a($$0, $$1, $$2)) {
            this.o = this.f.b();
            this.p = this.f.a();
         } else {
            this.f.b(false);
         }

         return true;
      } else if (this.j.a($$0, $$1, $$2)) {
         this.m++;
         this.f();
         return true;
      } else if (this.k.a($$0, $$1, $$2)) {
         this.m--;
         this.f();
         return true;
      } else {
         for (fbu $$7 : this.d) {
            if ($$7.a($$0, $$1, $$2)) {
               if ($$2 == 0) {
                  this.o = $$7.e();
                  this.p = $$7.a();
               } else if ($$2 == 1 && !this.f.d() && !$$7.b()) {
                  this.f.a(this.g, $$7.a(), $$7.r(), $$7.t(), $$3 + $$5 / 2, $$4 + 13 + $$6 / 2, (float)$$7.l());
               }

               return true;
            }
         }

         return false;
      }
   }

   public void a(List<cmf<?>> $$0) {
      for (fbw $$1 : this.h) {
         $$1.a($$0);
      }
   }

   public eqq d() {
      return this.g;
   }

   public apc e() {
      return this.n;
   }

   protected void a(Consumer<esj> $$0) {
      $$0.accept(this.j);
      $$0.accept(this.k);
      this.d.forEach($$0);
   }
}
