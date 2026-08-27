import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record emv(String b) implements emx {
   public static final Codec<emv> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(emv::c)).apply($$0, emv::new));

   public static emx a(String $$0) {
      return new emv($$0);
   }

   @Override
   public emw a() {
      return emy.b;
   }

   @Override
   public eov a(eiv $$0) {
      return eov.d(this.b);
   }

   @Override
   public Set<eld<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
