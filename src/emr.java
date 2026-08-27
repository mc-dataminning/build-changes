import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record emr(aiy b) implements emp {
   public static final Codec<emr> a = RecordCodecBuilder.create($$0 -> $$0.group(aiy.a.fieldOf("source").forGetter(emr::c)).apply($$0, emr::new));

   @Override
   public emo a() {
      return emq.b;
   }

   @Nullable
   @Override
   public tt a(ejc $$0) {
      return $$0.d().o().aK().a(this.b);
   }

   @Override
   public Set<elk<?>> b() {
      return ImmutableSet.of();
   }

   public aiy c() {
      return this.b;
   }
}
