import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fqd {
   private final atw a;
   final List<att> b;
   final List<att> c;
   final Function<att, alb> d;
   final Runnable e;
   private final Consumer<atw> f;

   public fqd(Runnable $$0, Function<att, alb> $$1, atw $$2, Consumer<atw> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fqd.a> a() {
      return this.c.stream().map($$0 -> new fqd.d($$0));
   }

   public Stream<fqd.a> b() {
      return this.b.stream().map($$0 -> new fqd.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(att::g).collect(ImmutableList.toImmutableList()));
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

      atu b();

      String c();

      xl d();

      xl e();

      atx f();

      default xl g() {
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

   abstract class b implements fqd.a {
      private final att b;

      public b(final att $$0) {
         this.b = $$0;
      }

      protected abstract List<att> s();

      protected abstract List<att> t();

      @Override
      public alb a() {
         return fqd.this.d.apply(this.b);
      }

      @Override
      public atu b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public xl d() {
         return this.b.b();
      }

      @Override
      public xl e() {
         return this.b.c();
      }

      @Override
      public atx f() {
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
         this.b.k().a(this.t(), this.b, att::h, true);
         fqd.this.e.run();
         fqd.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            ffd<Boolean> $$0 = ffa.Q().m.t();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<att> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fqd.this.e.run();
      }

      @Override
      public boolean q() {
         List<att> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<att> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fqd.b {
      public c(final att $$0) {
         super($$0);
      }

      @Override
      protected List<att> s() {
         return fqd.this.b;
      }

      @Override
      protected List<att> t() {
         return fqd.this.c;
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

   class d extends fqd.b {
      public d(final att $$0) {
         super($$0);
      }

      @Override
      protected List<att> s() {
         return fqd.this.c;
      }

      @Override
      protected List<att> t() {
         return fqd.this.b;
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
