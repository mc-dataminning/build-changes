import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fqq {
   private final atf a;
   final List<atc> b;
   final List<atc> c;
   final Function<atc, akk> d;
   final Runnable e;
   private final Consumer<atf> f;

   public fqq(Runnable $$0, Function<atc, akk> $$1, atf $$2, Consumer<atf> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fqq.a> a() {
      return this.c.stream().map($$0 -> new fqq.d($$0));
   }

   public Stream<fqq.a> b() {
      return this.b.stream().map($$0 -> new fqq.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(atc::g).collect(ImmutableList.toImmutableList()));
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
      akk a();

      atd b();

      String c();

      wu d();

      wu e();

      atg f();

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

   abstract class b implements fqq.a {
      private final atc b;

      public b(final atc $$0) {
         this.b = $$0;
      }

      protected abstract List<atc> s();

      protected abstract List<atc> t();

      @Override
      public akk a() {
         return fqq.this.d.apply(this.b);
      }

      @Override
      public atd b() {
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
      public atg f() {
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
         this.b.k().a(this.t(), this.b, atc::h, true);
         fqq.this.e.run();
         fqq.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            ffq<Boolean> $$0 = ffn.Q().m.t();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<atc> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fqq.this.e.run();
      }

      @Override
      public boolean q() {
         List<atc> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<atc> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fqq.b {
      public c(final atc $$0) {
         super($$0);
      }

      @Override
      protected List<atc> s() {
         return fqq.this.b;
      }

      @Override
      protected List<atc> t() {
         return fqq.this.c;
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

   class d extends fqq.b {
      public d(final atc $$0) {
         super($$0);
      }

      @Override
      protected List<atc> s() {
         return fqq.this.c;
      }

      @Override
      protected List<atc> t() {
         return fqq.this.b;
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
