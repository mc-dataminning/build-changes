import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cu(Optional<bc<ard<String>, cu.a>> c) implements dt<cxj> {
   public static final Codec<cu> a = RecordCodecBuilder.create($$0 -> $$0.group(bc.a(cu.a.a).optionalFieldOf("pages").forGetter(cu::b)).apply($$0, cu::new));

   @Override
   public km<cxj> a() {
      return kn.I;
   }

   public boolean a(cuc $$0, cxj $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.a());
   }

   public Optional<bc<ard<String>, cu.a>> b() {
      return this.c;
   }

   public static record a(String b) implements Predicate<ard<String>> {
      public static final Codec<cu.a> a = Codec.STRING.xmap(cu.a::new, cu.a::a);

      public boolean a(ard<String> $$0) {
         return $$0.a().equals(this.b);
      }

      public String a() {
         return this.b;
      }
   }
}
