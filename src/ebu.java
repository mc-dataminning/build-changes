import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ebu extends ecf {
   private final ebv n;
   private final boolean o;

   public ebu(ebv $$0, boolean $$1) {
      super($$0.f(), eci.a, $$0.l, $$0.H().F_().f(mg.aG), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dwn c_(iu $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dzo a_(iu $$0) {
      return this.n.a_($$0);
   }

   @Override
   public evv b_(iu $$0) {
      return this.n.b_($$0);
   }

   @Override
   public ebw b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dzo a(iu $$0, dzo $$1, int $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dwn $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bwa $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(ecm $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public ebw[] d() {
      return this.n.d();
   }

   @Override
   public void a(efn.a $$0, long[] $$1) {
   }

   private efn.a c(efn.a $$0) {
      if ($$0 == efn.a.a) {
         return efn.a.b;
      } else {
         return $$0 == efn.a.c ? efn.a.d : $$0;
      }
   }

   @Override
   public efn a(efn.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(efn.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public je<djs> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dhw f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public eqq a(eqi $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eqi $$0, eqq $$1) {
   }

   @Override
   public Map<eqi, eqq> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eqi, eqq> $$0) {
   }

   @Override
   public LongSet b(eqi $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eqi $$0, long $$1) {
   }

   @Override
   public Map<eqi, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eqi, LongSet> $$0) {
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
   public ecm n() {
      return this.n.n();
   }

   @Override
   public void d(iu $$0) {
   }

   @Override
   public void e(iu $$0) {
   }

   @Override
   public void a(tx $$0) {
   }

   @Nullable
   @Override
   public tx f(iu $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public tx a(iu $$0, jg.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dzo> $$0, BiConsumer<iu, dzo> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public ffr<dlu> q() {
      return this.o ? this.n.q() : ffh.a();
   }

   @Override
   public ffr<evu> r() {
      return this.o ? this.n.r() : ffh.a();
   }

   @Override
   public ebl.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public egq v() {
      return this.n.v();
   }

   @Override
   public ebk E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public ebk F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public ebv G() {
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
   public void a(djv $$0, dkb.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public evf D() {
      return this.n.D();
   }
}
