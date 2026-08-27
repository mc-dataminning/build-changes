import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fnc {
   private final asp a;
   final List<asm> b;
   final List<asm> c;
   final Function<asm, ajv> d;
   final Runnable e;
   private final Consumer<asp> f;

   public fnc(Runnable $$0, Function<asm, ajv> $$1, asp $$2, Consumer<asp> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fnc.a> a() {
      return this.c.stream().map($$0 -> new fnc.d($$0));
   }

   public Stream<fnc.a> b() {
      return this.b.stream().map($$0 -> new fnc.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(asm::g).collect(ImmutableList.toImmutableList()));
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
      ajv a();

      asn b();

      String c();

      wi d();

      wi e();

      asq f();

      default wi g() {
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

   abstract class b implements fnc.a {
      private final asm b;

      public b(asm $$0) {
         this.b = $$0;
      }

      protected abstract List<asm> s();

      protected abstract List<asm> t();

      @Override
      public ajv a() {
         return fnc.this.d.apply(this.b);
      }

      @Override
      public asn b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public wi d() {
         return this.b.b();
      }

      @Override
      public wi e() {
         return this.b.c();
      }

      @Override
      public asq f() {
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
         this.b.k().a(this.t(), this.b, asm::h, true);
         fnc.this.e.run();
         fnc.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fcb<Boolean> $$0 = fby.Q().m.t();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<asm> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fnc.this.e.run();
      }

      @Override
      public boolean q() {
         List<asm> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<asm> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fnc.b {
      public c(asm $$0) {
         super($$0);
      }

      @Override
      protected List<asm> s() {
         return fnc.this.b;
      }

      @Override
      protected List<asm> t() {
         return fnc.this.c;
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

   class d extends fnc.b {
      public d(asm $$0) {
         super($$0);
      }

      @Override
      protected List<asm> s() {
         return fnc.this.c;
      }

      @Override
      protected List<asm> t() {
         return fnc.this.b;
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
