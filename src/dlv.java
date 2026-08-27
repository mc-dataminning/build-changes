import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dlv extends dmg {
   private final dlw n;
   private final boolean o;

   public dlv(dlw $$0, boolean $$1) {
      super($$0.f(), dmj.a, $$0.l, $$0.F().I_().d(ke.at), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dhd c_(hx $$0) {
      return this.n.c_($$0);
   }

   @Override
   public djp a_(hx $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eez b_(hx $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int O() {
      return this.n.O();
   }

   @Override
   public dlx b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public djp a(hx $$0, djp $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dhd $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(blw $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dlq $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dlx[] d() {
      return this.n.d();
   }

   @Override
   public void a(doy.a $$0, long[] $$1) {
   }

   private doy.a c(doy.a $$0) {
      if ($$0 == doy.a.a) {
         return doy.a.b;
      } else {
         return $$0 == doy.a.c ? doy.a.d : $$0;
      }
   }

   @Override
   public doy a(doy.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(doy.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ih<cuw> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cte f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dzw a(dzo $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dzo $$0, dzw $$1) {
   }

   @Override
   public Map<dzo, dzw> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dzo, dzw> $$0) {
   }

   @Override
   public LongSet b(dzo $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dzo $$0, long $$1) {
   }

   @Override
   public Map<dzo, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dzo, LongSet> $$0) {
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
   public dlq j() {
      return this.n.j();
   }

   @Override
   public void d(hx $$0) {
   }

   @Override
   public void e(hx $$0) {
   }

   @Override
   public void a(so $$0) {
   }

   @Nullable
   @Override
   public so f(hx $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public so g(hx $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<djp> $$0, BiConsumer<hx, djp> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public enw<cwy> o() {
      return this.o ? this.n.o() : enm.a();
   }

   @Override
   public enw<eey> p() {
      return this.o ? this.n.p() : enm.a();
   }

   @Override
   public dll.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dqb t() {
      return this.n.t();
   }

   @Override
   public void a(dqb $$0) {
      this.n.a($$0);
   }

   @Override
   public dlk a(dou.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dlk b(dou.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dlw C() {
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
   public void a(cuz $$0, cvf.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public eej B() {
      return this.n.B();
   }
}
