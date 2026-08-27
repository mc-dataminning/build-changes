import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fgf {
   private final aps a;
   final List<app> b;
   final List<app> c;
   final Function<app, ahg> d;
   final Runnable e;
   private final Consumer<aps> f;

   public fgf(Runnable $$0, Function<app, ahg> $$1, aps $$2, Consumer<aps> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fgf.a> a() {
      return this.c.stream().map($$0 -> new fgf.d($$0));
   }

   public Stream<fgf.a> b() {
      return this.b.stream().map($$0 -> new fgf.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(app::f).collect(ImmutableList.toImmutableList()));
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
      ahg a();

      apq b();

      String c();

      vf d();

      vf e();

      apt f();

      default vf g() {
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

   abstract class b implements fgf.a {
      private final app b;

      public b(app $$0) {
         this.b = $$0;
      }

      protected abstract List<app> s();

      protected abstract List<app> t();

      @Override
      public ahg a() {
         return fgf.this.d.apply(this.b);
      }

      @Override
      public apq b() {
         return this.b.c();
      }

      @Override
      public String c() {
         return this.b.f();
      }

      @Override
      public vf d() {
         return this.b.a();
      }

      @Override
      public vf e() {
         return this.b.b();
      }

      @Override
      public apt f() {
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
         fgf.this.e.run();
         fgf.this.e();
         this.v();
      }

      private void v() {
         if (this.b.f().equals("high_contrast")) {
            evj<Boolean> $$0 = evg.O().m.r();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<app> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fgf.this.e.run();
      }

      @Override
      public boolean q() {
         List<app> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).h();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<app> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fgf.b {
      public c(app $$0) {
         super($$0);
      }

      @Override
      protected List<app> s() {
         return fgf.this.b;
      }

      @Override
      protected List<app> t() {
         return fgf.this.c;
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

   class d extends fgf.b {
      public d(app $$0) {
         super($$0);
      }

      @Override
      protected List<app> s() {
         return fgf.this.c;
      }

      @Override
      protected List<app> t() {
         return fgf.this.b;
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
