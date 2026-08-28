import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record euj(alf b) implements euh {
   public static final MapCodec<euj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alf.a.fieldOf("source").forGetter(euj::c)).apply($$0, euj::new));

   @Override
   public eug a() {
      return eui.b;
   }

   @Nullable
   @Override
   public vp a(eqj $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<etc<?>> b() {
      return ImmutableSet.of();
   }

   public alf c() {
      return this.b;
   }
}
