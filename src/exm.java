import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record exm(ale b) implements exk {
   public static final MapCodec<exm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a.fieldOf("source").forGetter(exm::c)).apply($$0, exm::new));

   @Override
   public exj a() {
      return exl.b;
   }

   @Nullable
   @Override
   public vd a(etl $$0) {
      return $$0.d().o().aK().a(this.b);
   }

   @Override
   public Set<ewe<?>> b() {
      return ImmutableSet.of();
   }

   public ale c() {
      return this.b;
   }
}
