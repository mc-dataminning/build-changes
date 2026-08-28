import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record exi(alc b) implements exg {
   public static final MapCodec<exi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alc.a.fieldOf("source").forGetter(exi::c)).apply($$0, exi::new));

   @Override
   public exf a() {
      return exh.b;
   }

   @Nullable
   @Override
   public vc a(eth $$0) {
      return $$0.d().o().aK().a(this.b);
   }

   @Override
   public Set<ewa<?>> b() {
      return ImmutableSet.of();
   }

   public alc c() {
      return this.b;
   }
}
