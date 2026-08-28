import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ftq {
   public static final int a = 20;
   private static final fln b = new fln(alb.b("recipe_book/page_forward"), alb.b("recipe_book/page_forward_highlighted"));
   private static final fln c = new fln(alb.b("recipe_book/page_backward"), alb.b("recipe_book/page_backward_highlighted"));
   private final List<fts> d = Lists.newArrayListWithCapacity(20);
   @Nullable
   private fts e;
   private final fto f;
   private fib g;
   private final List<ftu> h = Lists.newArrayList();
   private List<ftt> i = ImmutableList.of();
   private flg j;
   private flg k;
   private int l;
   private int m;
   private awg n;
   @Nullable
   private czv<?> o;
   @Nullable
   private ftt p;
   private boolean q;

   public ftq(ftw $$0, boolean $$1) {
      this.f = new fto($$0, $$1);

      for (int $$2 = 0; $$2 < 20; $$2++) {
         this.d.add(new fts($$0));
      }
   }

   public void a(fib $$0, int $$1, int $$2) {
      this.g = $$0;
      this.n = $$0.t.j();

      for (int $$3 = 0; $$3 < this.d.size(); $$3++) {
         this.d.get($$3).c($$1 + 11 + 25 * ($$3 % 5), $$2 + 31 + 25 * ($$3 / 5));
      }

      this.j = new flg($$1 + 93, $$2 + 137, 12, 17, false);
      this.j.a(b);
      this.k = new flg($$1 + 38, $$2 + 137, 12, 17, true);
      this.k.a(c);
   }

   public void a(ftp $$0) {
      this.h.remove($$0);
      this.h.add($$0);
   }

   public void a(List<ftt> $$0, boolean $$1, boolean $$2) {
      this.i = $$0;
      this.q = $$2;
      this.l = (int)Math.ceil((double)$$0.size() / 20.0);
      if (this.l <= this.m || $$1) {
         this.m = 0;
      }

      this.e();
   }

   private void e() {
      int $$0 = 20 * this.m;

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         fts $$2 = this.d.get($$1);
         if ($$0 + $$1 < this.i.size()) {
            ftt $$3 = this.i.get($$0 + $$1);
            $$2.a($$3, this.q, this);
            $$2.k = true;
         } else {
            $$2.k = false;
         }
      }

      this.f();
   }

   private void f() {
      this.j.k = this.l > 1 && this.m < this.l - 1;
      this.k.k = this.l > 1 && this.m > 0;
   }

   public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
      if (this.l > 1) {
         xd $$6 = xd.a("gui.recipebook.page", this.m + 1, this.l);
         int $$7 = this.g.h.a($$6);
         $$0.a(this.g.h, $$6, $$1 - $$7 / 2 + 73, $$2 + 141, -1, false);
      }

      this.e = null;

      for (fts $$8 : this.d) {
         $$8.a($$0, $$3, $$4, $$5);
         if ($$8.k && $$8.B()) {
            this.e = $$8;
         }
      }

      this.k.a($$0, $$3, $$4, $$5);
      this.j.a($$0, $$3, $$4, $$5);
      this.f.a($$0, $$3, $$4, $$5);
   }

   public void a(fjn $$0, int $$1, int $$2) {
      if (this.g.z != null && this.e != null && !this.f.c()) {
         $$0.a(this.g.h, this.e.e(), $$1, $$2);
      }
   }

   @Nullable
   public czv<?> a() {
      return this.o;
   }

   @Nullable
   public ftt b() {
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
         this.e();
         return true;
      } else if (this.k.a($$0, $$1, $$2)) {
         this.m--;
         this.e();
         return true;
      } else {
         for (fts $$7 : this.d) {
            if ($$7.a($$0, $$1, $$2)) {
               if ($$2 == 0) {
                  this.o = $$7.c();
                  this.p = $$7.a();
               } else if ($$2 == 1 && !this.f.c() && !$$7.b()) {
                  this.f.a($$7.a(), this.q, $$7.D(), $$7.E(), $$3 + $$5 / 2, $$4 + 13 + $$6 / 2, (float)$$7.y());
               }

               return true;
            }
         }

         return false;
      }
   }

   public void a(List<czv<?>> $$0) {
      for (ftu $$1 : this.h) {
         $$1.a($$0);
      }
   }

   public awg d() {
      return this.n;
   }

   protected void a(Consumer<fjy> $$0) {
      $$0.accept(this.j);
      $$0.accept(this.k);
      this.d.forEach($$0);
   }
}
