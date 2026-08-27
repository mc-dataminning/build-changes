import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dhg extends dhr {
   private final dhh n;
   private final boolean o;

   public dhg(dhh $$0, boolean $$1) {
      super($$0.f(), dhu.a, $$0.l, $$0.F().B_().d(jc.ap), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dcm c_(gu $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dfa a_(gu $$0) {
      return this.n.a_($$0);
   }

   @Override
   public ead b_(gu $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int M() {
      return this.n.M();
   }

   @Override
   public dhi b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dfa a(gu $$0, dfa $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dcm $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bii $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dhb $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dhi[] d() {
      return this.n.d();
   }

   @Override
   public void a(dkj.a $$0, long[] $$1) {
   }

   private dkj.a c(dkj.a $$0) {
      if ($$0 == dkj.a.a) {
         return dkj.a.b;
      } else {
         return $$0 == dkj.a.c ? dkj.a.d : $$0;
      }
   }

   @Override
   public dkj a(dkj.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dkj.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public he<cqk> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cot f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dvh a(duz $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(duz $$0, dvh $$1) {
   }

   @Override
   public Map<duz, dvh> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<duz, dvh> $$0) {
   }

   @Override
   public LongSet b(duz $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(duz $$0, long $$1) {
   }

   @Override
   public Map<duz, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<duz, LongSet> $$0) {
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
   public dhb j() {
      return this.n.j();
   }

   @Override
   public void d(gu $$0) {
   }

   @Override
   public void e(gu $$0) {
   }

   @Override
   public void a(qr $$0) {
   }

   @Nullable
   @Override
   public qr f(gu $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public qr g(gu $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<dfa> $$0, BiConsumer<gu, dfa> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public eit<csm> o() {
      return this.o ? this.n.o() : eij.a();
   }

   @Override
   public eit<eac> p() {
      return this.o ? this.n.p() : eij.a();
   }

   @Override
   public dgw.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dlm t() {
      return this.n.t();
   }

   @Override
   public void a(dlm $$0) {
      this.n.a($$0);
   }

   @Override
   public dgv a(dkf.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dgv b(dkf.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dhh C() {
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
   public void a(cqn $$0, cqt.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public dzn B() {
      return this.n.B();
   }
}
