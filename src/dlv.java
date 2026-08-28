import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dlv extends diz implements dit {
   public static final MapCodec<dlv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.a(ma.aJ).fieldOf("feature").forGetter($$0x -> $$0x.e), lz.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dlv::new)
   );
   protected static final fas b = diq.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final diq d;
   private final ali<eei<?, ?>> e;

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   protected dlv(ali<eei<?, ?>> $$0, diq $$1, dvu.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return $$0.a(axc.aN) || $$0.a(dis.fl) || $$0.a(dis.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jq<eei<?, ?>>> a(dfp $$0) {
      return $$0.J_().e(ma.aJ).a(this.e);
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      dvv $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      this.a($$0).ifPresent($$3x -> ((eei)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
