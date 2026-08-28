import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eb extends dr<eb.a> {
   @Override
   public Codec<eb.a> a() {
      return eb.a.a;
   }

   public void a(arf $$0, bst $$1, evq $$2, int $$3) {
      eqh $$4 = bu.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bf> b, de.d c, Optional<bf> d) implements dr.a {
      public static final Codec<eb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(eb.a::a),
                  de.d.d.optionalFieldOf("signal_strength", de.d.c).forGetter(eb.a::b),
                  bu.b.optionalFieldOf("projectile").forGetter(eb.a::c)
               )
               .apply($$0, eb.a::new)
      );

      public static an<eb.a> a(de.d $$0, Optional<bf> $$1) {
         return am.M.a(new eb.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(eqh $$0, evq $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
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
