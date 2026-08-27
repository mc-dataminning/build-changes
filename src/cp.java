import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cp extends cv<cp.a> {
   @Override
   public Codec<cp.a> a() {
      return cp.a.a;
   }

   public void a(anf $$0, cng $$1, blw $$2) {
      ehf $$3 = bp.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static record a(Optional<bb> b, Optional<ca> c, Optional<bb> d) implements cv.a {
      public static final Codec<cp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atx.a(bp.b, "player").forGetter(cp.a::a), atx.a(ca.a, "item").forGetter(cp.a::b), atx.a(bp.b, "entity").forGetter(cp.a::c))
               .apply($$0, cp.a::new)
      );

      public static an<cp.a> a(Optional<bb> $$0, ca.a $$1, Optional<bb> $$2) {
         return am.R.a(new cp.a($$0, Optional.of($$1.b()), $$2));
      }

      public static an<cp.a> a(ca.a $$0, Optional<bb> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(cng $$0, ehf $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.isEmpty() || this.d.get().a($$1);
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

      public Optional<ca> b() {
         return this.c;
      }

      public Optional<bb> c() {
         return this.d;
      }
   }
}
