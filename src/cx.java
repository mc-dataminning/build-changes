import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cx(Optional<bd<arl<String>, cx.a>> c) implements dw<cya> {
   public static final Codec<cx> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(cx.a.a).optionalFieldOf("pages").forGetter(cx::b)).apply($$0, cx::new));

   @Override
   public kp<cya> a() {
      return kq.I;
   }

   public boolean a(cuq $$0, cya $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.a());
   }

   public Optional<bd<arl<String>, cx.a>> b() {
      return this.c;
   }

   public static record a(String b) implements Predicate<arl<String>> {
      public static final Codec<cx.a> a = Codec.STRING.xmap(cx.a::new, cx.a::a);

      public boolean a(arl<String> $$0) {
         return $$0.a().equals(this.b);
      }

      public String a() {
         return this.b;
      }
   }
}
