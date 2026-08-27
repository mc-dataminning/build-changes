import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsd extends dso {
   private final dse n;
   private final boolean o;

   public dsd(dse $$0, boolean $$1) {
      super($$0.f(), dsr.a, $$0.l, $$0.F().H_().d(ld.ay), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dnd c_(im $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dpy a_(im $$0) {
      return this.n.a_($$0);
   }

   @Override
   public elr b_(im $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int P() {
      return this.n.P();
   }

   @Override
   public dsf b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dpy a(im $$0, dpy $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dnd $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bql $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dst $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dsf[] d() {
      return this.n.d();
   }

   @Override
   public void a(dvq.a $$0, long[] $$1) {
   }

   private dvq.a c(dvq.a $$0) {
      if ($$0 == dvq.a.a) {
         return dvq.a.b;
      } else {
         return $$0 == dvq.a.c ? dvq.a.d : $$0;
      }
   }

   @Override
   public dvq a(dvq.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dvq.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public iv<dat> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public czb f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public ego a(egg $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(egg $$0, ego $$1) {
   }

   @Override
   public Map<egg, ego> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<egg, ego> $$0) {
   }

   @Override
   public LongSet b(egg $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(egg $$0, long $$1) {
   }

   @Override
   public Map<egg, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<egg, LongSet> $$0) {
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
   public dst j() {
      return this.n.j();
   }

   @Override
   public void d(im $$0) {
   }

   @Override
   public void e(im $$0) {
   }

   @Override
   public void a(ty $$0) {
   }

   @Nullable
   @Override
   public ty f(im $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public ty a(im $$0, ix.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dpy> $$0, BiConsumer<im, dpy> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public euz<dcv> o() {
      return this.o ? this.n.o() : eup.a();
   }

   @Override
   public euz<elq> p() {
      return this.o ? this.n.p() : eup.a();
   }

   @Override
   public dru.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dwt t() {
      return this.n.t();
   }

   @Override
   public void a(dwt $$0) {
      this.n.a($$0);
   }

   @Override
   public drt a(dvm.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public drt b(dvm.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dse C() {
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
   public void a(daw $$0, dbc.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public elb B() {
      return this.n.B();
   }
}
