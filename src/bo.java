import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bo extends ds<bo.a> {
   @Override
   public Codec<bo.a> a() {
      return bo.a.a;
   }

   public void a(aqn $$0, cuc $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bf> b, Optional<cp> c, de.d d) implements ds.a {
      public static final Codec<bo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(bo.a::a),
                  cp.a.optionalFieldOf("item").forGetter(bo.a::c),
                  de.d.d.optionalFieldOf("levels", de.d.c).forGetter(bo.a::d)
               )
               .apply($$0, bo.a::new)
      );

      public static an<bo.a> b() {
         return am.j.a(new bo.a(Optional.empty(), Optional.empty(), de.d.c));
      }

      public boolean a(cuc $$0, int $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.d($$1);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
