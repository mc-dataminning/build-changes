import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dbu extends cyx implements cyr {
   public static final MapCodec<dbu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aix.a(kg.aw).fieldOf("feature").forGetter($$0x -> $$0x.e), kf.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dbu::new)
   );
   protected static final eol b = cyo.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final cyo d;
   private final aix<dtf<?, ?>> e;

   @Override
   public MapCodec<dbu> a() {
      return a;
   }

   protected dbu(aix<dtf<?, ?>> $$0, cyo $$1, dle.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }

   @Override
   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      return $$0.a(atz.aK) || $$0.a(cyq.fl) || $$0.a(cyq.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ij<dtf<?, ?>>> a(cvq $$0) {
      return $$0.I_().d(kg.aw).b(this.e);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      dlf $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      this.a($$0).ifPresent($$3x -> ((dtf)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
