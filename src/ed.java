import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ed extends ds<ed.a> {
   @Override
   public Codec<ed.a> a() {
      return ed.a.a;
   }

   public void a(aql $$0, clp $$1, cua $$2) {
      eqo $$3 = bu.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bf> b, Optional<bf> c, Optional<cp> d) implements ds.a {
      public static final Codec<ed.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(ed.a::a),
                  bu.b.optionalFieldOf("villager").forGetter(ed.a::c),
                  cp.a.optionalFieldOf("item").forGetter(ed.a::d)
               )
               .apply($$0, ed.a::new)
      );

      public static an<ed.a> b() {
         return am.t.a(new ed.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<ed.a> a(bu.a $$0) {
         return am.t.a(new ed.a(Optional.of(bu.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(eqo $$0, cua $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bg $$0) {
         ds.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
