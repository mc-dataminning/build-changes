import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ci(Optional<bd<cuo, cs>> c) implements dw<cxd> {
   public static final Codec<ci> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(cs.a).optionalFieldOf("items").forGetter(ci::b)).apply($$0, ci::new));

   @Override
   public kp<cxd> a() {
      return kq.F;
   }

   public boolean a(cuo $$0, cxd $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bd<cuo, cs>> b() {
      return this.c;
   }
}
