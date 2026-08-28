import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djw extends dhp {
   public static final MapCodec<djw> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djt.a.forGetter($$0x -> $$0x.f), t()).apply($$0, djw::new));
   private final die f;

   @Override
   public MapCodec<djw> a() {
      return e;
   }

   protected djw(die $$0, dvi.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      this.a($$0, (dfc)$$1, $$2);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(d, Boolean.valueOf(false)).b(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dig.a.m();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, erl.c, erl.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
