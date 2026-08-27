import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record esg(akh b) implements ese {
   public static final Codec<esg> a = RecordCodecBuilder.create($$0 -> $$0.group(akh.a.fieldOf("source").forGetter(esg::c)).apply($$0, esg::new));

   @Override
   public esd a() {
      return esf.b;
   }

   @Nullable
   @Override
   public ux a(eol $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<eqz<?>> b() {
      return ImmutableSet.of();
   }

   public akh c() {
      return this.b;
   }
}
