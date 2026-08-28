import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cg(Optional<bc<cud, cp>> c) implements dt<cwp> {
   public static final Codec<cg> a = RecordCodecBuilder.create($$0 -> $$0.group(bc.a(cp.a).optionalFieldOf("items").forGetter(cg::b)).apply($$0, cg::new));

   @Override
   public km<cwp> a() {
      return kn.F;
   }

   public boolean a(cud $$0, cwp $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bc<cud, cp>> b() {
      return this.c;
   }
}
