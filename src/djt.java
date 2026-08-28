import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djt extends die {
   public static final MapCodec<die> a = ly.e.q().fieldOf("dead");
   public static final MapCodec<djt> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, djt::new));
   private final die c;

   public djt(die $$0, dvi.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<djt> a() {
      return b;
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(deg $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         erk $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(axg.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.m();
   }
}
