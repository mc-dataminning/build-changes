import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record esr(eol.b c) implements esu {
   public static final Codec<esr> a = RecordCodecBuilder.create($$0 -> $$0.group(eol.b.e.fieldOf("target").forGetter(esr::c)).apply($$0, esr::new));
   public static final Codec<esr> b = eol.b.e.xmap(esr::new, esr::c);

   public static esu a(eol.b $$0) {
      return new esr($$0);
   }

   @Override
   public est a() {
      return esv.c;
   }

   @Nullable
   @Override
   public eus a(eol $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<eqz<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
