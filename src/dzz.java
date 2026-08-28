import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dzz extends eak {
   private final eaa n;
   private final boolean o;

   public dzz(eaa $$0, boolean $$1) {
      super($$0.f(), ean.a, $$0.l, $$0.H().K_().e(mb.aI), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dux c_(jh $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dxv a_(jh $$0) {
      return this.n.a_($$0);
   }

   @Override
   public etx b_(jh $$0) {
      return this.n.b_($$0);
   }

   @Override
   public eab b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dxv a(jh $$0, dxv $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dux $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bvk $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(ear $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public eab[] d() {
      return this.n.d();
   }

   @Override
   public void a(edq.a $$0, long[] $$1) {
   }

   private edq.a c(edq.a $$0) {
      if ($$0 == edq.a.a) {
         return edq.a.b;
      } else {
         return $$0 == edq.a.c ? edq.a.d : $$0;
      }
   }

   @Override
   public edq a(edq.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(edq.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jq<dik> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dgo f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public eos a(eok $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eok $$0, eos $$1) {
   }

   @Override
   public Map<eok, eos> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eok, eos> $$0) {
   }

   @Override
   public LongSet b(eok $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eok $$0, long $$1) {
   }

   @Override
   public Map<eok, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eok, LongSet> $$0) {
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
   public ear n() {
      return this.n.n();
   }

   @Override
   public void d(jh $$0) {
   }

   @Override
   public void e(jh $$0) {
   }

   @Override
   public void a(ux $$0) {
   }

   @Nullable
   @Override
   public ux f(jh $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public ux a(jh $$0, js.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dxv> $$0, BiConsumer<jh, dxv> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fdt<dkm> q() {
      return this.o ? this.n.q() : fdj.a();
   }

   @Override
   public fdt<etw> r() {
      return this.o ? this.n.r() : fdj.a();
   }

   @Override
   public dzq.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public eet v() {
      return this.n.v();
   }

   @Override
   public dzp E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dzp F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public eaa G() {
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
   public void a(din $$0, dit.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public eth D() {
      return this.n.D();
   }
}
