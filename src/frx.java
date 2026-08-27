import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class frx {
   private final ato a;
   final List<atl> b;
   final List<atl> c;
   final Function<atl, akt> d;
   final Runnable e;
   private final Consumer<ato> f;

   public frx(Runnable $$0, Function<atl, akt> $$1, ato $$2, Consumer<ato> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<frx.a> a() {
      return this.c.stream().map($$0 -> new frx.d($$0));
   }

   public Stream<frx.a> b() {
      return this.b.stream().map($$0 -> new frx.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(atl::g).collect(ImmutableList.toImmutableList()));
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
      akt a();

      atm b();

      String c();

      xe d();

      xe e();

      atp f();

      default xe g() {
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

   abstract class b implements frx.a {
      private final atl b;

      public b(atl $$0) {
         this.b = $$0;
      }

      protected abstract List<atl> s();

      protected abstract List<atl> t();

      @Override
      public akt a() {
         return frx.this.d.apply(this.b);
      }

      @Override
      public atm b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public xe d() {
         return this.b.b();
      }

      @Override
      public xe e() {
         return this.b.c();
      }

      @Override
      public atp f() {
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
         this.b.k().a(this.t(), this.b, atl::h, true);
         frx.this.e.run();
         frx.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fgm<Boolean> $$0 = fgj.Q().m.t();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<atl> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         frx.this.e.run();
      }

      @Override
      public boolean q() {
         List<atl> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<atl> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends frx.b {
      public c(atl $$0) {
         super($$0);
      }

      @Override
      protected List<atl> s() {
         return frx.this.b;
      }

      @Override
      protected List<atl> t() {
         return frx.this.c;
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

   class d extends frx.b {
      public d(atl $$0) {
         super($$0);
      }

      @Override
      protected List<atl> s() {
         return frx.this.c;
      }

      @Override
      protected List<atl> t() {
         return frx.this.b;
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
