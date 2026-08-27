import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egk(String b) implements egm {
   public static final Codec<egk> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(egk::c)).apply($$0, egk::new));

   public static egm a(String $$0) {
      return new egk($$0);
   }

   @Override
   public egl a() {
      return egn.b;
   }

   @Nullable
   @Override
   public String a(eck $$0) {
      return this.b;
   }

   @Override
   public Set<ees<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
