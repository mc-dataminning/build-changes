import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record da(Optional<bf<arv<String>, da.a>> c) implements ea<czw> {
   public static final Codec<da> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(da.a.a).optionalFieldOf("pages").forGetter(da::b)).apply($$0, da::new));

   @Override
   public ku<czw> a() {
      return kv.S;
   }

   public boolean a(cwp $$0, czw $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.a());
   }

   public Optional<bf<arv<String>, da.a>> b() {
      return this.c;
   }

   public static record a(String b) implements Predicate<arv<String>> {
      public static final Codec<da.a> a = Codec.STRING.xmap(da.a::new, da.a::a);

      public boolean a(arv<String> $$0) {
         return $$0.a().equals(this.b);
      }

      public String a() {
         return this.b;
      }
   }
}
