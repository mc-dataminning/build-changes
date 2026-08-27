import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsm extends dsx {
   private final dsn n;
   private final boolean o;

   public dsm(dsn $$0, boolean $$1) {
      super($$0.f(), dta.a, $$0.l, $$0.F().H_().d(le.az), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dnm c_(in $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dqh a_(in $$0) {
      return this.n.a_($$0);
   }

   @Override
   public ema b_(in $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int P() {
      return this.n.P();
   }

   @Override
   public dso b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dqh a(in $$0, dqh $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dnm $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(brh $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dtc $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dso[] d() {
      return this.n.d();
   }

   @Override
   public void a(dvz.a $$0, long[] $$1) {
   }

   private dvz.a c(dvz.a $$0) {
      if ($$0 == dvz.a.a) {
         return dvz.a.b;
      } else {
         return $$0 == dvz.a.c ? dvz.a.d : $$0;
      }
   }

   @Override
   public dvz a(dvz.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dvz.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public iw<dbc> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public czk f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public egx a(egp $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(egp $$0, egx $$1) {
   }

   @Override
   public Map<egp, egx> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<egp, egx> $$0) {
   }

   @Override
   public LongSet b(egp $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(egp $$0, long $$1) {
   }

   @Override
   public Map<egp, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<egp, LongSet> $$0) {
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
   public dtc j() {
      return this.n.j();
   }

   @Override
   public void d(in $$0) {
   }

   @Override
   public void e(in $$0) {
   }

   @Override
   public void a(ua $$0) {
   }

   @Nullable
   @Override
   public ua f(in $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public ua a(in $$0, iy.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dqh> $$0, BiConsumer<in, dqh> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public evj<dde> o() {
      return this.o ? this.n.o() : euz.a();
   }

   @Override
   public evj<elz> p() {
      return this.o ? this.n.p() : euz.a();
   }

   @Override
   public dsd.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dxc t() {
      return this.n.t();
   }

   @Override
   public void a(dxc $$0) {
      this.n.a($$0);
   }

   @Override
   public dsc a(dvv.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dsc b(dvv.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dsn C() {
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
   public void a(dbf $$0, dbl.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public elk B() {
      return this.n.B();
   }
}
