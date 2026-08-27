import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dlg extends dlr {
   private final dlh n;
   private final boolean o;

   public dlg(dlh $$0, boolean $$1) {
      super($$0.f(), dlu.a, $$0.l, $$0.F().I_().d(ke.at), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dgo c_(hx $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dja a_(hx $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eek b_(hx $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int O() {
      return this.n.O();
   }

   @Override
   public dli b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dja a(hx $$0, dja $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dgo $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(blp $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dlb $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dli[] d() {
      return this.n.d();
   }

   @Override
   public void a(doj.a $$0, long[] $$1) {
   }

   private doj.a c(doj.a $$0) {
      if ($$0 == doj.a.a) {
         return doj.a.b;
      } else {
         return $$0 == doj.a.c ? doj.a.d : $$0;
      }
   }

   @Override
   public doj a(doj.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(doj.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ih<cuh> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public csp f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dzh a(dyz $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dyz $$0, dzh $$1) {
   }

   @Override
   public Map<dyz, dzh> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dyz, dzh> $$0) {
   }

   @Override
   public LongSet b(dyz $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dyz $$0, long $$1) {
   }

   @Override
   public Map<dyz, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dyz, LongSet> $$0) {
   }

   @Override
   public void a(boolean $$0) {
      this.n.a($$0);
   }

   @Override
   public boolean i() {
      return false;
   }

   @Override
   public dlb j() {
      return this.n.j();
   }

   @Override
   public void d(hx $$0) {
   }

   @Override
   public void e(hx $$0) {
   }

   @Override
   public void a(sl $$0) {
   }

   @Nullable
   @Override
   public sl f(hx $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public sl g(hx $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<dja> $$0, BiConsumer<hx, dja> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public eng<cwj> o() {
      return this.o ? this.n.o() : emw.a();
   }

   @Override
   public eng<eej> p() {
      return this.o ? this.n.p() : emw.a();
   }

   @Override
   public dkw.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dpm t() {
      return this.n.t();
   }

   @Override
   public void a(dpm $$0) {
      this.n.a($$0);
   }

   @Override
   public dkv a(dof.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dkv b(dof.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dlh C() {
      return this.n;
   }

   @Override
   public boolean v() {
      return this.n.v();
   }

   @Override
   public void b(boolean $$0) {
      this.n.b($$0);
   }

   @Override
   public void a(cuk $$0, cuq.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public edu B() {
      return this.n.B();
   }
}
