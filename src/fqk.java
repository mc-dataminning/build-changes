import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fqk {
   private final aua a;
   final List<atx> b;
   final List<atx> c;
   final Function<atx, alf> d;
   final Runnable e;
   private final Consumer<aua> f;

   public fqk(Runnable $$0, Function<atx, alf> $$1, aua $$2, Consumer<aua> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fqk.a> a() {
      return this.c.stream().map($$0 -> new fqk.d($$0));
   }

   public Stream<fqk.a> b() {
      return this.b.stream().map($$0 -> new fqk.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(atx::g).collect(ImmutableList.toImmutableList()));
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
      alf a();

      aty b();

      String c();

      xp d();

      xp e();

      aub f();

      default xp g() {
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

   abstract class b implements fqk.a {
      private final atx b;

      public b(final atx $$0) {
         this.b = $$0;
      }

      protected abstract List<atx> s();

      protected abstract List<atx> t();

      @Override
      public alf a() {
         return fqk.this.d.apply(this.b);
      }

      @Override
      public aty b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public xp d() {
         return this.b.b();
      }

      @Override
      public xp e() {
         return this.b.c();
      }

      @Override
      public aub f() {
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
         this.b.k().a(this.t(), this.b, atx::h, true);
         fqk.this.e.run();
         fqk.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            ffk<Boolean> $$0 = ffh.Q().m.t();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<atx> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fqk.this.e.run();
      }

      @Override
      public boolean q() {
         List<atx> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<atx> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fqk.b {
      public c(final atx $$0) {
         super($$0);
      }

      @Override
      protected List<atx> s() {
         return fqk.this.b;
      }

      @Override
      protected List<atx> t() {
         return fqk.this.c;
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

   class d extends fqk.b {
      public d(final atx $$0) {
         super($$0);
      }

      @Override
      protected List<atx> s() {
         return fqk.this.c;
      }

      @Override
      protected List<atx> t() {
         return fqk.this.b;
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
