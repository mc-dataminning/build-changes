import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dzc extends dzn {
   private final dzd n;
   private final boolean o;

   public dzc(dzd $$0, boolean $$1) {
      super($$0.f(), dzq.a, $$0.l, $$0.H().K_().e(mc.aI), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dua c_(ji $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dwy a_(ji $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eta b_(ji $$0) {
      return this.n.b_($$0);
   }

   @Override
   public dze b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dwy a(ji $$0, dwy $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dua $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bum $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dzu $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dze[] d() {
      return this.n.d();
   }

   @Override
   public void a(ect.a $$0, long[] $$1) {
   }

   private ect.a c(ect.a $$0) {
      if ($$0 == ect.a.a) {
         return ect.a.b;
      } else {
         return $$0 == ect.a.c ? ect.a.d : $$0;
      }
   }

   @Override
   public ect a(ect.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(ect.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jr<dhl> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dfp f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public env a(enn $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(enn $$0, env $$1) {
   }

   @Override
   public Map<enn, env> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<enn, env> $$0) {
   }

   @Override
   public LongSet b(enn $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(enn $$0, long $$1) {
   }

   @Override
   public Map<enn, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<enn, LongSet> $$0) {
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
   public dzu n() {
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
   public void a(Predicate<dwy> $$0, BiConsumer<ji, dwy> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fcw<djn> q() {
      return this.o ? this.n.q() : fcm.a();
   }

   @Override
   public fcw<esz> r() {
      return this.o ? this.n.r() : fcm.a();
   }

   @Override
   public dyt.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public edw v() {
      return this.n.v();
   }

   @Override
   public dys E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dys F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dzd G() {
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
   public void a(dho $$0, dhu.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public esk D() {
      return this.n.D();
   }
}
