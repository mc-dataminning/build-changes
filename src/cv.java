import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cv(Optional<jr<cxs>> c, Optional<jr<cxu>> d) implements dw<cxr> {
   public static final Codec<cv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kc.a(lv.aX).optionalFieldOf("material").forGetter(cv::b), kc.a(lv.aY).optionalFieldOf("pattern").forGetter(cv::c)).apply($$0, cv::new)
   );

   @Override
   public kq<cxr> a() {
      return kr.P;
   }

   public boolean a(cvp $$0, cxr $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : !this.d.isPresent() || this.d.get().a($$1.a());
   }

   public Optional<jr<cxs>> b() {
      return this.c;
   }

   public Optional<jr<cxu>> c() {
      return this.d;
   }
}
