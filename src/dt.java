import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dt extends dh<dt.a> {
   @Override
   public Codec<dt.a> a() {
      return dt.a.a;
   }

   public void a(aqu $$0, cuh $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bd> b, Optional<ci> c, int d) implements dh.a {
      public static final Codec<dt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(bs.b, "player").forGetter(dt.a::a),
                  axu.a(ci.a, "item_predicate").forGetter(dt.a::b),
                  Codec.INT.fieldOf("min_lubrication").forGetter(dt.a::c)
               )
               .apply($$0, dt.a::new)
      );

      public static ao<dt.a> a(int $$0) {
         return an.ak.a(new dt.a(Optional.empty(), Optional.empty(), $$0));
      }

      public static ao<dt.a> a(ci $$0, int $$1) {
         return an.ak.a(new dt.a(Optional.empty(), Optional.of($$0), $$1));
      }

      public boolean a(cuh $$0) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else {
            dri $$1 = $$0.a(ke.am);
            return $$1 == null ? false : $$1.b() >= this.d;
         }
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<ci> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
