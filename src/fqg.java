import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fqg {
   private final atz a;
   final List<atw> b;
   final List<atw> c;
   final Function<atw, ale> d;
   final Runnable e;
   private final Consumer<atz> f;

   public fqg(Runnable $$0, Function<atw, ale> $$1, atz $$2, Consumer<atz> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fqg.a> a() {
      return this.c.stream().map($$0 -> new fqg.d($$0));
   }

   public Stream<fqg.a> b() {
      return this.b.stream().map($$0 -> new fqg.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(atw::g).collect(ImmutableList.toImmutableList()));
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
      ale a();

      atx b();

      String c();

      xo d();

      xo e();

      aua f();

      default xo g() {
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

   abstract class b implements fqg.a {
      private final atw b;

      public b(final atw $$0) {
         this.b = $$0;
      }

      protected abstract List<atw> s();

      protected abstract List<atw> t();

      @Override
      public ale a() {
         return fqg.this.d.apply(this.b);
      }

      @Override
      public atx b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public xo d() {
         return this.b.b();
      }

      @Override
      public xo e() {
         return this.b.c();
      }

      @Override
      public aua f() {
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
         this.b.k().a(this.t(), this.b, atw::h, true);
         fqg.this.e.run();
         fqg.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            ffg<Boolean> $$0 = ffd.Q().m.t();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<atw> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fqg.this.e.run();
      }

      @Override
      public boolean q() {
         List<atw> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<atw> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fqg.b {
      public c(final atw $$0) {
         super($$0);
      }

      @Override
      protected List<atw> s() {
         return fqg.this.b;
      }

      @Override
      protected List<atw> t() {
         return fqg.this.c;
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

   class d extends fqg.b {
      public d(final atw $$0) {
         super($$0);
      }

      @Override
      protected List<atw> s() {
         return fqg.this.c;
      }

      @Override
      protected List<atw> t() {
         return fqg.this.b;
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
