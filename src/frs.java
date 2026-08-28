import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class frs {
   private final atp a;
   final List<atm> b;
   final List<atm> c;
   final Function<atm, akr> d;
   final Runnable e;
   private final Consumer<atp> f;

   public frs(Runnable $$0, Function<atm, akr> $$1, atp $$2, Consumer<atp> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<frs.a> a() {
      return this.c.stream().map($$0 -> new frs.d($$0));
   }

   public Stream<frs.a> b() {
      return this.b.stream().map($$0 -> new frs.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(atm::g).collect(ImmutableList.toImmutableList()));
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
      akr a();

      atn b();

      String c();

      wz d();

      wz e();

      atq f();

      default wz g() {
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

   abstract class b implements frs.a {
      private final atm b;

      public b(final atm $$0) {
         this.b = $$0;
      }

      protected abstract List<atm> s();

      protected abstract List<atm> t();

      @Override
      public akr a() {
         return frs.this.d.apply(this.b);
      }

      @Override
      public atn b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public wz d() {
         return this.b.b();
      }

      @Override
      public wz e() {
         return this.b.c();
      }

      @Override
      public atq f() {
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
         this.b.k().a(this.t(), this.b, atm::h, true);
         frs.this.e.run();
         frs.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fgr<Boolean> $$0 = fgo.Q().m.t();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<atm> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         frs.this.e.run();
      }

      @Override
      public boolean q() {
         List<atm> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<atm> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends frs.b {
      public c(final atm $$0) {
         super($$0);
      }

      @Override
      protected List<atm> s() {
         return frs.this.b;
      }

      @Override
      protected List<atm> t() {
         return frs.this.c;
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

   class d extends frs.b {
      public d(final atm $$0) {
         super($$0);
      }

      @Override
      protected List<atm> s() {
         return frs.this.c;
      }

      @Override
      protected List<atm> t() {
         return frs.this.b;
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
