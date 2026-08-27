import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dhk extends dhv {
   private final dhl n;
   private final boolean o;

   public dhk(dhl $$0, boolean $$1) {
      super($$0.f(), dhy.a, $$0.l, $$0.F().B_().d(je.ap), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dcq c_(gw $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dfe a_(gw $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eah b_(gw $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int M() {
      return this.n.M();
   }

   @Override
   public dhm b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dfe a(gw $$0, dfe $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dcq $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bil $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dhf $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dhm[] d() {
      return this.n.d();
   }

   @Override
   public void a(dkn.a $$0, long[] $$1) {
   }

   private dkn.a c(dkn.a $$0) {
      if ($$0 == dkn.a.a) {
         return dkn.a.b;
      } else {
         return $$0 == dkn.a.c ? dkn.a.d : $$0;
      }
   }

   @Override
   public dkn a(dkn.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dkn.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public hg<cqo> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cox f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dvl a(dvd $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dvd $$0, dvl $$1) {
   }

   @Override
   public Map<dvd, dvl> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dvd, dvl> $$0) {
   }

   @Override
   public LongSet b(dvd $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dvd $$0, long $$1) {
   }

   @Override
   public Map<dvd, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dvd, LongSet> $$0) {
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
   public dhf j() {
      return this.n.j();
   }

   @Override
   public void d(gw $$0) {
   }

   @Override
   public void e(gw $$0) {
   }

   @Override
   public void a(qu $$0) {
   }

   @Nullable
   @Override
   public qu f(gw $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public qu g(gw $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<dfe> $$0, BiConsumer<gw, dfe> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public eix<csq> o() {
      return this.o ? this.n.o() : ein.a();
   }

   @Override
   public eix<eag> p() {
      return this.o ? this.n.p() : ein.a();
   }

   @Override
   public dha.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dlq t() {
      return this.n.t();
   }

   @Override
   public void a(dlq $$0) {
      this.n.a($$0);
   }

   @Override
   public dgz a(dkj.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dgz b(dkj.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dhl C() {
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
   public void a(cqr $$0, cqx.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public dzr B() {
      return this.n.B();
   }
}
