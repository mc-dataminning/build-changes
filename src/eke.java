import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eke(String b) implements ekg {
   public static final Codec<eke> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(eke::c)).apply($$0, eke::new));

   public static ekg a(String $$0) {
      return new eke($$0);
   }

   @Override
   public ekf a() {
      return ekh.b;
   }

   @Nullable
   @Override
   public String a(ege $$0) {
      return this.b;
   }

   @Override
   public Set<eim<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
