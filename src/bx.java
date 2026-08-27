import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bx extends dh<bx.a> {
   @Override
   public Codec<bx.a> a() {
      return bx.a.a;
   }

   public void a(aqu $$0, cuh $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bd> b, Optional<ci> c) implements dh.a {
      public static final Codec<bx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(bx.a::a), axu.a(ci.a, "item").forGetter(bx.a::b)).apply($$0, bx.a::new)
      );

      public static ao<bx.a> a(ci.a $$0) {
         return an.k.a(new bx.a(Optional.empty(), Optional.of($$0.b())));
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
