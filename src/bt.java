import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bt extends cv<bt.a> {
   @Override
   public Codec<bt.a> a() {
      return bt.a.a;
   }

   public void a(ana $$0, cmr $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bb> b, Optional<ca> c) implements cv.a {
      public static final Codec<bt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atq.a(bp.b, "player").forGetter(bt.a::a), atq.a(ca.a, "item").forGetter(bt.a::b)).apply($$0, bt.a::new)
      );

      public static an<bt.a> a(ca.a $$0) {
         return am.k.a(new bt.a(Optional.empty(), Optional.of($$0.b())));
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
