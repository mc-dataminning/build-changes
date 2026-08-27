import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bo extends cv<bo.a> {
   @Override
   public Codec<bo.a> a() {
      return bo.a.a;
   }

   public void a(ane $$0, bkt $$1, float $$2, float $$3, boolean $$4) {
      this.a($$0, $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   public static record a(Optional<bb> b, Optional<be> c) implements cv.a {
      public static final Codec<bo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atw.a(bp.b, "player").forGetter(bo.a::a), atw.a(be.a, "damage").forGetter(bo.a::c)).apply($$0, bo.a::new)
      );

      public static an<bo.a> b() {
         return am.i.a(new bo.a(Optional.empty(), Optional.empty()));
      }

      public static an<bo.a> a(be $$0) {
         return am.i.a(new bo.a(Optional.empty(), Optional.of($$0)));
      }

      public static an<bo.a> a(be.a $$0) {
         return am.i.a(new bo.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(ane $$0, bkt $$1, float $$2, float $$3, boolean $$4) {
         return !this.c.isPresent() || this.c.get().a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }
   }
}
