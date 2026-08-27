import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eow(String b) implements eoy {
   public static final Codec<eow> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(eow::c)).apply($$0, eow::new));

   public static eoy a(String $$0) {
      return new eow($$0);
   }

   @Override
   public eox a() {
      return eoz.b;
   }

   @Override
   public eqw a(ekw $$0) {
      return eqw.d(this.b);
   }

   @Override
   public Set<ene<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
