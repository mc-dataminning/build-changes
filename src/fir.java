import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fir {
   private final arm a;
   final List<arj> b;
   final List<arj> c;
   final Function<arj, aiy> d;
   final Runnable e;
   private final Consumer<arm> f;

   public fir(Runnable $$0, Function<arj, aiy> $$1, arm $$2, Consumer<arm> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fir.a> a() {
      return this.c.stream().map($$0 -> new fir.d($$0));
   }

   public Stream<fir.a> b() {
      return this.b.stream().map($$0 -> new fir.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(arj::f).collect(ImmutableList.toImmutableList()));
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
      aiy a();

      ark b();

      String c();

      vq d();

      vq e();

      arn f();

      default vq g() {
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

   abstract class b implements fir.a {
      private final arj b;

      public b(arj $$0) {
         this.b = $$0;
      }

      protected abstract List<arj> s();

      protected abstract List<arj> t();

      @Override
      public aiy a() {
         return fir.this.d.apply(this.b);
      }

      @Override
      public ark b() {
         return this.b.c();
      }

      @Override
      public String c() {
         return this.b.f();
      }

      @Override
      public vq d() {
         return this.b.a();
      }

      @Override
      public vq e() {
         return this.b.b();
      }

      @Override
      public arn f() {
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
         fir.this.e.run();
         fir.this.e();
         this.v();
      }

      private void v() {
         if (this.b.f().equals("high_contrast")) {
            exr<Boolean> $$0 = exo.P().m.r();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<arj> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fir.this.e.run();
      }

      @Override
      public boolean q() {
         List<arj> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).h();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<arj> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fir.b {
      public c(arj $$0) {
         super($$0);
      }

      @Override
      protected List<arj> s() {
         return fir.this.b;
      }

      @Override
      protected List<arj> t() {
         return fir.this.c;
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

   class d extends fir.b {
      public d(arj $$0) {
         super($$0);
      }

      @Override
      protected List<arj> s() {
         return fir.this.c;
      }

      @Override
      protected List<arj> t() {
         return fir.this.b;
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
