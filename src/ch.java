import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ch(Optional<bc<cud, cp>> c) implements dt<cwy> {
   public static final Codec<ch> a = RecordCodecBuilder.create($$0 -> $$0.group(bc.a(cp.a).optionalFieldOf("items").forGetter(ch::b)).apply($$0, ch::new));

   @Override
   public km<cwy> a() {
      return kn.aa;
   }

   public boolean a(cud $$0, cwy $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.d());
   }

   public Optional<bc<cud, cp>> b() {
      return this.c;
   }
}
