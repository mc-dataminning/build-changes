import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egg(String b) implements egi {
   public static final Codec<egg> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(egg::c)).apply($$0, egg::new));

   public static egi a(String $$0) {
      return new egg($$0);
   }

   @Override
   public egh a() {
      return egj.b;
   }

   @Nullable
   @Override
   public String a(ecg $$0) {
      return this.b;
   }

   @Override
   public Set<eeo<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
