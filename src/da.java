import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class da extends cv<da.a> {
   @Override
   public Codec<da.a> a() {
      return da.a.a;
   }

   public void a(ana $$0, blp $$1) {
      egp $$2 = bp.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bb> b, Optional<bb> c) implements cv.a {
      public static final Codec<da.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atq.a(bp.b, "player").forGetter(da.a::a), atq.a(bp.b, "entity").forGetter(da.a::b)).apply($$0, da.a::new)
      );

      public static an<da.a> a(bp.a $$0) {
         return am.o.a(new da.a(Optional.empty(), Optional.of(bp.a($$0))));
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

      public Optional<bb> b() {
         return this.c;
      }
   }
}
