import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cs(Optional<jn<cwh>> c, Optional<jn<cwj>> d) implements dt<cwg> {
   public static final Codec<cs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jy.a(lr.aV).optionalFieldOf("material").forGetter(cs::b), jy.a(lr.aW).optionalFieldOf("pattern").forGetter(cs::c)).apply($$0, cs::new)
   );

   @Override
   public km<cwg> a() {
      return kn.K;
   }

   public boolean a(cuc $$0, cwg $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : !this.d.isPresent() || this.d.get().a($$1.a());
   }

   public Optional<jn<cwh>> b() {
      return this.c;
   }

   public Optional<jn<cwj>> c() {
      return this.d;
   }
}
