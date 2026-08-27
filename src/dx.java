import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dx extends dh<dx.a> {
   @Override
   public Codec<dx.a> a() {
      return dx.a.a;
   }

   public void a(aqu $$0, cuh $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bd> b, Optional<ci> c) implements dh.a {
      public static final Codec<dx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(dx.a::a), axu.a(ci.a, "item").forGetter(dx.a::b)).apply($$0, dx.a::new)
      );

      public static ao<dx.a> a(bs.a $$0, ci.a $$1) {
         return an.W.a(new dx.a(Optional.of(bs.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(cuh $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<ci> b() {
         return this.c;
      }
   }
}
