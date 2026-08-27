import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dhr extends dic {
   private final dhs n;
   private final boolean o;

   public dhr(dhs $$0, boolean $$1) {
      super($$0.f(), dif.a, $$0.l, $$0.F().G_().d(je.ap), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dcx c_(gw $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dfl a_(gw $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eao b_(gw $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int M() {
      return this.n.M();
   }

   @Override
   public dht b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dfl a(gw $$0, dfl $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dcx $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bis $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dhm $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dht[] d() {
      return this.n.d();
   }

   @Override
   public void a(dku.a $$0, long[] $$1) {
   }

   private dku.a c(dku.a $$0) {
      if ($$0 == dku.a.a) {
         return dku.a.b;
      } else {
         return $$0 == dku.a.c ? dku.a.d : $$0;
      }
   }

   @Override
   public dku a(dku.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dku.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public hg<cqv> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cpe f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dvs a(dvk $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dvk $$0, dvs $$1) {
   }

   @Override
   public Map<dvk, dvs> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dvk, dvs> $$0) {
   }

   @Override
   public LongSet b(dvk $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dvk $$0, long $$1) {
   }

   @Override
   public Map<dvk, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dvk, LongSet> $$0) {
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
   public dhm j() {
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
   public void a(Predicate<dfl> $$0, BiConsumer<gw, dfl> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public eje<csx> o() {
      return this.o ? this.n.o() : eiu.a();
   }

   @Override
   public eje<ean> p() {
      return this.o ? this.n.p() : eiu.a();
   }

   @Override
   public dhh.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dlx t() {
      return this.n.t();
   }

   @Override
   public void a(dlx $$0) {
      this.n.a($$0);
   }

   @Override
   public dhg a(dkq.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dhg b(dkq.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dhs C() {
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
   public void a(cqy $$0, cre.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public dzy B() {
      return this.n.B();
   }
}
