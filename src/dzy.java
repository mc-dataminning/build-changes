import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dzy extends eaj {
   private final dzz n;
   private final boolean o;

   public dzy(dzz $$0, boolean $$1) {
      super($$0.f(), eam.a, $$0.l, $$0.G().K_().e(mb.aI), $$0.u());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public duw c_(jh $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dxu a_(jh $$0) {
      return this.n.a_($$0);
   }

   @Override
   public etw b_(jh $$0) {
      return this.n.b_($$0);
   }

   @Override
   public eaa b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dxu a(jh $$0, dxu $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(duw $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bvj $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(eaq $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public eaa[] d() {
      return this.n.d();
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
      return this.n.a($$0);
   }

   @Override
   public int a(edp.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jq<dij> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dgn f() {
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
   public boolean j() {
      return this.n.j();
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public eaq n() {
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
   public void a(Predicate<dxu> $$0, BiConsumer<jh, dxu> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fds<dkl> q() {
      return this.o ? this.n.q() : fdi.a();
   }

   @Override
   public fds<etv> r() {
      return this.o ? this.n.r() : fdi.a();
   }

   @Override
   public dzp.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public ees u() {
      return this.n.u();
   }

   @Override
   public dzo D() {
      if (this.o) {
         return super.D();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dzo E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dzz F() {
      return this.n;
   }

   @Override
   public boolean w() {
      return this.n.w();
   }

   @Override
   public void a(boolean $$0) {
      this.n.a($$0);
   }

   @Override
   public void a(dim $$0, dis.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void B() {
      this.n.B();
   }

   @Override
   public etg C() {
      return this.n.C();
   }
}
