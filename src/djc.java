import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class djc extends djn {
   private final djd n;
   private final boolean o;

   public djc(djd $$0, boolean $$1) {
      super($$0.f(), djq.a, $$0.l, $$0.F().H_().d(jz.ar), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public der c_(ht $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dgw a_(ht $$0) {
      return this.n.a_($$0);
   }

   @Override
   public ecg b_(ht $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int M() {
      return this.n.M();
   }

   @Override
   public dje b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dgw a(ht $$0, dgw $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(der $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bki $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dix $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dje[] d() {
      return this.n.d();
   }

   @Override
   public void a(dmf.a $$0, long[] $$1) {
   }

   private dmf.a c(dmf.a $$0) {
      if ($$0 == dmf.a.a) {
         return dmf.a.b;
      } else {
         return $$0 == dmf.a.c ? dmf.a.d : $$0;
      }
   }

   @Override
   public dmf a(dmf.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dmf.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ib<csq> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cqz f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dxd a(dwv $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dwv $$0, dxd $$1) {
   }

   @Override
   public Map<dwv, dxd> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dwv, dxd> $$0) {
   }

   @Override
   public LongSet b(dwv $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dwv $$0, long $$1) {
   }

   @Override
   public Map<dwv, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dwv, LongSet> $$0) {
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
   public dix j() {
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
   public void a(Predicate<dgw> $$0, BiConsumer<ht, dgw> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public ekx<cut> o() {
      return this.o ? this.n.o() : ekn.a();
   }

   @Override
   public ekx<ecf> p() {
      return this.o ? this.n.p() : ekn.a();
   }

   @Override
   public dis.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dni t() {
      return this.n.t();
   }

   @Override
   public void a(dni $$0) {
      this.n.a($$0);
   }

   @Override
   public dir a(dmb.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dir b(dmb.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public djd C() {
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
   public void a(cst $$0, csz.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public ebq B() {
      return this.n.B();
   }
}
