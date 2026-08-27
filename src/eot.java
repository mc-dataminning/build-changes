import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eot(eku.b c) implements eow {
   public static final Codec<eot> a = RecordCodecBuilder.create($$0 -> $$0.group(eku.b.e.fieldOf("target").forGetter(eot::c)).apply($$0, eot::new));
   public static final Codec<eot> b = eku.b.e.xmap(eot::new, eot::c);

   public static eow a(eku.b $$0) {
      return new eot($$0);
   }

   @Override
   public eov a() {
      return eox.c;
   }

   @Nullable
   @Override
   public equ a(eku $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<enc<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
