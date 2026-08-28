import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dui extends dut {
   private final duj n;
   private final boolean o;

   public dui(duj $$0, boolean $$1) {
      super($$0.f(), duw.a, $$0.l, $$0.F().H_().d(lq.az), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dpi c_(iz $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dsd a_(iz $$0) {
      return this.n.a_($$0);
   }

   @Override
   public enw b_(iz $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int Q() {
      return this.n.Q();
   }

   @Override
   public duk b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dsd a(iz $$0, dsd $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dpi $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bsv $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(duy $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public duk[] d() {
      return this.n.d();
   }

   @Override
   public void a(dxv.a $$0, long[] $$1) {
   }

   private dxv.a c(dxv.a $$0) {
      if ($$0 == dxv.a.a) {
         return dxv.a.b;
      } else {
         return $$0 == dxv.a.c ? dxv.a.d : $$0;
      }
   }

   @Override
   public dxv a(dxv.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dxv.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ji<dcy> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dbg f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public eit a(eil $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eil $$0, eit $$1) {
   }

   @Override
   public Map<eil, eit> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eil, eit> $$0) {
   }

   @Override
   public LongSet b(eil $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eil $$0, long $$1) {
   }

   @Override
   public Map<eil, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eil, LongSet> $$0) {
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
   public duy j() {
      return this.n.j();
   }

   @Override
   public void d(iz $$0) {
   }

   @Override
   public void e(iz $$0) {
   }

   @Override
   public void a(us $$0) {
   }

   @Nullable
   @Override
   public us f(iz $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public us a(iz $$0, jk.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dsd> $$0, BiConsumer<iz, dsd> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public exm<dfa> o() {
      return this.o ? this.n.o() : exc.a();
   }

   @Override
   public exm<env> p() {
      return this.o ? this.n.p() : exc.a();
   }

   @Override
   public dtz.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dyy t() {
      return this.n.t();
   }

   @Override
   public void a(dyy $$0) {
      this.n.a($$0);
   }

   @Override
   public dty a(dxr.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dty b(dxr.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public duj C() {
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
   public void a(ddb $$0, ddh.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public eng B() {
      return this.n.B();
   }
}
