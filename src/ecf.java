import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ecf extends ecq {
   private final ecg n;
   private final boolean o;

   public ecf(ecg $$0, boolean $$1) {
      super($$0.f(), ect.a, $$0.l, $$0.H().F_().f(mg.aG), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dwx c_(iu $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dzz a_(iu $$0) {
      return this.n.a_($$0);
   }

   @Override
   public ewg b_(iu $$0) {
      return this.n.b_($$0);
   }

   @Override
   public ech b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dzz a(iu $$0, dzz $$1, int $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dwx $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bwd $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(ecx $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public ech[] d() {
      return this.n.d();
   }

   @Override
   public void a(efy.a $$0, long[] $$1) {
   }

   private efy.a c(efy.a $$0) {
      if ($$0 == efy.a.a) {
         return efy.a.b;
      } else {
         return $$0 == efy.a.c ? efy.a.d : $$0;
      }
   }

   @Override
   public efy a(efy.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(efy.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public je<djy> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dic f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public erb a(eqt $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eqt $$0, erb $$1) {
   }

   @Override
   public Map<eqt, erb> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eqt, erb> $$0) {
   }

   @Override
   public LongSet b(eqt $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eqt $$0, long $$1) {
   }

   @Override
   public Map<eqt, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eqt, LongSet> $$0) {
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
   public ecx n() {
      return this.n.n();
   }

   @Override
   public void d(iu $$0) {
   }

   @Override
   public void e(iu $$0) {
   }

   @Override
   public void a(tz $$0) {
   }

   @Nullable
   @Override
   public tz f(iu $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public tz a(iu $$0, jg.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dzz> $$0, BiConsumer<iu, dzz> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fgd<dma> q() {
      return this.o ? this.n.q() : fft.a();
   }

   @Override
   public fgd<ewf> r() {
      return this.o ? this.n.r() : fft.a();
   }

   @Override
   public ebw.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public ehb v() {
      return this.n.v();
   }

   @Override
   public ebv E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public ebv F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public ecg G() {
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
   public void a(dkb $$0, dkh.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public evq D() {
      return this.n.D();
   }
}
