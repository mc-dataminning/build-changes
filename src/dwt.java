import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dwt extends dxe {
   private final dwu n;
   private final boolean o;

   public dwt(dwu $$0, boolean $$1) {
      super($$0.f(), dxh.a, $$0.l, $$0.E().F_().d(lv.aG), $$0.s());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public drs c_(je $$0) {
      return this.n.c_($$0);
   }

   @Override
   public duo a_(je $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eqp b_(je $$0) {
      return this.n.b_($$0);
   }

   @Override
   public dwv b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public duo a(je $$0, duo $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(drs $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bto $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dxl $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dwv[] d() {
      return this.n.d();
   }

   @Override
   public void a(eak.a $$0, long[] $$1) {
   }

   private eak.a c(eak.a $$0) {
      if ($$0 == eak.a.a) {
         return eak.a.b;
      } else {
         return $$0 == eak.a.c ? eak.a.d : $$0;
      }
   }

   @Override
   public eak a(eak.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(eak.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jn<dfh> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public ddm f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public elk a(elc $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(elc $$0, elk $$1) {
   }

   @Override
   public Map<elc, elk> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<elc, elk> $$0) {
   }

   @Override
   public LongSet b(elc $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(elc $$0, long $$1) {
   }

   @Override
   public Map<elc, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<elc, LongSet> $$0) {
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
   public dxl j() {
      return this.n.j();
   }

   @Override
   public void d(je $$0) {
   }

   @Override
   public void e(je $$0) {
   }

   @Override
   public void a(uf $$0) {
   }

   @Nullable
   @Override
   public uf f(je $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public uf a(je $$0, jp.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<duo> $$0, BiConsumer<je, duo> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fan<dhj> o() {
      return this.o ? this.n.o() : fad.a();
   }

   @Override
   public fan<eqo> p() {
      return this.o ? this.n.p() : fad.a();
   }

   @Override
   public dwk.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public ebn s() {
      return this.n.s();
   }

   @Override
   public dwj B() {
      if (this.o) {
         return super.B();
      } else {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dwj C() {
      if (this.o) {
         return super.C();
      } else {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dwu D() {
      return this.n;
   }

   @Override
   public boolean u() {
      return this.n.u();
   }

   @Override
   public void b(boolean $$0) {
      this.n.b($$0);
   }

   @Override
   public void a(dfk $$0, dfq.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void z() {
      this.n.z();
   }

   @Override
   public epz A() {
      return this.n.A();
   }
}
