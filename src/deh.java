import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class deh extends des {
   private final dei n;
   private final boolean o;

   public deh(dei $$0, boolean $$1) {
      super($$0.f(), dev.a, $$0.l, $$0.F().B_().d(jc.ap), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public czn c_(gu $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dcb a_(gu $$0) {
      return this.n.a_($$0);
   }

   @Override
   public dxe b_(gu $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int M() {
      return this.n.M();
   }

   @Override
   public dej b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dcb a(gu $$0, dcb $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(czn $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bfj $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dec $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dej[] d() {
      return this.n.d();
   }

   @Override
   public void a(dhk.a $$0, long[] $$1) {
   }

   private dhk.a c(dhk.a $$0) {
      if ($$0 == dhk.a.a) {
         return dhk.a.b;
      } else {
         return $$0 == dhk.a.c ? dhk.a.d : $$0;
      }
   }

   @Override
   public dhk a(dhk.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dhk.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public he<cnk> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public clt f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dsi a(dsa $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dsa $$0, dsi $$1) {
   }

   @Override
   public Map<dsa, dsi> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dsa, dsi> $$0) {
   }

   @Override
   public LongSet b(dsa $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dsa $$0, long $$1) {
   }

   @Override
   public Map<dsa, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dsa, LongSet> $$0) {
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
   public dec j() {
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
   public void a(Predicate<dcb> $$0, BiConsumer<gu, dcb> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public efw<cpn> o() {
      return this.o ? this.n.o() : efm.a();
   }

   @Override
   public efw<dxd> p() {
      return this.o ? this.n.p() : efm.a();
   }

   @Override
   public ddx.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public din t() {
      return this.n.t();
   }

   @Override
   public void a(din $$0) {
      this.n.a($$0);
   }

   @Override
   public ddw a(dhg.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public ddw b(dhg.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dei C() {
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
   public void a(cnn $$0, cnt.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public dwo B() {
      return this.n.B();
   }
}
