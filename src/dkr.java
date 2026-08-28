import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkr extends dlk {
   public static final MapCodec<dkr> a = b(dkr::new);
   public static final int b = 3;
   public static final dvs c = dvi.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   public dkr(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      $$1.a($$2, this, azf.a($$1.D_(), 60, 120));
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.g() && this.e($$0, $$1, $$2)) {
         jf.a $$4 = new jf.a();

         for (jk $$5 : jk.values()) {
            $$4.a($$2, $$5);
            dus $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, azf.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, azf.a($$3, 20, 40));
      }
   }

   private boolean e(dus $$0, dej $$1, jf $$2) {
      int $$3 = $$0.c(c);
      if ($$3 < 3) {
         $$1.a($$2, $$0.b(c, Integer.valueOf($$3 + 1)), 2);
         return false;
      } else {
         this.d($$0, $$1, $$2);
         return true;
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if ($$3.n().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(ddo $$0, jf $$1, int $$2) {
      int $$3 = 0;
      jf.a $$4 = new jf.a();

      for (jk $$5 : jk.values()) {
         $$4.a($$1, $$5);
         if ($$0.a_($$4).a(this)) {
            if (++$$3 >= $$2) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c);
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return cvs.k;
   }
}
