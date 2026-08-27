import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bh extends cv<bh.a> {
   @Override
   public Codec<bh.a> a() {
      return bh.a.a;
   }

   public void a(ane $$0, els $$1) {
      els $$2 = $$0.dk();
      this.a($$0, $$3 -> $$3.a($$0.z(), $$1, $$2));
   }

   public static record a(Optional<bb> b, Optional<ci> c, Optional<bg> d) implements cv.a {
      public static final Codec<bh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atv.a(bp.b, "player").forGetter(bh.a::a), atv.a(ci.a, "start_position").forGetter(bh.a::b), atv.a(bg.a, "distance").forGetter(bh.a::c)
               )
               .apply($$0, bh.a::new)
      );

      public static an<bh.a> a(bp.a $$0, bg $$1, ci.a $$2) {
         return am.V.a(new bh.a(Optional.of(bp.a($$0)), Optional.of($$2.b()), Optional.of($$1)));
      }

      public static an<bh.a> a(bp.a $$0, bg $$1) {
         return am.W.a(new bh.a(Optional.of(bp.a($$0)), Optional.empty(), Optional.of($$1)));
      }

      public static an<bh.a> a(bg $$0) {
         return am.D.a(new bh.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public boolean a(and $$0, els $$1, els $$2) {
         return this.c.isPresent() && !this.c.get().a($$0, $$1.c, $$1.d, $$1.e)
            ? false
            : !this.d.isPresent() || this.d.get().a($$1.c, $$1.d, $$1.e, $$2.c, $$2.d, $$2.e);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<ci> b() {
         return this.c;
      }

      public Optional<bg> c() {
         return this.d;
      }
   }
}
