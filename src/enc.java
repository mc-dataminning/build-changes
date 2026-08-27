import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record enc(String b) implements ene {
   public static final Codec<enc> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(enc::c)).apply($$0, enc::new));

   public static ene a(String $$0) {
      return new enc($$0);
   }

   @Override
   public end a() {
      return enf.b;
   }

   @Override
   public epc a(ejc $$0) {
      return epc.d(this.b);
   }

   @Override
   public Set<elk<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
