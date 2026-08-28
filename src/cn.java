import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cn(Optional<bc<cwu, cm.a>> c, de.d d) implements dt<cwv> {
   public static final Codec<cn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bc.a(cm.a.a).optionalFieldOf("explosions").forGetter(cn::b), de.d.d.optionalFieldOf("flight_duration", de.d.c).forGetter(cn::c))
            .apply($$0, cn::new)
   );

   @Override
   public km<cwv> a() {
      return kn.U;
   }

   public boolean a(cuc $$0, cwv $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : this.d.d($$1.a());
   }

   public Optional<bc<cwu, cm.a>> b() {
      return this.c;
   }

   public de.d c() {
      return this.d;
   }
}
