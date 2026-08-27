import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egq(String b) implements egs {
   public static final Codec<egq> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(egq::c)).apply($$0, egq::new));

   public static egs a(String $$0) {
      return new egq($$0);
   }

   @Override
   public egr a() {
      return egt.b;
   }

   @Nullable
   @Override
   public String a(ecq $$0) {
      return this.b;
   }

   @Override
   public Set<eey<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
