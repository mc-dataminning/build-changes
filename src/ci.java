import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ci(Optional<bd<cuq, cs>> c) implements dw<cxf> {
   public static final Codec<ci> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(cs.a).optionalFieldOf("items").forGetter(ci::b)).apply($$0, ci::new));

   @Override
   public kp<cxf> a() {
      return kq.F;
   }

   public boolean a(cuq $$0, cxf $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bd<cuq, cs>> b() {
      return this.c;
   }
}
