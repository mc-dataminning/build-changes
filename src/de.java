import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class de extends dz<de.a> {
   @Override
   public Codec<de.a> a() {
      return de.a.a;
   }

   public void a(are $$0, faz $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static record a(Optional<bi> b, Optional<bo> c, dk.d d) implements dz.a {
      public static final Codec<de.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(de.a::a),
                  bo.a.optionalFieldOf("distance").forGetter(de.a::b),
                  dk.d.d.optionalFieldOf("duration", dk.d.c).forGetter(de.a::c)
               )
               .apply($$0, de.a::new)
      );

      public static aq<de.a> a(bo $$0) {
         return ap.v.a(new de.a(Optional.empty(), Optional.of($$0), dk.d.c));
      }

      public boolean a(are $$0, faz $$1, int $$2) {
         return this.c.isPresent() && !this.c.get().a($$1.d, $$1.e, $$1.f, $$0.dA(), $$0.dC(), $$0.dG()) ? false : this.d.d($$2);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<bo> b() {
         return this.c;
      }

      public dk.d c() {
         return this.d;
      }
   }
}
