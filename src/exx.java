import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record exx(alh b) implements exv {
   public static final MapCodec<exx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alh.a.fieldOf("source").forGetter(exx::c)).apply($$0, exx::new));

   @Override
   public exu a() {
      return exw.b;
   }

   @Nullable
   @Override
   public vg a(etw $$0) {
      return $$0.d().o().aK().a(this.b);
   }

   @Override
   public Set<ewp<?>> b() {
      return ImmutableSet.of();
   }

   public alh c() {
      return this.b;
   }
}
