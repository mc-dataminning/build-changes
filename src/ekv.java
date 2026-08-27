import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekv(String b) implements ekx {
   public static final Codec<ekv> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ekv::c)).apply($$0, ekv::new));

   public static ekx a(String $$0) {
      return new ekv($$0);
   }

   @Override
   public ekw a() {
      return eky.b;
   }

   @Override
   public emv a(egv $$0) {
      return emv.d(this.b);
   }

   @Override
   public Set<ejd<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
