import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dzy extends eaj {
   private final dzz o;
   private final boolean p;

   public dzy(dzz $$0, boolean $$1) {
      super($$0.f(), eam.a, $$0.m, $$0.E().K_().e(mb.aI), $$0.s());
      this.o = $$0;
      this.p = $$1;
   }

   @Nullable
   @Override
   public duw c_(jh $$0) {
      return this.o.c_($$0);
   }

   @Override
   public dxu a_(jh $$0) {
      return this.o.a_($$0);
   }

   @Override
   public etw b_(jh $$0) {
      return this.o.b_($$0);
   }

   @Override
   public eaa b(int $$0) {
      return this.p ? this.o.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dxu a(jh $$0, dxu $$1, boolean $$2) {
      return this.p ? this.o.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(duw $$0) {
      if (this.p) {
         this.o.a($$0);
      }
   }

   @Override
   public void a(bvj $$0) {
      if (this.p) {
         this.o.a($$0);
      }
   }

   @Override
   public void a(eaq $$0) {
      if (this.p) {
         super.a($$0);
      }
   }

   @Override
   public eaa[] d() {
      return this.o.d();
   }

   @Override
   public void a(edp.a $$0, long[] $$1) {
   }

   private edp.a c(edp.a $$0) {
      if ($$0 == edp.a.a) {
         return edp.a.b;
      } else {
         return $$0 == edp.a.c ? edp.a.d : $$0;
      }
   }

   @Override
   public edp a(edp.a $$0) {
      return this.o.a($$0);
   }

   @Override
   public int a(edp.a $$0, int $$1, int $$2) {
      return this.o.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jq<dij> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.o.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dgn f() {
      return this.o.f();
   }

   @Nullable
   @Override
   public eor a(eoj $$0) {
      return this.o.a($$0);
   }

   @Override
   public void a(eoj $$0, eor $$1) {
   }

   @Override
   public Map<eoj, eor> g() {
      return this.o.g();
   }

   @Override
   public void a(Map<eoj, eor> $$0) {
   }

   @Override
   public LongSet b(eoj $$0) {
      return this.o.b($$0);
   }

   @Override
   public void a(eoj $$0, long $$1) {
   }

   @Override
   public Map<eoj, LongSet> h() {
      return this.o.h();
   }

   @Override
   public void b(Map<eoj, LongSet> $$0) {
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
   public eaq j() {
      return this.o.j();
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
      return this.o.f($$0);
   }

   @Nullable
   @Override
   public ux a(jh $$0, js.a $$1) {
      return this.o.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dxu> $$0, BiConsumer<jh, dxu> $$1) {
      this.o.a($$0, $$1);
   }

   @Override
   public fds<dkl> o() {
      return this.p ? this.o.o() : fdi.a();
   }

   @Override
   public fds<etv> p() {
      return this.p ? this.o.p() : fdi.a();
   }

   @Override
   public dzp.a a(long $$0) {
      return this.o.a($$0);
   }

   @Nullable
   @Override
   public ees s() {
      return this.o.s();
   }

   @Override
   public dzo B() {
      if (this.p) {
         return super.B();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dzo C() {
      if (this.p) {
         return super.C();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dzz D() {
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
   public void a(dim $$0, dis.f $$1) {
      if (this.p) {
         this.o.a($$0, $$1);
      }
   }

   @Override
   public void z() {
      this.o.z();
   }

   @Override
   public etg A() {
      return this.o.A();
   }
}
