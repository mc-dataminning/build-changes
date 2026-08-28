import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class be extends dr<be.a> {
   @Override
   public Codec<be.a> a() {
      return be.a.a;
   }

   public void a(arg $$0, cur $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bf> b, Optional<cp> c) implements dr.a {
      public static final Codec<be.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(be.a::a), cp.a.optionalFieldOf("item").forGetter(be.a::c)).apply($$0, be.a::new)
      );

      public static an<be.a> b() {
         return am.A.a(new be.a(Optional.empty(), Optional.empty()));
      }

      public static an<be.a> a(dbz $$0) {
         return a(cp.a.a().a($$0.r()));
      }

      public static an<be.a> a(cp.a $$0) {
         return am.A.a(new be.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cur $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
