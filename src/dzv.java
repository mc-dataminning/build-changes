import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dzv extends eag {
   private final dzw n;
   private final boolean o;

   public dzv(dzw $$0, boolean $$1) {
      super($$0.f(), eaj.a, $$0.l, $$0.H().F_().e(mc.aJ), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dus c_(ji $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dxq a_(ji $$0) {
      return this.n.a_($$0);
   }

   @Override
   public etw b_(ji $$0) {
      return this.n.b_($$0);
   }

   @Override
   public dzx b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dxq a(ji $$0, dxq $$1, int $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dus $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bva $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(ean $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dzx[] d() {
      return this.n.d();
   }

   @Override
   public void a(edo.a $$0, long[] $$1) {
   }

   private edo.a c(edo.a $$0) {
      if ($$0 == edo.a.a) {
         return edo.a.b;
      } else {
         return $$0 == edo.a.c ? edo.a.d : $$0;
      }
   }

   @Override
   public edo a(edo.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(edo.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jr<dic> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dgg f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public eor a(eoj $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eoj $$0, eor $$1) {
   }

   @Override
   public Map<eoj, eor> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eoj, eor> $$0) {
   }

   @Override
   public LongSet b(eoj $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eoj $$0, long $$1) {
   }

   @Override
   public Map<eoj, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eoj, LongSet> $$0) {
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
   public ean n() {
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
   public void a(Predicate<dxq> $$0, BiConsumer<ji, dxq> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fds<dke> q() {
      return this.o ? this.n.q() : fdi.a();
   }

   @Override
   public fds<etv> r() {
      return this.o ? this.n.r() : fdi.a();
   }

   @Override
   public dzm.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public eer v() {
      return this.n.v();
   }

   @Override
   public dzl E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dzl F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dzw G() {
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
   public void a(dif $$0, dil.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public etg D() {
      return this.n.D();
   }
}
