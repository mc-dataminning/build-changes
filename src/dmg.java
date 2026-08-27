import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmg implements dlt {
   public static final Codec<dmg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hy.v(16).optionalFieldOf("offset", hy.g).forGetter($$0x -> $$0x.e), dfd.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dmg::new)
   );
   private final hy e;
   private final dfd f;

   protected dmg(hy $$0, dfd $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cqv $$0, gw $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dlu<?> a() {
      return dlu.g;
   }
}
