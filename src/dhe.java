import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dhe extends dhp {
   private final dhf n;
   private final boolean o;

   public dhe(dhf $$0, boolean $$1) {
      super($$0.f(), dhs.a, $$0.l, $$0.F().B_().d(jd.ap), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dck c_(gv $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dey a_(gv $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eab b_(gv $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int M() {
      return this.n.M();
   }

   @Override
   public dhg b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dey a(gv $$0, dey $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dck $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(big $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dgz $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dhg[] d() {
      return this.n.d();
   }

   @Override
   public void a(dkh.a $$0, long[] $$1) {
   }

   private dkh.a c(dkh.a $$0) {
      if ($$0 == dkh.a.a) {
         return dkh.a.b;
      } else {
         return $$0 == dkh.a.c ? dkh.a.d : $$0;
      }
   }

   @Override
   public dkh a(dkh.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dkh.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public hf<cqi> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cor f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dvf a(dux $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dux $$0, dvf $$1) {
   }

   @Override
   public Map<dux, dvf> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dux, dvf> $$0) {
   }

   @Override
   public LongSet b(dux $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dux $$0, long $$1) {
   }

   @Override
   public Map<dux, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dux, LongSet> $$0) {
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
   public dgz j() {
      return this.n.j();
   }

   @Override
   public void d(gv $$0) {
   }

   @Override
   public void e(gv $$0) {
   }

   @Override
   public void a(qs $$0) {
   }

   @Nullable
   @Override
   public qs f(gv $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public qs g(gv $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<dey> $$0, BiConsumer<gv, dey> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public eiu<csk> o() {
      return this.o ? this.n.o() : eik.a();
   }

   @Override
   public eiu<eaa> p() {
      return this.o ? this.n.p() : eik.a();
   }

   @Override
   public dgu.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dlk t() {
      return this.n.t();
   }

   @Override
   public void a(dlk $$0) {
      this.n.a($$0);
   }

   @Override
   public dgt a(dkd.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dgt b(dkd.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dhf C() {
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
   public void a(cql $$0, cqr.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public dzl B() {
      return this.n.B();
   }
}
