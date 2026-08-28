import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cl(Optional<bf<cxh, cv>> c) implements ea<czj> {
   public static final Codec<cl> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(cv.a).optionalFieldOf("items").forGetter(cl::b)).apply($$0, cl::new));

   @Override
   public ku<czj> a() {
      return kv.Q;
   }

   public boolean a(cxh $$0, czj $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.c());
   }

   public Optional<bf<cxh, cv>> b() {
      return this.c;
   }
}
