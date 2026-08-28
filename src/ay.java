import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ay extends dy<ay.a> {
   @Override
   public Codec<ay.a> a() {
      return ay.a.a;
   }

   public void a(arr $$0, cgv $$1, cgv $$2, @Nullable btz $$3) {
      eug $$4 = bw.b($$0, $$1);
      eug $$5 = bw.b($$0, $$2);
      eug $$6 = $$3 != null ? bw.b($$0, $$3) : null;
      this.a($$0, $$3x -> $$3x.a($$4, $$5, $$6));
   }

   public static record a(Optional<bh> b, Optional<bh> c, Optional<bh> d, Optional<bh> e) implements dy.a {
      public static final Codec<ay.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(ay.a::a),
                  bw.b.optionalFieldOf("parent").forGetter(ay.a::c),
                  bw.b.optionalFieldOf("partner").forGetter(ay.a::d),
                  bw.b.optionalFieldOf("child").forGetter(ay.a::e)
               )
               .apply($$0, ay.a::new)
      );

      public static ap<ay.a> b() {
         return ao.p.a(new ay.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ap<ay.a> a(bw.a $$0) {
         return ao.p.a(new ay.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(bw.a($$0))));
      }

      public static ap<ay.a> a(Optional<bw> $$0, Optional<bw> $$1, Optional<bw> $$2) {
         return ao.p.a(new ay.a(Optional.empty(), bw.a($$0), bw.a($$1), bw.a($$2)));
      }

      public boolean a(eug $$0, eug $$1, @Nullable eug $$2) {
         return !this.e.isPresent() || $$2 != null && this.e.get().a($$2) ? a(this.c, $$0) && a(this.d, $$1) || a(this.c, $$1) && a(this.d, $$0) : false;
      }

      private static boolean a(Optional<bh> $$0, eug $$1) {
         return $$0.isEmpty() || $$0.get().a($$1);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.c, ".parent");
         $$0.a(this.d, ".partner");
         $$0.a(this.e, ".child");
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }
   }
}
