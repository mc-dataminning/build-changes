import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eou(String b) implements eow {
   public static final Codec<eou> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(eou::c)).apply($$0, eou::new));

   public static eow a(String $$0) {
      return new eou($$0);
   }

   @Override
   public eov a() {
      return eox.b;
   }

   @Override
   public equ a(eku $$0) {
      return equ.d(this.b);
   }

   @Override
   public Set<enc<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
