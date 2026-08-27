import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bz extends cv<bz.a> {
   @Override
   public Codec<bz.a> a() {
      return bz.a.a;
   }

   public void a(ane $$0, cmy $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bb> b, Optional<ca> c, ck.d d, ck.d e) implements cv.a {
      public static final Codec<bz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atw.a(bp.b, "player").forGetter(bz.a::a),
                  atw.a(ca.a, "item").forGetter(bz.a::b),
                  atw.a(ck.d.d, "durability", ck.d.c).forGetter(bz.a::c),
                  atw.a(ck.d.d, "delta", ck.d.c).forGetter(bz.a::d)
               )
               .apply($$0, bz.a::new)
      );

      public static an<bz.a> a(Optional<ca> $$0, ck.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static an<bz.a> a(Optional<bb> $$0, Optional<ca> $$1, ck.d $$2) {
         return am.u.a(new bz.a($$0, $$1, $$2, ck.d.c));
      }

      public boolean a(cmy $$0, int $$1) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else {
            return !this.d.d($$0.l() - $$1) ? false : this.e.d($$0.k() - $$1);
         }
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<ca> b() {
         return this.c;
      }

      public ck.d c() {
         return this.d;
      }

      public ck.d d() {
         return this.e;
      }
   }
}
