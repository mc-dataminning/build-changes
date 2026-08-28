import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dd extends dl<dd.a> {
   @Override
   public Codec<dd.a> a() {
      return dd.a.a;
   }

   public void a(arv $$0, daa $$1, bwv $$2) {
      faj $$3 = bz.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static record a(Optional<bj> b, Optional<cn> c, Optional<bj> d) implements dl.a {
      public static final Codec<dd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(dd.a::a),
                  cn.a.optionalFieldOf("item").forGetter(dd.a::b),
                  bz.b.optionalFieldOf("entity").forGetter(dd.a::c)
               )
               .apply($$0, dd.a::new)
      );

      public static ar<dd.a> a(Optional<bj> $$0, cn.a $$1, Optional<bj> $$2) {
         return aq.T.a(new dd.a($$0, Optional.of($$1.b()), $$2));
      }

      public static ar<dd.a> a(cn.a $$0, Optional<bj> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(daa $$0, faj $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.isEmpty() || this.d.get().a($$1);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<cn> b() {
         return this.c;
      }

      public Optional<bj> c() {
         return this.d;
      }
   }
}
