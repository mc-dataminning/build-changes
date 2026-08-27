import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fgs {
   private final apu a;
   final List<apr> b;
   final List<apr> c;
   final Function<apr, ahh> d;
   final Runnable e;
   private final Consumer<apu> f;

   public fgs(Runnable $$0, Function<apr, ahh> $$1, apu $$2, Consumer<apu> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fgs.a> a() {
      return this.c.stream().map($$0 -> new fgs.d($$0));
   }

   public Stream<fgs.a> b() {
      return this.b.stream().map($$0 -> new fgs.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(apr::f).collect(ImmutableList.toImmutableList()));
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
      ahh a();

      aps b();

      String c();

      vg d();

      vg e();

      apv f();

      default vg g() {
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

   abstract class b implements fgs.a {
      private final apr b;

      public b(apr $$0) {
         this.b = $$0;
      }

      protected abstract List<apr> s();

      protected abstract List<apr> t();

      @Override
      public ahh a() {
         return fgs.this.d.apply(this.b);
      }

      @Override
      public aps b() {
         return this.b.c();
      }

      @Override
      public String c() {
         return this.b.f();
      }

      @Override
      public vg d() {
         return this.b.a();
      }

      @Override
      public vg e() {
         return this.b.b();
      }

      @Override
      public apv f() {
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
         fgs.this.e.run();
         fgs.this.e();
         this.v();
      }

      private void v() {
         if (this.b.f().equals("high_contrast")) {
            evu<Boolean> $$0 = evr.O().m.r();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<apr> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fgs.this.e.run();
      }

      @Override
      public boolean q() {
         List<apr> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).h();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<apr> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fgs.b {
      public c(apr $$0) {
         super($$0);
      }

      @Override
      protected List<apr> s() {
         return fgs.this.b;
      }

      @Override
      protected List<apr> t() {
         return fgs.this.c;
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

   class d extends fgs.b {
      public d(apr $$0) {
         super($$0);
      }

      @Override
      protected List<apr> s() {
         return fgs.this.c;
      }

      @Override
      protected List<apr> t() {
         return fgs.this.b;
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
