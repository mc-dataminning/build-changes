import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cy(Optional<jw<dgf>> c, Optional<jw<dgh>> d) implements ea<dge> {
   public static final Codec<cy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kh.a(me.bg).optionalFieldOf("material").forGetter(cy::b), kh.a(me.bh).optionalFieldOf("pattern").forGetter(cy::c)).apply($$0, cy::new)
   );

   @Override
   public kw<dge> a() {
      return kx.W;
   }

   public boolean a(cxy $$0, dge $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.a()) ? false : !this.d.isPresent() || this.d.get().a($$1.b());
   }

   public Optional<jw<dgf>> b() {
      return this.c;
   }

   public Optional<jw<dgh>> c() {
      return this.d;
   }
}
