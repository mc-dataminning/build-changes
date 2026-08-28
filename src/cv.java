import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cv(Optional<js<cxv>> c, Optional<js<cxx>> d) implements dx<cxu> {
   public static final Codec<cv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.a(lw.aY).optionalFieldOf("material").forGetter(cv::b), kd.a(lw.aZ).optionalFieldOf("pattern").forGetter(cv::c)).apply($$0, cv::new)
   );

   @Override
   public kr<cxu> a() {
      return ks.P;
   }

   public boolean a(cvs $$0, cxu $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : !this.d.isPresent() || this.d.get().a($$1.a());
   }

   public Optional<js<cxv>> b() {
      return this.c;
   }

   public Optional<js<cxx>> c() {
      return this.d;
   }
}
