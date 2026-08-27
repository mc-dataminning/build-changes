import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bj extends cv<bj.a> {
   @Override
   public Codec<bj.a> a() {
      return bj.a.a;
   }

   public void a(ane $$0, cmx $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bb> b, Optional<ca> c, ck.d d) implements cv.a {
      public static final Codec<bj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atv.a(bp.b, "player").forGetter(bj.a::a), atv.a(ca.a, "item").forGetter(bj.a::c), atv.a(ck.d.d, "levels", ck.d.c).forGetter(bj.a::d))
               .apply($$0, bj.a::new)
      );

      public static an<bj.a> b() {
         return am.j.a(new bj.a(Optional.empty(), Optional.empty(), ck.d.c));
      }

      public boolean a(cmx $$0, int $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.d($$1);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }
   }
}
