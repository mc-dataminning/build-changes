import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dql extends drf {
   public static final MapCodec<dql> a = b(dql::new);
   public static final int b = 3;
   public static final ece c = ebu.av;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dql> a() {
      return a;
   }

   public dql(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      $$1.a($$2, this, azo.a($$1.G_(), 60, 120));
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.B($$2) > 11 - $$0.c(c) - $$0.g() && this.e($$0, $$1, $$2)) {
         iv.a $$4 = new iv.a();

         for (jb $$5 : jb.values()) {
            $$4.a($$2, $$5);
            ebe $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, azo.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, azo.a($$3, 20, 40));
      }
   }

   private boolean e(ebe $$0, djx $$1, iv $$2) {
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
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if ($$3.m().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(djb $$0, iv $$1, int $$2) {
      int $$3 = 0;
      iv.a $$4 = new iv.a();

      for (jb $$5 : jb.values()) {
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
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c);
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return czy.k;
   }
}
