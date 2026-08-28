import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dp extends dy<dp.a> {
   @Override
   public Codec<dp.a> a() {
      return dp.a.a;
   }

   public void a(asi $$0, bvj $$1, btz $$2, float $$3, float $$4, boolean $$5) {
      ewo $$6 = bw.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bh> b, Optional<bk> c, Optional<bh> d) implements dy.a {
      public static final Codec<dp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(dp.a::a),
                  bk.a.optionalFieldOf("damage").forGetter(dp.a::c),
                  bw.b.optionalFieldOf("entity").forGetter(dp.a::d)
               )
               .apply($$0, dp.a::new)
      );

      public static ap<dp.a> b() {
         return ao.h.a(new dp.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ap<dp.a> a(Optional<bk> $$0) {
         return ao.h.a(new dp.a(Optional.empty(), $$0, Optional.empty()));
      }

      public static ap<dp.a> a(bk.a $$0) {
         return ao.h.a(new dp.a(Optional.empty(), Optional.of($$0.b()), Optional.empty()));
      }

      public static ap<dp.a> b(Optional<bw> $$0) {
         return ao.h.a(new dp.a(Optional.empty(), Optional.empty(), bw.a($$0)));
      }

      public static ap<dp.a> a(Optional<bk> $$0, Optional<bw> $$1) {
         return ao.h.a(new dp.a(Optional.empty(), $$0, bw.a($$1)));
      }

      public static ap<dp.a> a(bk.a $$0, Optional<bw> $$1) {
         return ao.h.a(new dp.a(Optional.empty(), Optional.of($$0.b()), bw.a($$1)));
      }

      public boolean a(asi $$0, ewo $$1, btz $$2, float $$3, float $$4, boolean $$5) {
         return this.c.isPresent() && !this.c.get().a($$0, $$2, $$3, $$4, $$5) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }
   }
}
