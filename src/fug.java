import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fug {
   private final auk a;
   final List<auh> b;
   final List<auh> c;
   final Function<auh, alh> d;
   final Runnable e;
   private final Consumer<auk> f;

   public fug(Runnable $$0, Function<auh, alh> $$1, auk $$2, Consumer<auk> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.g());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.d());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fug.a> a() {
      return this.c.stream().map($$0 -> new fug.d($$0));
   }

   public Stream<fug.a> b() {
      return this.b.stream().map($$0 -> new fug.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(auh::g).collect(ImmutableList.toImmutableList()));
   }

   public void c() {
      this.e();
      this.f.accept(this.a);
   }

   public void d() {
      this.a.a();
      this.b.retainAll(this.a.d());
      this.c.clear();
      this.c.addAll(this.a.d());
      this.c.removeAll(this.b);
   }

   public interface a {
      alh a();

      aui b();

      String c();

      xh d();

      xh e();

      aul f();

      default xh g() {
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

   abstract class b implements fug.a {
      private final auh b;

      public b(final auh $$0) {
         this.b = $$0;
      }

      protected abstract List<auh> s();

      protected abstract List<auh> t();

      @Override
      public alh a() {
         return fug.this.d.apply(this.b);
      }

      @Override
      public aui b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public xh d() {
         return this.b.b();
      }

      @Override
      public xh e() {
         return this.b.c();
      }

      @Override
      public aul f() {
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
         this.b.k().a(this.t(), this.b, auh::h, true);
         fug.this.e.run();
         fug.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fjd<Boolean> $$0 = fja.Q().n.u();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<auh> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fug.this.e.run();
      }

      @Override
      public boolean q() {
         List<auh> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<auh> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fug.b {
      public c(final auh $$0) {
         super($$0);
      }

      @Override
      protected List<auh> s() {
         return fug.this.b;
      }

      @Override
      protected List<auh> t() {
         return fug.this.c;
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

   class d extends fug.b {
      public d(final auh $$0) {
         super($$0);
      }

      @Override
      protected List<auh> s() {
         return fug.this.c;
      }

      @Override
      protected List<auh> t() {
         return fug.this.b;
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
