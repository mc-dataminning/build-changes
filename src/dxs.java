import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxs extends dyd {
   private final dxt o;
   private final boolean p;

   public dxs(dxt $$0, boolean $$1) {
      super($$0.f(), dyg.a, $$0.m, $$0.E().H_().e(ma.aG), $$0.s());
      this.o = $$0;
      this.p = $$1;
   }

   @Nullable
   @Override
   public dsr c_(jh $$0) {
      return this.o.c_($$0);
   }

   @Override
   public dvo a_(jh $$0) {
      return this.o.a_($$0);
   }

   @Override
   public ero b_(jh $$0) {
      return this.o.b_($$0);
   }

   @Override
   public dxu b(int $$0) {
      return this.p ? this.o.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dvo a(jh $$0, dvo $$1, boolean $$2) {
      return this.p ? this.o.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dsr $$0) {
      if (this.p) {
         this.o.a($$0);
      }
   }

   @Override
   public void a(bui $$0) {
      if (this.p) {
         this.o.a($$0);
      }
   }

   @Override
   public void a(dyk $$0) {
      if (this.p) {
         super.a($$0);
      }
   }

   @Override
   public dxu[] d() {
      return this.o.d();
   }

   @Override
   public void a(ebj.a $$0, long[] $$1) {
   }

   private ebj.a c(ebj.a $$0) {
      if ($$0 == ebj.a.a) {
         return ebj.a.b;
      } else {
         return $$0 == ebj.a.c ? ebj.a.d : $$0;
      }
   }

   @Override
   public ebj a(ebj.a $$0) {
      return this.o.a($$0);
   }

   @Override
   public int a(ebj.a $$0, int $$1, int $$2) {
      return this.o.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jq<dgh> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.o.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public del f() {
      return this.o.f();
   }

   @Nullable
   @Override
   public emj a(emb $$0) {
      return this.o.a($$0);
   }

   @Override
   public void a(emb $$0, emj $$1) {
   }

   @Override
   public Map<emb, emj> g() {
      return this.o.g();
   }

   @Override
   public void a(Map<emb, emj> $$0) {
   }

   @Override
   public LongSet b(emb $$0) {
      return this.o.b($$0);
   }

   @Override
   public void a(emb $$0, long $$1) {
   }

   @Override
   public Map<emb, LongSet> h() {
      return this.o.h();
   }

   @Override
   public void b(Map<emb, LongSet> $$0) {
   }

   @Override
   public void a(boolean $$0) {
      this.o.a($$0);
   }

   @Override
   public boolean i() {
      return false;
   }

   @Override
   public dyk j() {
      return this.o.j();
   }

   @Override
   public void d(jh $$0) {
   }

   @Override
   public void e(jh $$0) {
   }

   @Override
   public void a(un $$0) {
   }

   @Nullable
   @Override
   public un f(jh $$0) {
      return this.o.f($$0);
   }

   @Nullable
   @Override
   public un a(jh $$0, js.a $$1) {
      return this.o.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dvo> $$0, BiConsumer<jh, dvo> $$1) {
      this.o.a($$0, $$1);
   }

   @Override
   public fbm<dij> o() {
      return this.p ? this.o.o() : fbc.a();
   }

   @Override
   public fbm<ern> p() {
      return this.p ? this.o.p() : fbc.a();
   }

   @Override
   public dxj.a a(long $$0) {
      return this.o.a($$0);
   }

   @Nullable
   @Override
   public ecm s() {
      return this.o.s();
   }

   @Override
   public dxi B() {
      if (this.p) {
         return super.B();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dxi C() {
      if (this.p) {
         return super.C();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dxt D() {
      return this.o;
   }

   @Override
   public boolean u() {
      return this.o.u();
   }

   @Override
   public void b(boolean $$0) {
      this.o.b($$0);
   }

   @Override
   public void a(dgk $$0, dgq.f $$1) {
      if (this.p) {
         this.o.a($$0, $$1);
      }
   }

   @Override
   public void z() {
      this.o.z();
   }

   @Override
   public eqy A() {
      return this.o.A();
   }
}
