import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dzb extends dzm {
   private final dzc n;
   private final boolean o;

   public dzb(dzc $$0, boolean $$1) {
      super($$0.f(), dzp.a, $$0.l, $$0.H().K_().e(mc.aI), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dtz c_(ji $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dwx a_(ji $$0) {
      return this.n.a_($$0);
   }

   @Override
   public esz b_(ji $$0) {
      return this.n.b_($$0);
   }

   @Override
   public dzd b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dwx a(ji $$0, dwx $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dtz $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bul $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dzt $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dzd[] d() {
      return this.n.d();
   }

   @Override
   public void a(ecs.a $$0, long[] $$1) {
   }

   private ecs.a c(ecs.a $$0) {
      if ($$0 == ecs.a.a) {
         return ecs.a.b;
      } else {
         return $$0 == ecs.a.c ? ecs.a.d : $$0;
      }
   }

   @Override
   public ecs a(ecs.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(ecs.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jr<dhk> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dfo f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public enu a(enm $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(enm $$0, enu $$1) {
   }

   @Override
   public Map<enm, enu> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<enm, enu> $$0) {
   }

   @Override
   public LongSet b(enm $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(enm $$0, long $$1) {
   }

   @Override
   public Map<enm, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<enm, LongSet> $$0) {
   }

   @Override
   public void i() {
      this.n.i();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public dzt n() {
      return this.n.n();
   }

   @Override
   public void d(ji $$0) {
   }

   @Override
   public void e(ji $$0) {
   }

   @Override
   public void a(tq $$0) {
   }

   @Nullable
   @Override
   public tq f(ji $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public tq a(ji $$0, jt.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dwx> $$0, BiConsumer<ji, dwx> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fcv<djm> q() {
      return this.o ? this.n.q() : fcl.a();
   }

   @Override
   public fcv<esy> r() {
      return this.o ? this.n.r() : fcl.a();
   }

   @Override
   public dys.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public edv v() {
      return this.n.v();
   }

   @Override
   public dyr E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dyr F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dzc G() {
      return this.n;
   }

   @Override
   public boolean x() {
      return this.n.x();
   }

   @Override
   public void a(boolean $$0) {
      this.n.a($$0);
   }

   @Override
   public void a(dhn $$0, dht.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public esj D() {
      return this.n.D();
   }
}
