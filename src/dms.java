import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dms extends djv implements djo {
   public static final MapCodec<dms> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a(mc.aL).fieldOf("feature").forGetter($$0x -> $$0x.e), mb.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dms::new)
   );
   protected static final fbt b = djl.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final djl d;
   private final aku<efj<?, ?>> e;

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   protected dms(aku<efj<?, ?>> $$0, djl $$1, dwv.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b;
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return $$0.a(awp.aO) || $$0.a(djn.fA) || $$0.a(djn.ek) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jr<efj<?, ?>>> a(dgk $$0) {
      return $$0.K_().e(mc.aL).a(this.e);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      dww $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      this.a($$0).ifPresent($$3x -> ((efj)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
