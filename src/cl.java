import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cl(Optional<bf<cwp, cv>> c) implements ea<cyt> {
   public static final Codec<cl> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(cv.a).optionalFieldOf("items").forGetter(cl::b)).apply($$0, cl::new));

   @Override
   public ku<cyt> a() {
      return kv.P;
   }

   public boolean a(cwp $$0, cyt $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.c());
   }

   public Optional<bf<cwp, cv>> b() {
      return this.c;
   }
}
