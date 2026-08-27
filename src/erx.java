import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record erx(akf b) implements erv {
   public static final Codec<erx> a = RecordCodecBuilder.create($$0 -> $$0.group(akf.a.fieldOf("source").forGetter(erx::c)).apply($$0, erx::new));

   @Override
   public eru a() {
      return erw.b;
   }

   @Nullable
   @Override
   public uv a(eoa $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<eqq<?>> b() {
      return ImmutableSet.of();
   }

   public akf c() {
      return this.b;
   }
}
