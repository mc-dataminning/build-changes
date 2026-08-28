import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dq extends ds<dq.a> {
   @Override
   public Codec<dq.a> a() {
      return dq.a.a;
   }

   public void a(aql $$0, cyi<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static an<dq.a> a(akk $$0) {
      return am.g.a(new dq.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bf> b, akk c) implements ds.a {
      public static final Codec<dq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(dq.a::a), akk.a.fieldOf("recipe").forGetter(dq.a::b)).apply($$0, dq.a::new)
      );

      public boolean a(cyi<?> $$0) {
         return this.c.equals($$0.a());
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public akk b() {
         return this.c;
      }
   }
}
