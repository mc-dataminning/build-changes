import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dyz extends dzk {
   private final dza n;
   private final boolean o;

   public dyz(dza $$0, boolean $$1) {
      super($$0.f(), dzn.a, $$0.l, $$0.H().K_().e(mc.aI), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dtx c_(ji $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dwv a_(ji $$0) {
      return this.n.a_($$0);
   }

   @Override
   public esx b_(ji $$0) {
      return this.n.b_($$0);
   }

   @Override
   public dzb b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dwv a(ji $$0, dwv $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dtx $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(buj $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dzr $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dzb[] d() {
      return this.n.d();
   }

   @Override
   public void a(ecq.a $$0, long[] $$1) {
   }

   private ecq.a c(ecq.a $$0) {
      if ($$0 == ecq.a.a) {
         return ecq.a.b;
      } else {
         return $$0 == ecq.a.c ? ecq.a.d : $$0;
      }
   }

   @Override
   public ecq a(ecq.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(ecq.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jr<dhi> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dfm f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public ens a(enk $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(enk $$0, ens $$1) {
   }

   @Override
   public Map<enk, ens> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<enk, ens> $$0) {
   }

   @Override
   public LongSet b(enk $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(enk $$0, long $$1) {
   }

   @Override
   public Map<enk, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<enk, LongSet> $$0) {
   }

   @Override
   public void i() {
      this.n.i();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public dzr n() {
      return this.n.n();
   }

   @Override
   public void d(ji $$0) {
   }

   @Override
   public void e(ji $$0) {
   }

   @Override
   public void a(tq $$0) {
   }

   @Nullable
   @Override
   public tq f(ji $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public tq a(ji $$0, jt.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dwv> $$0, BiConsumer<ji, dwv> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fct<djk> q() {
      return this.o ? this.n.q() : fcj.a();
   }

   @Override
   public fct<esw> r() {
      return this.o ? this.n.r() : fcj.a();
   }

   @Override
   public dyq.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public edt v() {
      return this.n.v();
   }

   @Override
   public dyp E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dyp F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dza G() {
      return this.n;
   }

   @Override
   public boolean x() {
      return this.n.x();
   }

   @Override
   public void a(boolean $$0) {
      this.n.a($$0);
   }

   @Override
   public void a(dhl $$0, dhr.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public esh D() {
      return this.n.D();
   }
}
