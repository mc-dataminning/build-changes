import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fkl {
   private final arz a;
   final List<arw> b;
   final List<arw> c;
   final Function<arw, ajh> d;
   final Runnable e;
   private final Consumer<arz> f;

   public fkl(Runnable $$0, Function<arw, ajh> $$1, arz $$2, Consumer<arz> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fkl.a> a() {
      return this.c.stream().map($$0 -> new fkl.d($$0));
   }

   public Stream<fkl.a> b() {
      return this.b.stream().map($$0 -> new fkl.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(arw::g).collect(ImmutableList.toImmutableList()));
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
      ajh a();

      arx b();

      String c();

      vu d();

      vu e();

      asa f();

      default vu g() {
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

   abstract class b implements fkl.a {
      private final arw b;

      public b(arw $$0) {
         this.b = $$0;
      }

      protected abstract List<arw> s();

      protected abstract List<arw> t();

      @Override
      public ajh a() {
         return fkl.this.d.apply(this.b);
      }

      @Override
      public arx b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public vu d() {
         return this.b.b();
      }

      @Override
      public vu e() {
         return this.b.c();
      }

      @Override
      public asa f() {
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
         this.b.k().a(this.t(), this.b, arw::h, true);
         fkl.this.e.run();
         fkl.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            ezj<Boolean> $$0 = ezg.Q().m.r();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<arw> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fkl.this.e.run();
      }

      @Override
      public boolean q() {
         List<arw> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<arw> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fkl.b {
      public c(arw $$0) {
         super($$0);
      }

      @Override
      protected List<arw> s() {
         return fkl.this.b;
      }

      @Override
      protected List<arw> t() {
         return fkl.this.c;
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

   class d extends fkl.b {
      public d(arw $$0) {
         super($$0);
      }

      @Override
      protected List<arw> s() {
         return fkl.this.c;
      }

      @Override
      protected List<arw> t() {
         return fkl.this.b;
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
