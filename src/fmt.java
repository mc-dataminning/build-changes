import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fmt {
   private final asn a;
   final List<ask> b;
   final List<ask> c;
   final Function<ask, ajt> d;
   final Runnable e;
   private final Consumer<asn> f;

   public fmt(Runnable $$0, Function<ask, ajt> $$1, asn $$2, Consumer<asn> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fmt.a> a() {
      return this.c.stream().map($$0 -> new fmt.d($$0));
   }

   public Stream<fmt.a> b() {
      return this.b.stream().map($$0 -> new fmt.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(ask::g).collect(ImmutableList.toImmutableList()));
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
      ajt a();

      asl b();

      String c();

      wg d();

      wg e();

      aso f();

      default wg g() {
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

   abstract class b implements fmt.a {
      private final ask b;

      public b(ask $$0) {
         this.b = $$0;
      }

      protected abstract List<ask> s();

      protected abstract List<ask> t();

      @Override
      public ajt a() {
         return fmt.this.d.apply(this.b);
      }

      @Override
      public asl b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public wg d() {
         return this.b.b();
      }

      @Override
      public wg e() {
         return this.b.c();
      }

      @Override
      public aso f() {
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
         this.b.k().a(this.t(), this.b, ask::h, true);
         fmt.this.e.run();
         fmt.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fbs<Boolean> $$0 = fbp.Q().m.t();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<ask> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fmt.this.e.run();
      }

      @Override
      public boolean q() {
         List<ask> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<ask> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fmt.b {
      public c(ask $$0) {
         super($$0);
      }

      @Override
      protected List<ask> s() {
         return fmt.this.b;
      }

      @Override
      protected List<ask> t() {
         return fmt.this.c;
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

   class d extends fmt.b {
      public d(ask $$0) {
         super($$0);
      }

      @Override
      protected List<ask> s() {
         return fmt.this.c;
      }

      @Override
      protected List<ask> t() {
         return fmt.this.b;
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
