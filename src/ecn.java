import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ecn extends ecy {
   private final eco n;
   private final boolean o;

   public ecn(eco $$0, boolean $$1) {
      super($$0.f(), edb.a, $$0.l, $$0.H().F_().f(mg.aG), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dxf c_(iu $$0) {
      return this.n.c_($$0);
   }

   @Override
   public eah a_(iu $$0) {
      return this.n.a_($$0);
   }

   @Override
   public ewo b_(iu $$0) {
      return this.n.b_($$0);
   }

   @Override
   public ecp b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public eah a(iu $$0, eah $$1, int $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dxf $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bwf $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(edf $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public ecp[] d() {
      return this.n.d();
   }

   @Override
   public void a(egg.a $$0, long[] $$1) {
   }

   private egg.a c(egg.a $$0) {
      if ($$0 == egg.a.a) {
         return egg.a.b;
      } else {
         return $$0 == egg.a.c ? egg.a.d : $$0;
      }
   }

   @Override
   public egg a(egg.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(egg.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public je<dkd> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dih f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public erj a(erb $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(erb $$0, erj $$1) {
   }

   @Override
   public Map<erb, erj> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<erb, erj> $$0) {
   }

   @Override
   public LongSet b(erb $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(erb $$0, long $$1) {
   }

   @Override
   public Map<erb, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<erb, LongSet> $$0) {
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
   public edf n() {
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
   public void a(Predicate<eah> $$0, BiConsumer<iu, eah> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fgl<dmf> q() {
      return this.o ? this.n.q() : fgb.a();
   }

   @Override
   public fgl<ewn> r() {
      return this.o ? this.n.r() : fgb.a();
   }

   @Override
   public ece.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public ehj v() {
      return this.n.v();
   }

   @Override
   public ecd E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public ecd F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public eco G() {
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
   public void a(dkg $$0, dkm.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public evy D() {
      return this.n.D();
   }
}
