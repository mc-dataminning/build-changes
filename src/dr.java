import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dr extends dz<dr.a> {
   @Override
   public Codec<dr.a> a() {
      return dr.a.a;
   }

   public void a(are $$0, cwp $$1, bul $$2) {
      evr $$3 = bx.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static record a(Optional<bi> b, Optional<cv> c, Optional<bi> d) implements dz.a {
      public static final Codec<dr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(dr.a::a),
                  cv.a.optionalFieldOf("item").forGetter(dr.a::b),
                  bx.b.optionalFieldOf("entity").forGetter(dr.a::c)
               )
               .apply($$0, dr.a::new)
      );

      public static aq<dr.a> a(Optional<bi> $$0, cv.a $$1, Optional<bi> $$2) {
         return ap.T.a(new dr.a($$0, Optional.of($$1.b()), $$2));
      }

      public static aq<dr.a> a(cv.a $$0, Optional<bi> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(cwp $$0, evr $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.isEmpty() || this.d.get().a($$1);
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
