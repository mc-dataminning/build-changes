import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dum extends dux {
   private final dun n;
   private final boolean o;

   public dum(dun $$0, boolean $$1) {
      super($$0.f(), dva.a, $$0.l, $$0.F().H_().d(lr.aE), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dpn c_(ja $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dsh a_(ja $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eob b_(ja $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int Q() {
      return this.n.Q();
   }

   @Override
   public duo b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dsh a(ja $$0, dsh $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dpn $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bsd $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dvc $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public duo[] d() {
      return this.n.d();
   }

   @Override
   public void a(dxz.a $$0, long[] $$1) {
   }

   private dxz.a c(dxz.a $$0) {
      if ($$0 == dxz.a.a) {
         return dxz.a.b;
      } else {
         return $$0 == dxz.a.c ? dxz.a.d : $$0;
      }
   }

   @Override
   public dxz a(dxz.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dxz.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jj<ddd> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dbk f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public eiy a(eiq $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eiq $$0, eiy $$1) {
   }

   @Override
   public Map<eiq, eiy> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eiq, eiy> $$0) {
   }

   @Override
   public LongSet b(eiq $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eiq $$0, long $$1) {
   }

   @Override
   public Map<eiq, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eiq, LongSet> $$0) {
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
   public dvc j() {
      return this.n.j();
   }

   @Override
   public void d(ja $$0) {
   }

   @Override
   public void e(ja $$0) {
   }

   @Override
   public void a(tx $$0) {
   }

   @Nullable
   @Override
   public tx f(ja $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public tx a(ja $$0, jl.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dsh> $$0, BiConsumer<ja, dsh> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public ext<dff> o() {
      return this.o ? this.n.o() : exj.a();
   }

   @Override
   public ext<eoa> p() {
      return this.o ? this.n.p() : exj.a();
   }

   @Override
   public dud.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dzc t() {
      return this.n.t();
   }

   @Override
   public void a(dzc $$0) {
      this.n.a($$0);
   }

   @Override
   public duc a(dxv.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public duc b(dxv.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dun C() {
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
   public void a(ddg $$0, ddm.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public enl B() {
      return this.n.B();
   }
}
