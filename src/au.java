import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class au extends dr<au.a> {
   @Override
   public Codec<au.a> a() {
      return au.a.a;
   }

   public void a(arf $$0, dsa $$1, cun $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bf> b, Optional<ji<dex>> c, Optional<cp> d, de.d e) implements dr.a {
      public static final Codec<au.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(au.a::a),
                  lp.e.r().optionalFieldOf("block").forGetter(au.a::b),
                  cp.a.optionalFieldOf("item").forGetter(au.a::c),
                  de.d.d.optionalFieldOf("num_bees_inside", de.d.c).forGetter(au.a::d)
               )
               .apply($$0, au.a::new)
      );

      public static an<au.a> a(dex $$0, cp.a $$1, de.d $$2) {
         return am.L.a(new au.a(Optional.empty(), Optional.of($$0.s()), Optional.of($$1.b()), $$2));
      }

      public boolean a(dsa $$0, cun $$1, int $$2) {
         if (this.c.isPresent() && !$$0.a(this.c.get())) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1) ? false : this.e.d($$2);
         }
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<ji<dex>> b() {
         return this.c;
      }

      public Optional<cp> c() {
         return this.d;
      }

      public de.d d() {
         return this.e;
      }
   }
}
