import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dnp extends doa {
   private final dnq n;
   private final boolean o;

   public dnp(dnq $$0, boolean $$1) {
      super($$0.f(), dod.a, $$0.l, $$0.F().I_().d(kg.at), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dix c_(hz $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dlj a_(hz $$0) {
      return this.n.a_($$0);
   }

   @Override
   public egw b_(hz $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int O() {
      return this.n.O();
   }

   @Override
   public dnr b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dlj a(hz $$0, dlj $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dix $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bnq $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dnk $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dnr[] d() {
      return this.n.d();
   }

   @Override
   public void a(dqv.a $$0, long[] $$1) {
   }

   private dqv.a c(dqv.a $$0) {
      if ($$0 == dqv.a.a) {
         return dqv.a.b;
      } else {
         return $$0 == dqv.a.c ? dqv.a.d : $$0;
      }
   }

   @Override
   public dqv a(dqv.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dqv.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ij<cwq> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cuy f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public ebt a(ebl $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(ebl $$0, ebt $$1) {
   }

   @Override
   public Map<ebl, ebt> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<ebl, ebt> $$0) {
   }

   @Override
   public LongSet b(ebl $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(ebl $$0, long $$1) {
   }

   @Override
   public Map<ebl, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<ebl, LongSet> $$0) {
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
   public dnk j() {
      return this.n.j();
   }

   @Override
   public void d(hz $$0) {
   }

   @Override
   public void e(hz $$0) {
   }

   @Override
   public void a(sw $$0) {
   }

   @Nullable
   @Override
   public sw f(hz $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public sw g(hz $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<dlj> $$0, BiConsumer<hz, dlj> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public ept<cys> o() {
      return this.o ? this.n.o() : epj.a();
   }

   @Override
   public ept<egv> p() {
      return this.o ? this.n.p() : epj.a();
   }

   @Override
   public dnf.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dry t() {
      return this.n.t();
   }

   @Override
   public void a(dry $$0) {
      this.n.a($$0);
   }

   @Override
   public dne a(dqr.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dne b(dqr.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dnq C() {
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
   public void a(cwt $$0, cwz.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public egg B() {
      return this.n.B();
   }
}
