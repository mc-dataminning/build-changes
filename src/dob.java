import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dob extends dov {
   public static final MapCodec<dob> a = b(dob::new);
   public static final int b = 3;
   public static final dzm c = dzc.av;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dob> a() {
      return a;
   }

   public dob(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      $$1.a($$2, this, azk.a($$1.C_(), 60, 120));
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.g() && this.f($$0, $$1, $$2)) {
         jj.a $$4 = new jj.a();

         for (jo $$5 : jo.values()) {
            $$4.a($$2, $$5);
            dym $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.f($$6, $$1, $$4)) {
               $$1.a($$4, this, azk.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, azk.a($$3, 20, 40));
      }
   }

   private boolean f(dym $$0, dhp $$1, jj $$2) {
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
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if ($$3.m().a(this) && this.a($$1, $$2, 2)) {
         this.e($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dgv $$0, jj $$1, int $$2) {
      int $$3 = 0;
      jj.a $$4 = new jj.a();

      for (jo $$5 : jo.values()) {
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
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c);
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return cxy.k;
   }
}
