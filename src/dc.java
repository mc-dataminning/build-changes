import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dc extends cv<dc.a> {
   @Override
   public Codec<dc.a> a() {
      return dc.a.a;
   }

   public void a(ana $$0, bxs $$1) {
      egp $$2 = bp.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bb> b, Optional<bb> c) implements cv.a {
      public static final Codec<dc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atq.a(bp.b, "player").forGetter(dc.a::a), atq.a(bp.b, "entity").forGetter(dc.a::c)).apply($$0, dc.a::new)
      );

      public static an<dc.a> b() {
         return am.y.a(new dc.a(Optional.empty(), Optional.empty()));
      }

      public static an<dc.a> a(bp.a $$0) {
         return am.y.a(new dc.a(Optional.empty(), Optional.of(bp.a($$0))));
      }

      public boolean a(egp $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
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
   }
}
