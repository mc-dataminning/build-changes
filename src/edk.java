import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class edk extends edv {
   private final edl n;
   private final boolean o;

   public edk(edl $$0, boolean $$1) {
      super($$0.f(), edy.a, $$0.l, $$0.H().J_().f(mh.aG), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dyc c_(iv $$0) {
      return this.n.c_($$0);
   }

   @Override
   public ebe a_(iv $$0) {
      return this.n.a_($$0);
   }

   @Override
   public exo b_(iv $$0) {
      return this.n.b_($$0);
   }

   @Override
   public edm b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public ebe a(iv $$0, ebe $$1, int $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dyc $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bwt $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(eec $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public edm[] d() {
      return this.n.d();
   }

   @Override
   public void a(ehd.a $$0, long[] $$1) {
   }

   private ehd.a c(ehd.a $$0) {
      if ($$0 == ehd.a.a) {
         return ehd.a.b;
      } else {
         return $$0 == ehd.a.c ? ehd.a.d : $$0;
      }
   }

   @Override
   public ehd a(ehd.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(ehd.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jf<dla> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public djc f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public esj a(esb $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(esb $$0, esj $$1) {
   }

   @Override
   public Map<esb, esj> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<esb, esj> $$0) {
   }

   @Override
   public LongSet b(esb $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(esb $$0, long $$1) {
   }

   @Override
   public Map<esb, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<esb, LongSet> $$0) {
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
   public eec n() {
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
   public void a(Predicate<ebe> $$0, BiConsumer<iv, ebe> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fhl<dnc> q() {
      return this.o ? this.n.q() : fhb.a();
   }

   @Override
   public fhl<exn> r() {
      return this.o ? this.n.r() : fhb.a();
   }

   @Override
   public edb.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public eig v() {
      return this.n.v();
   }

   @Override
   public eda E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public eda F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public edl G() {
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
   public void a(dld $$0, dlj.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public ewy D() {
      return this.n.D();
   }
}
