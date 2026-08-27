import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class djo extends djz {
   private final djp n;
   private final boolean o;

   public djo(djp $$0, boolean $$1) {
      super($$0.f(), dkc.a, $$0.l, $$0.F().H_().d(jz.ar), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dfd c_(ht $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dhi a_(ht $$0) {
      return this.n.a_($$0);
   }

   @Override
   public ecs b_(ht $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int N() {
      return this.n.N();
   }

   @Override
   public djq b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dhi a(ht $$0, dhi $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dfd $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bkq $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(djj $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public djq[] d() {
      return this.n.d();
   }

   @Override
   public void a(dmr.a $$0, long[] $$1) {
   }

   private dmr.a c(dmr.a $$0) {
      if ($$0 == dmr.a.a) {
         return dmr.a.b;
      } else {
         return $$0 == dmr.a.c ? dmr.a.d : $$0;
      }
   }

   @Override
   public dmr a(dmr.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dmr.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ib<csy> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public crh f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dxp a(dxh $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dxh $$0, dxp $$1) {
   }

   @Override
   public Map<dxh, dxp> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dxh, dxp> $$0) {
   }

   @Override
   public LongSet b(dxh $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dxh $$0, long $$1) {
   }

   @Override
   public Map<dxh, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dxh, LongSet> $$0) {
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
   public djj j() {
      return this.n.j();
   }

   @Override
   public void d(ht $$0) {
   }

   @Override
   public void e(ht $$0) {
   }

   @Override
   public void a(rz $$0) {
   }

   @Nullable
   @Override
   public rz f(ht $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public rz g(ht $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<dhi> $$0, BiConsumer<ht, dhi> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public elj<cva> o() {
      return this.o ? this.n.o() : ekz.a();
   }

   @Override
   public elj<ecr> p() {
      return this.o ? this.n.p() : ekz.a();
   }

   @Override
   public dje.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dnu t() {
      return this.n.t();
   }

   @Override
   public void a(dnu $$0) {
      this.n.a($$0);
   }

   @Override
   public djd a(dmn.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public djd b(dmn.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public djp C() {
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
   public void a(ctb $$0, cth.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public ecc B() {
      return this.n.B();
   }
}
