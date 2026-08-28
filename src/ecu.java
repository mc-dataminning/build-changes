import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ecu extends edf {
   private final ecv n;
   private final boolean o;

   public ecu(ecv $$0, boolean $$1) {
      super($$0.f(), edi.a, $$0.l, $$0.H().F_().f(mh.aG), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dxm c_(iv $$0) {
      return this.n.c_($$0);
   }

   @Override
   public eao a_(iv $$0) {
      return this.n.a_($$0);
   }

   @Override
   public ewv b_(iv $$0) {
      return this.n.b_($$0);
   }

   @Override
   public ecw b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public eao a(iv $$0, eao $$1, int $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dxm $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bwi $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(edm $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public ecw[] d() {
      return this.n.d();
   }

   @Override
   public void a(egn.a $$0, long[] $$1) {
   }

   private egn.a c(egn.a $$0) {
      if ($$0 == egn.a.a) {
         return egn.a.b;
      } else {
         return $$0 == egn.a.c ? egn.a.d : $$0;
      }
   }

   @Override
   public egn a(egn.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(egn.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jf<dkk> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dio f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public erq a(eri $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eri $$0, erq $$1) {
   }

   @Override
   public Map<eri, erq> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eri, erq> $$0) {
   }

   @Override
   public LongSet b(eri $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eri $$0, long $$1) {
   }

   @Override
   public Map<eri, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eri, LongSet> $$0) {
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
   public edm n() {
      return this.n.n();
   }

   @Override
   public void d(iv $$0) {
   }

   @Override
   public void e(iv $$0) {
   }

   @Override
   public void a(tz $$0) {
   }

   @Nullable
   @Override
   public tz f(iv $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public tz a(iv $$0, jh.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<eao> $$0, BiConsumer<iv, eao> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fgs<dmm> q() {
      return this.o ? this.n.q() : fgi.a();
   }

   @Override
   public fgs<ewu> r() {
      return this.o ? this.n.r() : fgi.a();
   }

   @Override
   public ecl.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public ehq v() {
      return this.n.v();
   }

   @Override
   public eck E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public eck F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public ecv G() {
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
   public void a(dkn $$0, dkt.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public ewf D() {
      return this.n.D();
   }
}
