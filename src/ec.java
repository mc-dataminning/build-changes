import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ec extends ds<ec.a> {
   @Override
   public Codec<ec.a> a() {
      return ec.a.a;
   }

   public void a(aqn $$0, bsh $$1, ewh $$2, int $$3) {
      eqw $$4 = bu.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bf> b, de.d c, Optional<bf> d) implements ds.a {
      public static final Codec<ec.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(ec.a::a),
                  de.d.d.optionalFieldOf("signal_strength", de.d.c).forGetter(ec.a::b),
                  bu.b.optionalFieldOf("projectile").forGetter(ec.a::c)
               )
               .apply($$0, ec.a::new)
      );

      public static an<ec.a> a(de.d $$0, Optional<bf> $$1) {
         return am.M.a(new ec.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(eqw $$0, ewh $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bg $$0) {
         ds.a.super.a($$0);
         $$0.a(this.d, ".projectile");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public de.d b() {
         return this.c;
      }

      public Optional<bf> c() {
         return this.d;
      }
   }
}
