import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fef {
   private final aow a;
   final List<aot> b;
   final List<aot> c;
   final Function<aot, agm> d;
   final Runnable e;
   private final Consumer<aow> f;

   public fef(Runnable $$0, Function<aot, agm> $$1, aow $$2, Consumer<aow> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fef.a> a() {
      return this.c.stream().map($$0 -> new fef.d($$0));
   }

   public Stream<fef.a> b() {
      return this.b.stream().map($$0 -> new fef.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(aot::f).collect(ImmutableList.toImmutableList()));
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
      agm a();

      aou b();

      String c();

      uv d();

      uv e();

      aox f();

      default uv g() {
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

   abstract class b implements fef.a {
      private final aot b;

      public b(aot $$0) {
         this.b = $$0;
      }

      protected abstract List<aot> s();

      protected abstract List<aot> t();

      @Override
      public agm a() {
         return fef.this.d.apply(this.b);
      }

      @Override
      public aou b() {
         return this.b.c();
      }

      @Override
      public String c() {
         return this.b.f();
      }

      @Override
      public uv d() {
         return this.b.a();
      }

      @Override
      public uv e() {
         return this.b.b();
      }

      @Override
      public aox f() {
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
         fef.this.e.run();
         fef.this.e();
         this.v();
      }

      private void v() {
         if (this.b.f().equals("high_contrast")) {
            etl<Boolean> $$0 = eti.N().m.r();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<aot> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fef.this.e.run();
      }

      @Override
      public boolean q() {
         List<aot> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).h();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<aot> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fef.b {
      public c(aot $$0) {
         super($$0);
      }

      @Override
      protected List<aot> s() {
         return fef.this.b;
      }

      @Override
      protected List<aot> t() {
         return fef.this.c;
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

   class d extends fef.b {
      public d(aot $$0) {
         super($$0);
      }

      @Override
      protected List<aot> s() {
         return fef.this.c;
      }

      @Override
      protected List<aot> t() {
         return fef.this.b;
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
