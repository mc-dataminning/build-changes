import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bm extends dr<bm.a> {
   @Override
   public Codec<bm.a> a() {
      return bm.a.a;
   }

   public void a(arg $$0, evs $$1) {
      evs $$2 = $$0.dn();
      this.a($$0, $$3 -> $$3.a($$0.z(), $$1, $$2));
   }

   public static record a(Optional<bf> b, Optional<dc> c, Optional<bl> d) implements dr.a {
      public static final Codec<bm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(bm.a::a),
                  dc.a.optionalFieldOf("start_position").forGetter(bm.a::b),
                  bl.a.optionalFieldOf("distance").forGetter(bm.a::c)
               )
               .apply($$0, bm.a::new)
      );

      public static an<bm.a> a(bu.a $$0, bl $$1, dc.a $$2) {
         return am.X.a(new bm.a(Optional.of(bu.a($$0)), Optional.of($$2.b()), Optional.of($$1)));
      }

      public static an<bm.a> a(bu.a $$0, bl $$1) {
         return am.Y.a(new bm.a(Optional.of(bu.a($$0)), Optional.empty(), Optional.of($$1)));
      }

      public static an<bm.a> a(bl $$0) {
         return am.D.a(new bm.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public boolean a(arf $$0, evs $$1, evs $$2) {
         return this.c.isPresent() && !this.c.get().a($$0, $$1.c, $$1.d, $$1.e)
            ? false
            : !this.d.isPresent() || this.d.get().a($$1.c, $$1.d, $$1.e, $$2.c, $$2.d, $$2.e);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<dc> b() {
         return this.c;
      }

      public Optional<bl> c() {
         return this.d;
      }
   }
}
