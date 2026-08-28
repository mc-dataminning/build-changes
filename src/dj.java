import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dj extends dr<dj.a> {
   @Override
   public Codec<dj.a> a() {
      return dj.a.a;
   }

   public void a(arg $$0, cup $$1, bsu $$2) {
      eqi $$3 = bu.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static record a(Optional<bf> b, Optional<cp> c, Optional<bf> d) implements dr.a {
      public static final Codec<dj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(dj.a::a),
                  cp.a.optionalFieldOf("item").forGetter(dj.a::b),
                  bu.b.optionalFieldOf("entity").forGetter(dj.a::c)
               )
               .apply($$0, dj.a::new)
      );

      public static an<dj.a> a(Optional<bf> $$0, cp.a $$1, Optional<bf> $$2) {
         return am.T.a(new dj.a($$0, Optional.of($$1.b()), $$2));
      }

      public static an<dj.a> a(cp.a $$0, Optional<bf> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(cup $$0, eqi $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.isEmpty() || this.d.get().a($$1);
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
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
