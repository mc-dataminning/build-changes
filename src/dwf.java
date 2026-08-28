import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dwf extends dwq {
   private final dwg n;
   private final boolean o;

   public dwf(dwg $$0, boolean $$1) {
      super($$0.f(), dwt.a, $$0.l, $$0.E().F_().d(lv.aF), $$0.s());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dre c_(je $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dua a_(je $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eqb b_(je $$0) {
      return this.n.b_($$0);
   }

   @Override
   public dwh b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dua a(je $$0, dua $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dre $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(btj $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dwx $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dwh[] d() {
      return this.n.d();
   }

   @Override
   public void a(dzw.a $$0, long[] $$1) {
   }

   private dzw.a c(dzw.a $$0) {
      if ($$0 == dzw.a.a) {
         return dzw.a.b;
      } else {
         return $$0 == dzw.a.c ? dzw.a.d : $$0;
      }
   }

   @Override
   public dzw a(dzw.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dzw.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jn<det> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dcy f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public ekw a(eko $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eko $$0, ekw $$1) {
   }

   @Override
   public Map<eko, ekw> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eko, ekw> $$0) {
   }

   @Override
   public LongSet b(eko $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eko $$0, long $$1) {
   }

   @Override
   public Map<eko, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eko, LongSet> $$0) {
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
   public dwx j() {
      return this.n.j();
   }

   @Override
   public void d(je $$0) {
   }

   @Override
   public void e(je $$0) {
   }

   @Override
   public void a(uf $$0) {
   }

   @Nullable
   @Override
   public uf f(je $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public uf a(je $$0, jp.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dua> $$0, BiConsumer<je, dua> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public ezy<dgv> o() {
      return this.o ? this.n.o() : ezo.a();
   }

   @Override
   public ezy<eqa> p() {
      return this.o ? this.n.p() : ezo.a();
   }

   @Override
   public dvw.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public eaz s() {
      return this.n.s();
   }

   @Override
   public dvv B() {
      if (this.o) {
         return super.B();
      } else {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dvv C() {
      if (this.o) {
         return super.C();
      } else {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dwg D() {
      return this.n;
   }

   @Override
   public boolean u() {
      return this.n.u();
   }

   @Override
   public void b(boolean $$0) {
      this.n.b($$0);
   }

   @Override
   public void a(dew $$0, dfc.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void z() {
      this.n.z();
   }

   @Override
   public epl A() {
      return this.n.A();
   }
}
