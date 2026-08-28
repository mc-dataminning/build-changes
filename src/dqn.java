import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqn extends drh {
   public static final MapCodec<dqn> a = b(dqn::new);
   public static final int b = 3;
   public static final ecg c = ebw.av;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dqn> a() {
      return a;
   }

   public dqn(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      $$1.a($$2, this, azq.a($$1.G_(), 60, 120));
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.B($$2) > 11 - $$0.c(c) - $$0.g() && this.e($$0, $$1, $$2)) {
         iw.a $$4 = new iw.a();

         for (jc $$5 : jc.values()) {
            $$4.a($$2, $$5);
            ebg $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, azq.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, azq.a($$3, 20, 40));
      }
   }

   private boolean e(ebg $$0, djz $$1, iw $$2) {
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
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if ($$3.m().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(djd $$0, iw $$1, int $$2) {
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
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c);
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return daa.k;
   }
}
