import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eui(alf b) implements eug {
   public static final MapCodec<eui> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alf.a.fieldOf("source").forGetter(eui::c)).apply($$0, eui::new));

   @Override
   public euf a() {
      return euh.b;
   }

   @Nullable
   @Override
   public vp a(eqi $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<etb<?>> b() {
      return ImmutableSet.of();
   }

   public alf c() {
      return this.b;
   }
}
