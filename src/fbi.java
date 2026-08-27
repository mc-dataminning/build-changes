import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fbi {
   public static final int a = 20;
   private static final ett b = new ett(new aep("recipe_book/page_forward"), new aep("recipe_book/page_forward_highlighted"));
   private static final ett c = new ett(new aep("recipe_book/page_backward"), new aep("recipe_book/page_backward_highlighted"));
   private final List<fbk> d = Lists.newArrayListWithCapacity(20);
   @Nullable
   private fbk e;
   private final fbg f = new fbg();
   private eqn g;
   private final List<fbm> h = Lists.newArrayList();
   private List<fbl> i = ImmutableList.of();
   private etm j;
   private etm k;
   private int l;
   private int m;
   private aox n;
   @Nullable
   private clz<?> o;
   @Nullable
   private fbl p;

   public fbi() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         this.d.add(new fbk());
      }
   }

   public void a(eqn $$0, int $$1, int $$2) {
      this.g = $$0;
      this.n = $$0.t.m();

      for (int $$3 = 0; $$3 < this.d.size(); $$3++) {
         this.d.get($$3).b($$1 + 11 + 25 * ($$3 % 5), $$2 + 31 + 25 * ($$3 / 5));
      }

      this.j = new etm($$1 + 93, $$2 + 137, 12, 17, false);
      this.j.a(b);
      this.k = new etm($$1 + 38, $$2 + 137, 12, 17, true);
      this.k.a(c);
   }

   public void a(fbh $$0) {
      this.h.remove($$0);
      this.h.add($$0);
   }

   public void a(List<fbl> $$0, boolean $$1) {
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
         fbk $$2 = this.d.get($$1);
         if ($$0 + $$1 < this.i.size()) {
            fbl $$3 = this.i.get($$0 + $$1);
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

   public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
      if (this.l > 1) {
         String $$6 = this.m + 1 + "/" + this.l;
         int $$7 = this.g.h.b($$6);
         $$0.a(this.g.h, $$6, $$1 - $$7 / 2 + 73, $$2 + 141, -1, false);
      }

      this.e = null;

      for (fbk $$8 : this.d) {
         $$8.a($$0, $$3, $$4, $$5);
         if ($$8.j && $$8.n()) {
            this.e = $$8;
         }
      }

      this.k.a($$0, $$3, $$4, $$5);
      this.j.a($$0, $$3, $$4, $$5);
      this.f.a($$0, $$3, $$4, $$5);
   }

   public void a(erx $$0, int $$1, int $$2) {
      if (this.g.z != null && this.e != null && !this.f.d()) {
         $$0.a(this.g.h, this.e.f(), $$1, $$2);
      }
   }

   @Nullable
   public clz<?> a() {
      return this.o;
   }

   @Nullable
   public fbl b() {
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
         for (fbk $$7 : this.d) {
            if ($$7.a($$0, $$1, $$2)) {
               if ($$2 == 0) {
                  this.o = $$7.e();
                  this.p = $$7.a();
               } else if ($$2 == 1 && !this.f.d() && !$$7.b()) {
                  this.f.a(this.g, $$7.a(), $$7.p(), $$7.r(), $$3 + $$5 / 2, $$4 + 13 + $$6 / 2, (float)$$7.k());
               }

               return true;
            }
         }

         return false;
      }
   }

   public void a(List<clz<?>> $$0) {
      for (fbm $$1 : this.h) {
         $$1.a($$0);
      }
   }

   public eqn d() {
      return this.g;
   }

   public aox e() {
      return this.n;
   }

   protected void a(Consumer<esg> $$0) {
      $$0.accept(this.j);
      $$0.accept(this.k);
      this.d.forEach($$0);
   }
}
