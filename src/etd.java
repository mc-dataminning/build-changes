import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record etd(akn b) implements etb {
   public static final MapCodec<etd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akn.a.fieldOf("source").forGetter(etd::c)).apply($$0, etd::new));

   @Override
   public eta a() {
      return etc.b;
   }

   @Nullable
   @Override
   public va a(eph $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<erw<?>> b() {
      return ImmutableSet.of();
   }

   public akn c() {
      return this.b;
   }
}
