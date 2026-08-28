import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dlj extends din implements dih {
   public static final MapCodec<dlj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alh.a(lz.aJ).fieldOf("feature").forGetter($$0x -> $$0x.e), ly.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dlj::new)
   );
   protected static final fah b = die.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final die d;
   private final alh<edx<?, ?>> e;

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   protected dlj(alh<edx<?, ?>> $$0, die $$1, dvi.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }

   @Override
   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      return $$0.a(axa.aM) || $$0.a(dig.fl) || $$0.a(dig.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jq<edx<?, ?>>> a(dfe $$0) {
      return $$0.H_().e(lz.aJ).a(this.e);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      dvj $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      this.a($$0).ifPresent($$3x -> ((edx)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
