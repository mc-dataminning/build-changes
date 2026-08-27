import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fbj {
   private final anh a;
   final List<ane> b;
   final List<ane> c;
   final Function<ane, aez> d;
   final Runnable e;
   private final Consumer<anh> f;

   public fbj(Runnable $$0, Function<ane, aez> $$1, anh $$2, Consumer<anh> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fbj.a> a() {
      return this.c.stream().map($$0 -> new fbj.d($$0));
   }

   public Stream<fbj.a> b() {
      return this.b.stream().map($$0 -> new fbj.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(ane::f).collect(ImmutableList.toImmutableList()));
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
      aez a();

      anf b();

      String c();

      tl d();

      tl e();

      ani f();

      default tl g() {
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

   abstract class b implements fbj.a {
      private final ane b;

      public b(ane $$0) {
         this.b = $$0;
      }

      protected abstract List<ane> s();

      protected abstract List<ane> t();

      @Override
      public aez a() {
         return fbj.this.d.apply(this.b);
      }

      @Override
      public anf b() {
         return this.b.c();
      }

      @Override
      public String c() {
         return this.b.f();
      }

      @Override
      public tl d() {
         return this.b.a();
      }

      @Override
      public tl e() {
         return this.b.b();
      }

      @Override
      public ani f() {
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
         fbj.this.e.run();
         fbj.this.e();
         this.v();
      }

      private void v() {
         if (this.b.f().equals("high_contrast")) {
            eqs<Boolean> $$0 = eqp.O().m.q();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<ane> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fbj.this.e.run();
      }

      @Override
      public boolean q() {
         List<ane> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).h();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<ane> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fbj.b {
      public c(ane $$0) {
         super($$0);
      }

      @Override
      protected List<ane> s() {
         return fbj.this.b;
      }

      @Override
      protected List<ane> t() {
         return fbj.this.c;
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

   class d extends fbj.b {
      public d(ane $$0) {
         super($$0);
      }

      @Override
      protected List<ane> s() {
         return fbj.this.c;
      }

      @Override
      protected List<ane> t() {
         return fbj.this.b;
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
