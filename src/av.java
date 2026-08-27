import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class av extends dh<av.a> {
   @Override
   public Codec<av.a> a() {
      return av.a.a;
   }

   public void a(aqu $$0, dtc $$1, cuh $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bd> b, Optional<ja<dfc>> c, Optional<ci> d, cu.d e) implements dh.a {
      public static final Codec<av.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(bs.b, "player").forGetter(av.a::a),
                  axu.a(lh.e.r(), "block").forGetter(av.a::b),
                  axu.a(ci.a, "item").forGetter(av.a::c),
                  axu.a(cu.d.d, "num_bees_inside", cu.d.c).forGetter(av.a::d)
               )
               .apply($$0, av.a::new)
      );

      public static ao<av.a> a(dfc $$0, ci.a $$1, cu.d $$2) {
         return an.L.a(new av.a(Optional.empty(), Optional.of($$0.r()), Optional.of($$1.b()), $$2));
      }

      public boolean a(dtc $$0, cuh $$1, int $$2) {
         if (this.c.isPresent() && !$$0.a(this.c.get())) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1) ? false : this.e.d($$2);
         }
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<ja<dfc>> b() {
         return this.c;
      }

      public Optional<ci> c() {
         return this.d;
      }

      public cu.d d() {
         return this.e;
      }
   }
}
