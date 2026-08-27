import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dln extends dly {
   private final dlo n;
   private final boolean o;

   public dln(dlo $$0, boolean $$1) {
      super($$0.f(), dmb.a, $$0.l, $$0.F().I_().d(ke.at), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dgv c_(hx $$0) {
      return this.n.c_($$0);
   }

   @Override
   public djh a_(hx $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eer b_(hx $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int O() {
      return this.n.O();
   }

   @Override
   public dlp b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public djh a(hx $$0, djh $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dgv $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(blv $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dli $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dlp[] d() {
      return this.n.d();
   }

   @Override
   public void a(doq.a $$0, long[] $$1) {
   }

   private doq.a c(doq.a $$0) {
      if ($$0 == doq.a.a) {
         return doq.a.b;
      } else {
         return $$0 == doq.a.c ? doq.a.d : $$0;
      }
   }

   @Override
   public doq a(doq.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(doq.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ih<cuo> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public csw f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dzo a(dzg $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dzg $$0, dzo $$1) {
   }

   @Override
   public Map<dzg, dzo> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dzg, dzo> $$0) {
   }

   @Override
   public LongSet b(dzg $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dzg $$0, long $$1) {
   }

   @Override
   public Map<dzg, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dzg, LongSet> $$0) {
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
   public dli j() {
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
   public void a(Predicate<djh> $$0, BiConsumer<hx, djh> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public enn<cwq> o() {
      return this.o ? this.n.o() : end.a();
   }

   @Override
   public enn<eeq> p() {
      return this.o ? this.n.p() : end.a();
   }

   @Override
   public dld.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dpt t() {
      return this.n.t();
   }

   @Override
   public void a(dpt $$0) {
      this.n.a($$0);
   }

   @Override
   public dlc a(dom.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dlc b(dom.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dlo C() {
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
   public void a(cur $$0, cux.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public eeb B() {
      return this.n.B();
   }
}
