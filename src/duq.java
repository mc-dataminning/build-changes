import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class duq extends dvb {
   private final dur n;
   private final boolean o;

   public duq(dur $$0, boolean $$1) {
      super($$0.f(), dve.a, $$0.l, $$0.F().H_().d(lr.aE), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dpq c_(ja $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dsl a_(ja $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eoj b_(ja $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int Q() {
      return this.n.Q();
   }

   @Override
   public dus b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dsl a(ja $$0, dsl $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dpq $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bsh $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dvi $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dus[] d() {
      return this.n.d();
   }

   @Override
   public void a(dyg.a $$0, long[] $$1) {
   }

   private dyg.a c(dyg.a $$0) {
      if ($$0 == dyg.a.a) {
         return dyg.a.b;
      } else {
         return $$0 == dyg.a.c ? dyg.a.d : $$0;
      }
   }

   @Override
   public dyg a(dyg.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dyg.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jj<ddg> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dbn f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public ejf a(eix $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eix $$0, ejf $$1) {
   }

   @Override
   public Map<eix, ejf> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eix, ejf> $$0) {
   }

   @Override
   public LongSet b(eix $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eix $$0, long $$1) {
   }

   @Override
   public Map<eix, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eix, LongSet> $$0) {
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
   public dvi j() {
      return this.n.j();
   }

   @Override
   public void d(ja $$0) {
   }

   @Override
   public void e(ja $$0) {
   }

   @Override
   public void a(tx $$0) {
   }

   @Nullable
   @Override
   public tx f(ja $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public tx a(ja $$0, jl.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dsl> $$0, BiConsumer<ja, dsl> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public eyb<dfi> o() {
      return this.o ? this.n.o() : exr.a();
   }

   @Override
   public eyb<eoi> p() {
      return this.o ? this.n.p() : exr.a();
   }

   @Override
   public duh.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dzj t() {
      return this.n.t();
   }

   @Override
   public void a(dzj $$0) {
      this.n.a($$0);
   }

   @Override
   public dug a(dyc.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dug b(dyc.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dur C() {
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
   public void a(ddj $$0, ddp.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public ent B() {
      return this.n.B();
   }
}
