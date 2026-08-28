import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cl(Optional<bf<cwn, cv>> c) implements ea<cyr> {
   public static final Codec<cl> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(cv.a).optionalFieldOf("items").forGetter(cl::b)).apply($$0, cl::new));

   @Override
   public ku<cyr> a() {
      return kv.P;
   }

   public boolean a(cwn $$0, cyr $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.c());
   }

   public Optional<bf<cwn, cv>> b() {
      return this.c;
   }
}
