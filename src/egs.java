import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egs(String b) implements egu {
   public static final Codec<egs> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(egs::c)).apply($$0, egs::new));

   public static egu a(String $$0) {
      return new egs($$0);
   }

   @Override
   public egt a() {
      return egv.b;
   }

   @Nullable
   @Override
   public String a(ecs $$0) {
      return this.b;
   }

   @Override
   public Set<efa<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
