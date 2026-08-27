import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bc extends dh<bc.a> {
   @Override
   public Codec<bc.a> a() {
      return bc.a.a;
   }

   public void a(aqu $$0, cuh $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bd> b, Optional<ci> c) implements dh.a {
      public static final Codec<bc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(bc.a::a), axu.a(ci.a, "item").forGetter(bc.a::c)).apply($$0, bc.a::new)
      );

      public static ao<bc.a> b() {
         return an.A.a(new bc.a(Optional.empty(), Optional.empty()));
      }

      public static ao<bc.a> a(dbz $$0) {
         return a(ci.a.a().a($$0.q()));
      }

      public static ao<bc.a> a(ci.a $$0) {
         return an.A.a(new bc.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cuh $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }
   }
}
