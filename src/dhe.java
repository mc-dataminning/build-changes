import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhe extends dkz {
   public static final MapCodec<dhe> a = b(dhe::new);
   public static final dwd b = dlz.aF;
   private static final fah c = die.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final fah d = die.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final fah e = die.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final fah f = die.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final fah g = die.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final fah h = die.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final fah i = die.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final fah j = fae.a(c, d, e, f);
   private static final fah k = fae.a(c, g, h, i);
   private static final xi l = xi.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dhe> a() {
      return a;
   }

   public dhe(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awv.aC);
      }

      return bsd.a;
   }

   @Nullable
   @Override
   protected bsf b(dvj $$0, dfb $$1, jh $$2) {
      return new bsl(($$2x, $$3, $$4) -> new crr($$2x, $$3, csb.a($$1, $$2)), l);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      jm $$4 = $$0.c(b);
      return $$4.o() == jm.a.a ? j : k;
   }

   @Override
   protected void a(cku $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, dvj $$3, cku $$4) {
      if (!$$4.bc()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dfb $$0, jh $$1, cku $$2) {
      if (!$$2.bc()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bsu a(bue $$0) {
      return $$0.dY().b($$0);
   }

   @Nullable
   public static dvj e(dvj $$0) {
      if ($$0.a(dig.gS)) {
         return dig.gT.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dig.gT) ? dig.gU.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   @Override
   public int b(dvj $$0, deg $$1, jh $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
