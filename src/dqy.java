import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dqy extends dxa implements dnr {
   public static final MapCodec<dqy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alq.a(mi.aL).fieldOf("feature").forGetter($$0x -> $$0x.e), mh.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dqy::new)
   );
   private static final double b = 0.4;
   private static final fgw c = dno.b(8.0, 0.0, 9.0);
   private final dno d;
   private final alq<ekh<?, ?>> e;

   @Override
   public MapCodec<dqy> a() {
      return a;
   }

   protected dqy(alq<ekh<?, ?>> $$0, dno $$1, ebp.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c;
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return $$0.a(axn.aO) || $$0.a(dnq.fE) || $$0.a(dnq.eo) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jg<ekh<?, ?>>> a(dkm $$0) {
      return $$0.J_().f(mi.aL).a(this.e);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      ebq $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      this.a($$0).ifPresent($$3x -> ((ekh)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
