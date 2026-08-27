import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dm extends df<dm.a> {
   @Override
   public Codec<dm.a> a() {
      return dm.a.a;
   }

   public void a(aqn $$0, bru $$1) {
      epf $$2 = br.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements df.a {
      public static final Codec<dm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(dm.a::a), br.b.optionalFieldOf("entity").forGetter(dm.a::b)).apply($$0, dm.a::new)
      );

      public static an<dm.a> a(br.a $$0) {
         return am.o.a(new dm.a(Optional.empty(), Optional.of(br.a($$0))));
      }

      public boolean a(epf $$0) {
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

      public Optional<bc> b() {
         return this.c;
      }
   }
}
