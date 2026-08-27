import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dp extends dh<dp.a> {
   @Override
   public Codec<dp.a> a() {
      return dp.a.a;
   }

   public void a(aqu $$0, brv $$1) {
      erp $$2 = bs.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bd> b, Optional<bd> c) implements dh.a {
      public static final Codec<dp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(dp.a::a), axu.a(bs.b, "entity").forGetter(dp.a::b)).apply($$0, dp.a::new)
      );

      public static ao<dp.a> a(bs.a $$0) {
         return an.o.a(new dp.a(Optional.empty(), Optional.of(bs.a($$0))));
      }

      public boolean a(erp $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<bd> b() {
         return this.c;
      }
   }
}
