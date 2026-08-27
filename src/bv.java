import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bv extends dd<bv.a> {
   @Override
   public Codec<bv.a> a() {
      return bv.a.a;
   }

   public void a(aqf $$0, csd $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<cg> c) implements dd.a {
      public static final Codec<bv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(bv.a::a), axe.a(cg.a, "item").forGetter(bv.a::b)).apply($$0, bv.a::new)
      );

      public static an<bv.a> a(cg.a $$0) {
         return am.k.a(new bv.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(csd $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<cg> b() {
         return this.c;
      }
   }
}
