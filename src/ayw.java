import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class ayw {
   public static final Codec<ayw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axv.n.optionalFieldOf("namespace").forGetter($$0x -> $$0x.b), axv.n.optionalFieldOf("path").forGetter($$0x -> $$0x.d))
            .apply($$0, ayw::new)
   );
   private final Optional<Pattern> b;
   private final Predicate<String> c;
   private final Optional<Pattern> d;
   private final Predicate<String> e;
   private final Predicate<akq> f;

   private ayw(Optional<Pattern> $$0, Optional<Pattern> $$1) {
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

   public Predicate<akq> c() {
      return this.f;
   }
}
