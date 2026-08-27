import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekp(String b) implements ekr {
   public static final Codec<ekp> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ekp::c)).apply($$0, ekp::new));

   public static ekr a(String $$0) {
      return new ekp($$0);
   }

   @Override
   public ekq a() {
      return eks.b;
   }

   @Override
   public emp a(egp $$0) {
      return emp.d(this.b);
   }

   @Override
   public Set<eix<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
