import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fgh {
   private final apt a;
   final List<apq> b;
   final List<apq> c;
   final Function<apq, ahg> d;
   final Runnable e;
   private final Consumer<apt> f;

   public fgh(Runnable $$0, Function<apq, ahg> $$1, apt $$2, Consumer<apt> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fgh.a> a() {
      return this.c.stream().map($$0 -> new fgh.d($$0));
   }

   public Stream<fgh.a> b() {
      return this.b.stream().map($$0 -> new fgh.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(apq::f).collect(ImmutableList.toImmutableList()));
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

      apr b();

      String c();

      vf d();

      vf e();

      apu f();

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

   abstract class b implements fgh.a {
      private final apq b;

      public b(apq $$0) {
         this.b = $$0;
      }

      protected abstract List<apq> s();

      protected abstract List<apq> t();

      @Override
      public ahg a() {
         return fgh.this.d.apply(this.b);
      }

      @Override
      public apr b() {
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
      public apu f() {
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
         fgh.this.e.run();
         fgh.this.e();
         this.v();
      }

      private void v() {
         if (this.b.f().equals("high_contrast")) {
            evl<Boolean> $$0 = evi.O().m.r();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<apq> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fgh.this.e.run();
      }

      @Override
      public boolean q() {
         List<apq> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).h();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<apq> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fgh.b {
      public c(apq $$0) {
         super($$0);
      }

      @Override
      protected List<apq> s() {
         return fgh.this.b;
      }

      @Override
      protected List<apq> t() {
         return fgh.this.c;
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

   class d extends fgh.b {
      public d(apq $$0) {
         super($$0);
      }

      @Override
      protected List<apq> s() {
         return fgh.this.c;
      }

      @Override
      protected List<apq> t() {
         return fgh.this.b;
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
