import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record emu(eiv.b c) implements emx {
   public static final Codec<emu> a = RecordCodecBuilder.create($$0 -> $$0.group(eiv.b.e.fieldOf("target").forGetter(emu::c)).apply($$0, emu::new));
   public static final Codec<emu> b = eiv.b.e.xmap(emu::new, emu::c);

   public static emx a(eiv.b $$0) {
      return new emu($$0);
   }

   @Override
   public emw a() {
      return emy.c;
   }

   @Nullable
   @Override
   public eov a(eiv $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<eld<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
