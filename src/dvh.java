import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dvh extends dvs {
   private final dvi n;
   private final boolean o;

   public dvh(dvi $$0, boolean $$1) {
      super($$0.f(), dvv.a, $$0.l, $$0.F().H_().d(lu.aF), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dqh c_(jd $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dtc a_(jd $$0) {
      return this.n.a_($$0);
   }

   @Override
   public epc b_(jd $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int Q() {
      return this.n.Q();
   }

   @Override
   public dvj b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dtc a(jd $$0, dtc $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dqh $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bsr $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dvz $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dvj[] d() {
      return this.n.d();
   }

   @Override
   public void a(dyy.a $$0, long[] $$1) {
   }

   private dyy.a c(dyy.a $$0) {
      if ($$0 == dyy.a.a) {
         return dyy.a.b;
      } else {
         return $$0 == dyy.a.c ? dyy.a.d : $$0;
      }
   }

   @Override
   public dyy a(dyy.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dyy.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jm<ddw> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dcd f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public ejx a(ejp $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(ejp $$0, ejx $$1) {
   }

   @Override
   public Map<ejp, ejx> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<ejp, ejx> $$0) {
   }

   @Override
   public LongSet b(ejp $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(ejp $$0, long $$1) {
   }

   @Override
   public Map<ejp, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<ejp, LongSet> $$0) {
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
   public dvz j() {
      return this.n.j();
   }

   @Override
   public void d(jd $$0) {
   }

   @Override
   public void e(jd $$0) {
   }

   @Override
   public void a(ub $$0) {
   }

   @Nullable
   @Override
   public ub f(jd $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public ub a(jd $$0, jo.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dtc> $$0, BiConsumer<jd, dtc> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public eyu<dfy> o() {
      return this.o ? this.n.o() : eyk.a();
   }

   @Override
   public eyu<epb> p() {
      return this.o ? this.n.p() : eyk.a();
   }

   @Override
   public duy.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public eab t() {
      return this.n.t();
   }

   @Override
   public void a(eab $$0) {
      this.n.a($$0);
   }

   @Override
   public dux a(dyu.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dux b(dyu.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dvi C() {
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
   public void a(ddz $$0, def.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public eom B() {
      return this.n.B();
   }
}
