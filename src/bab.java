import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class bab {
   public static final Codec<bab> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayy.p.optionalFieldOf("namespace").forGetter($$0x -> $$0x.b), ayy.p.optionalFieldOf("path").forGetter($$0x -> $$0x.d))
            .apply($$0, bab::new)
   );
   private final Optional<Pattern> b;
   private final Predicate<String> c;
   private final Optional<Pattern> d;
   private final Predicate<String> e;
   private final Predicate<alk> f;

   private bab(Optional<Pattern> $$0, Optional<Pattern> $$1) {
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

   public Predicate<alk> c() {
      return this.f;
   }
}
