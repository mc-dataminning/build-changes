import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record evy(erl.b c) implements ewb {
   public static final MapCodec<evy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(erl.b.e.fieldOf("target").forGetter(evy::c)).apply($$0, evy::new));
   public static final Codec<evy> b = erl.b.e.xmap(evy::new, evy::c);

   public static ewb a(erl.b $$0) {
      return new evy($$0);
   }

   @Override
   public ewa a() {
      return ewc.c;
   }

   @Nullable
   @Override
   public exz a(erl $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<eue<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
