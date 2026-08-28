import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ej extends dy<ej.a> {
   @Override
   public Codec<ej.a> a() {
      return ej.a.a;
   }

   public void a(aro $$0, cnt $$1, cwb $$2) {
      euc $$3 = bw.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bh> b, Optional<bh> c, Optional<cu> d) implements dy.a {
      public static final Codec<ej.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(ej.a::a),
                  bw.b.optionalFieldOf("villager").forGetter(ej.a::c),
                  cu.a.optionalFieldOf("item").forGetter(ej.a::d)
               )
               .apply($$0, ej.a::new)
      );

      public static ap<ej.a> b() {
         return ao.t.a(new ej.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ap<ej.a> a(bw.a $$0) {
         return ao.t.a(new ej.a(Optional.of(bw.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(euc $$0, cwb $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }
   }
}
