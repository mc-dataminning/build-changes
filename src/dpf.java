import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dpf extends dpq {
   private final dpg n;
   private final boolean o;

   public dpf(dpg $$0, boolean $$1) {
      super($$0.f(), dpt.a, $$0.l, $$0.F().H_().d(kj.au), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dkg c_(ib $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dmz a_(ib $$0) {
      return this.n.a_($$0);
   }

   @Override
   public ein b_(ib $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int O() {
      return this.n.O();
   }

   @Override
   public dph b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dmz a(ib $$0, dmz $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dkg $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bow $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dpa $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dph[] d() {
      return this.n.d();
   }

   @Override
   public void a(dsm.a $$0, long[] $$1) {
   }

   private dsm.a c(dsm.a $$0) {
      if ($$0 == dsm.a.a) {
         return dsm.a.b;
      } else {
         return $$0 == dsm.a.c ? dsm.a.d : $$0;
      }
   }

   @Override
   public dsm a(dsm.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dsm.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public il<cxy> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cwg f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public edk a(edc $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(edc $$0, edk $$1) {
   }

   @Override
   public Map<edc, edk> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<edc, edk> $$0) {
   }

   @Override
   public LongSet b(edc $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(edc $$0, long $$1) {
   }

   @Override
   public Map<edc, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<edc, LongSet> $$0) {
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
   public dpa j() {
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
   public void a(Predicate<dmz> $$0, BiConsumer<ib, dmz> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public erl<daa> o() {
      return this.o ? this.n.o() : erb.a();
   }

   @Override
   public erl<eim> p() {
      return this.o ? this.n.p() : erb.a();
   }

   @Override
   public dov.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dtp t() {
      return this.n.t();
   }

   @Override
   public void a(dtp $$0) {
      this.n.a($$0);
   }

   @Override
   public dou a(dsi.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dou b(dsi.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dpg C() {
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
   public void a(cyb $$0, cyh.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public ehx B() {
      return this.n.B();
   }
}
