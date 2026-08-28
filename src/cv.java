import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cv extends dk<cv.a> {
   @Override
   public Codec<cv.a> a() {
      return cv.a.a;
   }

   public void a(art $$0, alh<fam> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bj> b, alh<fam> c) implements dk.a {
      public static final Codec<cv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(cv.a::a), fam.a.fieldOf("loot_table").forGetter(cv.a::b)).apply($$0, cv.a::new)
      );

      public static ar<cv.a> a(alh<fam> $$0) {
         return aq.Q.a(new cv.a(Optional.empty(), $$0));
      }

      public boolean b(alh<fam> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public alh<fam> b() {
         return this.c;
      }
   }
}
