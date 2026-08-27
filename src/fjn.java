import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fjn {
   private final arq a;
   final List<arn> b;
   final List<arn> c;
   final Function<arn, ajc> d;
   final Runnable e;
   private final Consumer<arq> f;

   public fjn(Runnable $$0, Function<arn, ajc> $$1, arq $$2, Consumer<arq> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fjn.a> a() {
      return this.c.stream().map($$0 -> new fjn.d($$0));
   }

   public Stream<fjn.a> b() {
      return this.b.stream().map($$0 -> new fjn.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(arn::f).collect(ImmutableList.toImmutableList()));
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
      ajc a();

      aro b();

      String c();

      vs d();

      vs e();

      arr f();

      default vs g() {
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

   abstract class b implements fjn.a {
      private final arn b;

      public b(arn $$0) {
         this.b = $$0;
      }

      protected abstract List<arn> s();

      protected abstract List<arn> t();

      @Override
      public ajc a() {
         return fjn.this.d.apply(this.b);
      }

      @Override
      public aro b() {
         return this.b.c();
      }

      @Override
      public String c() {
         return this.b.f();
      }

      @Override
      public vs d() {
         return this.b.a();
      }

      @Override
      public vs e() {
         return this.b.b();
      }

      @Override
      public arr f() {
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
         fjn.this.e.run();
         fjn.this.e();
         this.v();
      }

      private void v() {
         if (this.b.f().equals("high_contrast")) {
            eyn<Boolean> $$0 = eyk.P().m.r();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<arn> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fjn.this.e.run();
      }

      @Override
      public boolean q() {
         List<arn> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).h();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<arn> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fjn.b {
      public c(arn $$0) {
         super($$0);
      }

      @Override
      protected List<arn> s() {
         return fjn.this.b;
      }

      @Override
      protected List<arn> t() {
         return fjn.this.c;
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

   class d extends fjn.b {
      public d(arn $$0) {
         super($$0);
      }

      @Override
      protected List<arn> s() {
         return fjn.this.c;
      }

      @Override
      protected List<arn> t() {
         return fjn.this.b;
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
