import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eb extends ds<eb.a> {
   @Override
   public Codec<eb.a> a() {
      return eb.a.a;
   }

   public void a(aqn $$0, ces $$1) {
      eqw $$2 = bu.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bf> b, Optional<bf> c) implements ds.a {
      public static final Codec<eb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(eb.a::a), bu.b.optionalFieldOf("entity").forGetter(eb.a::c)).apply($$0, eb.a::new)
      );

      public static an<eb.a> b() {
         return am.y.a(new eb.a(Optional.empty(), Optional.empty()));
      }

      public static an<eb.a> a(bu.a $$0) {
         return am.y.a(new eb.a(Optional.empty(), Optional.of(bu.a($$0))));
      }

      public boolean a(eqw $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bg $$0) {
         ds.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
