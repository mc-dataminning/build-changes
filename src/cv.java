import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cv(Optional<bc<arv<xo>, cv.a>> c, Optional<String> d, Optional<String> e, de.d f, Optional<Boolean> g) implements ds<cxw> {
   public static final Codec<cv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bc.a(cv.a.a).optionalFieldOf("pages").forGetter(cv::b),
               Codec.STRING.optionalFieldOf("author").forGetter(cv::c),
               Codec.STRING.optionalFieldOf("title").forGetter(cv::d),
               de.d.d.optionalFieldOf("generation", de.d.c).forGetter(cv::e),
               Codec.BOOL.optionalFieldOf("resolved").forGetter(cv::f)
            )
            .apply($$0, cv::new)
   );

   @Override
   public kl<cxw> a() {
      return km.I;
   }

   public boolean a(cun $$0, cxw $$1) {
      if (this.d.isPresent() && !this.d.get().equals($$1.e())) {
         return false;
      } else if (this.e.isPresent() && !this.e.get().equals($$1.d().a())) {
         return false;
      } else if (!this.f.d($$1.f())) {
         return false;
      } else {
         return this.g.isPresent() && this.g.get() != $$1.g() ? false : !this.c.isPresent() || this.c.get().a($$1.a());
      }
   }

   public Optional<bc<arv<xo>, cv.a>> b() {
      return this.c;
   }

   public Optional<String> c() {
      return this.d;
   }

   public Optional<String> d() {
      return this.e;
   }

   public de.d e() {
      return this.f;
   }

   public Optional<Boolean> f() {
      return this.g;
   }

   public static record a(xo b) implements Predicate<arv<xo>> {
      public static final Codec<cv.a> a = xq.a.xmap(cv.a::new, cv.a::a);

      public boolean a(arv<xo> $$0) {
         return $$0.a().equals(this.b);
      }

      public xo a() {
         return this.b;
      }
   }
}
