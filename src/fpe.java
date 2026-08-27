import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fpe {
   private final ath a;
   final List<ate> b;
   final List<ate> c;
   final Function<ate, akm> d;
   final Runnable e;
   private final Consumer<ath> f;

   public fpe(Runnable $$0, Function<ate, akm> $$1, ath $$2, Consumer<ath> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fpe.a> a() {
      return this.c.stream().map($$0 -> new fpe.d($$0));
   }

   public Stream<fpe.a> b() {
      return this.b.stream().map($$0 -> new fpe.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(ate::g).collect(ImmutableList.toImmutableList()));
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
      akm a();

      atf b();

      String c();

      wx d();

      wx e();

      ati f();

      default wx g() {
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

   abstract class b implements fpe.a {
      private final ate b;

      public b(ate $$0) {
         this.b = $$0;
      }

      protected abstract List<ate> s();

      protected abstract List<ate> t();

      @Override
      public akm a() {
         return fpe.this.d.apply(this.b);
      }

      @Override
      public atf b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public wx d() {
         return this.b.b();
      }

      @Override
      public wx e() {
         return this.b.c();
      }

      @Override
      public ati f() {
         return this.b.l();
      }

      @Override
      public boolean h() {
         return this.b.j();
      }

      @Override
      public boolean i() {
         return this.b.i();
      }

      protected void u() {
         this.s().remove(this.b);
         this.b.k().a(this.t(), this.b, ate::h, true);
         fpe.this.e.run();
         fpe.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fec<Boolean> $$0 = fdz.Q().m.t();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<ate> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fpe.this.e.run();
      }

      @Override
      public boolean q() {
         List<ate> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<ate> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fpe.b {
      public c(ate $$0) {
         super($$0);
      }

      @Override
      protected List<ate> s() {
         return fpe.this.b;
      }

      @Override
      protected List<ate> t() {
         return fpe.this.c;
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

   class d extends fpe.b {
      public d(ate $$0) {
         super($$0);
      }

      @Override
      protected List<ate> s() {
         return fpe.this.c;
      }

      @Override
      protected List<ate> t() {
         return fpe.this.b;
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
