import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class djt extends dke {
   private final dju n;
   private final boolean o;

   public djt(dju $$0, boolean $$1) {
      super($$0.f(), dkh.a, $$0.l, $$0.F().I_().d(kd.ar), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dfi c_(hx $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dhn a_(hx $$0) {
      return this.n.a_($$0);
   }

   @Override
   public ecx b_(hx $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int N() {
      return this.n.N();
   }

   @Override
   public djv b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dhn a(hx $$0, dhn $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dfi $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bkv $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(djo $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public djv[] d() {
      return this.n.d();
   }

   @Override
   public void a(dmw.a $$0, long[] $$1) {
   }

   private dmw.a c(dmw.a $$0) {
      if ($$0 == dmw.a.a) {
         return dmw.a.b;
      } else {
         return $$0 == dmw.a.c ? dmw.a.d : $$0;
      }
   }

   @Override
   public dmw a(dmw.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dmw.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ig<ctd> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public crm f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dxu a(dxm $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dxm $$0, dxu $$1) {
   }

   @Override
   public Map<dxm, dxu> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dxm, dxu> $$0) {
   }

   @Override
   public LongSet b(dxm $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dxm $$0, long $$1) {
   }

   @Override
   public Map<dxm, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dxm, LongSet> $$0) {
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
   public djo j() {
      return this.n.j();
   }

   @Override
   public void d(hx $$0) {
   }

   @Override
   public void e(hx $$0) {
   }

   @Override
   public void a(sd $$0) {
   }

   @Nullable
   @Override
   public sd f(hx $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public sd g(hx $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<dhn> $$0, BiConsumer<hx, dhn> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public elo<cvf> o() {
      return this.o ? this.n.o() : ele.a();
   }

   @Override
   public elo<ecw> p() {
      return this.o ? this.n.p() : ele.a();
   }

   @Override
   public djj.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dnz t() {
      return this.n.t();
   }

   @Override
   public void a(dnz $$0) {
      this.n.a($$0);
   }

   @Override
   public dji a(dms.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dji b(dms.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dju C() {
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
   public void a(ctg $$0, ctm.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public ech B() {
      return this.n.B();
   }
}
