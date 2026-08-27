import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dti extends dtt {
   private final dtj n;
   private final boolean o;

   public dti(dtj $$0, boolean $$1) {
      super($$0.f(), dtw.a, $$0.l, $$0.F().H_().d(lf.az), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public doi c_(io $$0) {
      return this.n.c_($$0);
   }

   @Override
   public drd a_(io $$0) {
      return this.n.a_($$0);
   }

   @Override
   public emw b_(io $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int P() {
      return this.n.P();
   }

   @Override
   public dtk b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public drd a(io $$0, drd $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(doi $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(brw $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dty $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dtk[] d() {
      return this.n.d();
   }

   @Override
   public void a(dwv.a $$0, long[] $$1) {
   }

   private dwv.a c(dwv.a $$0) {
      if ($$0 == dwv.a.a) {
         return dwv.a.b;
      } else {
         return $$0 == dwv.a.c ? dwv.a.d : $$0;
      }
   }

   @Override
   public dwv a(dwv.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dwv.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ix<dby> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dag f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public eht a(ehl $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(ehl $$0, eht $$1) {
   }

   @Override
   public Map<ehl, eht> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<ehl, eht> $$0) {
   }

   @Override
   public LongSet b(ehl $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(ehl $$0, long $$1) {
   }

   @Override
   public Map<ehl, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<ehl, LongSet> $$0) {
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
   public dty j() {
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
   public void a(Predicate<drd> $$0, BiConsumer<io, drd> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public ewg<dea> o() {
      return this.o ? this.n.o() : evw.a();
   }

   @Override
   public ewg<emv> p() {
      return this.o ? this.n.p() : evw.a();
   }

   @Override
   public dsz.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dxy t() {
      return this.n.t();
   }

   @Override
   public void a(dxy $$0) {
      this.n.a($$0);
   }

   @Override
   public dsy a(dwr.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dsy b(dwr.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dtj C() {
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
   public void a(dcb $$0, dch.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public emg B() {
      return this.n.B();
   }
}
