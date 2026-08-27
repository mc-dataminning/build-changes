import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dj extends cx<dj.a> {
   @Override
   public Codec<dj.a> a() {
      return dj.a.a;
   }

   public void a(aox $$0, cpd $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<cc> c) implements cx.a {
      public static final Codec<dj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avq.a(br.b, "player").forGetter(dj.a::a), avq.a(cc.a, "item").forGetter(dj.a::b)).apply($$0, dj.a::new)
      );

      public static an<dj.a> a(br.a $$0, cc.a $$1) {
         return am.W.a(new dj.a(Optional.of(br.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(cpd $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<cc> b() {
         return this.c;
      }
   }
}
