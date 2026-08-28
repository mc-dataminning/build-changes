import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record euk(alf b) implements eui {
   public static final MapCodec<euk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alf.a.fieldOf("source").forGetter(euk::c)).apply($$0, euk::new));

   @Override
   public euh a() {
      return euj.b;
   }

   @Nullable
   @Override
   public vp a(eqk $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<etd<?>> b() {
      return ImmutableSet.of();
   }

   public alf c() {
      return this.b;
   }
}
