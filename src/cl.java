import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cl(Optional<bf<cwq, cv>> c) implements ea<cyu> {
   public static final Codec<cl> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(cv.a).optionalFieldOf("items").forGetter(cl::b)).apply($$0, cl::new));

   @Override
   public ku<cyu> a() {
      return kv.P;
   }

   public boolean a(cwq $$0, cyu $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.c());
   }

   public Optional<bf<cwq, cv>> b() {
      return this.c;
   }
}
