import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record euh(ale b) implements euf {
   public static final MapCodec<euh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a.fieldOf("source").forGetter(euh::c)).apply($$0, euh::new));

   @Override
   public eue a() {
      return eug.b;
   }

   @Nullable
   @Override
   public vo a(eqh $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<eta<?>> b() {
      return ImmutableSet.of();
   }

   public ale c() {
      return this.b;
   }
}
