import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cx(Optional<bd<ary<String>, cx.a>> c) implements dw<cza> {
   public static final Codec<cx> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(cx.a.a).optionalFieldOf("pages").forGetter(cx::b)).apply($$0, cx::new));

   @Override
   public kq<cza> a() {
      return kr.N;
   }

   public boolean a(cvp $$0, cza $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.a());
   }

   public Optional<bd<ary<String>, cx.a>> b() {
      return this.c;
   }

   public static record a(String b) implements Predicate<ary<String>> {
      public static final Codec<cx.a> a = Codec.STRING.xmap(cx.a::new, cx.a::a);

      public boolean a(ary<String> $$0) {
         return $$0.a().equals(this.b);
      }

      public String a() {
         return this.b;
      }
   }
}
