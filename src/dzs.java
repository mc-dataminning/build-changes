import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dzs extends ead {
   private final dzt n;
   private final boolean o;

   public dzs(dzt $$0, boolean $$1) {
      super($$0.f(), eag.a, $$0.l, $$0.H().K_().e(mb.aI), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public duq c_(jh $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dxo a_(jh $$0) {
      return this.n.a_($$0);
   }

   @Override
   public etq b_(jh $$0) {
      return this.n.b_($$0);
   }

   @Override
   public dzu b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dxo a(jh $$0, dxo $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(duq $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bvb $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(eak $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dzu[] d() {
      return this.n.d();
   }

   @Override
   public void a(edj.a $$0, long[] $$1) {
   }

   private edj.a c(edj.a $$0) {
      if ($$0 == edj.a.a) {
         return edj.a.b;
      } else {
         return $$0 == edj.a.c ? edj.a.d : $$0;
      }
   }

   @Override
   public edj a(edj.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(edj.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jq<dib> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dgf f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public eol a(eod $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eod $$0, eol $$1) {
   }

   @Override
   public Map<eod, eol> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eod, eol> $$0) {
   }

   @Override
   public LongSet b(eod $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eod $$0, long $$1) {
   }

   @Override
   public Map<eod, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eod, LongSet> $$0) {
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
   public eak n() {
      return this.n.n();
   }

   @Override
   public void d(jh $$0) {
   }

   @Override
   public void e(jh $$0) {
   }

   @Override
   public void a(um $$0) {
   }

   @Nullable
   @Override
   public um f(jh $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public um a(jh $$0, js.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dxo> $$0, BiConsumer<jh, dxo> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fdm<dkd> q() {
      return this.o ? this.n.q() : fdc.a();
   }

   @Override
   public fdm<etp> r() {
      return this.o ? this.n.r() : fdc.a();
   }

   @Override
   public dzj.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public eem v() {
      return this.n.v();
   }

   @Override
   public dzi E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dzi F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dzt G() {
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
   public void a(die $$0, dik.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public eta D() {
      return this.n.D();
   }
}
