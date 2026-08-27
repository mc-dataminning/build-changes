import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class faz {
   private final amv a;
   final List<ams> b;
   final List<ams> c;
   final Function<ams, aep> d;
   final Runnable e;
   private final Consumer<amv> f;

   public faz(Runnable $$0, Function<ams, aep> $$1, amv $$2, Consumer<amv> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<faz.a> a() {
      return this.c.stream().map($$0 -> new faz.d($$0));
   }

   public Stream<faz.a> b() {
      return this.b.stream().map($$0 -> new faz.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(ams::f).collect(ImmutableList.toImmutableList()));
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
      aep a();

      amt b();

      String c();

      te d();

      te e();

      amw f();

      default te g() {
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

   abstract class b implements faz.a {
      private final ams b;

      public b(ams $$0) {
         this.b = $$0;
      }

      protected abstract List<ams> s();

      protected abstract List<ams> t();

      @Override
      public aep a() {
         return faz.this.d.apply(this.b);
      }

      @Override
      public amt b() {
         return this.b.c();
      }

      @Override
      public String c() {
         return this.b.f();
      }

      @Override
      public te d() {
         return this.b.a();
      }

      @Override
      public te e() {
         return this.b.b();
      }

      @Override
      public amw f() {
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
         faz.this.e.run();
         faz.this.e();
         this.v();
      }

      private void v() {
         if (this.b.f().equals("high_contrast")) {
            eqq<Boolean> $$0 = eqn.N().m.q();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<ams> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         faz.this.e.run();
      }

      @Override
      public boolean q() {
         List<ams> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).h();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<ams> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends faz.b {
      public c(ams $$0) {
         super($$0);
      }

      @Override
      protected List<ams> s() {
         return faz.this.b;
      }

      @Override
      protected List<ams> t() {
         return faz.this.c;
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

   class d extends faz.b {
      public d(ams $$0) {
         super($$0);
      }

      @Override
      protected List<ams> s() {
         return faz.this.c;
      }

      @Override
      protected List<ams> t() {
         return faz.this.b;
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
