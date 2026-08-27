import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cd extends cv<cd.a> {
   @Override
   public Codec<cd.a> a() {
      return cd.a.a;
   }

   public void a(ana $$0, blp $$1, bkn $$2) {
      egp $$3 = bp.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static record a(Optional<bb> b, Optional<bb> c, Optional<bf> d) implements cv.a {
      public static final Codec<cd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atq.a(bp.b, "player").forGetter(cd.a::a), atq.a(bp.b, "entity").forGetter(cd.a::e), atq.a(bf.a, "killing_blow").forGetter(cd.a::f))
               .apply($$0, cd.a::new)
      );

      public static an<cd.a> a(Optional<bp> $$0) {
         return am.c.a(new cd.a(Optional.empty(), bp.a($$0), Optional.empty()));
      }

      public static an<cd.a> a(bp.a $$0) {
         return am.c.a(new cd.a(Optional.empty(), Optional.of(bp.a($$0)), Optional.empty()));
      }

      public static an<cd.a> b() {
         return am.c.a(new cd.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cd.a> a(Optional<bp> $$0, Optional<bf> $$1) {
         return am.c.a(new cd.a(Optional.empty(), bp.a($$0), $$1));
      }

      public static an<cd.a> a(bp.a $$0, Optional<bf> $$1) {
         return am.c.a(new cd.a(Optional.empty(), Optional.of(bp.a($$0)), $$1));
      }

      public static an<cd.a> a(Optional<bp> $$0, bf.a $$1) {
         return am.c.a(new cd.a(Optional.empty(), bp.a($$0), Optional.of($$1.b())));
      }

      public static an<cd.a> a(bp.a $$0, bf.a $$1) {
         return am.c.a(new cd.a(Optional.empty(), Optional.of(bp.a($$0)), Optional.of($$1.b())));
      }

      public static an<cd.a> c() {
         return am.X.a(new cd.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cd.a> b(Optional<bp> $$0) {
         return am.d.a(new cd.a(Optional.empty(), bp.a($$0), Optional.empty()));
      }

      public static an<cd.a> b(bp.a $$0) {
         return am.d.a(new cd.a(Optional.empty(), Optional.of(bp.a($$0)), Optional.empty()));
      }

      public static an<cd.a> d() {
         return am.d.a(new cd.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cd.a> b(Optional<bp> $$0, Optional<bf> $$1) {
         return am.d.a(new cd.a(Optional.empty(), bp.a($$0), $$1));
      }

      public static an<cd.a> b(bp.a $$0, Optional<bf> $$1) {
         return am.d.a(new cd.a(Optional.empty(), Optional.of(bp.a($$0)), $$1));
      }

      public static an<cd.a> b(Optional<bp> $$0, bf.a $$1) {
         return am.d.a(new cd.a(Optional.empty(), bp.a($$0), Optional.of($$1.b())));
      }

      public static an<cd.a> b(bp.a $$0, bf.a $$1) {
         return am.d.a(new cd.a(Optional.empty(), Optional.of(bp.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(ana $$0, egp $$1, bkn $$2) {
         return this.d.isPresent() && !this.d.get().a($$0, $$2) ? false : this.c.isEmpty() || this.c.get().a($$1);
      }

      @Override
      public void a(bc $$0) {
         cv.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<bb> e() {
         return this.c;
      }

      public Optional<bf> f() {
         return this.d;
      }
   }
}
