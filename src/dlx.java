import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlx implements dlu {
   private final ib e;
   private final hc f;
   public static final Codec<dlx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ib.v(16).optionalFieldOf("offset", ib.g).forGetter($$0x -> $$0x.e), hc.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dlx::new)
   );

   public dlx(ib $$0, hc $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cqk $$0, gw $$1) {
      gw $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dlv<?> a() {
      return dlv.d;
   }
}
