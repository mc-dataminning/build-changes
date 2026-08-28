import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class duf extends duq {
   private final dug n;
   private final boolean o;

   public duf(dug $$0, boolean $$1) {
      super($$0.f(), dut.a, $$0.l, $$0.F().H_().d(lq.az), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dpf c_(iz $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dsa a_(iz $$0) {
      return this.n.a_($$0);
   }

   @Override
   public ent b_(iz $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int Q() {
      return this.n.Q();
   }

   @Override
   public duh b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dsa a(iz $$0, dsa $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dpf $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bss $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(duv $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public duh[] d() {
      return this.n.d();
   }

   @Override
   public void a(dxs.a $$0, long[] $$1) {
   }

   private dxs.a c(dxs.a $$0) {
      if ($$0 == dxs.a.a) {
         return dxs.a.b;
      } else {
         return $$0 == dxs.a.c ? dxs.a.d : $$0;
      }
   }

   @Override
   public dxs a(dxs.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dxs.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ji<dcv> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dbd f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public eiq a(eii $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eii $$0, eiq $$1) {
   }

   @Override
   public Map<eii, eiq> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eii, eiq> $$0) {
   }

   @Override
   public LongSet b(eii $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eii $$0, long $$1) {
   }

   @Override
   public Map<eii, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eii, LongSet> $$0) {
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
   public duv j() {
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
   public void a(Predicate<dsa> $$0, BiConsumer<iz, dsa> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public exj<dex> o() {
      return this.o ? this.n.o() : ewz.a();
   }

   @Override
   public exj<ens> p() {
      return this.o ? this.n.p() : ewz.a();
   }

   @Override
   public dtw.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dyv t() {
      return this.n.t();
   }

   @Override
   public void a(dyv $$0) {
      this.n.a($$0);
   }

   @Override
   public dtv a(dxo.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dtv b(dxo.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dug C() {
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
   public void a(dcy $$0, dde.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public end B() {
      return this.n.B();
   }
}
