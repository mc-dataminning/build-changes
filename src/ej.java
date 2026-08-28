import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ej extends dz<ej.a> {
   @Override
   public Codec<ej.a> a() {
      return ej.a.a;
   }

   public void a(are $$0, buk $$1, faz $$2, int $$3) {
      evq $$4 = bx.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bi> b, dk.d c, Optional<bi> d) implements dz.a {
      public static final Codec<ej.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(ej.a::a),
                  dk.d.d.optionalFieldOf("signal_strength", dk.d.c).forGetter(ej.a::b),
                  bx.b.optionalFieldOf("projectile").forGetter(ej.a::c)
               )
               .apply($$0, ej.a::new)
      );

      public static aq<ej.a> a(dk.d $$0, Optional<bi> $$1) {
         return ap.M.a(new ej.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(evq $$0, faz $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bj $$0) {
         dz.a.super.a($$0);
         $$0.a(this.d, ".projectile");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public dk.d b() {
         return this.c;
      }

      public Optional<bi> c() {
         return this.d;
      }
   }
}
