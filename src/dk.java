import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dk extends ds<dk.a> {
   @Override
   public Codec<dk.a> a() {
      return dk.a.a;
   }

   public void a(aql $$0, cua $$1, bsd $$2) {
      eqo $$3 = bu.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static record a(Optional<bf> b, Optional<cp> c, Optional<bf> d) implements ds.a {
      public static final Codec<dk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(dk.a::a),
                  cp.a.optionalFieldOf("item").forGetter(dk.a::b),
                  bu.b.optionalFieldOf("entity").forGetter(dk.a::c)
               )
               .apply($$0, dk.a::new)
      );

      public static an<dk.a> a(Optional<bf> $$0, cp.a $$1, Optional<bf> $$2) {
         return am.T.a(new dk.a($$0, Optional.of($$1.b()), $$2));
      }

      public static an<dk.a> a(cp.a $$0, Optional<bf> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(cua $$0, eqo $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.isEmpty() || this.d.get().a($$1);
      }

      @Override
      public void a(bg $$0) {
         ds.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<cp> b() {
         return this.c;
      }

      public Optional<bf> c() {
         return this.d;
      }
   }
}
