import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dd extends cv<dd.a> {
   @Override
   public Codec<dd.a> a() {
      return dd.a.a;
   }

   public void a(ane $$0, blu $$1, els $$2, int $$3) {
      egv $$4 = bp.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bb> b, ck.d c, Optional<bb> d) implements cv.a {
      public static final Codec<dd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atv.a(bp.b, "player").forGetter(dd.a::a),
                  atv.a(ck.d.d, "signal_strength", ck.d.c).forGetter(dd.a::b),
                  atv.a(bp.b, "projectile").forGetter(dd.a::c)
               )
               .apply($$0, dd.a::new)
      );

      public static an<dd.a> a(ck.d $$0, Optional<bb> $$1) {
         return am.M.a(new dd.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(egv $$0, els $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bc $$0) {
         cv.a.super.a($$0);
         $$0.a(this.d, ".projectile");
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public ck.d b() {
         return this.c;
      }

      public Optional<bb> c() {
         return this.d;
      }
   }
}
