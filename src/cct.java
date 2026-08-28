import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cct extends ccw {
   private final bwa a;
   private final Predicate<bwa> b;
   @Nullable
   private bwa c;
   private final double d;
   private final cfk e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public cct(bwa $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.O();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(ccw.a.a, ccw.a.b));
      if (!($$0.O() instanceof cfj) && !($$0.O() instanceof cfi)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean b() {
      List<bwa> $$0 = this.a.dU().a(bwa.class, this.a.cQ().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for (bwa $$1 : $$0) {
            if (!$$1.co()) {
               this.c = $$1;
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean c() {
      return this.c != null && !this.e.k() && this.a.g(this.c) > (double)(this.g * this.g);
   }

   @Override
   public void d() {
      this.f = 0;
      this.h = this.a.a(eun.j);
      this.a.a(eun.j, 0.0F);
   }

   @Override
   public void e() {
      this.c = null;
      this.e.m();
      this.a.a(eun.j, this.h);
   }

   @Override
   public void a() {
      if (this.c != null && !this.a.O_()) {
         this.a.J().a(this.c, 10.0F, (float)this.a.ac());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.dz() - this.c.dz();
            double $$1 = this.a.dB() - this.c.dB();
            double $$2 = this.a.dF() - this.c.dF();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.m();
               cby $$4 = this.c.J();
               if ($$3 <= (double)this.g || $$4.e() == this.a.dz() && $$4.f() == this.a.dB() && $$4.g() == this.a.dF()) {
                  double $$5 = this.c.dz() - this.a.dz();
                  double $$6 = this.c.dF() - this.a.dF();
                  this.e.a(this.a.dz() - $$5, this.a.dB(), this.a.dF() - $$6, this.d);
               }
            }
         }
      }
   }
}
