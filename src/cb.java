import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cb extends dz<cb.a> {
   @Override
   public Codec<cb.a> a() {
      return cb.a.a;
   }

   public void a(are $$0, fba $$1, @Nullable bul $$2) {
      fba $$3 = $$0.dt();
      evr $$4 = $$2 != null ? bx.b($$0, $$2) : null;
      this.a($$0, $$4x -> $$4x.a($$0.y(), $$1, $$3, $$4));
   }

   public static record a(Optional<bi> b, Optional<di> c, Optional<bo> d, Optional<bi> e) implements dz.a {
      public static final Codec<cb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(cb.a::a),
                  di.a.optionalFieldOf("start_position").forGetter(cb.a::b),
                  bo.a.optionalFieldOf("distance").forGetter(cb.a::c),
                  bx.b.optionalFieldOf("cause").forGetter(cb.a::d)
               )
               .apply($$0, cb.a::new)
      );

      public static aq<cb.a> a(bo $$0, bx.a $$1) {
         return ap.ae.a(new cb.a(Optional.empty(), Optional.empty(), Optional.of($$0), Optional.of(bx.a($$1))));
      }

      @Override
      public void a(bj $$0) {
         dz.a.super.a($$0);
         $$0.a(this.d(), ".cause");
      }

      public boolean a(ard $$0, fba $$1, fba $$2, @Nullable evr $$3) {
         if (this.c.isPresent() && !this.c.get().a($$0, $$1.d, $$1.e, $$1.f)) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1.d, $$1.e, $$1.f, $$2.d, $$2.e, $$2.f)
               ? false
               : !this.e.isPresent() || $$3 != null && this.e.get().a($$3);
         }
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

      public Optional<bi> d() {
         return this.e;
      }
   }
}
