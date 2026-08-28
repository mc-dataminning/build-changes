import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class ftr {
   private final aue a;
   final List<aub> b;
   final List<aub> c;
   final Function<aub, alc> d;
   final Runnable e;
   private final Consumer<aue> f;

   public ftr(Runnable $$0, Function<aub, alc> $$1, aue $$2, Consumer<aue> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.f());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.c());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<ftr.a> a() {
      return this.c.stream().map($$0 -> new ftr.d($$0));
   }

   public Stream<ftr.a> b() {
      return this.b.stream().map($$0 -> new ftr.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(aub::g).collect(ImmutableList.toImmutableList()));
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
      alc a();

      auc b();

      String c();

      xd d();

      xd e();

      auf f();

      default xd g() {
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

   abstract class b implements ftr.a {
      private final aub b;

      public b(final aub $$0) {
         this.b = $$0;
      }

      protected abstract List<aub> s();

      protected abstract List<aub> t();

      @Override
      public alc a() {
         return ftr.this.d.apply(this.b);
      }

      @Override
      public auc b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public xd d() {
         return this.b.b();
      }

      @Override
      public xd e() {
         return this.b.c();
      }

      @Override
      public auf f() {
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
         this.b.k().a(this.t(), this.b, aub::h, true);
         ftr.this.e.run();
         ftr.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fio<Boolean> $$0 = fil.Q().n.u();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<aub> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         ftr.this.e.run();
      }

      @Override
      public boolean q() {
         List<aub> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<aub> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends ftr.b {
      public c(final aub $$0) {
         super($$0);
      }

      @Override
      protected List<aub> s() {
         return ftr.this.b;
      }

      @Override
      protected List<aub> t() {
         return ftr.this.c;
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

   class d extends ftr.b {
      public d(final aub $$0) {
         super($$0);
      }

      @Override
      protected List<aub> s() {
         return ftr.this.c;
      }

      @Override
      protected List<aub> t() {
         return ftr.this.b;
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
