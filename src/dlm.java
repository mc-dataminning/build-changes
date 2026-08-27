import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dlm extends dlx {
   private final dln n;
   private final boolean o;

   public dlm(dln $$0, boolean $$1) {
      super($$0.f(), dma.a, $$0.l, $$0.F().I_().d(ke.at), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dgu c_(hx $$0) {
      return this.n.c_($$0);
   }

   @Override
   public djg a_(hx $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eeq b_(hx $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int O() {
      return this.n.O();
   }

   @Override
   public dlo b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public djg a(hx $$0, djg $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dgu $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(blu $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dlh $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dlo[] d() {
      return this.n.d();
   }

   @Override
   public void a(dop.a $$0, long[] $$1) {
   }

   private dop.a c(dop.a $$0) {
      if ($$0 == dop.a.a) {
         return dop.a.b;
      } else {
         return $$0 == dop.a.c ? dop.a.d : $$0;
      }
   }

   @Override
   public dop a(dop.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dop.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ih<cun> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public csv f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dzn a(dzf $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dzf $$0, dzn $$1) {
   }

   @Override
   public Map<dzf, dzn> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dzf, dzn> $$0) {
   }

   @Override
   public LongSet b(dzf $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dzf $$0, long $$1) {
   }

   @Override
   public Map<dzf, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dzf, LongSet> $$0) {
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
   public dlh j() {
      return this.n.j();
   }

   @Override
   public void d(hx $$0) {
   }

   @Override
   public void e(hx $$0) {
   }

   @Override
   public void a(sn $$0) {
   }

   @Nullable
   @Override
   public sn f(hx $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public sn g(hx $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<djg> $$0, BiConsumer<hx, djg> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public enm<cwp> o() {
      return this.o ? this.n.o() : enc.a();
   }

   @Override
   public enm<eep> p() {
      return this.o ? this.n.p() : enc.a();
   }

   @Override
   public dlc.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dps t() {
      return this.n.t();
   }

   @Override
   public void a(dps $$0) {
      this.n.a($$0);
   }

   @Override
   public dlb a(dol.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dlb b(dol.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dln C() {
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
   public void a(cuq $$0, cuw.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public eea B() {
      return this.n.B();
   }
}
