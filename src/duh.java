import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class duh extends dus {
   private final dui n;
   private final boolean o;

   public duh(dui $$0, boolean $$1) {
      super($$0.f(), duv.a, $$0.l, $$0.F().H_().d(lq.az), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dph c_(iz $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dsc a_(iz $$0) {
      return this.n.a_($$0);
   }

   @Override
   public env b_(iz $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int Q() {
      return this.n.Q();
   }

   @Override
   public duj b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dsc a(iz $$0, dsc $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dph $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bsu $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dux $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public duj[] d() {
      return this.n.d();
   }

   @Override
   public void a(dxu.a $$0, long[] $$1) {
   }

   private dxu.a c(dxu.a $$0) {
      if ($$0 == dxu.a.a) {
         return dxu.a.b;
      } else {
         return $$0 == dxu.a.c ? dxu.a.d : $$0;
      }
   }

   @Override
   public dxu a(dxu.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dxu.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ji<dcx> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dbf f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public eis a(eik $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eik $$0, eis $$1) {
   }

   @Override
   public Map<eik, eis> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eik, eis> $$0) {
   }

   @Override
   public LongSet b(eik $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eik $$0, long $$1) {
   }

   @Override
   public Map<eik, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eik, LongSet> $$0) {
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
   public dux j() {
      return this.n.j();
   }

   @Override
   public void d(iz $$0) {
   }

   @Override
   public void e(iz $$0) {
   }

   @Override
   public void a(us $$0) {
   }

   @Nullable
   @Override
   public us f(iz $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public us a(iz $$0, jk.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dsc> $$0, BiConsumer<iz, dsc> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public exl<dez> o() {
      return this.o ? this.n.o() : exb.a();
   }

   @Override
   public exl<enu> p() {
      return this.o ? this.n.p() : exb.a();
   }

   @Override
   public dty.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dyx t() {
      return this.n.t();
   }

   @Override
   public void a(dyx $$0) {
      this.n.a($$0);
   }

   @Override
   public dtx a(dxq.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dtx b(dxq.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dui C() {
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
   public void a(dda $$0, ddg.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public enf B() {
      return this.n.B();
   }
}
