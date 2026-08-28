import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ed extends dr<ed.a> {
   @Override
   public Codec<ed.a> a() {
      return ed.a.a;
   }

   public void a(arg $$0, iz $$1) {
      double $$2 = $$0.du() - (double)$$1.u();
      double $$3 = $$0.dA() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bf> b, de.c c) implements dr.a {
      public static final Codec<ed.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(ed.a::a), de.c.d.optionalFieldOf("distance", de.c.c).forGetter(ed.a::b))
               .apply($$0, ed.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public de.c b() {
         return this.c;
      }
   }
}
