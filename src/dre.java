import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dre extends drp {
   private final drf n;
   private final boolean o;

   public dre(drf $$0, boolean $$1) {
      super($$0.f(), drs.a, $$0.l, $$0.F().H_().d(ks.av), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dmf c_(ib $$0) {
      return this.n.c_($$0);
   }

   @Override
   public doz a_(ib $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eks b_(ib $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int P() {
      return this.n.P();
   }

   @Override
   public drg b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public doz a(ib $$0, doz $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dmf $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bpv $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dru $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public drg[] d() {
      return this.n.d();
   }

   @Override
   public void a(dur.a $$0, long[] $$1) {
   }

   private dur.a c(dur.a $$0) {
      if ($$0 == dur.a.a) {
         return dur.a.b;
      } else {
         return $$0 == dur.a.c ? dur.a.d : $$0;
      }
   }

   @Override
   public dur a(dur.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dur.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public il<czw> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cye f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public efp a(efh $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(efh $$0, efp $$1) {
   }

   @Override
   public Map<efh, efp> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<efh, efp> $$0) {
   }

   @Override
   public LongSet b(efh $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(efh $$0, long $$1) {
   }

   @Override
   public Map<efh, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<efh, LongSet> $$0) {
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
   public dru j() {
      return this.n.j();
   }

   @Override
   public void d(ib $$0) {
   }

   @Override
   public void e(ib $$0) {
   }

   @Override
   public void a(tm $$0) {
   }

   @Nullable
   @Override
   public tm f(ib $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public tm a(ib $$0, in.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<doz> $$0, BiConsumer<ib, doz> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public etu<dby> o() {
      return this.o ? this.n.o() : etk.a();
   }

   @Override
   public etu<ekr> p() {
      return this.o ? this.n.p() : etk.a();
   }

   @Override
   public dqv.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dvu t() {
      return this.n.t();
   }

   @Override
   public void a(dvu $$0) {
      this.n.a($$0);
   }

   @Override
   public dqu a(dun.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dqu b(dun.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public drf C() {
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
   public void a(czz $$0, daf.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public ekc B() {
      return this.n.B();
   }
}
