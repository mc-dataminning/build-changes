import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class doc extends dle implements dkx {
   public static final MapCodec<doc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alc.a(me.aP).fieldOf("feature").forGetter($$0x -> $$0x.e), md.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, doc::new)
   );
   private static final double b = 0.4;
   private static final fdo c = dku.b(8.0, 0.0, 9.0);
   private final dku d;
   private final alc<ehd<?, ?>> e;

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   protected doc(alc<ehd<?, ?>> $$0, dku $$1, dyl.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c;
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return $$0.a(awz.aO) || $$0.a(dkw.fA) || $$0.a(dkw.ek) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends js<ehd<?, ?>>> a(dhs $$0) {
      return $$0.F_().f(me.aP).a(this.e);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      dym $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      this.a($$0).ifPresent($$3x -> ((ehd)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
