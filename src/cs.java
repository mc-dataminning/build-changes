import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cs(Optional<jn<cwi>> c, Optional<jn<cwk>> d) implements dt<cwh> {
   public static final Codec<cs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jy.a(lr.aV).optionalFieldOf("material").forGetter(cs::b), jy.a(lr.aW).optionalFieldOf("pattern").forGetter(cs::c)).apply($$0, cs::new)
   );

   @Override
   public km<cwh> a() {
      return kn.K;
   }

   public boolean a(cud $$0, cwh $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : !this.d.isPresent() || this.d.get().a($$1.a());
   }

   public Optional<jn<cwi>> b() {
      return this.c;
   }

   public Optional<jn<cwk>> c() {
      return this.d;
   }
}
