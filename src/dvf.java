import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dvf extends dvq {
   private final dvg n;
   private final boolean o;

   public dvf(dvg $$0, boolean $$1) {
      super($$0.f(), dvt.a, $$0.l, $$0.F().H_().d(lu.aF), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dqf c_(jd $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dta a_(jd $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eoy b_(jd $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int Q() {
      return this.n.Q();
   }

   @Override
   public dvh b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dta a(jd $$0, dta $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dqf $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bsq $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dvx $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dvh[] d() {
      return this.n.d();
   }

   @Override
   public void a(dyv.a $$0, long[] $$1) {
   }

   private dyv.a c(dyv.a $$0) {
      if ($$0 == dyv.a.a) {
         return dyv.a.b;
      } else {
         return $$0 == dyv.a.c ? dyv.a.d : $$0;
      }
   }

   @Override
   public dyv a(dyv.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dyv.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jm<ddu> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dcb f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public eju a(ejm $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(ejm $$0, eju $$1) {
   }

   @Override
   public Map<ejm, eju> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<ejm, eju> $$0) {
   }

   @Override
   public LongSet b(ejm $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(ejm $$0, long $$1) {
   }

   @Override
   public Map<ejm, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<ejm, LongSet> $$0) {
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
   public dvx j() {
      return this.n.j();
   }

   @Override
   public void d(jd $$0) {
   }

   @Override
   public void e(jd $$0) {
   }

   @Override
   public void a(ua $$0) {
   }

   @Nullable
   @Override
   public ua f(jd $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public ua a(jd $$0, jo.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dta> $$0, BiConsumer<jd, dta> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public eyq<dfw> o() {
      return this.o ? this.n.o() : eyg.a();
   }

   @Override
   public eyq<eox> p() {
      return this.o ? this.n.p() : eyg.a();
   }

   @Override
   public duw.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dzy t() {
      return this.n.t();
   }

   @Override
   public void a(dzy $$0) {
      this.n.a($$0);
   }

   @Override
   public duv a(dyr.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public duv b(dyr.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dvg C() {
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
   public void a(ddx $$0, ded.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public eoi B() {
      return this.n.B();
   }
}
