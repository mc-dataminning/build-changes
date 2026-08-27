import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dvh extends dvs {
   private final dvi n;
   private final boolean o;

   public dvh(dvi $$0, boolean $$1) {
      super($$0.g(), dvv.a, $$0.l, $$0.G().I_().d(li.az), $$0.u());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dqc c_(ir $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dtc a_(ir $$0) {
      return this.n.a_($$0);
   }

   @Override
   public epe b_(ir $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int Q() {
      return this.n.Q();
   }

   @Override
   public dvj b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dtc a(ir $$0, dtc $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dqc $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(brv $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dvx $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dvj[] e() {
      return this.n.e();
   }

   @Override
   public void a(dyu.a $$0, long[] $$1) {
   }

   private dyu.a c(dyu.a $$0) {
      if ($$0 == dyu.a.a) {
         return dyu.a.b;
      } else {
         return $$0 == dyu.a.c ? dyu.a.d : $$0;
      }
   }

   @Override
   public dyu a(dyu.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dyu.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public ja<dcz> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dbh g() {
      return this.n.g();
   }

   @Nullable
   @Override
   public ekb a(ejt $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(ejt $$0, ekb $$1) {
   }

   @Override
   public Map<ejt, ekb> h() {
      return this.n.h();
   }

   @Override
   public void a(Map<ejt, ekb> $$0) {
   }

   @Override
   public LongSet b(ejt $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(ejt $$0, long $$1) {
   }

   @Override
   public Map<ejt, LongSet> i() {
      return this.n.i();
   }

   @Override
   public void b(Map<ejt, LongSet> $$0) {
   }

   @Override
   public void a(boolean $$0) {
      this.n.a($$0);
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public dvx k() {
      return this.n.k();
   }

   @Override
   public void d(ir $$0) {
   }

   @Override
   public void e(ir $$0) {
   }

   @Override
   public void a(uk $$0) {
   }

   @Nullable
   @Override
   public uk f(ir $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public uk a(ir $$0, jc.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<dtc> $$0, BiConsumer<ir, dtc> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public eyo<dfc> p() {
      return this.o ? this.n.p() : eye.a();
   }

   @Override
   public eyo<epd> q() {
      return this.o ? this.n.q() : eye.a();
   }

   @Override
   public duy.a r() {
      return this.n.r();
   }

   @Nullable
   @Override
   public dzx u() {
      return this.n.u();
   }

   @Override
   public void a(dzx $$0) {
      this.n.a($$0);
   }

   @Override
   public dux a(dyq.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dux b(dyq.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dvi D() {
      return this.n;
   }

   @Override
   public boolean w() {
      return this.n.w();
   }

   @Override
   public void b(boolean $$0) {
      this.n.b($$0);
   }

   @Override
   public void a(ddc $$0, ddi.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void B() {
      this.n.B();
   }

   @Override
   public eoo C() {
      return this.n.C();
   }
}
