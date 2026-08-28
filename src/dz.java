import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dz extends ds<dz.a> {
   @Override
   public Codec<dz.a> a() {
      return dz.a.a;
   }

   public void a(aqn $$0, bsh $$1) {
      eqw $$2 = bu.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bf> b, Optional<bf> c) implements ds.a {
      public static final Codec<dz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(dz.a::a), bu.b.optionalFieldOf("entity").forGetter(dz.a::b)).apply($$0, dz.a::new)
      );

      public static an<dz.a> a(bu.a $$0) {
         return am.o.a(new dz.a(Optional.empty(), Optional.of(bu.a($$0))));
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

      public Optional<bf> b() {
         return this.c;
      }
   }
}
