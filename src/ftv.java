import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class ftv {
   private final aug a;
   final List<aud> b;
   final List<aud> c;
   final Function<aud, ale> d;
   final Runnable e;
   private final Consumer<aug> f;

   public ftv(Runnable $$0, Function<aud, ale> $$1, aug $$2, Consumer<aug> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<ftv.a> a() {
      return this.c.stream().map($$0 -> new ftv.d($$0));
   }

   public Stream<ftv.a> b() {
      return this.b.stream().map($$0 -> new ftv.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(aud::g).collect(ImmutableList.toImmutableList()));
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

      aue b();

      String c();

      xe d();

      xe e();

      auh f();

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

   abstract class b implements ftv.a {
      private final aud b;

      public b(final aud $$0) {
         this.b = $$0;
      }

      protected abstract List<aud> s();

      protected abstract List<aud> t();

      @Override
      public ale a() {
         return ftv.this.d.apply(this.b);
      }

      @Override
      public aue b() {
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
      public auh f() {
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
         this.b.k().a(this.t(), this.b, aud::h, true);
         ftv.this.e.run();
         ftv.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fis<Boolean> $$0 = fip.Q().n.u();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<aud> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         ftv.this.e.run();
      }

      @Override
      public boolean q() {
         List<aud> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<aud> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends ftv.b {
      public c(final aud $$0) {
         super($$0);
      }

      @Override
      protected List<aud> s() {
         return ftv.this.b;
      }

      @Override
      protected List<aud> t() {
         return ftv.this.c;
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

   class d extends ftv.b {
      public d(final aud $$0) {
         super($$0);
      }

      @Override
      protected List<aud> s() {
         return ftv.this.c;
      }

      @Override
      protected List<aud> t() {
         return ftv.this.b;
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
