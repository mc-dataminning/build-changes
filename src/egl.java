import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egl(String b) implements egn {
   public static final Codec<egl> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(egl::c)).apply($$0, egl::new));

   public static egn a(String $$0) {
      return new egl($$0);
   }

   @Override
   public egm a() {
      return ego.b;
   }

   @Nullable
   @Override
   public String a(ecl $$0) {
      return this.b;
   }

   @Override
   public Set<eet<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
