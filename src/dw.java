import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dw extends dh<dw.a> {
   @Override
   public Codec<dw.a> a() {
      return dw.a.a;
   }

   public void a(aqu $$0, cuh $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bd> b, Optional<ci> c) implements dh.a {
      public static final Codec<dw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(dw.a::a), axu.a(ci.a, "item").forGetter(dw.a::b)).apply($$0, dw.a::new)
      );

      public static ao<dw.a> a(ci $$0) {
         return an.C.a(new dw.a(Optional.empty(), Optional.of($$0)));
      }

      public static ao<dw.a> a(dbz $$0) {
         return an.C.a(new dw.a(Optional.empty(), Optional.of(ci.a.a().a($$0).b())));
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
