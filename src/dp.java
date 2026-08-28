import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dp extends dz<dp.a> {
   @Override
   public Codec<dp.a> a() {
      return dp.a.a;
   }

   public void a(are $$0, cwq $$1, @Nullable bum $$2) {
      evs $$3 = bx.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static record a(Optional<bi> b, Optional<cv> c, Optional<bi> d) implements dz.a {
      public static final Codec<dp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(dp.a::a),
                  cv.a.optionalFieldOf("item").forGetter(dp.a::b),
                  bx.b.optionalFieldOf("entity").forGetter(dp.a::c)
               )
               .apply($$0, dp.a::new)
      );

      public static aq<dp.a> a(bi $$0, Optional<cv> $$1, Optional<bi> $$2) {
         return ap.R.a(new dp.a(Optional.of($$0), $$1, $$2));
      }

      public static aq<dp.a> a(Optional<bi> $$0, Optional<cv> $$1, Optional<bi> $$2) {
         return ap.S.a(new dp.a($$0, $$1, $$2));
      }

      public boolean a(are $$0, cwq $$1, evs $$2) {
         return this.c.isPresent() && !this.c.get().a($$1) ? false : !this.d.isPresent() || this.d.get().a($$2);
      }

      @Override
      public void a(bj $$0) {
         dz.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<cv> b() {
         return this.c;
      }

      public Optional<bi> c() {
         return this.d;
      }
   }
}
