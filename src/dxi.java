import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxi extends dxt {
   private final dxj o;
   private final boolean p;

   public dxi(dxj $$0, boolean $$1) {
      super($$0.f(), dxw.a, $$0.m, $$0.E().H_().e(ly.aG), $$0.s());
      this.o = $$0;
      this.p = $$1;
   }

   @Nullable
   @Override
   public dsg c_(jg $$0) {
      return this.o.c_($$0);
   }

   @Override
   public dvd a_(jg $$0) {
      return this.o.a_($$0);
   }

   @Override
   public ere b_(jg $$0) {
      return this.o.b_($$0);
   }

   @Override
   public dxk b(int $$0) {
      return this.p ? this.o.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dvd a(jg $$0, dvd $$1, boolean $$2) {
      return this.p ? this.o.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dsg $$0) {
      if (this.p) {
         this.o.a($$0);
      }
   }

   @Override
   public void a(btz $$0) {
      if (this.p) {
         this.o.a($$0);
      }
   }

   @Override
   public void a(dya $$0) {
      if (this.p) {
         super.a($$0);
      }
   }

   @Override
   public dxk[] d() {
      return this.o.d();
   }

   @Override
   public void a(eaz.a $$0, long[] $$1) {
   }

   private eaz.a c(eaz.a $$0) {
      if ($$0 == eaz.a.a) {
         return eaz.a.b;
      } else {
         return $$0 == eaz.a.c ? eaz.a.d : $$0;
      }
   }

   @Override
   public eaz a(eaz.a $$0) {
      return this.o.a($$0);
   }

   @Override
   public int a(eaz.a $$0, int $$1, int $$2) {
      return this.o.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jp<dfw> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.o.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public deb f() {
      return this.o.f();
   }

   @Nullable
   @Override
   public elz a(elr $$0) {
      return this.o.a($$0);
   }

   @Override
   public void a(elr $$0, elz $$1) {
   }

   @Override
   public Map<elr, elz> g() {
      return this.o.g();
   }

   @Override
   public void a(Map<elr, elz> $$0) {
   }

   @Override
   public LongSet b(elr $$0) {
      return this.o.b($$0);
   }

   @Override
   public void a(elr $$0, long $$1) {
   }

   @Override
   public Map<elr, LongSet> h() {
      return this.o.h();
   }

   @Override
   public void b(Map<elr, LongSet> $$0) {
   }

   @Override
   public void a(boolean $$0) {
      this.o.a($$0);
   }

   @Override
   public boolean i() {
      return false;
   }

   @Override
   public dya j() {
      return this.o.j();
   }

   @Override
   public void d(jg $$0) {
   }

   @Override
   public void e(jg $$0) {
   }

   @Override
   public void a(uj $$0) {
   }

   @Nullable
   @Override
   public uj f(jg $$0) {
      return this.o.f($$0);
   }

   @Nullable
   @Override
   public uj a(jg $$0, jr.a $$1) {
      return this.o.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dvd> $$0, BiConsumer<jg, dvd> $$1) {
      this.o.a($$0, $$1);
   }

   @Override
   public fbc<dhy> o() {
      return this.p ? this.o.o() : fas.a();
   }

   @Override
   public fbc<erd> p() {
      return this.p ? this.o.p() : fas.a();
   }

   @Override
   public dwz.a a(long $$0) {
      return this.o.a($$0);
   }

   @Nullable
   @Override
   public ecc s() {
      return this.o.s();
   }

   @Override
   public dwy B() {
      if (this.p) {
         return super.B();
      } else {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dwy C() {
      if (this.p) {
         return super.C();
      } else {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dxj D() {
      return this.o;
   }

   @Override
   public boolean u() {
      return this.o.u();
   }

   @Override
   public void b(boolean $$0) {
      this.o.b($$0);
   }

   @Override
   public void a(dfz $$0, dgf.f $$1) {
      if (this.p) {
         this.o.a($$0, $$1);
      }
   }

   @Override
   public void z() {
      this.o.z();
   }

   @Override
   public eqo A() {
      return this.o.A();
   }
}
