import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fai(alz b) implements fag {
   public static final MapCodec<fai> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alz.a.fieldOf("source").forGetter(fai::c)).apply($$0, fai::new));

   @Override
   public faf a() {
      return fah.b;
   }

   @Nullable
   @Override
   public vu a(ewh $$0) {
      return $$0.d().p().aK().a(this.b);
   }

   @Override
   public Set<eza<?>> b() {
      return ImmutableSet.of();
   }

   public alz c() {
      return this.b;
   }
}
