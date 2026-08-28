import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ec extends dr<ec.a> {
   @Override
   public Codec<ec.a> a() {
      return ec.a.a;
   }

   public void a(arc $$0, cma $$1, cuk $$2) {
      eqd $$3 = bu.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bf> b, Optional<bf> c, Optional<cp> d) implements dr.a {
      public static final Codec<ec.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(ec.a::a),
                  bu.b.optionalFieldOf("villager").forGetter(ec.a::c),
                  cp.a.optionalFieldOf("item").forGetter(ec.a::d)
               )
               .apply($$0, ec.a::new)
      );

      public static an<ec.a> b() {
         return am.t.a(new ec.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<ec.a> a(bu.a $$0) {
         return am.t.a(new ec.a(Optional.of(bu.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(eqd $$0, cuk $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
