import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record euv(akk b) implements eut {
   public static final MapCodec<euv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akk.a.fieldOf("source").forGetter(euv::c)).apply($$0, euv::new));

   @Override
   public eus a() {
      return euu.b;
   }

   @Nullable
   @Override
   public uu a(equ $$0) {
      return $$0.d().o().aM().a(this.b);
   }

   @Override
   public Set<etn<?>> b() {
      return ImmutableSet.of();
   }

   public akk c() {
      return this.b;
   }
}
