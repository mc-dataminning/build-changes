import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fci {
   private final aoe a;
   final List<aob> b;
   final List<aob> c;
   final Function<aob, afw> d;
   final Runnable e;
   private final Consumer<aoe> f;

   public fci(Runnable $$0, Function<aob, afw> $$1, aoe $$2, Consumer<aoe> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fci.a> a() {
      return this.c.stream().map($$0 -> new fci.d($$0));
   }

   public Stream<fci.a> b() {
      return this.b.stream().map($$0 -> new fci.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(aob::f).collect(ImmutableList.toImmutableList()));
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
      afw a();

      aoc b();

      String c();

      ui d();

      ui e();

      aof f();

      default ui g() {
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

   abstract class b implements fci.a {
      private final aob b;

      public b(aob $$0) {
         this.b = $$0;
      }

      protected abstract List<aob> s();

      protected abstract List<aob> t();

      @Override
      public afw a() {
         return fci.this.d.apply(this.b);
      }

      @Override
      public aoc b() {
         return this.b.c();
      }

      @Override
      public String c() {
         return this.b.f();
      }

      @Override
      public ui d() {
         return this.b.a();
      }

      @Override
      public ui e() {
         return this.b.b();
      }

      @Override
      public aof f() {
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
         fci.this.e.run();
         fci.this.e();
         this.v();
      }

      private void v() {
         if (this.b.f().equals("high_contrast")) {
            err<Boolean> $$0 = ero.O().m.q();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<aob> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fci.this.e.run();
      }

      @Override
      public boolean q() {
         List<aob> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).h();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<aob> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fci.b {
      public c(aob $$0) {
         super($$0);
      }

      @Override
      protected List<aob> s() {
         return fci.this.b;
      }

      @Override
      protected List<aob> t() {
         return fci.this.c;
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

   class d extends fci.b {
      public d(aob $$0) {
         super($$0);
      }

      @Override
      protected List<aob> s() {
         return fci.this.c;
      }

      @Override
      protected List<aob> t() {
         return fci.this.b;
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
