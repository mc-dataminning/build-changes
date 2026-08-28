import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cz(Optional<be<asf<String>, cz.a>> c) implements dz<czi> {
   public static final Codec<cz> a = RecordCodecBuilder.create($$0 -> $$0.group(be.a(cz.a.a).optionalFieldOf("pages").forGetter(cz::b)).apply($$0, cz::new));

   @Override
   public kt<czi> a() {
      return ku.S;
   }

   public boolean a(cwb $$0, czi $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.a());
   }

   public Optional<be<asf<String>, cz.a>> b() {
      return this.c;
   }

   public static record a(String b) implements Predicate<asf<String>> {
      public static final Codec<cz.a> a = Codec.STRING.xmap(cz.a::new, cz.a::a);

      public boolean a(asf<String> $$0) {
         return $$0.a().equals(this.b);
      }

      public String a() {
         return this.b;
      }
   }
}
