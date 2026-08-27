import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dph extends dps {
   private final dpi n;
   private final boolean o;

   public dph(dpi $$0, boolean $$1) {
      super($$0.f(), dpv.a, $$0.l, $$0.F().H_().d(kj.au), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dki c_(ib $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dnb a_(ib $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eip b_(ib $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int O() {
      return this.n.O();
   }

   @Override
   public dpj b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dnb a(ib $$0, dnb $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dki $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(box $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dpc $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dpj[] d() {
      return this.n.d();
   }

   @Override
   public void a(dso.a $$0, long[] $$1) {
   }

   private dso.a c(dso.a $$0) {
      if ($$0 == dso.a.a) {
         return dso.a.b;
      } else {
         return $$0 == dso.a.c ? dso.a.d : $$0;
      }
   }

   @Override
   public dso a(dso.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dso.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public il<cya> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cwi f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public edm a(ede $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(ede $$0, edm $$1) {
   }

   @Override
   public Map<ede, edm> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<ede, edm> $$0) {
   }

   @Override
   public LongSet b(ede $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(ede $$0, long $$1) {
   }

   @Override
   public Map<ede, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<ede, LongSet> $$0) {
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
   public dpc j() {
      return this.n.j();
   }

   @Override
   public void d(ib $$0) {
   }

   @Override
   public void e(ib $$0) {
   }

   @Override
   public void a(ta $$0) {
   }

   @Nullable
   @Override
   public ta f(ib $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public ta a(ib $$0, in.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dnb> $$0, BiConsumer<ib, dnb> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public ern<dac> o() {
      return this.o ? this.n.o() : erd.a();
   }

   @Override
   public ern<eio> p() {
      return this.o ? this.n.p() : erd.a();
   }

   @Override
   public dox.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dtr t() {
      return this.n.t();
   }

   @Override
   public void a(dtr $$0) {
      this.n.a($$0);
   }

   @Override
   public dow a(dsk.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dow b(dsk.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dpi C() {
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
   public void a(cyd $$0, cyj.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public ehz B() {
      return this.n.B();
   }
}
