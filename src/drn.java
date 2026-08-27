import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class drn extends dry {
   private final dro n;
   private final boolean o;

   public drn(dro $$0, boolean $$1) {
      super($$0.f(), dsb.a, $$0.l, $$0.F().H_().d(ku.aw), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dmo c_(id $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dpi a_(id $$0) {
      return this.n.a_($$0);
   }

   @Override
   public elb b_(id $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int P() {
      return this.n.P();
   }

   @Override
   public drp b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dpi a(id $$0, dpi $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dmo $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bqa $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dsd $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public drp[] d() {
      return this.n.d();
   }

   @Override
   public void a(dva.a $$0, long[] $$1) {
   }

   private dva.a c(dva.a $$0) {
      if ($$0 == dva.a.a) {
         return dva.a.b;
      } else {
         return $$0 == dva.a.c ? dva.a.d : $$0;
      }
   }

   @Override
   public dva a(dva.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dva.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public in<daf> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cyn f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public efy a(efq $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(efq $$0, efy $$1) {
   }

   @Override
   public Map<efq, efy> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<efq, efy> $$0) {
   }

   @Override
   public LongSet b(efq $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(efq $$0, long $$1) {
   }

   @Override
   public Map<efq, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<efq, LongSet> $$0) {
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
   public dsd j() {
      return this.n.j();
   }

   @Override
   public void d(id $$0) {
   }

   @Override
   public void e(id $$0) {
   }

   @Override
   public void a(to $$0) {
   }

   @Nullable
   @Override
   public to f(id $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public to a(id $$0, ip.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dpi> $$0, BiConsumer<id, dpi> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public eud<dch> o() {
      return this.o ? this.n.o() : ett.a();
   }

   @Override
   public eud<ela> p() {
      return this.o ? this.n.p() : ett.a();
   }

   @Override
   public dre.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dwd t() {
      return this.n.t();
   }

   @Override
   public void a(dwd $$0) {
      this.n.a($$0);
   }

   @Override
   public drd a(duw.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public drd b(duw.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dro C() {
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
   public void a(dai $$0, dao.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public ekl B() {
      return this.n.B();
   }
}
