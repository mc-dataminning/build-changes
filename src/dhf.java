import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dhf extends dhq {
   private final dhg n;
   private final boolean o;

   public dhf(dhg $$0, boolean $$1) {
      super($$0.f(), dht.a, $$0.l, $$0.F().B_().d(jc.ap), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dcl c_(gu $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dez a_(gu $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eac b_(gu $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int M() {
      return this.n.M();
   }

   @Override
   public dhh b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dez a(gu $$0, dez $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dcl $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bii $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dha $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dhh[] d() {
      return this.n.d();
   }

   @Override
   public void a(dki.a $$0, long[] $$1) {
   }

   private dki.a c(dki.a $$0) {
      if ($$0 == dki.a.a) {
         return dki.a.b;
      } else {
         return $$0 == dki.a.c ? dki.a.d : $$0;
      }
   }

   @Override
   public dki a(dki.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dki.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public he<cqj> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cos f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dvg a(duy $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(duy $$0, dvg $$1) {
   }

   @Override
   public Map<duy, dvg> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<duy, dvg> $$0) {
   }

   @Override
   public LongSet b(duy $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(duy $$0, long $$1) {
   }

   @Override
   public Map<duy, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<duy, LongSet> $$0) {
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
   public dha j() {
      return this.n.j();
   }

   @Override
   public void d(gu $$0) {
   }

   @Override
   public void e(gu $$0) {
   }

   @Override
   public void a(qr $$0) {
   }

   @Nullable
   @Override
   public qr f(gu $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public qr g(gu $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<dez> $$0, BiConsumer<gu, dez> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public eis<csl> o() {
      return this.o ? this.n.o() : eii.a();
   }

   @Override
   public eis<eab> p() {
      return this.o ? this.n.p() : eii.a();
   }

   @Override
   public dgv.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dll t() {
      return this.n.t();
   }

   @Override
   public void a(dll $$0) {
      this.n.a($$0);
   }

   @Override
   public dgu a(dke.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dgu b(dke.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dhg C() {
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
   public void a(cqm $$0, cqs.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public dzm B() {
      return this.n.B();
   }
}
