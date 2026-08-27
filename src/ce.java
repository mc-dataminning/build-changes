import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ce extends df<ce.a> {
   @Override
   public Codec<ce.a> a() {
      return ce.a.a;
   }

   public void a(aqn $$0, cto $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bc> b, Optional<ch> c, ct.d d, ct.d e) implements df.a {
      public static final Codec<ce.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  br.b.optionalFieldOf("player").forGetter(ce.a::a),
                  ch.a.optionalFieldOf("item").forGetter(ce.a::b),
                  ct.d.d.optionalFieldOf("durability", ct.d.c).forGetter(ce.a::c),
                  ct.d.d.optionalFieldOf("delta", ct.d.c).forGetter(ce.a::d)
               )
               .apply($$0, ce.a::new)
      );

      public static an<ce.a> a(Optional<ch> $$0, ct.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static an<ce.a> a(Optional<bc> $$0, Optional<ch> $$1, ct.d $$2) {
         return am.u.a(new ce.a($$0, $$1, $$2, ct.d.c));
      }

      public boolean a(cto $$0, int $$1) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else {
            return !this.d.d($$0.o() - $$1) ? false : this.e.d($$0.n() - $$1);
         }
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<ch> b() {
         return this.c;
      }

      public ct.d c() {
         return this.d;
      }

      public ct.d d() {
         return this.e;
      }
   }
}
