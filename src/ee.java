import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ee extends dx<ee.a> {
   @Override
   public Codec<ee.a> a() {
      return ee.a.a;
   }

   public void a(arn $$0, btz $$1) {
      etw $$2 = bv.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dx.a {
      public static final Codec<ee.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ee.a::a), bv.b.optionalFieldOf("entity").forGetter(ee.a::b)).apply($$0, ee.a::new)
      );

      public static ao<ee.a> a(bv.a $$0) {
         return an.o.a(new ee.a(Optional.empty(), Optional.of(bv.a($$0))));
      }

      public boolean a(etw $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dx.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<bg> b() {
         return this.c;
      }
   }
}
