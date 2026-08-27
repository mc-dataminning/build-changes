import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dhp extends dia {
   private final dhq n;
   private final boolean o;

   public dhp(dhq $$0, boolean $$1) {
      super($$0.f(), did.a, $$0.l, $$0.F().G_().d(je.ap), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dcv c_(gw $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dfj a_(gw $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eam b_(gw $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int M() {
      return this.n.M();
   }

   @Override
   public dhr b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dfj a(gw $$0, dfj $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dcv $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(biq $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dhk $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dhr[] d() {
      return this.n.d();
   }

   @Override
   public void a(dks.a $$0, long[] $$1) {
   }

   private dks.a c(dks.a $$0) {
      if ($$0 == dks.a.a) {
         return dks.a.b;
      } else {
         return $$0 == dks.a.c ? dks.a.d : $$0;
      }
   }

   @Override
   public dks a(dks.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dks.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public hg<cqt> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cpc f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dvq a(dvi $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dvi $$0, dvq $$1) {
   }

   @Override
   public Map<dvi, dvq> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dvi, dvq> $$0) {
   }

   @Override
   public LongSet b(dvi $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dvi $$0, long $$1) {
   }

   @Override
   public Map<dvi, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dvi, LongSet> $$0) {
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
   public dhk j() {
      return this.n.j();
   }

   @Override
   public void d(gw $$0) {
   }

   @Override
   public void e(gw $$0) {
   }

   @Override
   public void a(qy $$0) {
   }

   @Nullable
   @Override
   public qy f(gw $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public qy g(gw $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<dfj> $$0, BiConsumer<gw, dfj> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public ejc<csv> o() {
      return this.o ? this.n.o() : eis.a();
   }

   @Override
   public ejc<eal> p() {
      return this.o ? this.n.p() : eis.a();
   }

   @Override
   public dhf.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dlv t() {
      return this.n.t();
   }

   @Override
   public void a(dlv $$0) {
      this.n.a($$0);
   }

   @Override
   public dhe a(dko.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dhe b(dko.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dhq C() {
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
   public void a(cqw $$0, crc.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public dzw B() {
      return this.n.B();
   }
}
