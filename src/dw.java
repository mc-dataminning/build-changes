import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dw extends dl<dw.a> {
   @Override
   public Codec<dw.a> a() {
      return dw.a.a;
   }

   public void a(arv $$0, bwv $$1, ffs $$2, int $$3) {
      faj $$4 = bz.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bj> b, cx.d c, Optional<bj> d) implements dl.a {
      public static final Codec<dw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(dw.a::a),
                  cx.d.d.optionalFieldOf("signal_strength", cx.d.c).forGetter(dw.a::b),
                  bz.b.optionalFieldOf("projectile").forGetter(dw.a::c)
               )
               .apply($$0, dw.a::new)
      );

      public static ar<dw.a> a(cx.d $$0, Optional<bj> $$1) {
         return aq.M.a(new dw.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(faj $$0, ffs $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         $$0.a(this.d, ".projectile");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public cx.d b() {
         return this.c;
      }

      public Optional<bj> c() {
         return this.d;
      }
   }
}
