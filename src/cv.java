import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cv(Optional<jr<cxr>> c, Optional<jr<cxt>> d) implements dw<cxq> {
   public static final Codec<cv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kc.a(lv.aW).optionalFieldOf("material").forGetter(cv::b), kc.a(lv.aX).optionalFieldOf("pattern").forGetter(cv::c)).apply($$0, cv::new)
   );

   @Override
   public kq<cxq> a() {
      return kr.M;
   }

   public boolean a(cvl $$0, cxq $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : !this.d.isPresent() || this.d.get().a($$1.a());
   }

   public Optional<jr<cxr>> b() {
      return this.c;
   }

   public Optional<jr<cxt>> c() {
      return this.d;
   }
}
