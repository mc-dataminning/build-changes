import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dia extends dfd implements dex {
   public static final MapCodec<dia> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ala.a(lq.aC).fieldOf("feature").forGetter($$0x -> $$0x.e), lp.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dia::new)
   );
   protected static final ewf b = deu.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final deu d;
   private final ala<eag<?, ?>> e;

   @Override
   public MapCodec<dia> a() {
      return a;
   }

   protected dia(ala<eag<?, ?>> $$0, deu $$1, drw.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return $$0.a(awl.aL) || $$0.a(dew.fl) || $$0.a(dew.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ji<eag<?, ?>>> a(dbw $$0) {
      return $$0.H_().d(lq.aC).b(this.e);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      drx $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      this.a($$0).ifPresent($$3x -> ((eag)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
