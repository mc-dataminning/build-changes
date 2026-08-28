import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class br extends dz<br.a> {
   @Override
   public Codec<br.a> a() {
      return br.a.a;
   }

   public void a(ard $$0, cwn $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bi> b, Optional<cv> c, dk.d d) implements dz.a {
      public static final Codec<br.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(br.a::a),
                  cv.a.optionalFieldOf("item").forGetter(br.a::c),
                  dk.d.d.optionalFieldOf("levels", dk.d.c).forGetter(br.a::d)
               )
               .apply($$0, br.a::new)
      );

      public static aq<br.a> b() {
         return ap.j.a(new br.a(Optional.empty(), Optional.empty(), dk.d.c));
      }

      public boolean a(cwn $$0, int $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.d($$1);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
