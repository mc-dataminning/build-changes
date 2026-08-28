import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ci(Optional<bd<cvl, cs>> c) implements dw<cxy> {
   public static final Codec<ci> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(cs.a).optionalFieldOf("items").forGetter(ci::b)).apply($$0, ci::new));

   @Override
   public kq<cxy> a() {
      return kr.H;
   }

   public boolean a(cvl $$0, cxy $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.c());
   }

   public Optional<bd<cvl, cs>> b() {
      return this.c;
   }
}
