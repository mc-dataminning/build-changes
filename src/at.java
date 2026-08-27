import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends cv<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(amq $$0, dip $$1, cmh $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bb> b, Optional<ie<cvz>> c, Optional<ca> d, ck.d e) implements cv.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atg.a(bp.b, "player").forGetter(at.a::a),
                  atg.a(kb.e.r(), "block").forGetter(at.a::b),
                  atg.a(ca.a, "item").forGetter(at.a::c),
                  atg.a(ck.d.d, "num_bees_inside", ck.d.c).forGetter(at.a::d)
               )
               .apply($$0, at.a::new)
      );

      public static an<at.a> a(cvz $$0, ca.a $$1, ck.d $$2) {
         return am.L.a(new at.a(Optional.empty(), Optional.of($$0.r()), Optional.of($$1.b()), $$2));
      }

      public boolean a(dip $$0, cmh $$1, int $$2) {
         if (this.c.isPresent() && !$$0.a(this.c.get())) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1) ? false : this.e.d($$2);
         }
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<ie<cvz>> b() {
         return this.c;
      }

      public Optional<ca> c() {
         return this.d;
      }

      public ck.d d() {
         return this.e;
      }
   }
}
