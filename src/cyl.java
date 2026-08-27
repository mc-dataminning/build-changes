import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cyl extends cvo implements cvi {
   public static final MapCodec<cyl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(agl.a(kd.au).fieldOf("feature").forGetter($$0x -> $$0x.e), kc.f.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, cyl::new)
   );
   protected static final eks b = cvf.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final cvf d;
   private final agl<dpn<?, ?>> e;

   @Override
   public MapCodec<cyl> a() {
      return a;
   }

   protected cyl(agl<dpn<?, ?>> $$0, cvf $$1, dhm.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.a(ark.aK) || $$0.a(cvh.fl) || $$0.a(cvh.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ig<dpn<?, ?>>> a(csi $$0) {
      return $$0.I_().d(kd.au).b(this.e);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      dhn $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      this.a($$0).ifPresent($$3x -> ((dpn)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2));
   }
}
