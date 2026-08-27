import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fbd {
   private final amx a;
   final List<amu> b;
   final List<amu> c;
   final Function<amu, aer> d;
   final Runnable e;
   private final Consumer<amx> f;

   public fbd(Runnable $$0, Function<amu, aer> $$1, amx $$2, Consumer<amx> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fbd.a> a() {
      return this.c.stream().map($$0 -> new fbd.d($$0));
   }

   public Stream<fbd.a> b() {
      return this.b.stream().map($$0 -> new fbd.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(amu::f).collect(ImmutableList.toImmutableList()));
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
      aer a();

      amv b();

      String c();

      tf d();

      tf e();

      amy f();

      default tf g() {
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

   abstract class b implements fbd.a {
      private final amu b;

      public b(amu $$0) {
         this.b = $$0;
      }

      protected abstract List<amu> s();

      protected abstract List<amu> t();

      @Override
      public aer a() {
         return fbd.this.d.apply(this.b);
      }

      @Override
      public amv b() {
         return this.b.c();
      }

      @Override
      public String c() {
         return this.b.f();
      }

      @Override
      public tf d() {
         return this.b.a();
      }

      @Override
      public tf e() {
         return this.b.b();
      }

      @Override
      public amy f() {
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
         fbd.this.e.run();
         fbd.this.e();
         this.v();
      }

      private void v() {
         if (this.b.f().equals("high_contrast")) {
            eqp<Boolean> $$0 = eqm.O().m.q();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<amu> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fbd.this.e.run();
      }

      @Override
      public boolean q() {
         List<amu> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).h();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<amu> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fbd.b {
      public c(amu $$0) {
         super($$0);
      }

      @Override
      protected List<amu> s() {
         return fbd.this.b;
      }

      @Override
      protected List<amu> t() {
         return fbd.this.c;
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

   class d extends fbd.b {
      public d(amu $$0) {
         super($$0);
      }

      @Override
      protected List<amu> s() {
         return fbd.this.c;
      }

      @Override
      protected List<amu> t() {
         return fbd.this.b;
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
