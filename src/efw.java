import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record efw(aer b) implements efu {
   public static final Codec<efw> a = RecordCodecBuilder.create($$0 -> $$0.group(aer.a.fieldOf("source").forGetter(efw::c)).apply($$0, efw::new));

   @Override
   public eft a() {
      return efv.b;
   }

   @Nullable
   @Override
   public rk a(ech $$0) {
      return $$0.d().n().aG().a(this.b);
   }

   @Override
   public Set<eep<?>> b() {
      return ImmutableSet.of();
   }

   public aer c() {
      return this.b;
   }
}
