import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fdn {
   private final aoo a;
   final List<aol> b;
   final List<aol> c;
   final Function<aol, agg> d;
   final Runnable e;
   private final Consumer<aoo> f;

   public fdn(Runnable $$0, Function<aol, agg> $$1, aoo $$2, Consumer<aoo> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fdn.a> a() {
      return this.c.stream().map($$0 -> new fdn.d($$0));
   }

   public Stream<fdn.a> b() {
      return this.b.stream().map($$0 -> new fdn.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(aol::f).collect(ImmutableList.toImmutableList()));
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
      agg a();

      aom b();

      String c();

      ur d();

      ur e();

      aop f();

      default ur g() {
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

   abstract class b implements fdn.a {
      private final aol b;

      public b(aol $$0) {
         this.b = $$0;
      }

      protected abstract List<aol> s();

      protected abstract List<aol> t();

      @Override
      public agg a() {
         return fdn.this.d.apply(this.b);
      }

      @Override
      public aom b() {
         return this.b.c();
      }

      @Override
      public String c() {
         return this.b.f();
      }

      @Override
      public ur d() {
         return this.b.a();
      }

      @Override
      public ur e() {
         return this.b.b();
      }

      @Override
      public aop f() {
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
         fdn.this.e.run();
         fdn.this.e();
         this.v();
      }

      private void v() {
         if (this.b.f().equals("high_contrast")) {
            esu<Boolean> $$0 = esr.N().m.r();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<aol> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fdn.this.e.run();
      }

      @Override
      public boolean q() {
         List<aol> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).h();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<aol> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fdn.b {
      public c(aol $$0) {
         super($$0);
      }

      @Override
      protected List<aol> s() {
         return fdn.this.b;
      }

      @Override
      protected List<aol> t() {
         return fdn.this.c;
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

   class d extends fdn.b {
      public d(aol $$0) {
         super($$0);
      }

      @Override
      protected List<aol> s() {
         return fdn.this.c;
      }

      @Override
      protected List<aol> t() {
         return fdn.this.b;
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
