import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dup extends dva {
   private final duq n;
   private final boolean o;

   public dup(duq $$0, boolean $$1) {
      super($$0.f(), dvd.a, $$0.l, $$0.F().H_().d(lr.aE), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dpp c_(ja $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dsk a_(ja $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eoh b_(ja $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int Q() {
      return this.n.Q();
   }

   @Override
   public dur b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dsk a(ja $$0, dsk $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dpp $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bsg $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dvh $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dur[] d() {
      return this.n.d();
   }

   @Override
   public void a(dyf.a $$0, long[] $$1) {
   }

   private dyf.a c(dyf.a $$0) {
      if ($$0 == dyf.a.a) {
         return dyf.a.b;
      } else {
         return $$0 == dyf.a.c ? dyf.a.d : $$0;
      }
   }

   @Override
   public dyf a(dyf.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dyf.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jj<ddf> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dbm f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public eje a(eiw $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eiw $$0, eje $$1) {
   }

   @Override
   public Map<eiw, eje> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eiw, eje> $$0) {
   }

   @Override
   public LongSet b(eiw $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eiw $$0, long $$1) {
   }

   @Override
   public Map<eiw, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eiw, LongSet> $$0) {
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
   public dvh j() {
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
   public void a(Predicate<dsk> $$0, BiConsumer<ja, dsk> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public exz<dfh> o() {
      return this.o ? this.n.o() : exp.a();
   }

   @Override
   public exz<eog> p() {
      return this.o ? this.n.p() : exp.a();
   }

   @Override
   public dug.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dzi t() {
      return this.n.t();
   }

   @Override
   public void a(dzi $$0) {
      this.n.a($$0);
   }

   @Override
   public duf a(dyb.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public duf b(dyb.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public duq C() {
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
   public void a(ddi $$0, ddo.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public enr B() {
      return this.n.B();
   }
}
