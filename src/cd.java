import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cd extends dd<cd.a> {
   @Override
   public Codec<cd.a> a() {
      return cd.a.a;
   }

   public void a(aqf $$0, csd $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bc> b, Optional<cg> c, cs.d d, cs.d e) implements dd.a {
      public static final Codec<cd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axe.a(br.b, "player").forGetter(cd.a::a),
                  axe.a(cg.a, "item").forGetter(cd.a::b),
                  axe.a(cs.d.d, "durability", cs.d.c).forGetter(cd.a::c),
                  axe.a(cs.d.d, "delta", cs.d.c).forGetter(cd.a::d)
               )
               .apply($$0, cd.a::new)
      );

      public static an<cd.a> a(Optional<cg> $$0, cs.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static an<cd.a> a(Optional<bc> $$0, Optional<cg> $$1, cs.d $$2) {
         return am.u.a(new cd.a($$0, $$1, $$2, cs.d.c));
      }

      public boolean a(csd $$0, int $$1) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else {
            return !this.d.d($$0.n() - $$1) ? false : this.e.d($$0.m() - $$1);
         }
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<cg> b() {
         return this.c;
      }

      public cs.d c() {
         return this.d;
      }

      public cs.d d() {
         return this.e;
      }
   }
}
