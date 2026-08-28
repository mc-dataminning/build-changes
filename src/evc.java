import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evc(String b) implements eve {
   public static final MapCodec<evc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(evc::c)).apply($$0, evc::new));

   public static eve a(String $$0) {
      return new evc($$0);
   }

   @Override
   public evd a() {
      return evf.b;
   }

   @Override
   public exc a(eqo $$0) {
      return exc.c(this.b);
   }

   @Override
   public Set<eth<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
