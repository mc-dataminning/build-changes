import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bj extends dy<bj.a> {
   @Override
   public Codec<bj.a> a() {
      return bj.a.a;
   }

   public void a(arr $$0, cmo $$1, coc $$2) {
      eug $$3 = bw.b($$0, $$1);
      eug $$4 = bw.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$3, $$4));
   }

   public static record a(Optional<bh> b, Optional<bh> c, Optional<bh> d) implements dy.a {
      public static final Codec<bj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(bj.a::a),
                  bw.b.optionalFieldOf("zombie").forGetter(bj.a::c),
                  bw.b.optionalFieldOf("villager").forGetter(bj.a::d)
               )
               .apply($$0, bj.a::new)
      );

      public static ap<bj.a> b() {
         return ao.s.a(new bj.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public boolean a(eug $$0, eug $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.c, ".zombie");
         $$0.a(this.d, ".villager");
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }
   }
}
