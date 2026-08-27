import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record emk(aiy b) implements emi {
   public static final Codec<emk> a = RecordCodecBuilder.create($$0 -> $$0.group(aiy.a.fieldOf("source").forGetter(emk::c)).apply($$0, emk::new));

   @Override
   public emh a() {
      return emj.b;
   }

   @Nullable
   @Override
   public tt a(eiv $$0) {
      return $$0.d().o().aI().a(this.b);
   }

   @Override
   public Set<eld<?>> b() {
      return ImmutableSet.of();
   }

   public aiy c() {
      return this.b;
   }
}
