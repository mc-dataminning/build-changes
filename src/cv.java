import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cv(Optional<jq<cwy>> c, Optional<jq<cxa>> d) implements dw<cwx> {
   public static final Codec<cv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kb.a(lu.aW).optionalFieldOf("material").forGetter(cv::b), kb.a(lu.aX).optionalFieldOf("pattern").forGetter(cv::c)).apply($$0, cv::new)
   );

   @Override
   public kp<cwx> a() {
      return kq.K;
   }

   public boolean a(cuq $$0, cwx $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : !this.d.isPresent() || this.d.get().a($$1.a());
   }

   public Optional<jq<cwy>> b() {
      return this.c;
   }

   public Optional<jq<cxa>> c() {
      return this.d;
   }
}
