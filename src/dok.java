import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dok extends dov {
   private final dol n;
   private final boolean o;

   public dok(dol $$0, boolean $$1) {
      super($$0.f(), doy.a, $$0.l, $$0.F().I_().d(ki.au), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public djl c_(ib $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dme a_(ib $$0) {
      return this.n.a_($$0);
   }

   @Override
   public ehr b_(ib $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int O() {
      return this.n.O();
   }

   @Override
   public dom b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dme a(ib $$0, dme $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(djl $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bof $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dof $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dom[] d() {
      return this.n.d();
   }

   @Override
   public void a(drq.a $$0, long[] $$1) {
   }

   private drq.a c(drq.a $$0) {
      if ($$0 == drq.a.a) {
         return drq.a.b;
      } else {
         return $$0 == drq.a.c ? drq.a.d : $$0;
      }
   }

   @Override
   public drq a(drq.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(drq.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public il<cxd> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cvl f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public eco a(ecg $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(ecg $$0, eco $$1) {
   }

   @Override
   public Map<ecg, eco> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<ecg, eco> $$0) {
   }

   @Override
   public LongSet b(ecg $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(ecg $$0, long $$1) {
   }

   @Override
   public Map<ecg, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<ecg, LongSet> $$0) {
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
   public dof j() {
      return this.n.j();
   }

   @Override
   public void d(ib $$0) {
   }

   @Override
   public void e(ib $$0) {
   }

   @Override
   public void a(sy $$0) {
   }

   @Nullable
   @Override
   public sy f(ib $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public sy a(ib $$0, in.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dme> $$0, BiConsumer<ib, dme> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public eqp<czf> o() {
      return this.o ? this.n.o() : eqf.a();
   }

   @Override
   public eqp<ehq> p() {
      return this.o ? this.n.p() : eqf.a();
   }

   @Override
   public doa.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dst t() {
      return this.n.t();
   }

   @Override
   public void a(dst $$0) {
      this.n.a($$0);
   }

   @Override
   public dnz a(drm.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dnz b(drm.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dol C() {
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
   public void a(cxg $$0, cxm.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public ehb B() {
      return this.n.B();
   }
}
