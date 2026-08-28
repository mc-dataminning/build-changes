import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eyj(etw.b c) implements eym {
   public static final MapCodec<eyj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(etw.b.e.fieldOf("target").forGetter(eyj::c)).apply($$0, eyj::new));
   public static final Codec<eyj> b = etw.b.e.xmap(eyj::new, eyj::c);

   public static eym a(etw.b $$0) {
      return new eyj($$0);
   }

   @Override
   public eyl a() {
      return eyn.c;
   }

   @Nullable
   @Override
   public fal a(etw $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<ewp<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
