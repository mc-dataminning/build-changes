import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ecz extends edk {
   private final eda n;
   private final boolean o;

   public ecz(eda $$0, boolean $$1) {
      super($$0.f(), edn.a, $$0.l, $$0.H().F_().f(mh.aG), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dxr c_(iv $$0) {
      return this.n.c_($$0);
   }

   @Override
   public eat a_(iv $$0) {
      return this.n.a_($$0);
   }

   @Override
   public exa b_(iv $$0) {
      return this.n.b_($$0);
   }

   @Override
   public edb b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public eat a(iv $$0, eat $$1, int $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dxr $$0) {
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
   public void a(edr $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public edb[] d() {
      return this.n.d();
   }

   @Override
   public void a(egs.a $$0, long[] $$1) {
   }

   private egs.a c(egs.a $$0) {
      if ($$0 == egs.a.a) {
         return egs.a.b;
      } else {
         return $$0 == egs.a.c ? egs.a.d : $$0;
      }
   }

   @Override
   public egs a(egs.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(egs.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jf<dkp> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dir f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public erv a(ern $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(ern $$0, erv $$1) {
   }

   @Override
   public Map<ern, erv> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<ern, erv> $$0) {
   }

   @Override
   public LongSet b(ern $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(ern $$0, long $$1) {
   }

   @Override
   public Map<ern, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<ern, LongSet> $$0) {
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
   public edr n() {
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
   public void a(Predicate<eat> $$0, BiConsumer<iv, eat> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fgx<dmr> q() {
      return this.o ? this.n.q() : fgn.a();
   }

   @Override
   public fgx<ewz> r() {
      return this.o ? this.n.r() : fgn.a();
   }

   @Override
   public ecq.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public ehv v() {
      return this.n.v();
   }

   @Override
   public ecp E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public ecp F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public eda G() {
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
   public void a(dks $$0, dky.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public ewk D() {
      return this.n.D();
   }
}
