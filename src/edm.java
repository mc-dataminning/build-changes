import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class edm extends edx {
   private final edn n;
   private final boolean o;

   public edm(edn $$0, boolean $$1) {
      super($$0.f(), eea.a, $$0.l, $$0.H().J_().f(mi.aG), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dye c_(iw $$0) {
      return this.n.c_($$0);
   }

   @Override
   public ebg a_(iw $$0) {
      return this.n.a_($$0);
   }

   @Override
   public exq b_(iw $$0) {
      return this.n.b_($$0);
   }

   @Override
   public edo b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public ebg a(iw $$0, ebg $$1, int $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dye $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bwv $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(eee $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public edo[] d() {
      return this.n.d();
   }

   @Override
   public void a(ehf.a $$0, long[] $$1) {
   }

   private ehf.a c(ehf.a $$0) {
      if ($$0 == ehf.a.a) {
         return ehf.a.b;
      } else {
         return $$0 == ehf.a.c ? ehf.a.d : $$0;
      }
   }

   @Override
   public ehf a(ehf.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(ehf.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jg<dlc> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dje f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public esl a(esd $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(esd $$0, esl $$1) {
   }

   @Override
   public Map<esd, esl> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<esd, esl> $$0) {
   }

   @Override
   public LongSet b(esd $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(esd $$0, long $$1) {
   }

   @Override
   public Map<esd, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<esd, LongSet> $$0) {
   }

   @Override
   public void i() {
      this.n.i();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public eee n() {
      return this.n.n();
   }

   @Override
   public void d(iw $$0) {
   }

   @Override
   public void e(iw $$0) {
   }

   @Override
   public void a(ua $$0) {
   }

   @Nullable
   @Override
   public ua f(iw $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public ua a(iw $$0, ji.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<ebg> $$0, BiConsumer<iw, ebg> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fhn<dne> q() {
      return this.o ? this.n.q() : fhd.a();
   }

   @Override
   public fhn<exp> r() {
      return this.o ? this.n.r() : fhd.a();
   }

   @Override
   public edd.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public eii v() {
      return this.n.v();
   }

   @Override
   public edc E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public edc F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public edn G() {
      return this.n;
   }

   @Override
   public boolean x() {
      return this.n.x();
   }

   @Override
   public void a(boolean $$0) {
      this.n.a($$0);
   }

   @Override
   public void a(dlf $$0, dll.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public exa D() {
      return this.n.D();
   }
}
