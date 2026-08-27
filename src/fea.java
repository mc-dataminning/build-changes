import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fea {
   private final aos a;
   final List<aop> b;
   final List<aop> c;
   final Function<aop, agi> d;
   final Runnable e;
   private final Consumer<aos> f;

   public fea(Runnable $$0, Function<aop, agi> $$1, aos $$2, Consumer<aos> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fea.a> a() {
      return this.c.stream().map($$0 -> new fea.d($$0));
   }

   public Stream<fea.a> b() {
      return this.b.stream().map($$0 -> new fea.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(aop::f).collect(ImmutableList.toImmutableList()));
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
      agi a();

      aoq b();

      String c();

      ur d();

      ur e();

      aot f();

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

   abstract class b implements fea.a {
      private final aop b;

      public b(aop $$0) {
         this.b = $$0;
      }

      protected abstract List<aop> s();

      protected abstract List<aop> t();

      @Override
      public agi a() {
         return fea.this.d.apply(this.b);
      }

      @Override
      public aoq b() {
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
      public aot f() {
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
         fea.this.e.run();
         fea.this.e();
         this.v();
      }

      private void v() {
         if (this.b.f().equals("high_contrast")) {
            etg<Boolean> $$0 = etd.N().m.r();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<aop> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fea.this.e.run();
      }

      @Override
      public boolean q() {
         List<aop> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).h();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<aop> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fea.b {
      public c(aop $$0) {
         super($$0);
      }

      @Override
      protected List<aop> s() {
         return fea.this.b;
      }

      @Override
      protected List<aop> t() {
         return fea.this.c;
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

   class d extends fea.b {
      public d(aop $$0) {
         super($$0);
      }

      @Override
      protected List<aop> s() {
         return fea.this.c;
      }

      @Override
      protected List<aop> t() {
         return fea.this.b;
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
