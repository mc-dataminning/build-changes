import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxz extends dyk {
   private final dya o;
   private final boolean p;

   public dxz(dya $$0, boolean $$1) {
      super($$0.f(), dyn.a, $$0.m, $$0.E().J_().e(ma.aG), $$0.s());
      this.o = $$0;
      this.p = $$1;
   }

   @Nullable
   @Override
   public dsy c_(jh $$0) {
      return this.o.c_($$0);
   }

   @Override
   public dvv a_(jh $$0) {
      return this.o.a_($$0);
   }

   @Override
   public erv b_(jh $$0) {
      return this.o.b_($$0);
   }

   @Override
   public dyb b(int $$0) {
      return this.p ? this.o.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dvv a(jh $$0, dvv $$1, boolean $$2) {
      return this.p ? this.o.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dsy $$0) {
      if (this.p) {
         this.o.a($$0);
      }
   }

   @Override
   public void a(bul $$0) {
      if (this.p) {
         this.o.a($$0);
      }
   }

   @Override
   public void a(dyr $$0) {
      if (this.p) {
         super.a($$0);
      }
   }

   @Override
   public dyb[] d() {
      return this.o.d();
   }

   @Override
   public void a(ebq.a $$0, long[] $$1) {
   }

   private ebq.a c(ebq.a $$0) {
      if ($$0 == ebq.a.a) {
         return ebq.a.b;
      } else {
         return $$0 == ebq.a.c ? ebq.a.d : $$0;
      }
   }

   @Override
   public ebq a(ebq.a $$0) {
      return this.o.a($$0);
   }

   @Override
   public int a(ebq.a $$0, int $$1, int $$2) {
      return this.o.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jq<dgo> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.o.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public des f() {
      return this.o.f();
   }

   @Nullable
   @Override
   public emq a(emi $$0) {
      return this.o.a($$0);
   }

   @Override
   public void a(emi $$0, emq $$1) {
   }

   @Override
   public Map<emi, emq> g() {
      return this.o.g();
   }

   @Override
   public void a(Map<emi, emq> $$0) {
   }

   @Override
   public LongSet b(emi $$0) {
      return this.o.b($$0);
   }

   @Override
   public void a(emi $$0, long $$1) {
   }

   @Override
   public Map<emi, LongSet> h() {
      return this.o.h();
   }

   @Override
   public void b(Map<emi, LongSet> $$0) {
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
   public dyr j() {
      return this.o.j();
   }

   @Override
   public void d(jh $$0) {
   }

   @Override
   public void e(jh $$0) {
   }

   @Override
   public void a(ul $$0) {
   }

   @Nullable
   @Override
   public ul f(jh $$0) {
      return this.o.f($$0);
   }

   @Nullable
   @Override
   public ul a(jh $$0, js.a $$1) {
      return this.o.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dvv> $$0, BiConsumer<jh, dvv> $$1) {
      this.o.a($$0, $$1);
   }

   @Override
   public fbt<diq> o() {
      return this.p ? this.o.o() : fbj.a();
   }

   @Override
   public fbt<eru> p() {
      return this.p ? this.o.p() : fbj.a();
   }

   @Override
   public dxq.a a(long $$0) {
      return this.o.a($$0);
   }

   @Nullable
   @Override
   public ect s() {
      return this.o.s();
   }

   @Override
   public dxp B() {
      if (this.p) {
         return super.B();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dxp C() {
      if (this.p) {
         return super.C();
      } else {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dya D() {
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
   public void a(dgr $$0, dgx.f $$1) {
      if (this.p) {
         this.o.a($$0, $$1);
      }
   }

   @Override
   public void z() {
      this.o.z();
   }

   @Override
   public erf A() {
      return this.o.A();
   }
}
