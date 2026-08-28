import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dug extends dur {
   private final duh n;
   private final boolean o;

   public dug(duh $$0, boolean $$1) {
      super($$0.f(), duu.a, $$0.l, $$0.F().H_().d(lq.az), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dpg c_(iz $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dsb a_(iz $$0) {
      return this.n.a_($$0);
   }

   @Override
   public enu b_(iz $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int Q() {
      return this.n.Q();
   }

   @Override
   public dui b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dsb a(iz $$0, dsb $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dpg $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bst $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(duw $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dui[] d() {
      return this.n.d();
   }

   @Override
   public void a(dxt.a $$0, long[] $$1) {
   }

   private dxt.a c(dxt.a $$0) {
      if ($$0 == dxt.a.a) {
         return dxt.a.b;
      } else {
         return $$0 == dxt.a.c ? dxt.a.d : $$0;
      }
   }

   @Override
   public dxt a(dxt.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dxt.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ji<dcw> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dbe f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public eir a(eij $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eij $$0, eir $$1) {
   }

   @Override
   public Map<eij, eir> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eij, eir> $$0) {
   }

   @Override
   public LongSet b(eij $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eij $$0, long $$1) {
   }

   @Override
   public Map<eij, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eij, LongSet> $$0) {
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
   public duw j() {
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
   public void a(Predicate<dsb> $$0, BiConsumer<iz, dsb> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public exk<dey> o() {
      return this.o ? this.n.o() : exa.a();
   }

   @Override
   public exk<ent> p() {
      return this.o ? this.n.p() : exa.a();
   }

   @Override
   public dtx.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dyw t() {
      return this.n.t();
   }

   @Override
   public void a(dyw $$0) {
      this.n.a($$0);
   }

   @Override
   public dtw a(dxp.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dtw b(dxp.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public duh C() {
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
   public void a(dcz $$0, ddf.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public ene B() {
      return this.n.B();
   }
}
