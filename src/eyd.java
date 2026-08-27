import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eyd {
   public static final int a = 20;
   private final List<eyf> b = Lists.newArrayListWithCapacity(20);
   @Nullable
   private eyf c;
   private final eyb d = new eyb();
   private enn e;
   private final List<eyh> f = Lists.newArrayList();
   private List<eyg> g = ImmutableList.of();
   private eqj h;
   private eqj i;
   private int j;
   private int k;
   private amk l;
   @Nullable
   private cjc<?> m;
   @Nullable
   private eyg n;

   public eyd() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         this.b.add(new eyf());
      }
   }

   public void a(enn $$0, int $$1, int $$2) {
      this.e = $$0;
      this.l = $$0.t.x();

      for (int $$3 = 0; $$3 < this.b.size(); $$3++) {
         this.b.get($$3).b($$1 + 11 + 25 * ($$3 % 5), $$2 + 31 + 25 * ($$3 / 5));
      }

      this.h = new eqj($$1 + 93, $$2 + 137, 12, 17, false);
      this.h.a(1, 208, 13, 18, eyc.a);
      this.i = new eqj($$1 + 38, $$2 + 137, 12, 17, true);
      this.i.a(1, 208, 13, 18, eyc.a);
   }

   public void a(eyc $$0) {
      this.f.remove($$0);
      this.f.add($$0);
   }

   public void a(List<eyg> $$0, boolean $$1) {
      this.g = $$0;
      this.j = (int)Math.ceil((double)$$0.size() / 20.0);
      if (this.j <= this.k || $$1) {
         this.k = 0;
      }

      this.f();
   }

   private void f() {
      int $$0 = 20 * this.k;

      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         eyf $$2 = this.b.get($$1);
         if ($$0 + $$1 < this.g.size()) {
            eyg $$3 = this.g.get($$0 + $$1);
            $$2.a($$3, this);
            $$2.s = true;
         } else {
            $$2.s = false;
         }
      }

      this.g();
   }

   private void g() {
      this.h.s = this.j > 1 && this.k < this.j - 1;
      this.i.s = this.j > 1 && this.k > 0;
   }

   public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
      if (this.j > 1) {
         String $$6 = this.k + 1 + "/" + this.j;
         int $$7 = this.e.h.b($$6);
         $$0.a(this.e.h, $$6, $$1 - $$7 / 2 + 73, $$2 + 141, -1, false);
      }

      this.c = null;

      for (eyf $$8 : this.b) {
         $$8.a($$0, $$3, $$4, $$5);
         if ($$8.s && $$8.n()) {
            this.c = $$8;
         }
      }

      this.i.a($$0, $$3, $$4, $$5);
      this.h.a($$0, $$3, $$4, $$5);
      this.d.a($$0, $$3, $$4, $$5);
   }

   public void a(eox $$0, int $$1, int $$2) {
      if (this.e.z != null && this.c != null && !this.d.d()) {
         $$0.a(this.e.h, this.c.f(), $$1, $$2);
      }
   }

   @Nullable
   public cjc<?> a() {
      return this.m;
   }

   @Nullable
   public eyg b() {
      return this.n;
   }

   public void c() {
      this.d.b(false);
   }

   public boolean a(double $$0, double $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      this.m = null;
      this.n = null;
      if (this.d.d()) {
         if (this.d.a($$0, $$1, $$2)) {
            this.m = this.d.b();
            this.n = this.d.a();
         } else {
            this.d.b(false);
         }

         return true;
      } else if (this.h.a($$0, $$1, $$2)) {
         this.k++;
         this.f();
         return true;
      } else if (this.i.a($$0, $$1, $$2)) {
         this.k--;
         this.f();
         return true;
      } else {
         for (eyf $$7 : this.b) {
            if ($$7.a($$0, $$1, $$2)) {
               if ($$2 == 0) {
                  this.m = $$7.e();
                  this.n = $$7.a();
               } else if ($$2 == 1 && !this.d.d() && !$$7.b()) {
                  this.d.a(this.e, $$7.a(), $$7.p(), $$7.r(), $$3 + $$5 / 2, $$4 + 13 + $$6 / 2, (float)$$7.k());
               }

               return true;
            }
         }

         return false;
      }
   }

   public void a(List<cjc<?>> $$0) {
      for (eyh $$1 : this.f) {
         $$1.a($$0);
      }
   }

   public enn d() {
      return this.e;
   }

   public amk e() {
      return this.l;
   }

   protected void a(Consumer<epf> $$0) {
      $$0.accept(this.h);
      $$0.accept(this.i);
      this.b.forEach($$0);
   }
}
