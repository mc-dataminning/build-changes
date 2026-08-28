import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eyo(alj b) implements eym {
   public static final MapCodec<eyo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alj.a.fieldOf("source").forGetter(eyo::c)).apply($$0, eyo::new));

   @Override
   public eyl a() {
      return eyn.b;
   }

   @Nullable
   @Override
   public vi a(eun $$0) {
      return $$0.d().p().aK().a(this.b);
   }

   @Override
   public Set<exg<?>> b() {
      return ImmutableSet.of();
   }

   public alj c() {
      return this.b;
   }
}
