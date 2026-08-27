import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmd implements dlq {
   public static final Codec<dmd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hz.v(16).optionalFieldOf("offset", hz.g).forGetter($$0x -> $$0x.e), dfa.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dmd::new)
   );
   private final hz e;
   private final dfa f;

   protected dmd(hz $$0, dfa $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cqg $$0, gu $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dlr<?> a() {
      return dlr.g;
   }
}
