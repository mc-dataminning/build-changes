import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dtg extends dtr {
   private final dth n;
   private final boolean o;

   public dtg(dth $$0, boolean $$1) {
      super($$0.f(), dtu.a, $$0.l, $$0.F().H_().d(lf.az), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dog c_(io $$0) {
      return this.n.c_($$0);
   }

   @Override
   public drb a_(io $$0) {
      return this.n.a_($$0);
   }

   @Override
   public emu b_(io $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int P() {
      return this.n.P();
   }

   @Override
   public dti b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public drb a(io $$0, drb $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dog $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bru $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dtw $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dti[] d() {
      return this.n.d();
   }

   @Override
   public void a(dwt.a $$0, long[] $$1) {
   }

   private dwt.a c(dwt.a $$0) {
      if ($$0 == dwt.a.a) {
         return dwt.a.b;
      } else {
         return $$0 == dwt.a.c ? dwt.a.d : $$0;
      }
   }

   @Override
   public dwt a(dwt.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dwt.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ix<dbw> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dae f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public ehr a(ehj $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(ehj $$0, ehr $$1) {
   }

   @Override
   public Map<ehj, ehr> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<ehj, ehr> $$0) {
   }

   @Override
   public LongSet b(ehj $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(ehj $$0, long $$1) {
   }

   @Override
   public Map<ehj, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<ehj, LongSet> $$0) {
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
   public dtw j() {
      return this.n.j();
   }

   @Override
   public void d(io $$0) {
   }

   @Override
   public void e(io $$0) {
   }

   @Override
   public void a(ud $$0) {
   }

   @Nullable
   @Override
   public ud f(io $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public ud a(io $$0, iz.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<drb> $$0, BiConsumer<io, drb> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public ewe<ddy> o() {
      return this.o ? this.n.o() : evu.a();
   }

   @Override
   public ewe<emt> p() {
      return this.o ? this.n.p() : evu.a();
   }

   @Override
   public dsx.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dxw t() {
      return this.n.t();
   }

   @Override
   public void a(dxw $$0) {
      this.n.a($$0);
   }

   @Override
   public dsw a(dwp.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dsw b(dwp.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dth C() {
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
   public void a(dbz $$0, dcf.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public eme B() {
      return this.n.B();
   }
}
