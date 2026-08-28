import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djv extends dho {
   public static final MapCodec<djv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djt.a.forGetter($$0x -> $$0x.e), t()).apply($$0, djv::new));
   private final die e;
   protected static final float b = 6.0F;
   protected static final fah c = die.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   protected djv(die $$0, dvi.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      this.a($$0, (dfc)$$1, $$2);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.e.m().b(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$1 == jm.a && !$$0.a($$3, $$4)) {
         return dig.a.m();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, erl.c, erl.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return c;
   }
}
