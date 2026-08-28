import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bl extends dk<bl.a> {
   @Override
   public Codec<bl.a> a() {
      return bl.a.a;
   }

   public void a(arr $$0, cph $$1, cqy $$2) {
      ezt $$3 = by.b($$0, $$1);
      ezt $$4 = by.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$3, $$4));
   }

   public static record a(Optional<bj> b, Optional<bj> c, Optional<bj> d) implements dk.a {
      public static final Codec<bl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(bl.a::a),
                  by.b.optionalFieldOf("zombie").forGetter(bl.a::c),
                  by.b.optionalFieldOf("villager").forGetter(bl.a::d)
               )
               .apply($$0, bl.a::new)
      );

      public static ar<bl.a> b() {
         return aq.s.a(new bl.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public boolean a(ezt $$0, ezt $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         $$0.a(this.c, ".zombie");
         $$0.a(this.d, ".villager");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
