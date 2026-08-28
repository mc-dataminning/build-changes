import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eww extends exe {
   public static final int a = 0;
   public static final MapCodec<eww> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dcz.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  ezx.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, eww::new)
   );
   private final jr<dcz> c;
   private final ezw d;
   private final int e;

   eww(List<eza> $$0, jr<dcz> $$1, ezw $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public exg<eww> b() {
      return exh.m;
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(ImmutableSet.of(eyl.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      buk $$2 = $$1.c(eyl.d);
      if ($$2 instanceof bvg $$3) {
         int $$4 = ddb.a(this.c, $$3);
         if ($$4 == 0) {
            return $$0;
         }

         float $$5 = (float)$$4 * this.d.b($$1);
         $$0.g(Math.round($$5));
         if (this.c()) {
            $$0.f(this.e);
         }
      }

      return $$0;
   }

   public static eww.a a(jt.a $$0, ezw $$1) {
      jt.b<dcz> $$2 = $$0.d(mc.aO);
      return new eww.a($$2.b(dde.s), $$1);
   }

   public static class a extends exe.a<eww.a> {
      private final jr<dcz> a;
      private final ezw b;
      private int c = 0;

      public a(jr<dcz> $$0, ezw $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected eww.a a() {
         return this;
      }

      public eww.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public exf b() {
         return new eww(this.g(), this.a, this.b, this.c);
      }
   }
}
