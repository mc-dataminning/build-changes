import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cy(Optional<jv<dfp>> c, Optional<jv<dfr>> d) implements ea<dfo> {
   public static final Codec<cy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kg.a(mc.bb).optionalFieldOf("material").forGetter(cy::b), kg.a(mc.bc).optionalFieldOf("pattern").forGetter(cy::c)).apply($$0, cy::new)
   );

   @Override
   public ku<dfo> a() {
      return kv.W;
   }

   public boolean a(cxh $$0, dfo $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.a()) ? false : !this.d.isPresent() || this.d.get().a($$1.b());
   }

   public Optional<jv<dfp>> b() {
      return this.c;
   }

   public Optional<jv<dfr>> c() {
      return this.d;
   }
}
