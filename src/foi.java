import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class foi {
   private final atc a;
   final List<asz> b;
   final List<asz> c;
   final Function<asz, akh> d;
   final Runnable e;
   private final Consumer<atc> f;

   public foi(Runnable $$0, Function<asz, akh> $$1, atc $$2, Consumer<atc> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<foi.a> a() {
      return this.c.stream().map($$0 -> new foi.d($$0));
   }

   public Stream<foi.a> b() {
      return this.b.stream().map($$0 -> new foi.c($$0));
   }

   void e() {
      this.a.a(Lists.reverse(this.b).stream().map(asz::g).collect(ImmutableList.toImmutableList()));
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
      akh a();

      ata b();

      String c();

      wu d();

      wu e();

      atd f();

      default wu g() {
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

   abstract class b implements foi.a {
      private final asz b;

      public b(asz $$0) {
         this.b = $$0;
      }

      protected abstract List<asz> s();

      protected abstract List<asz> t();

      @Override
      public akh a() {
         return foi.this.d.apply(this.b);
      }

      @Override
      public ata b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public wu d() {
         return this.b.b();
      }

      @Override
      public wu e() {
         return this.b.c();
      }

      @Override
      public atd f() {
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
         this.b.k().a(this.t(), this.b, asz::h, true);
         foi.this.e.run();
         foi.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fdh<Boolean> $$0 = fde.Q().m.t();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<asz> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         foi.this.e.run();
      }

      @Override
      public boolean q() {
         List<asz> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<asz> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends foi.b {
      public c(asz $$0) {
         super($$0);
      }

      @Override
      protected List<asz> s() {
         return foi.this.b;
      }

      @Override
      protected List<asz> t() {
         return foi.this.c;
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

   class d extends foi.b {
      public d(asz $$0) {
         super($$0);
      }

      @Override
      protected List<asz> s() {
         return foi.this.c;
      }

      @Override
      protected List<asz> t() {
         return foi.this.b;
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
