import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ehh(edi.b c) implements ehk {
   public static final Codec<ehh> a = RecordCodecBuilder.create($$0 -> $$0.group(edi.b.e.fieldOf("target").forGetter(ehh::c)).apply($$0, ehh::new));
   public static final Codec<ehh> b = edi.b.e.xmap(ehh::new, ehh::c);

   public static ehk a(edi.b $$0) {
      return new ehh($$0);
   }

   @Override
   public ehj a() {
      return ehl.c;
   }

   @Nullable
   @Override
   public String a(edi $$0) {
      bjt $$1 = $$0.c(this.c.a());
      return $$1 != null ? $$1.cx() : null;
   }

   @Override
   public Set<efq<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
