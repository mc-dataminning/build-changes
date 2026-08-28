import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dwx extends dxi {
   private final dwy n;
   private final boolean o;

   public dwx(dwy $$0, boolean $$1) {
      super($$0.f(), dxl.a, $$0.l, $$0.E().G_().e(lw.aH), $$0.s());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public drv c_(jf $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dus a_(jf $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eqt b_(jf $$0) {
      return this.n.b_($$0);
   }

   @Override
   public dwz b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dus a(jf $$0, dus $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(drv $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(btr $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dxp $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dwz[] d() {
      return this.n.d();
   }

   @Override
   public void a(eao.a $$0, long[] $$1) {
   }

   private eao.a c(eao.a $$0) {
      if ($$0 == eao.a.a) {
         return eao.a.b;
      } else {
         return $$0 == eao.a.c ? eao.a.d : $$0;
      }
   }

   @Override
   public eao a(eao.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(eao.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jo<dfk> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public ddp f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public elo a(elg $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(elg $$0, elo $$1) {
   }

   @Override
   public Map<elg, elo> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<elg, elo> $$0) {
   }

   @Override
   public LongSet b(elg $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(elg $$0, long $$1) {
   }

   @Override
   public Map<elg, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<elg, LongSet> $$0) {
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
   public dxp j() {
      return this.n.j();
   }

   @Override
   public void d(jf $$0) {
   }

   @Override
   public void e(jf $$0) {
   }

   @Override
   public void a(ug $$0) {
   }

   @Nullable
   @Override
   public ug f(jf $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public ug a(jf $$0, jq.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dus> $$0, BiConsumer<jf, dus> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public far<dhm> o() {
      return this.o ? this.n.o() : fah.a();
   }

   @Override
   public far<eqs> p() {
      return this.o ? this.n.p() : fah.a();
   }

   @Override
   public dwo.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public ebr s() {
      return this.n.s();
   }

   @Override
   public dwn B() {
      if (this.o) {
         return super.B();
      } else {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dwn C() {
      if (this.o) {
         return super.C();
      } else {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dwy D() {
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
   public void a(dfn $$0, dft.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void z() {
      this.n.z();
   }

   @Override
   public eqd A() {
      return this.n.A();
   }
}
