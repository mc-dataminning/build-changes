import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evz(String b) implements ewb {
   public static final MapCodec<evz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(evz::c)).apply($$0, evz::new));

   public static ewb a(String $$0) {
      return new evz($$0);
   }

   @Override
   public ewa a() {
      return ewc.b;
   }

   @Override
   public exz a(erl $$0) {
      return exz.c(this.b);
   }

   @Override
   public Set<eue<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
