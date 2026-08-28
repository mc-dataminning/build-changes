import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dx extends dl<dx.a> {
   @Override
   public Codec<dx.a> a() {
      return dx.a.a;
   }

   public void a(asc $$0, crp $$1, dak $$2) {
      fat $$3 = bz.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bj> b, Optional<bj> c, Optional<cn> d) implements dl.a {
      public static final Codec<dx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(dx.a::a),
                  bz.b.optionalFieldOf("villager").forGetter(dx.a::c),
                  cn.a.optionalFieldOf("item").forGetter(dx.a::d)
               )
               .apply($$0, dx.a::new)
      );

      public static ar<dx.a> b() {
         return aq.t.a(new dx.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<dx.a> a(bz.a $$0) {
         return aq.t.a(new dx.a(Optional.of(bz.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(fat $$0, dak $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
