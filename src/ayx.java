import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class ayx {
   public static final Codec<ayx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axw.n.optionalFieldOf("namespace").forGetter($$0x -> $$0x.b), axw.n.optionalFieldOf("path").forGetter($$0x -> $$0x.d))
            .apply($$0, ayx::new)
   );
   private final Optional<Pattern> b;
   private final Predicate<String> c;
   private final Optional<Pattern> d;
   private final Predicate<String> e;
   private final Predicate<akr> f;

   private ayx(Optional<Pattern> $$0, Optional<Pattern> $$1) {
      this.b = $$0;
      this.c = $$0.map(Pattern::asPredicate).orElse($$0x -> true);
      this.d = $$1;
      this.e = $$1.map(Pattern::asPredicate).orElse($$0x -> true);
      this.f = $$0x -> this.c.test($$0x.b()) && this.e.test($$0x.a());
   }

   public Predicate<String> a() {
      return this.c;
   }

   public Predicate<String> b() {
      return this.e;
   }

   public Predicate<akr> c() {
      return this.f;
   }
}
