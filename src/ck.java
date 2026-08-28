import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ck extends ds<ck.a> {
   @Override
   public Codec<ck.a> a() {
      return ck.a.a;
   }

   public void a(aqn $$0, cud $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bf> b, Optional<cp> c, de.d d, de.d e) implements ds.a {
      public static final Codec<ck.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(ck.a::a),
                  cp.a.optionalFieldOf("item").forGetter(ck.a::b),
                  de.d.d.optionalFieldOf("durability", de.d.c).forGetter(ck.a::c),
                  de.d.d.optionalFieldOf("delta", de.d.c).forGetter(ck.a::d)
               )
               .apply($$0, ck.a::new)
      );

      public static an<ck.a> a(Optional<cp> $$0, de.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static an<ck.a> a(Optional<bf> $$0, Optional<cp> $$1, de.d $$2) {
         return am.u.a(new ck.a($$0, $$1, $$2, de.d.c));
      }

      public boolean a(cud $$0, int $$1) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else {
            return !this.d.d($$0.o() - $$1) ? false : this.e.d($$0.n() - $$1);
         }
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<cp> b() {
         return this.c;
      }

      public de.d c() {
         return this.d;
      }

      public de.d d() {
         return this.e;
      }
   }
}
