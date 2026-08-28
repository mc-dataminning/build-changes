import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlu extends dmn {
   public static final MapCodec<dlu> a = b(dlu::new);
   public static final int b = 3;
   public static final dwu c = dwl.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   public dlu(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      $$1.a($$2, this, azm.a($$1.G_(), 60, 120));
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.g() && this.f($$0, $$1, $$2)) {
         jh.a $$4 = new jh.a();

         for (jm $$5 : jm.values()) {
            $$4.a($$2, $$5);
            dvv $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.f($$6, $$1, $$4)) {
               $$1.a($$4, this, azm.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, azm.a($$3, 20, 40));
      }
   }

   private boolean f(dvv $$0, dfm $$1, jh $$2) {
      int $$3 = $$0.c(c);
      if ($$3 < 3) {
         $$1.a($$2, $$0.b(c, Integer.valueOf($$3 + 1)), 2);
         return false;
      } else {
         this.e($$0, $$1, $$2);
         return true;
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      if ($$3.m().a(this) && this.a($$1, $$2, 2)) {
         this.e($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(der $$0, jh $$1, int $$2) {
      int $$3 = 0;
      jh.a $$4 = new jh.a();

      for (jm $$5 : jm.values()) {
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
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c);
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return cwm.k;
   }
}
