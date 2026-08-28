import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ch(Optional<bc<cuc, cp>> c) implements dt<cwx> {
   public static final Codec<ch> a = RecordCodecBuilder.create($$0 -> $$0.group(bc.a(cp.a).optionalFieldOf("items").forGetter(ch::b)).apply($$0, ch::new));

   @Override
   public km<cwx> a() {
      return kn.aa;
   }

   public boolean a(cuc $$0, cwx $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.d());
   }

   public Optional<bc<cuc, cp>> b() {
      return this.c;
   }
}
