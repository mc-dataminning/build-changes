import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cf extends dh<cf.a> {
   @Override
   public Codec<cf.a> a() {
      return cf.a.a;
   }

   public void a(aqu $$0, cuh $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bd> b, Optional<ci> c, cu.d d, cu.d e) implements dh.a {
      public static final Codec<cf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(bs.b, "player").forGetter(cf.a::a),
                  axu.a(ci.a, "item").forGetter(cf.a::b),
                  axu.a(cu.d.d, "durability", cu.d.c).forGetter(cf.a::c),
                  axu.a(cu.d.d, "delta", cu.d.c).forGetter(cf.a::d)
               )
               .apply($$0, cf.a::new)
      );

      public static ao<cf.a> a(Optional<ci> $$0, cu.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static ao<cf.a> a(Optional<bd> $$0, Optional<ci> $$1, cu.d $$2) {
         return an.u.a(new cf.a($$0, $$1, $$2, cu.d.c));
      }

      public boolean a(cuh $$0, int $$1) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else {
            return !this.d.d($$0.n() - $$1) ? false : this.e.d($$0.m() - $$1);
         }
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<ci> b() {
         return this.c;
      }

      public cu.d c() {
         return this.d;
      }

      public cu.d d() {
         return this.e;
      }
   }
}
