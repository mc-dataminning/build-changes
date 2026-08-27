import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ds extends dd<ds.a> {
   @Override
   public Codec<ds.a> a() {
      return ds.a.a;
   }

   public void a(aqf $$0, csd $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<cg> c) implements dd.a {
      public static final Codec<ds.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(ds.a::a), axe.a(cg.a, "item").forGetter(ds.a::b)).apply($$0, ds.a::new)
      );

      public static an<ds.a> a(br.a $$0, cg.a $$1) {
         return am.W.a(new ds.a(Optional.of(br.a($$0)), Optional.of($$1.b())));
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
