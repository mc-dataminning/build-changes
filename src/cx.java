import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cx(Optional<bd<arx<String>, cx.a>> c) implements dw<cyt> {
   public static final Codec<cx> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(cx.a.a).optionalFieldOf("pages").forGetter(cx::b)).apply($$0, cx::new));

   @Override
   public kq<cyt> a() {
      return kr.K;
   }

   public boolean a(cvl $$0, cyt $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.a());
   }

   public Optional<bd<arx<String>, cx.a>> b() {
      return this.c;
   }

   public static record a(String b) implements Predicate<arx<String>> {
      public static final Codec<cx.a> a = Codec.STRING.xmap(cx.a::new, cx.a::a);

      public boolean a(arx<String> $$0) {
         return $$0.a().equals(this.b);
      }

      public String a() {
         return this.b;
      }
   }
}
