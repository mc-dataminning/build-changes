import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dnl extends dnw {
   private final dnm n;
   private final boolean o;

   public dnl(dnm $$0, boolean $$1) {
      super($$0.f(), dnz.a, $$0.l, $$0.F().I_().d(kg.at), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dit c_(hz $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dlf a_(hz $$0) {
      return this.n.a_($$0);
   }

   @Override
   public egp b_(hz $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int O() {
      return this.n.O();
   }

   @Override
   public dnn b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dlf a(hz $$0, dlf $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dit $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bno $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dng $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dnn[] d() {
      return this.n.d();
   }

   @Override
   public void a(dqo.a $$0, long[] $$1) {
   }

   private dqo.a c(dqo.a $$0) {
      if ($$0 == dqo.a.a) {
         return dqo.a.b;
      } else {
         return $$0 == dqo.a.c ? dqo.a.d : $$0;
      }
   }

   @Override
   public dqo a(dqo.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dqo.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ij<cwm> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cuu f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public ebm a(ebe $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(ebe $$0, ebm $$1) {
   }

   @Override
   public Map<ebe, ebm> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<ebe, ebm> $$0) {
   }

   @Override
   public LongSet b(ebe $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(ebe $$0, long $$1) {
   }

   @Override
   public Map<ebe, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<ebe, LongSet> $$0) {
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
   public dng j() {
      return this.n.j();
   }

   @Override
   public void d(hz $$0) {
   }

   @Override
   public void e(hz $$0) {
   }

   @Override
   public void a(sw $$0) {
   }

   @Nullable
   @Override
   public sw f(hz $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public sw g(hz $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<dlf> $$0, BiConsumer<hz, dlf> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public epm<cyo> o() {
      return this.o ? this.n.o() : epc.a();
   }

   @Override
   public epm<ego> p() {
      return this.o ? this.n.p() : epc.a();
   }

   @Override
   public dnb.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public drr t() {
      return this.n.t();
   }

   @Override
   public void a(drr $$0) {
      this.n.a($$0);
   }

   @Override
   public dna a(dqk.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dna b(dqk.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dnm C() {
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
   public void a(cwp $$0, cwv.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public efz B() {
      return this.n.B();
   }
}
