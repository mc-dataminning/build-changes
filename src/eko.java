import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eko(egp.b c) implements ekr {
   public static final Codec<eko> a = RecordCodecBuilder.create($$0 -> $$0.group(egp.b.e.fieldOf("target").forGetter(eko::c)).apply($$0, eko::new));
   public static final Codec<eko> b = egp.b.e.xmap(eko::new, eko::c);

   public static ekr a(egp.b $$0) {
      return new eko($$0);
   }

   @Override
   public ekq a() {
      return eks.c;
   }

   @Nullable
   @Override
   public emp a(egp $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<eix<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
