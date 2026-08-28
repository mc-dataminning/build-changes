import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpb extends dpv {
   public static final MapCodec<dpb> a = b(dpb::new);
   public static final int b = 3;
   public static final eao c = eae.av;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dpb> a() {
      return a;
   }

   public dpb(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      $$1.a($$2, this, azk.a($$1.C_(), 60, 120));
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.B($$2) > 11 - $$0.c(c) - $$0.g() && this.e($$0, $$1, $$2)) {
         iu.a $$4 = new iu.a();

         for (ja $$5 : ja.values()) {
            $$4.a($$2, $$5);
            dzo $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, azk.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, azk.a($$3, 20, 40));
      }
   }

   private boolean e(dzo $$0, dip $$1, iu $$2) {
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
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if ($$3.m().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dhv $$0, iu $$1, int $$2) {
      int $$3 = 0;
      iu.a $$4 = new iu.a();

      for (ja $$5 : ja.values()) {
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
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c);
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return cys.k;
   }
}
