import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bl extends dl<bl.a> {
   @Override
   public Codec<bl.a> a() {
      return bl.a.a;
   }

   public void a(arv $$0, cpu $$1, crl $$2) {
      faj $$3 = bz.b($$0, $$1);
      faj $$4 = bz.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$3, $$4));
   }

   public static record a(Optional<bj> b, Optional<bj> c, Optional<bj> d) implements dl.a {
      public static final Codec<bl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(bl.a::a),
                  bz.b.optionalFieldOf("zombie").forGetter(bl.a::c),
                  bz.b.optionalFieldOf("villager").forGetter(bl.a::d)
               )
               .apply($$0, bl.a::new)
      );

      public static ar<bl.a> b() {
         return aq.s.a(new bl.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public boolean a(faj $$0, faj $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         $$0.a(this.c, ".zombie");
         $$0.a(this.d, ".villager");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
