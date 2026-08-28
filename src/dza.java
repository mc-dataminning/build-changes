import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dza extends dzl {
   private final dzb n;
   private final boolean o;

   public dza(dzb $$0, boolean $$1) {
      super($$0.f(), dzo.a, $$0.l, $$0.H().K_().e(mc.aI), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dty c_(ji $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dww a_(ji $$0) {
      return this.n.a_($$0);
   }

   @Override
   public esy b_(ji $$0) {
      return this.n.b_($$0);
   }

   @Override
   public dzc b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dww a(ji $$0, dww $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dty $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(buk $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dzs $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dzc[] d() {
      return this.n.d();
   }

   @Override
   public void a(ecr.a $$0, long[] $$1) {
   }

   private ecr.a c(ecr.a $$0) {
      if ($$0 == ecr.a.a) {
         return ecr.a.b;
      } else {
         return $$0 == ecr.a.c ? ecr.a.d : $$0;
      }
   }

   @Override
   public ecr a(ecr.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(ecr.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jr<dhj> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dfn f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public ent a(enl $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(enl $$0, ent $$1) {
   }

   @Override
   public Map<enl, ent> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<enl, ent> $$0) {
   }

   @Override
   public LongSet b(enl $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(enl $$0, long $$1) {
   }

   @Override
   public Map<enl, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<enl, LongSet> $$0) {
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
   public dzs n() {
      return this.n.n();
   }

   @Override
   public void d(ji $$0) {
   }

   @Override
   public void e(ji $$0) {
   }

   @Override
   public void a(tq $$0) {
   }

   @Nullable
   @Override
   public tq f(ji $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public tq a(ji $$0, jt.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dww> $$0, BiConsumer<ji, dww> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fcu<djl> q() {
      return this.o ? this.n.q() : fck.a();
   }

   @Override
   public fcu<esx> r() {
      return this.o ? this.n.r() : fck.a();
   }

   @Override
   public dyr.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public edu v() {
      return this.n.v();
   }

   @Override
   public dyq E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dyq F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dzb G() {
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
   public void a(dhm $$0, dhs.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public esi D() {
      return this.n.D();
   }
}
