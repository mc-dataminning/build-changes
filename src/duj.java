import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class duj extends duu {
   private final duk n;
   private final boolean o;

   public duj(duk $$0, boolean $$1) {
      super($$0.f(), dux.a, $$0.l, $$0.F().H_().d(lq.az), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dpj c_(iz $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dse a_(iz $$0) {
      return this.n.a_($$0);
   }

   @Override
   public enx b_(iz $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int Q() {
      return this.n.Q();
   }

   @Override
   public dul b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dse a(iz $$0, dse $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dpj $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bsw $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(duz $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dul[] d() {
      return this.n.d();
   }

   @Override
   public void a(dxw.a $$0, long[] $$1) {
   }

   private dxw.a c(dxw.a $$0) {
      if ($$0 == dxw.a.a) {
         return dxw.a.b;
      } else {
         return $$0 == dxw.a.c ? dxw.a.d : $$0;
      }
   }

   @Override
   public dxw a(dxw.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dxw.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ji<dcz> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dbh f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public eiu a(eim $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(eim $$0, eiu $$1) {
   }

   @Override
   public Map<eim, eiu> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<eim, eiu> $$0) {
   }

   @Override
   public LongSet b(eim $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(eim $$0, long $$1) {
   }

   @Override
   public Map<eim, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<eim, LongSet> $$0) {
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
   public duz j() {
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
   public void a(Predicate<dse> $$0, BiConsumer<iz, dse> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public exn<dfb> o() {
      return this.o ? this.n.o() : exd.a();
   }

   @Override
   public exn<enw> p() {
      return this.o ? this.n.p() : exd.a();
   }

   @Override
   public dua.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dyz t() {
      return this.n.t();
   }

   @Override
   public void a(dyz $$0) {
      this.n.a($$0);
   }

   @Override
   public dtz a(dxs.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dtz b(dxs.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public duk C() {
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
   public void a(ddc $$0, ddi.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public enh B() {
      return this.n.B();
   }
}
