import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fau(ewh.b c) implements fax {
   public static final MapCodec<fau> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ewh.b.e.fieldOf("target").forGetter(fau::c)).apply($$0, fau::new));
   public static final Codec<fau> b = ewh.b.e.xmap(fau::new, fau::c);

   public static fax a(ewh.b $$0) {
      return new fau($$0);
   }

   @Override
   public faw a() {
      return fay.c;
   }

   @Nullable
   @Override
   public fcw a(ewh $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<eza<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
