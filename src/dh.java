import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dh extends cv<dh.a> {
   @Override
   public Codec<dh.a> a() {
      return dh.a.a;
   }

   public void a(ana $$0, cmr $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bb> b, Optional<ca> c) implements cv.a {
      public static final Codec<dh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atq.a(bp.b, "player").forGetter(dh.a::a), atq.a(ca.a, "item").forGetter(dh.a::b)).apply($$0, dh.a::new)
      );

      public static an<dh.a> a(bp.a $$0, ca.a $$1) {
         return am.U.a(new dh.a(Optional.of(bp.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(cmr $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<ca> b() {
         return this.c;
      }
   }
}
