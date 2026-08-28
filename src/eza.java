import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eza(eun.b c) implements ezd {
   public static final MapCodec<eza> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eun.b.e.fieldOf("target").forGetter(eza::c)).apply($$0, eza::new));
   public static final Codec<eza> b = eun.b.e.xmap(eza::new, eza::c);

   public static ezd a(eun.b $$0) {
      return new eza($$0);
   }

   @Override
   public ezc a() {
      return eze.c;
   }

   @Nullable
   @Override
   public fbc a(eun $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<exg<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
