import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cv extends dd<cv.a> {
   @Override
   public Codec<cv.a> a() {
      return cv.a.a;
   }

   public void a(aqf $$0, csd $$1, @Nullable bql $$2) {
      eoa $$3 = br.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static record a(Optional<bc> b, Optional<cg> c, Optional<bc> d) implements dd.a {
      public static final Codec<cv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(cv.a::a), axe.a(cg.a, "item").forGetter(cv.a::b), axe.a(br.b, "entity").forGetter(cv.a::c))
               .apply($$0, cv.a::new)
      );

      public static an<cv.a> a(bc $$0, Optional<cg> $$1, Optional<bc> $$2) {
         return am.R.a(new cv.a(Optional.of($$0), $$1, $$2));
      }

      public static an<cv.a> a(Optional<bc> $$0, Optional<cg> $$1, Optional<bc> $$2) {
         return am.S.a(new cv.a($$0, $$1, $$2));
      }

      public boolean a(aqf $$0, csd $$1, eoa $$2) {
         return this.c.isPresent() && !this.c.get().a($$1) ? false : !this.d.isPresent() || this.d.get().a($$2);
      }

      @Override
      public void a(bd $$0) {
         dd.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<cg> b() {
         return this.c;
      }

      public Optional<bc> c() {
         return this.d;
      }
   }
}
