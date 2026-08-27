import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class du extends dh<du.a> {
   @Override
   public Codec<du.a> a() {
      return du.a.a;
   }

   public void a(aqu $$0, clg $$1, cuh $$2) {
      erp $$3 = bs.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bd> b, Optional<bd> c, Optional<ci> d) implements dh.a {
      public static final Codec<du.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(du.a::a), axu.a(bs.b, "villager").forGetter(du.a::c), axu.a(ci.a, "item").forGetter(du.a::d))
               .apply($$0, du.a::new)
      );

      public static ao<du.a> b() {
         return an.t.a(new du.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<du.a> a(bs.a $$0) {
         return an.t.a(new du.a(Optional.of(bs.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(erp $$0, cuh $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }
   }
}
