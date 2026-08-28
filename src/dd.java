import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dd extends ds<dd.a> {
   @Override
   public Codec<dd.a> a() {
      return dd.a.a;
   }

   public void a(aql $$0, akj<eqt> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bf> b, akj<eqt> c) implements ds.a {
      public static final Codec<dd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(dd.a::a), akj.a(lr.bb).fieldOf("loot_table").forGetter(dd.a::b)).apply($$0, dd.a::new)
      );

      public static an<dd.a> a(akj<eqt> $$0) {
         return am.Q.a(new dd.a(Optional.empty(), $$0));
      }

      public boolean b(akj<eqt> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public akj<eqt> b() {
         return this.c;
      }
   }
}
