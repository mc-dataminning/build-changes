import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ffr {
   public static final int a = 20;
   private static final exu b = new exu(new agt("recipe_book/page_forward"), new agt("recipe_book/page_forward_highlighted"));
   private static final exu c = new exu(new agt("recipe_book/page_backward"), new agt("recipe_book/page_backward_highlighted"));
   private final List<fft> d = Lists.newArrayListWithCapacity(20);
   @Nullable
   private fft e;
   private final ffp f = new ffp();
   private euk g;
   private final List<ffv> h = Lists.newArrayList();
   private List<ffu> i = ImmutableList.of();
   private exn j;
   private exn k;
   private int l;
   private int m;
   private arf n;
   @Nullable
   private cpn<?> o;
   @Nullable
   private ffu p;

   public ffr() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         this.d.add(new fft());
      }
   }

   public void a(euk $$0, int $$1, int $$2) {
      this.g = $$0;
      this.n = $$0.s.m();

      for (int $$3 = 0; $$3 < this.d.size(); $$3++) {
         this.d.get($$3).b($$1 + 11 + 25 * ($$3 % 5), $$2 + 31 + 25 * ($$3 / 5));
      }

      this.j = new exn($$1 + 93, $$2 + 137, 12, 17, false);
      this.j.a(b);
      this.k = new exn($$1 + 38, $$2 + 137, 12, 17, true);
      this.k.a(c);
   }

   public void a(ffq $$0) {
      this.h.remove($$0);
      this.h.add($$0);
   }

   public void a(List<ffu> $$0, boolean $$1) {
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
         fft $$2 = this.d.get($$1);
         if ($$0 + $$1 < this.i.size()) {
            ffu $$3 = this.i.get($$0 + $$1);
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

   public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
      if (this.l > 1) {
         vb $$6 = vb.a("gui.recipebook.page", this.m + 1, this.l);
         int $$7 = this.g.h.a($$6);
         $$0.a(this.g.h, $$6, $$1 - $$7 / 2 + 73, $$2 + 141, -1, false);
      }

      this.e = null;

      for (fft $$8 : this.d) {
         $$8.a($$0, $$3, $$4, $$5);
         if ($$8.j && $$8.n()) {
            this.e = $$8;
         }
      }

      this.k.a($$0, $$3, $$4, $$5);
      this.j.a($$0, $$3, $$4, $$5);
      this.f.a($$0, $$3, $$4, $$5);
   }

   public void a(evw $$0, int $$1, int $$2) {
      if (this.g.y != null && this.e != null && !this.f.c()) {
         $$0.a(this.g.h, this.e.f(), $$1, $$2);
      }
   }

   @Nullable
   public cpn<?> a() {
      return this.o;
   }

   @Nullable
   public ffu b() {
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
         for (fft $$7 : this.d) {
            if ($$7.a($$0, $$1, $$2)) {
               if ($$2 == 0) {
                  this.o = $$7.e();
                  this.p = $$7.a();
               } else if ($$2 == 1 && !this.f.c() && !$$7.b()) {
                  this.f.a(this.g, $$7.a(), $$7.p(), $$7.r(), $$3 + $$5 / 2, $$4 + 13 + $$6 / 2, (float)$$7.k());
               }

               return true;
            }
         }

         return false;
      }
   }

   public void a(List<cpn<?>> $$0) {
      for (ffv $$1 : this.h) {
         $$1.a($$0);
      }
   }

   public euk d() {
      return this.g;
   }

   public arf e() {
      return this.n;
   }

   protected void a(Consumer<ewf> $$0) {
      $$0.accept(this.j);
      $$0.accept(this.k);
      this.d.forEach($$0);
   }
}
