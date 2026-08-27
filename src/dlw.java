import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlw implements dlt {
   private final hy e;
   private final ha f;
   public static final Codec<dlw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hy.v(16).optionalFieldOf("offset", hy.g).forGetter($$0x -> $$0x.e), ha.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dlw::new)
   );

   public dlw(hy $$0, ha $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cqv $$0, gw $$1) {
      gw $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dlu<?> a() {
      return dlu.d;
   }
}
