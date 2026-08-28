import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class duc extends dun {
   private final dud n;
   private final boolean o;

   public duc(dud $$0, boolean $$1) {
      super($$0.f(), duq.a, $$0.l, $$0.F().H_().d(lq.az), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dpc c_(iz $$0) {
      return this.n.c_($$0);
   }

   @Override
   public drx a_(iz $$0) {
      return this.n.a_($$0);
   }

   @Override
   public enq b_(iz $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int Q() {
      return this.n.Q();
   }

   @Override
   public due b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public drx a(iz $$0, drx $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dpc $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bsp $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dus $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public due[] d() {
      return this.n.d();
   }

   @Override
   public void a(dxp.a $$0, long[] $$1) {
   }

   private dxp.a c(dxp.a $$0) {
      if ($$0 == dxp.a.a) {
         return dxp.a.b;
      } else {
         return $$0 == dxp.a.c ? dxp.a.d : $$0;
      }
   }

   @Override
   public dxp a(dxp.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dxp.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ji<dcs> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dba f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public ein a(eif $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eif $$0, ein $$1) {
   }

   @Override
   public Map<eif, ein> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eif, ein> $$0) {
   }

   @Override
   public LongSet b(eif $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eif $$0, long $$1) {
   }

   @Override
   public Map<eif, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eif, LongSet> $$0) {
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
   public dus j() {
      return this.n.j();
   }

   @Override
   public void d(iz $$0) {
   }

   @Override
   public void e(iz $$0) {
   }

   @Override
   public void a(ur $$0) {
   }

   @Nullable
   @Override
   public ur f(iz $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public ur a(iz $$0, jk.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<drx> $$0, BiConsumer<iz, drx> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public exg<deu> o() {
      return this.o ? this.n.o() : eww.a();
   }

   @Override
   public exg<enp> p() {
      return this.o ? this.n.p() : eww.a();
   }

   @Override
   public dtt.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dys t() {
      return this.n.t();
   }

   @Override
   public void a(dys $$0) {
      this.n.a($$0);
   }

   @Override
   public dts a(dxl.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dts b(dxl.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dud C() {
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
   public void a(dcv $$0, ddb.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public ena B() {
      return this.n.B();
   }
}
