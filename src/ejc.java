import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ejc(String b) implements eje {
   public static final Codec<ejc> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ejc::c)).apply($$0, ejc::new));

   public static eje a(String $$0) {
      return new ejc($$0);
   }

   @Override
   public ejd a() {
      return ejf.b;
   }

   @Nullable
   @Override
   public String a(efc $$0) {
      return this.b;
   }

   @Override
   public Set<ehk<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
