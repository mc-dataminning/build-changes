import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cy(Optional<jv<dey>> c, Optional<jv<dfa>> d) implements ea<dex> {
   public static final Codec<cy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kg.a(mc.aZ).optionalFieldOf("material").forGetter(cy::b), kg.a(mc.ba).optionalFieldOf("pattern").forGetter(cy::c)).apply($$0, cy::new)
   );

   @Override
   public ku<dex> a() {
      return kv.U;
   }

   public boolean a(cwq $$0, dex $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.a()) ? false : !this.d.isPresent() || this.d.get().a($$1.b());
   }

   public Optional<jv<dey>> b() {
      return this.c;
   }

   public Optional<jv<dfa>> c() {
      return this.d;
   }
}
