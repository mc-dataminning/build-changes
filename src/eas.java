import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class eas extends ebd {
   private final eat n;
   private final boolean o;

   public eas(eat $$0, boolean $$1) {
      super($$0.f(), ebg.a, $$0.l, $$0.H().F_().f(me.aM), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dvl c_(jj $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dym a_(jj $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eut b_(jj $$0) {
      return this.n.b_($$0);
   }

   @Override
   public eau b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dym a(jj $$0, dym $$1, int $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dvl $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bvs $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(ebk $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public eau[] d() {
      return this.n.d();
   }

   @Override
   public void a(eel.a $$0, long[] $$1) {
   }

   private eel.a c(eel.a $$0) {
      if ($$0 == eel.a.a) {
         return eel.a.b;
      } else {
         return $$0 == eel.a.c ? eel.a.d : $$0;
      }
   }

   @Override
   public eel a(eel.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(eel.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public js<dis> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dgw f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public epo a(epg $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(epg $$0, epo $$1) {
   }

   @Override
   public Map<epg, epo> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<epg, epo> $$0) {
   }

   @Override
   public LongSet b(epg $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(epg $$0, long $$1) {
   }

   @Override
   public Map<epg, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<epg, LongSet> $$0) {
   }

   @Override
   public void i() {
      this.n.i();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public ebk n() {
      return this.n.n();
   }

   @Override
   public void d(jj $$0) {
   }

   @Override
   public void e(jj $$0) {
   }

   @Override
   public void a(tw $$0) {
   }

   @Nullable
   @Override
   public tw f(jj $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public tw a(jj $$0, ju.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dym> $$0, BiConsumer<jj, dym> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fep<dku> q() {
      return this.o ? this.n.q() : fef.a();
   }

   @Override
   public fep<eus> r() {
      return this.o ? this.n.r() : fef.a();
   }

   @Override
   public eaj.a a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public efo v() {
      return this.n.v();
   }

   @Override
   public eai E() {
      if (this.o) {
         return super.E();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public eai F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public eat G() {
      return this.n;
   }

   @Override
   public boolean x() {
      return this.n.x();
   }

   @Override
   public void a(boolean $$0) {
      this.n.a($$0);
   }

   @Override
   public void a(div $$0, djb.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public eud D() {
      return this.n.D();
   }
}
