import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eku(ahh b) implements eks {
   public static final Codec<eku> a = RecordCodecBuilder.create($$0 -> $$0.group(ahh.a.fieldOf("source").forGetter(eku::c)).apply($$0, eku::new));

   @Override
   public ekr a() {
      return ekt.b;
   }

   @Nullable
   @Override
   public tl a(ehf $$0) {
      return $$0.d().o().aI().a(this.b);
   }

   @Override
   public Set<ejn<?>> b() {
      return ImmutableSet.of();
   }

   public ahh c() {
      return this.b;
   }
}
