import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmh implements dlu {
   public static final Codec<dmh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ib.v(16).optionalFieldOf("offset", ib.g).forGetter($$0x -> $$0x.e), dfe.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dmh::new)
   );
   private final ib e;
   private final dfe f;

   protected dmh(ib $$0, dfe $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cqk $$0, gw $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dlv<?> a() {
      return dlv.g;
   }
}
