import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqx extends drr {
   public static final MapCodec<dqx> a = b(dqx::new);
   public static final int b = 3;
   public static final ecq c = ecg.av;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dqx> a() {
      return a;
   }

   public dqx(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      $$1.a($$2, this, azz.a($$1.G_(), 60, 120));
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.B($$2) > 11 - $$0.c(c) - $$0.g() && this.e($$0, $$1, $$2)) {
         iw.a $$4 = new iw.a();

         for (jc $$5 : jc.values()) {
            $$4.a($$2, $$5);
            ebq $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, azz.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, azz.a($$3, 20, 40));
      }
   }

   private boolean e(ebq $$0, dkj $$1, iw $$2) {
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
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if ($$3.m().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(djn $$0, iw $$1, int $$2) {
      int $$3 = 0;
      iw.a $$4 = new iw.a();

      for (jc $$5 : jc.values()) {
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
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c);
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return dak.l;
   }
}
