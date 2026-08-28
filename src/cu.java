import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cu(Optional<bc<ars<String>, cu.a>> c) implements ds<cxs> {
   public static final Codec<cu> a = RecordCodecBuilder.create($$0 -> $$0.group(bc.a(cu.a.a).optionalFieldOf("pages").forGetter(cu::b)).apply($$0, cu::new));

   @Override
   public kl<cxs> a() {
      return km.H;
   }

   public boolean a(cuk $$0, cxs $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.a());
   }

   public Optional<bc<ars<String>, cu.a>> b() {
      return this.c;
   }

   public static record a(String b) implements Predicate<ars<String>> {
      public static final Codec<cu.a> a = Codec.STRING.xmap(cu.a::new, cu.a::a);

      public boolean a(ars<String> $$0) {
         return $$0.a().equals(this.b);
      }

      public String a() {
         return this.b;
      }
   }
}
