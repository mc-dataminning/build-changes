import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dks extends dhv implements dhp {
   public static final MapCodec<dks> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(lw.aK).fieldOf("feature").forGetter($$0x -> $$0x.e), lv.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dks::new)
   );
   protected static final ezq b = dhm.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dhm d;
   private final ald<edg<?, ?>> e;

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   protected dks(ald<edg<?, ?>> $$0, dhm $$1, dur.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.a(awv.aM) || $$0.a(dho.fl) || $$0.a(dho.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jo<edg<?, ?>>> a(dem $$0) {
      return $$0.G_().e(lw.aK).a(this.e);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      dus $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      this.a($$0).ifPresent($$3x -> ((edg)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
