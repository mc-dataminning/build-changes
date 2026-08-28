import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dko extends dlh {
   public static final MapCodec<dko> a = b(dko::new);
   public static final int b = 3;
   public static final dvo c = dve.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   public dko(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      $$1.a($$2, this, azd.a($$1.C_(), 60, 120));
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.g() && this.e($$0, $$1, $$2)) {
         je.a $$4 = new je.a();

         for (jj $$5 : jj.values()) {
            $$4.a($$2, $$5);
            duo $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, azd.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, azd.a($$3, 20, 40));
      }
   }

   private boolean e(duo $$0, deg $$1, je $$2) {
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
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if ($$3.o().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(ddl $$0, je $$1, int $$2) {
      int $$3 = 0;
      je.a $$4 = new je.a();

      for (jj $$5 : jj.values()) {
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
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c);
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return cvp.k;
   }
}
