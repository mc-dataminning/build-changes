import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fny {
   private final asz a;
   final List<asw> b;
   final List<asw> c;
   final Function<asw, akf> d;
   final Runnable e;
   private final Consumer<asz> f;

   public fny(Runnable $$0, Function<asw, akf> $$1, asz $$2, Consumer<asz> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fny.a> a() {
      return this.c.stream().map($$0 -> new fny.d($$0));
   }

   public Stream<fny.a> b() {
      return this.b.stream().map($$0 -> new fny.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(asw::g).collect(ImmutableList.toImmutableList()));
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
      akf a();

      asx b();

      String c();

      ws d();

      ws e();

      ata f();

      default ws g() {
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

   abstract class b implements fny.a {
      private final asw b;

      public b(asw $$0) {
         this.b = $$0;
      }

      protected abstract List<asw> s();

      protected abstract List<asw> t();

      @Override
      public akf a() {
         return fny.this.d.apply(this.b);
      }

      @Override
      public asx b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public ws d() {
         return this.b.b();
      }

      @Override
      public ws e() {
         return this.b.c();
      }

      @Override
      public ata f() {
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
         this.b.k().a(this.t(), this.b, asw::h, true);
         fny.this.e.run();
         fny.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fcx<Boolean> $$0 = fcu.Q().m.t();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<asw> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fny.this.e.run();
      }

      @Override
      public boolean q() {
         List<asw> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<asw> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fny.b {
      public c(asw $$0) {
         super($$0);
      }

      @Override
      protected List<asw> s() {
         return fny.this.b;
      }

      @Override
      protected List<asw> t() {
         return fny.this.c;
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

   class d extends fny.b {
      public d(asw $$0) {
         super($$0);
      }

      @Override
      protected List<asw> s() {
         return fny.this.c;
      }

      @Override
      protected List<asw> t() {
         return fny.this.b;
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
