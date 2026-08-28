import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class edw extends eeh {
   private final edx n;
   private final boolean o;

   public edw(edx $$0, boolean $$1) {
      super($$0.f(), eek.a, $$0.l, $$0.H().J_().f(mi.aG), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dyo c_(iw $$0) {
      return this.n.c_($$0);
   }

   @Override
   public ebq a_(iw $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eya b_(iw $$0) {
      return this.n.b_($$0);
   }

   @Override
   public edy b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public ebq a(iw $$0, ebq $$1, int $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dyo $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bxe $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(eeo $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public edy[] d() {
      return this.n.d();
   }

   @Override
   public void a(ehp.a $$0, long[] $$1) {
   }

   private ehp.a c(ehp.a $$0) {
      if ($$0 == ehp.a.a) {
         return ehp.a.b;
      } else {
         return $$0 == ehp.a.c ? ehp.a.d : $$0;
      }
   }

   @Override
   public ehp a(ehp.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(ehp.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jg<dlm> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public djo f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public esv a(esn $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(esn $$0, esv $$1) {
   }

   @Override
   public Map<esn, esv> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<esn, esv> $$0) {
   }

   @Override
   public LongSet b(esn $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(esn $$0, long $$1) {
   }

   @Override
   public Map<esn, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<esn, LongSet> $$0) {
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
   public eeo n() {
      return this.n.n();
   }

   @Override
   public void d(iw $$0) {
   }

   @Override
   public void e(iw $$0) {
   }

   @Override
   public void a(ua $$0) {
   }

   @Nullable
   @Override
   public ua f(iw $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public ua a(iw $$0, ji.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<ebq> $$0, BiConsumer<iw, ebq> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fhx<dno> q() {
      return this.o ? this.n.q() : fhn.a();
   }

   @Override
   public fhx<exz> r() {
      return this.o ? this.n.r() : fhn.a();
   }

   @Override
   public edn.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public eis v() {
      return this.n.v();
   }

   @Override
   public edm E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public edm F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public edx G() {
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
   public void a(dlp $$0, dlv.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public exk D() {
      return this.n.D();
   }
}
