import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record emz(emw b, emw c) implements emw {
   public static final Codec<emz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emx.a.fieldOf("min").forGetter(emz::c), emx.a.fieldOf("max").forGetter(emz::d)).apply($$0, emz::new)
   );

   @Override
   public emv b() {
      return emx.c;
   }

   public static emz a(float $$0, float $$1) {
      return new emz(emu.a($$0), emu.a($$1));
   }

   @Override
   public int a(ejc $$0) {
      return awi.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ejc $$0) {
      return awi.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<elk<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public emw c() {
      return this.b;
   }

   public emw d() {
      return this.c;
   }
}
