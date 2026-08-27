import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dm extends dd<dm.a> {
   @Override
   public Codec<dm.a> a() {
      return dm.a.a;
   }

   public void a(aqf $$0, cct $$1) {
      eoa $$2 = br.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements dd.a {
      public static final Codec<dm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(dm.a::a), axe.a(br.b, "entity").forGetter(dm.a::c)).apply($$0, dm.a::new)
      );

      public static an<dm.a> b() {
         return am.y.a(new dm.a(Optional.empty(), Optional.empty()));
      }

      public static an<dm.a> a(br.a $$0) {
         return am.y.a(new dm.a(Optional.empty(), Optional.of(br.a($$0))));
      }

      public boolean a(eoa $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         dd.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
