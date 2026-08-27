import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record erc(enb.b c) implements erf {
   public static final Codec<erc> a = RecordCodecBuilder.create($$0 -> $$0.group(enb.b.e.fieldOf("target").forGetter(erc::c)).apply($$0, erc::new));
   public static final Codec<erc> b = enb.b.e.xmap(erc::new, erc::c);

   public static erf a(enb.b $$0) {
      return new erc($$0);
   }

   @Override
   public ere a() {
      return erg.c;
   }

   @Nullable
   @Override
   public etd a(enb $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<epl<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
