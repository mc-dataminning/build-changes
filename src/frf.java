import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class frf {
   public static final int a = 20;
   private static final fjf b = new fjf(new akk("recipe_book/page_forward"), new akk("recipe_book/page_forward_highlighted"));
   private static final fjf c = new fjf(new akk("recipe_book/page_backward"), new akk("recipe_book/page_backward_highlighted"));
   private final List<frh> d = Lists.newArrayListWithCapacity(20);
   @Nullable
   private frh e;
   private final frd f = new frd();
   private fft g;
   private final List<frj> h = Lists.newArrayList();
   private List<fri> i = ImmutableList.of();
   private fiy j;
   private fiy k;
   private int l;
   private int m;
   private avk n;
   @Nullable
   private cyk<?> o;
   @Nullable
   private fri p;

   public frf() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         this.d.add(new frh());
      }
   }

   public void a(fft $$0, int $$1, int $$2) {
      this.g = $$0;
      this.n = $$0.s.m();

      for (int $$3 = 0; $$3 < this.d.size(); $$3++) {
         this.d.get($$3).c($$1 + 11 + 25 * ($$3 % 5), $$2 + 31 + 25 * ($$3 / 5));
      }

      this.j = new fiy($$1 + 93, $$2 + 137, 12, 17, false);
      this.j.a(b);
      this.k = new fiy($$1 + 38, $$2 + 137, 12, 17, true);
      this.k.a(c);
   }

   public void a(fre $$0) {
      this.h.remove($$0);
      this.h.add($$0);
   }

   public void a(List<fri> $$0, boolean $$1) {
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
         frh $$2 = this.d.get($$1);
         if ($$0 + $$1 < this.i.size()) {
            fri $$3 = this.i.get($$0 + $$1);
            $$2.a($$3, this);
            $$2.k = true;
         } else {
            $$2.k = false;
         }
      }

      this.g();
   }

   private void g() {
      this.j.k = this.l > 1 && this.m < this.l - 1;
      this.k.k = this.l > 1 && this.m > 0;
   }

   public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
      if (this.l > 1) {
         wu $$6 = wu.a("gui.recipebook.page", this.m + 1, this.l);
         int $$7 = this.g.h.a($$6);
         $$0.a(this.g.h, $$6, $$1 - $$7 / 2 + 73, $$2 + 141, -1, false);
      }

      this.e = null;

      for (frh $$8 : this.d) {
         $$8.a($$0, $$3, $$4, $$5);
         if ($$8.k && $$8.B()) {
            this.e = $$8;
         }
      }

      this.k.a($$0, $$3, $$4, $$5);
      this.j.a($$0, $$3, $$4, $$5);
      this.f.a($$0, $$3, $$4, $$5);
   }

   public void a(fhf $$0, int $$1, int $$2) {
      if (this.g.y != null && this.e != null && !this.f.c()) {
         $$0.a(this.g.h, this.e.e(), $$1, $$2);
      }
   }

   @Nullable
   public cyk<?> a() {
      return this.o;
   }

   @Nullable
   public fri b() {
      return this.p;
   }

   public void c() {
      this.f.b(false);
   }

   public boolean a(double $$0, double $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      this.o = null;
      this.p = null;
      if (this.f.c()) {
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
         for (frh $$7 : this.d) {
            if ($$7.a($$0, $$1, $$2)) {
               if ($$2 == 0) {
                  this.o = $$7.c();
                  this.p = $$7.a();
               } else if ($$2 == 1 && !this.f.c() && !$$7.b()) {
                  this.f.a(this.g, $$7.a(), $$7.D(), $$7.E(), $$3 + $$5 / 2, $$4 + 13 + $$6 / 2, (float)$$7.y());
               }

               return true;
            }
         }

         return false;
      }
   }

   public void a(List<cyk<?>> $$0) {
      for (frj $$1 : this.h) {
         $$1.a($$0);
      }
   }

   public fft d() {
      return this.g;
   }

   public avk e() {
      return this.n;
   }

   protected void a(Consumer<fhq> $$0) {
      $$0.accept(this.j);
      $$0.accept(this.k);
      this.d.forEach($$0);
   }
}
