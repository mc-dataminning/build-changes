import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dme implements dmb {
   private final ib e;
   private final hc f;
   public static final Codec<dme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ib.v(16).optionalFieldOf("offset", ib.g).forGetter($$0x -> $$0x.e), hc.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dme::new)
   );

   public dme(ib $$0, hc $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cqr $$0, gw $$1) {
      gw $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dmc<?> a() {
      return dmc.d;
   }
}
