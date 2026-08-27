import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dg extends dh<dg.a> {
   @Override
   public Codec<dg.a> a() {
      return dg.a.a;
   }

   public void a(aqu $$0, cuh $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bd> b, Optional<ci> c) implements dh.a {
      public static final Codec<dg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(dg.a::a), axu.a(ci.a, "item").forGetter(dg.a::b)).apply($$0, dg.a::new)
      );

      public static ao<dg.a> a(Optional<ci> $$0) {
         return an.G.a(new dg.a(Optional.empty(), $$0));
      }

      public static ao<dg.a> a(dbz $$0) {
         return an.G.a(new dg.a(Optional.empty(), Optional.of(ci.a.a().a($$0).b())));
      }

      public boolean a(cuh $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
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
