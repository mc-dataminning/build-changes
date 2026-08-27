import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class co extends cv<co.a> {
   @Override
   public Codec<co.a> a() {
      return co.a.a;
   }

   public void a(amq $$0, blf $$1, bkd $$2, float $$3, float $$4, boolean $$5) {
      ege $$6 = bp.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bb> b, Optional<be> c, Optional<bb> d) implements cv.a {
      public static final Codec<co.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atg.a(bp.b, "player").forGetter(co.a::a), atg.a(be.a, "damage").forGetter(co.a::c), atg.a(bp.b, "entity").forGetter(co.a::d))
               .apply($$0, co.a::new)
      );

      public static an<co.a> b() {
         return am.h.a(new co.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<co.a> a(Optional<be> $$0) {
         return am.h.a(new co.a(Optional.empty(), $$0, Optional.empty()));
      }

      public static an<co.a> a(be.a $$0) {
         return am.h.a(new co.a(Optional.empty(), Optional.of($$0.b()), Optional.empty()));
      }

      public static an<co.a> b(Optional<bp> $$0) {
         return am.h.a(new co.a(Optional.empty(), Optional.empty(), bp.a($$0)));
      }

      public static an<co.a> a(Optional<be> $$0, Optional<bp> $$1) {
         return am.h.a(new co.a(Optional.empty(), $$0, bp.a($$1)));
      }

      public static an<co.a> a(be.a $$0, Optional<bp> $$1) {
         return am.h.a(new co.a(Optional.empty(), Optional.of($$0.b()), bp.a($$1)));
      }

      public boolean a(amq $$0, ege $$1, bkd $$2, float $$3, float $$4, boolean $$5) {
         return this.c.isPresent() && !this.c.get().a($$0, $$2, $$3, $$4, $$5) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bc $$0) {
         cv.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }
   }
}
