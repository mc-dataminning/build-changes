import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class ffz {
   private final apn a;
   final List<apk> b;
   final List<apk> c;
   final Function<apk, ahd> d;
   final Runnable e;
   private final Consumer<apn> f;

   public ffz(Runnable $$0, Function<apk, ahd> $$1, apn $$2, Consumer<apn> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<ffz.a> a() {
      return this.c.stream().map($$0 -> new ffz.d($$0));
   }

   public Stream<ffz.a> b() {
      return this.b.stream().map($$0 -> new ffz.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(apk::f).collect(ImmutableList.toImmutableList()));
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
      ahd a();

      apl b();

      String c();

      vd d();

      vd e();

      apo f();

      default vd g() {
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

   abstract class b implements ffz.a {
      private final apk b;

      public b(apk $$0) {
         this.b = $$0;
      }

      protected abstract List<apk> s();

      protected abstract List<apk> t();

      @Override
      public ahd a() {
         return ffz.this.d.apply(this.b);
      }

      @Override
      public apl b() {
         return this.b.c();
      }

      @Override
      public String c() {
         return this.b.f();
      }

      @Override
      public vd d() {
         return this.b.a();
      }

      @Override
      public vd e() {
         return this.b.b();
      }

      @Override
      public apo f() {
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
         ffz.this.e.run();
         ffz.this.e();
         this.v();
      }

      private void v() {
         if (this.b.f().equals("high_contrast")) {
            evd<Boolean> $$0 = eva.N().m.r();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<apk> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         ffz.this.e.run();
      }

      @Override
      public boolean q() {
         List<apk> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).h();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<apk> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends ffz.b {
      public c(apk $$0) {
         super($$0);
      }

      @Override
      protected List<apk> s() {
         return ffz.this.b;
      }

      @Override
      protected List<apk> t() {
         return ffz.this.c;
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

   class d extends ffz.b {
      public d(apk $$0) {
         super($$0);
      }

      @Override
      protected List<apk> s() {
         return ffz.this.c;
      }

      @Override
      protected List<apk> t() {
         return ffz.this.b;
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
