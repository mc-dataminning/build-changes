import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqb extends die {
   public static final MapCodec<dqb> a = b(dqb::new);
   private static final xi d = xi.c("container.stonecutter");
   public static final dwd b = dlz.aF;
   protected static final fah c = die.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   public dqb(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awv.ay);
      }

      return bsd.a;
   }

   @Nullable
   @Override
   protected bsf b(dvj $$0, dfb $$1, jh $$2) {
      return new bsl(($$2x, $$3, $$4) -> new ctr($$2x, $$3, csb.a($$1, $$2)), d);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return c;
   }

   @Override
   protected boolean g_(dvj $$0) {
      return true;
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
