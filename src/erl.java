import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record erl(enk.b c) implements ero {
   public static final Codec<erl> a = RecordCodecBuilder.create($$0 -> $$0.group(enk.b.e.fieldOf("target").forGetter(erl::c)).apply($$0, erl::new));
   public static final Codec<erl> b = enk.b.e.xmap(erl::new, erl::c);

   public static ero a(enk.b $$0) {
      return new erl($$0);
   }

   @Override
   public ern a() {
      return erp.c;
   }

   @Nullable
   @Override
   public etm a(enk $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<epu<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
