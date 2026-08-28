import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxo extends dxz {
   private final dxp o;
   private final boolean p;

   public dxo(dxp $$0, boolean $$1) {
      super($$0.f(), dyc.a, $$0.m, $$0.E().H_().e(lz.aG), $$0.s());
      this.o = $$0;
      this.p = $$1;
   }

   @Nullable
   @Override
   public dsm c_(jh $$0) {
      return this.o.c_($$0);
   }

   @Override
   public dvj a_(jh $$0) {
      return this.o.a_($$0);
   }

   @Override
   public erk b_(jh $$0) {
      return this.o.b_($$0);
   }

   @Override
   public dxq b(int $$0) {
      return this.p ? this.o.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dvj a(jh $$0, dvj $$1, boolean $$2) {
      return this.p ? this.o.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dsm $$0) {
      if (this.p) {
         this.o.a($$0);
      }
   }

   @Override
   public void a(bue $$0) {
      if (this.p) {
         this.o.a($$0);
      }
   }

   @Override
   public void a(dyg $$0) {
      if (this.p) {
         super.a($$0);
      }
   }

   @Override
   public dxq[] d() {
      return this.o.d();
   }

   @Override
   public void a(ebf.a $$0, long[] $$1) {
   }

   private ebf.a c(ebf.a $$0) {
      if ($$0 == ebf.a.a) {
         return ebf.a.b;
      } else {
         return $$0 == ebf.a.c ? ebf.a.d : $$0;
      }
   }

   @Override
   public ebf a(ebf.a $$0) {
      return this.o.a($$0);
   }

   @Override
   public int a(ebf.a $$0, int $$1, int $$2) {
      return this.o.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jq<dgc> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.o.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public deh f() {
      return this.o.f();
   }

   @Nullable
   @Override
   public emf a(elx $$0) {
      return this.o.a($$0);
   }

   @Override
   public void a(elx $$0, emf $$1) {
   }

   @Override
   public Map<elx, emf> g() {
      return this.o.g();
   }

   @Override
   public void a(Map<elx, emf> $$0) {
   }

   @Override
   public LongSet b(elx $$0) {
      return this.o.b($$0);
   }

   @Override
   public void a(elx $$0, long $$1) {
   }

   @Override
   public Map<elx, LongSet> h() {
      return this.o.h();
   }

   @Override
   public void b(Map<elx, LongSet> $$0) {
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
   public dyg j() {
      return this.o.j();
   }

   @Override
   public void d(jh $$0) {
   }

   @Override
   public void e(jh $$0) {
   }

   @Override
   public void a(uk $$0) {
   }

   @Nullable
   @Override
   public uk f(jh $$0) {
      return this.o.f($$0);
   }

   @Nullable
   @Override
   public uk a(jh $$0, js.a $$1) {
      return this.o.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dvj> $$0, BiConsumer<jh, dvj> $$1) {
      this.o.a($$0, $$1);
   }

   @Override
   public fbi<die> o() {
      return this.p ? this.o.o() : fay.a();
   }

   @Override
   public fbi<erj> p() {
      return this.p ? this.o.p() : fay.a();
   }

   @Override
   public dxf.a a(long $$0) {
      return this.o.a($$0);
   }

   @Nullable
   @Override
   public eci s() {
      return this.o.s();
   }

   @Override
   public dxe B() {
      if (this.p) {
         return super.B();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dxe C() {
      if (this.p) {
         return super.C();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dxp D() {
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
   public void a(dgf $$0, dgl.f $$1) {
      if (this.p) {
         this.o.a($$0, $$1);
      }
   }

   @Override
   public void z() {
      this.o.z();
   }

   @Override
   public equ A() {
      return this.o.A();
   }
}
