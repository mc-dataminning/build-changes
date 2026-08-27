import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bm extends dh<bm.a> {
   @Override
   public Codec<bm.a> a() {
      return bm.a.a;
   }

   public void a(aqu $$0, cuh $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bd> b, Optional<ci> c, cu.d d) implements dh.a {
      public static final Codec<bm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(bm.a::a), axu.a(ci.a, "item").forGetter(bm.a::c), axu.a(cu.d.d, "levels", cu.d.c).forGetter(bm.a::d))
               .apply($$0, bm.a::new)
      );

      public static ao<bm.a> b() {
         return an.j.a(new bm.a(Optional.empty(), Optional.empty(), cu.d.c));
      }

      public boolean a(cuh $$0, int $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.d($$1);
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }
   }
}
