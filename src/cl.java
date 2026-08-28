import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cl(Optional<bf<cwo, cv>> c) implements ea<cys> {
   public static final Codec<cl> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(cv.a).optionalFieldOf("items").forGetter(cl::b)).apply($$0, cl::new));

   @Override
   public ku<cys> a() {
      return kv.P;
   }

   public boolean a(cwo $$0, cys $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.c());
   }

   public Optional<bf<cwo, cv>> b() {
      return this.c;
   }
}
