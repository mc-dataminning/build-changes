import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dih extends dis {
   private final dii n;
   private final boolean o;

   public dih(dii $$0, boolean $$1) {
      super($$0.f(), div.a, $$0.l, $$0.F().H_().d(jz.aq), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public ddx c_(ht $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dgb a_(ht $$0) {
      return this.n.a_($$0);
   }

   @Override
   public ebe b_(ht $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int M() {
      return this.n.M();
   }

   @Override
   public dij b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dgb a(ht $$0, dgb $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(ddx $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bjt $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dic $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dij[] d() {
      return this.n.d();
   }

   @Override
   public void a(dlk.a $$0, long[] $$1) {
   }

   private dlk.a c(dlk.a $$0) {
      if ($$0 == dlk.a.a) {
         return dlk.a.b;
      } else {
         return $$0 == dlk.a.c ? dlk.a.d : $$0;
      }
   }

   @Override
   public dlk a(dlk.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dlk.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ib<crx> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cqg f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dwi a(dwa $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dwa $$0, dwi $$1) {
   }

   @Override
   public Map<dwa, dwi> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dwa, dwi> $$0) {
   }

   @Override
   public LongSet b(dwa $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dwa $$0, long $$1) {
   }

   @Override
   public Map<dwa, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dwa, LongSet> $$0) {
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
   public dic j() {
      return this.n.j();
   }

   @Override
   public void d(ht $$0) {
   }

   @Override
   public void e(ht $$0) {
   }

   @Override
   public void a(rt $$0) {
   }

   @Nullable
   @Override
   public rt f(ht $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public rt g(ht $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<dgb> $$0, BiConsumer<ht, dgb> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public eju<cua> o() {
      return this.o ? this.n.o() : ejk.a();
   }

   @Override
   public eju<ebd> p() {
      return this.o ? this.n.p() : ejk.a();
   }

   @Override
   public dhx.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dmn t() {
      return this.n.t();
   }

   @Override
   public void a(dmn $$0) {
      this.n.a($$0);
   }

   @Override
   public dhw a(dlg.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dhw b(dlg.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dii C() {
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
   public void a(csa $$0, csg.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public eao B() {
      return this.n.B();
   }
}
