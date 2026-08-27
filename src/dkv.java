import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dkv extends dlg {
   private final dkw n;
   private final boolean o;

   public dkv(dkw $$0, boolean $$1) {
      super($$0.f(), dlj.a, $$0.l, $$0.F().I_().d(kc.as), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dgd c_(hv $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dip a_(hv $$0) {
      return this.n.a_($$0);
   }

   @Override
   public edz b_(hv $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int N() {
      return this.n.N();
   }

   @Override
   public dkx b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dip a(hv $$0, dip $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dgd $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(blf $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dkq $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dkx[] d() {
      return this.n.d();
   }

   @Override
   public void a(dny.a $$0, long[] $$1) {
   }

   private dny.a c(dny.a $$0) {
      if ($$0 == dny.a.a) {
         return dny.a.b;
      } else {
         return $$0 == dny.a.c ? dny.a.d : $$0;
      }
   }

   @Override
   public dny a(dny.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dny.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ie<ctx> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public csf f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dyw a(dyo $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dyo $$0, dyw $$1) {
   }

   @Override
   public Map<dyo, dyw> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dyo, dyw> $$0) {
   }

   @Override
   public LongSet b(dyo $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dyo $$0, long $$1) {
   }

   @Override
   public Map<dyo, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dyo, LongSet> $$0) {
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
   public dkq j() {
      return this.n.j();
   }

   @Override
   public void d(hv $$0) {
   }

   @Override
   public void e(hv $$0) {
   }

   @Override
   public void a(sj $$0) {
   }

   @Nullable
   @Override
   public sj f(hv $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public sj g(hv $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<dip> $$0, BiConsumer<hv, dip> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public emq<cvz> o() {
      return this.o ? this.n.o() : emg.a();
   }

   @Override
   public emq<edy> p() {
      return this.o ? this.n.p() : emg.a();
   }

   @Override
   public dkl.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dpb t() {
      return this.n.t();
   }

   @Override
   public void a(dpb $$0) {
      this.n.a($$0);
   }

   @Override
   public dkk a(dnu.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dkk b(dnu.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dkw C() {
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
   public void a(cua $$0, cug.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public edj B() {
      return this.n.B();
   }
}
