import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class czp extends cws implements cwm {
   public static final MapCodec<czp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ahc.a(ke.aw).fieldOf("feature").forGetter($$0x -> $$0x.e), kd.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, czp::new)
   );
   protected static final emf b = cwj.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final cwj d;
   private final ahc<dra<?, ?>> e;

   @Override
   public MapCodec<czp> a() {
      return a;
   }

   protected czp(ahc<dra<?, ?>> $$0, cwj $$1, diz.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return $$0.a(asb.aK) || $$0.a(cwl.fl) || $$0.a(cwl.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ih<dra<?, ?>>> a(ctl $$0) {
      return $$0.I_().d(ke.aw).b(this.e);
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      dja $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      this.a($$0).ifPresent($$3x -> ((dra)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
