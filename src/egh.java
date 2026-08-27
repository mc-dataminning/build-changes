import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egh(String b) implements egj {
   public static final Codec<egh> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(egh::c)).apply($$0, egh::new));

   public static egj a(String $$0) {
      return new egh($$0);
   }

   @Override
   public egi a() {
      return egk.b;
   }

   @Nullable
   @Override
   public String a(ech $$0) {
      return this.b;
   }

   @Override
   public Set<eep<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
