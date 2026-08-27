import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class de extends cv<de.a> {
   @Override
   public Codec<de.a> a() {
      return de.a.a;
   }

   public void a(ane $$0, ceq $$1, cmy $$2) {
      egw $$3 = bp.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bb> b, Optional<bb> c, Optional<ca> d) implements cv.a {
      public static final Codec<de.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atw.a(bp.b, "player").forGetter(de.a::a), atw.a(bp.b, "villager").forGetter(de.a::c), atw.a(ca.a, "item").forGetter(de.a::d))
               .apply($$0, de.a::new)
      );

      public static an<de.a> b() {
         return am.t.a(new de.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<de.a> a(bp.a $$0) {
         return am.t.a(new de.a(Optional.of(bp.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(egw $$0, cmy $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bc $$0) {
         cv.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }
   }
}
