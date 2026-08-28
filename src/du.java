import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class du extends dj<du.a> {
   @Override
   public Codec<du.a> a() {
      return du.a.a;
   }

   public void a(arr $$0, bwf $$1, feq $$2, int $$3) {
      ezh $$4 = bx.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bi> b, cv.d c, Optional<bi> d) implements dj.a {
      public static final Codec<du.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(du.a::a),
                  cv.d.d.optionalFieldOf("signal_strength", cv.d.c).forGetter(du.a::b),
                  bx.b.optionalFieldOf("projectile").forGetter(du.a::c)
               )
               .apply($$0, du.a::new)
      );

      public static aq<du.a> a(cv.d $$0, Optional<bi> $$1) {
         return ap.M.a(new du.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(ezh $$0, feq $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bj $$0) {
         dj.a.super.a($$0);
         $$0.a(this.d, ".projectile");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public cv.d b() {
         return this.c;
      }

      public Optional<bi> c() {
         return this.d;
      }
   }
}
