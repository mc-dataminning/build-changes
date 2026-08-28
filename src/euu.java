import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euu(String b) implements euw {
   public static final MapCodec<euu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(euu::c)).apply($$0, euu::new));

   public static euw a(String $$0) {
      return new euu($$0);
   }

   @Override
   public euv a() {
      return eux.b;
   }

   @Override
   public ewu a(eqi $$0) {
      return ewu.c(this.b);
   }

   @Override
   public Set<etb<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
