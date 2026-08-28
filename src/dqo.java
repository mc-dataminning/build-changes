import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dqo extends dwq implements dnh {
   public static final MapCodec<dqo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alj.a(mi.aL).fieldOf("feature").forGetter($$0x -> $$0x.e), mh.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dqo::new)
   );
   private static final double b = 0.4;
   private static final fgm c = dne.b(8.0, 0.0, 9.0);
   private final dne d;
   private final alj<ejx<?, ?>> e;

   @Override
   public MapCodec<dqo> a() {
      return a;
   }

   protected dqo(alj<ejx<?, ?>> $$0, dne $$1, ebf.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c;
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return $$0.a(axg.aO) || $$0.a(dng.fE) || $$0.a(dng.eo) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jg<ejx<?, ?>>> a(dkc $$0) {
      return $$0.J_().f(mi.aL).a(this.e);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      ebg $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      this.a($$0).ifPresent($$3x -> ((ejx)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
