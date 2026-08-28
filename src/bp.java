import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bp extends dz<bp.a> {
   @Override
   public Codec<bp.a> a() {
      return bp.a.a;
   }

   public void a(ard $$0, fba $$1) {
      fba $$2 = $$0.du();
      this.a($$0, $$3 -> $$3.a($$0.y(), $$1, $$2));
   }

   public static record a(Optional<bi> b, Optional<di> c, Optional<bo> d) implements dz.a {
      public static final Codec<bp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(bp.a::a),
                  di.a.optionalFieldOf("start_position").forGetter(bp.a::b),
                  bo.a.optionalFieldOf("distance").forGetter(bp.a::c)
               )
               .apply($$0, bp.a::new)
      );

      public static aq<bp.a> a(bx.a $$0, bo $$1, di.a $$2) {
         return ap.X.a(new bp.a(Optional.of(bx.a($$0)), Optional.of($$2.b()), Optional.of($$1)));
      }

      public static aq<bp.a> a(bx.a $$0, bo $$1) {
         return ap.Y.a(new bp.a(Optional.of(bx.a($$0)), Optional.empty(), Optional.of($$1)));
      }

      public static aq<bp.a> a(bo $$0) {
         return ap.D.a(new bp.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public boolean a(arc $$0, fba $$1, fba $$2) {
         return this.c.isPresent() && !this.c.get().a($$0, $$1.d, $$1.e, $$1.f)
            ? false
            : !this.d.isPresent() || this.d.get().a($$1.d, $$1.e, $$1.f, $$2.d, $$2.e, $$2.f);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<di> b() {
         return this.c;
      }

      public Optional<bo> c() {
         return this.d;
      }
   }
}
