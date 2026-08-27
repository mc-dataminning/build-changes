import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fbq {
   private final ang a;
   final List<and> b;
   final List<and> c;
   final Function<and, aey> d;
   final Runnable e;
   private final Consumer<ang> f;

   public fbq(Runnable $$0, Function<and, aey> $$1, ang $$2, Consumer<ang> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fbq.a> a() {
      return this.c.stream().map($$0 -> new fbq.d($$0));
   }

   public Stream<fbq.a> b() {
      return this.b.stream().map($$0 -> new fbq.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(and::f).collect(ImmutableList.toImmutableList()));
   }

   public void c() {
      this.e();
      this.f.accept(this.a);
   }

   public void d() {
      this.a.a();
      this.b.retainAll(this.a.c());
      this.c.clear();
      this.c.addAll(this.a.c());
      this.c.removeAll(this.b);
   }

   public interface a {
      aey a();

      ane b();

      String c();

      tn d();

      tn e();

      anh f();

      default tn g() {
         return this.f().a(this.e());
      }

      boolean h();

      boolean i();

      void j();

      void k();

      void l();

      void m();

      boolean n();

      default boolean o() {
         return !this.n();
      }

      default boolean p() {
         return this.n() && !this.i();
      }

      boolean q();

      boolean r();
   }

   abstract class b implements fbq.a {
      private final and b;

      public b(and $$0) {
         this.b = $$0;
      }

      protected abstract List<and> s();

      protected abstract List<and> t();

      @Override
      public aey a() {
         return fbq.this.d.apply(this.b);
      }

      @Override
      public ane b() {
         return this.b.c();
      }

      @Override
      public String c() {
         return this.b.f();
      }

      @Override
      public tn d() {
         return this.b.a();
      }

      @Override
      public tn e() {
         return this.b.b();
      }

      @Override
      public anh f() {
         return this.b.j();
      }

      @Override
      public boolean h() {
         return this.b.h();
      }

      @Override
      public boolean i() {
         return this.b.g();
      }

      protected void u() {
         this.s().remove(this.b);
         this.b.i().a(this.t(), this.b, Function.identity(), true);
         fbq.this.e.run();
         fbq.this.e();
         this.v();
      }

      private void v() {
         if (this.b.f().equals("high_contrast")) {
            era<Boolean> $$0 = eqx.O().m.q();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<and> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fbq.this.e.run();
      }

      @Override
      public boolean q() {
         List<and> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).h();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<and> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fbq.b {
      public c(and $$0) {
         super($$0);
      }

      @Override
      protected List<and> s() {
         return fbq.this.b;
      }

      @Override
      protected List<and> t() {
         return fbq.this.c;
      }

      @Override
      public boolean n() {
         return true;
      }

      @Override
      public void j() {
      }

      @Override
      public void k() {
         this.u();
      }
   }

   class d extends fbq.b {
      public d(and $$0) {
         super($$0);
      }

      @Override
      protected List<and> s() {
         return fbq.this.c;
      }

      @Override
      protected List<and> t() {
         return fbq.this.b;
      }

      @Override
      public boolean n() {
         return false;
      }

      @Override
      public void j() {
         this.u();
      }

      @Override
      public void k() {
      }
   }
}
