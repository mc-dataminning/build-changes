import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ch(Optional<bc<cur, cp>> c) implements ds<cxn> {
   public static final Codec<ch> a = RecordCodecBuilder.create($$0 -> $$0.group(bc.a(cp.a).optionalFieldOf("items").forGetter(ch::b)).apply($$0, ch::new));

   @Override
   public kl<cxn> a() {
      return km.aa;
   }

   public boolean a(cur $$0, cxn $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.d());
   }

   public Optional<bc<cur, cp>> b() {
      return this.c;
   }
}
