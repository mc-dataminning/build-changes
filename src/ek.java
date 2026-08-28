import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ek extends dz<ek.a> {
   @Override
   public Codec<ek.a> a() {
      return ek.a.a;
   }

   public void a(ard $$0, cob $$1, cwn $$2) {
      evp $$3 = bx.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bi> b, Optional<bi> c, Optional<cv> d) implements dz.a {
      public static final Codec<ek.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(ek.a::a),
                  bx.b.optionalFieldOf("villager").forGetter(ek.a::c),
                  cv.a.optionalFieldOf("item").forGetter(ek.a::d)
               )
               .apply($$0, ek.a::new)
      );

      public static aq<ek.a> b() {
         return ap.t.a(new ek.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static aq<ek.a> a(bx.a $$0) {
         return ap.t.a(new ek.a(Optional.of(bx.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(evp $$0, cwn $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bj $$0) {
         dz.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
