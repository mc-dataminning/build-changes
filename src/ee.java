import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ee extends dv<ee.a> {
   @Override
   public Codec<ee.a> a() {
      return ee.a.a;
   }

   public void a(arh $$0, cfv $$1) {
      est $$2 = bv.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dv.a {
      public static final Codec<ee.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ee.a::a), bv.b.optionalFieldOf("entity").forGetter(ee.a::c)).apply($$0, ee.a::new)
      );

      public static ao<ee.a> b() {
         return an.y.a(new ee.a(Optional.empty(), Optional.empty()));
      }

      public static ao<ee.a> a(bv.a $$0) {
         return an.y.a(new ee.a(Optional.empty(), Optional.of(bv.a($$0))));
      }

      public boolean a(est $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
