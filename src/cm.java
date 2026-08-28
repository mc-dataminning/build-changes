import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cm(Optional<bf<cwq, cv>> c) implements ea<czi> {
   public static final Codec<cm> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(cv.a).optionalFieldOf("items").forGetter(cm::b)).apply($$0, cm::new));

   @Override
   public ku<czi> a() {
      return kv.al;
   }

   public boolean a(cwq $$0, czi $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.d());
   }

   public Optional<bf<cwq, cv>> b() {
      return this.c;
   }
}
