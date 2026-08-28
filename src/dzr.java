import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dzr extends eac {
   private final dzs o;
   private final boolean p;

   public dzr(dzs $$0, boolean $$1) {
      super($$0.f(), eaf.a, $$0.m, $$0.E().K_().e(mb.aH), $$0.s());
      this.o = $$0;
      this.p = $$1;
   }

   @Nullable
   @Override
   public dup c_(jh $$0) {
      return this.o.c_($$0);
   }

   @Override
   public dxn a_(jh $$0) {
      return this.o.a_($$0);
   }

   @Override
   public etp b_(jh $$0) {
      return this.o.b_($$0);
   }

   @Override
   public dzt b(int $$0) {
      return this.p ? this.o.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dxn a(jh $$0, dxn $$1, boolean $$2) {
      return this.p ? this.o.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dup $$0) {
      if (this.p) {
         this.o.a($$0);
      }
   }

   @Override
   public void a(bvf $$0) {
      if (this.p) {
         this.o.a($$0);
      }
   }

   @Override
   public void a(eaj $$0) {
      if (this.p) {
         super.a($$0);
      }
   }

   @Override
   public dzt[] d() {
      return this.o.d();
   }

   @Override
   public void a(edi.a $$0, long[] $$1) {
   }

   private edi.a c(edi.a $$0) {
      if ($$0 == edi.a.a) {
         return edi.a.b;
      } else {
         return $$0 == edi.a.c ? edi.a.d : $$0;
      }
   }

   @Override
   public edi a(edi.a $$0) {
      return this.o.a($$0);
   }

   @Override
   public int a(edi.a $$0, int $$1, int $$2) {
      return this.o.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jq<dic> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.o.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dgg f() {
      return this.o.f();
   }

   @Nullable
   @Override
   public eok a(eoc $$0) {
      return this.o.a($$0);
   }

   @Override
   public void a(eoc $$0, eok $$1) {
   }

   @Override
   public Map<eoc, eok> g() {
      return this.o.g();
   }

   @Override
   public void a(Map<eoc, eok> $$0) {
   }

   @Override
   public LongSet b(eoc $$0) {
      return this.o.b($$0);
   }

   @Override
   public void a(eoc $$0, long $$1) {
   }

   @Override
   public Map<eoc, LongSet> h() {
      return this.o.h();
   }

   @Override
   public void b(Map<eoc, LongSet> $$0) {
   }

   @Override
   public void a(boolean $$0) {
      this.o.a($$0);
   }

   @Override
   public boolean i() {
      return false;
   }

   @Override
   public eaj j() {
      return this.o.j();
   }

   @Override
   public void d(jh $$0) {
   }

   @Override
   public void e(jh $$0) {
   }

   @Override
   public void a(ux $$0) {
   }

   @Nullable
   @Override
   public ux f(jh $$0) {
      return this.o.f($$0);
   }

   @Nullable
   @Override
   public ux a(jh $$0, js.a $$1) {
      return this.o.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dxn> $$0, BiConsumer<jh, dxn> $$1) {
      this.o.a($$0, $$1);
   }

   @Override
   public fdn<dke> o() {
      return this.p ? this.o.o() : fdd.a();
   }

   @Override
   public fdn<eto> p() {
      return this.p ? this.o.p() : fdd.a();
   }

   @Override
   public dzi.a a(long $$0) {
      return this.o.a($$0);
   }

   @Nullable
   @Override
   public eel s() {
      return this.o.s();
   }

   @Override
   public dzh B() {
      if (this.p) {
         return super.B();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dzh C() {
      if (this.p) {
         return super.C();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dzs D() {
      return this.o;
   }

   @Override
   public boolean u() {
      return this.o.u();
   }

   @Override
   public void b(boolean $$0) {
      this.o.b($$0);
   }

   @Override
   public void a(dif $$0, dil.f $$1) {
      if (this.p) {
         this.o.a($$0, $$1);
      }
   }

   @Override
   public void z() {
      this.o.z();
   }

   @Override
   public esz A() {
      return this.o.A();
   }
}
