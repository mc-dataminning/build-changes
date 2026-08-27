import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dp extends df<dp.a> {
   @Override
   public Codec<dp.a> a() {
      return dp.a.a;
   }

   public void a(aqo $$0, ceg $$1) {
      eph $$2 = br.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements df.a {
      public static final Codec<dp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(dp.a::a), br.b.optionalFieldOf("entity").forGetter(dp.a::c)).apply($$0, dp.a::new)
      );

      public static an<dp.a> b() {
         return am.y.a(new dp.a(Optional.empty(), Optional.empty()));
      }

      public static an<dp.a> a(br.a $$0) {
         return am.y.a(new dp.a(Optional.empty(), Optional.of(br.a($$0))));
      }

      public boolean a(eph $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         df.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
