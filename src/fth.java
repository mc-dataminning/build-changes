import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fth {
   private final aud a;
   final List<aua> b;
   final List<aua> c;
   final Function<aua, alb> d;
   final Runnable e;
   private final Consumer<aud> f;

   public fth(Runnable $$0, Function<aua, alb> $$1, aud $$2, Consumer<aud> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fth.a> a() {
      return this.c.stream().map($$0 -> new fth.d($$0));
   }

   public Stream<fth.a> b() {
      return this.b.stream().map($$0 -> new fth.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(aua::g).collect(ImmutableList.toImmutableList()));
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
      alb a();

      aub b();

      String c();

      xd d();

      xd e();

      aue f();

      default xd g() {
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

   abstract class b implements fth.a {
      private final aua b;

      public b(final aua $$0) {
         this.b = $$0;
      }

      protected abstract List<aua> s();

      protected abstract List<aua> t();

      @Override
      public alb a() {
         return fth.this.d.apply(this.b);
      }

      @Override
      public aub b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public xd d() {
         return this.b.b();
      }

      @Override
      public xd e() {
         return this.b.c();
      }

      @Override
      public aue f() {
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
         this.b.k().a(this.t(), this.b, aua::h, true);
         fth.this.e.run();
         fth.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fie<Boolean> $$0 = fib.Q().n.u();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<aua> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fth.this.e.run();
      }

      @Override
      public boolean q() {
         List<aua> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<aua> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fth.b {
      public c(final aua $$0) {
         super($$0);
      }

      @Override
      protected List<aua> s() {
         return fth.this.b;
      }

      @Override
      protected List<aua> t() {
         return fth.this.c;
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

   class d extends fth.b {
      public d(final aua $$0) {
         super($$0);
      }

      @Override
      protected List<aua> s() {
         return fth.this.c;
      }

      @Override
      protected List<aua> t() {
         return fth.this.b;
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
