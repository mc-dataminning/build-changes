import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cu extends cv<cu.a> {
   @Override
   public Codec<cu.a> a() {
      return cu.a.a;
   }

   public void a(ana $$0, cmr $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bb> b, Optional<ca> c) implements cv.a {
      public static final Codec<cu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atq.a(bp.b, "player").forGetter(cu.a::a), atq.a(ca.a, "item").forGetter(cu.a::b)).apply($$0, cu.a::new)
      );

      public static an<cu.a> a(Optional<ca> $$0) {
         return am.G.a(new cu.a(Optional.empty(), $$0));
      }

      public static an<cu.a> a(cth $$0) {
         return am.G.a(new cu.a(Optional.empty(), Optional.of(ca.a.a().a($$0).b())));
      }

      public boolean a(cmr $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
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
