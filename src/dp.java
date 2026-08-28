import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dp extends dr<dp.a> {
   @Override
   public Codec<dp.a> a() {
      return dp.a.a;
   }

   public void a(arf $$0, cyv<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static an<dp.a> a(ale $$0) {
      return am.g.a(new dp.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bf> b, ale c) implements dr.a {
      public static final Codec<dp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(dp.a::a), ale.a.fieldOf("recipe").forGetter(dp.a::b)).apply($$0, dp.a::new)
      );

      public boolean a(cyv<?> $$0) {
         return this.c.equals($$0.a());
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public ale b() {
         return this.c;
      }
   }
}
