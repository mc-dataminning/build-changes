import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ekk(ahg b) implements eki {
   public static final Codec<ekk> a = RecordCodecBuilder.create($$0 -> $$0.group(ahg.a.fieldOf("source").forGetter(ekk::c)).apply($$0, ekk::new));

   @Override
   public ekh a() {
      return ekj.b;
   }

   @Nullable
   @Override
   public tk a(egv $$0) {
      return $$0.d().o().aI().a(this.b);
   }

   @Override
   public Set<ejd<?>> b() {
      return ImmutableSet.of();
   }

   public ahg c() {
      return this.b;
   }
}
