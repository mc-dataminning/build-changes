import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dkb extends dhe implements dgy {
   public static final MapCodec<dkb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ala.a(lv.aI).fieldOf("feature").forGetter($$0x -> $$0x.e), lu.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dkb::new)
   );
   protected static final eyx b = dgv.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dgv d;
   private final ala<eco<?, ?>> e;

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   protected dkb(ala<eco<?, ?>> $$0, dgv $$1, dtz.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }

   @Override
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return $$0.a(aws.aM) || $$0.a(dgx.fl) || $$0.a(dgx.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jn<eco<?, ?>>> a(ddv $$0) {
      return $$0.F_().d(lv.aI).b(this.e);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      dua $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      this.a($$0).ifPresent($$3x -> ((eco)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
