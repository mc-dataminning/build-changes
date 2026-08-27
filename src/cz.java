import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cz extends dh<cz.a> {
   @Override
   public Codec<cz.a> a() {
      return cz.a.a;
   }

   public void a(aqu $$0, cuh $$1, brv $$2) {
      erp $$3 = bs.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static record a(Optional<bd> b, Optional<ci> c, Optional<bd> d) implements dh.a {
      public static final Codec<cz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(cz.a::a), axu.a(ci.a, "item").forGetter(cz.a::b), axu.a(bs.b, "entity").forGetter(cz.a::c))
               .apply($$0, cz.a::new)
      );

      public static ao<cz.a> a(Optional<bd> $$0, ci.a $$1, Optional<bd> $$2) {
         return an.T.a(new cz.a($$0, Optional.of($$1.b()), $$2));
      }

      public static ao<cz.a> a(ci.a $$0, Optional<bd> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(cuh $$0, erp $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.isEmpty() || this.d.get().a($$1);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<ci> b() {
         return this.c;
      }

      public Optional<bd> c() {
         return this.d;
      }
   }
}
