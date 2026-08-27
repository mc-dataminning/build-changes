import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnp implements dnm {
   private final iw e;
   private final hx f;
   public static final Codec<dnp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.v(16).optionalFieldOf("offset", iw.g).forGetter($$0x -> $$0x.e), hx.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dnp::new)
   );

   public dnp(iw $$0, hx $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(csm $$0, ht $$1) {
      ht $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dnn<?> a() {
      return dnn.d;
   }
}
