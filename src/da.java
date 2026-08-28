import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record da(Optional<bf<asf<String>, da.a>> c) implements ea<dbd> {
   public static final Codec<da> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(da.a.a).optionalFieldOf("pages").forGetter(da::b)).apply($$0, da::new));

   @Override
   public kw<dbd> a() {
      return kx.U;
   }

   public boolean a(cxy $$0, dbd $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.a());
   }

   public Optional<bf<asf<String>, da.a>> b() {
      return this.c;
   }

   public static record a(String b) implements Predicate<asf<String>> {
      public static final Codec<da.a> a = Codec.STRING.xmap(da.a::new, da.a::a);

      public boolean a(asf<String> $$0) {
         return $$0.a().equals(this.b);
      }

      public String a() {
         return this.b;
      }
   }
}
