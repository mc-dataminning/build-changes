import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dwx extends dwv {
   public static final Codec<dwx> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  bja.e.fieldOf("extra_branch_steps").forGetter($$0x -> $$0x.b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("place_branch_per_log_probability").forGetter($$0x -> $$0x.h),
                  bja.d.fieldOf("extra_branch_length").forGetter($$0x -> $$0x.i),
                  iv.a(ke.f).fieldOf("can_grow_through").forGetter($$0x -> $$0x.j)
               )
            )
            .apply($$0, dwx::new)
   );
   private final bja b;
   private final float h;
   private final bja i;
   private final il<cwj> j;

   public dwx(int $$0, int $$1, int $$2, bja $$3, float $$4, bja $$5, il<cwj> $$6) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   @Override
   protected dww<?> a() {
      return dww.h;
   }

   @Override
   public List<dvd.a> a(cto $$0, BiConsumer<hx, dja> $$1, aup $$2, int $$3, hx $$4, dun $$5) {
      List<dvd.a> $$6 = Lists.newArrayList();
      hx.a $$7 = new hx.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         int $$9 = $$4.v() + $$8;
         if (this.b($$0, $$1, $$2, $$7.d($$4.u(), $$9, $$4.w()), $$5) && $$8 < $$3 - 1 && $$2.i() < this.h) {
            ic $$10 = ic.c.a.a($$2);
            int $$11 = this.i.a($$2);
            int $$12 = Math.max(0, $$11 - this.i.a($$2) - 1);
            int $$13 = this.b.a($$2);
            this.a($$0, $$1, $$2, $$3, $$5, $$6, $$7, $$9, $$10, $$12, $$13);
         }

         if ($$8 == $$3 - 1) {
            $$6.add(new dvd.a($$7.d($$4.u(), $$9 + 1, $$4.w()), 0, false));
         }
      }

      return $$6;
   }

   private void a(cto $$0, BiConsumer<hx, dja> $$1, aup $$2, int $$3, dun $$4, List<dvd.a> $$5, hx.a $$6, int $$7, ic $$8, int $$9, int $$10) {
      int $$11 = $$7 + $$9;
      int $$12 = $$6.u();
      int $$13 = $$6.w();
      int $$14 = $$9;

      while ($$14 < $$3 && $$10 > 0) {
         if ($$14 >= 1) {
            int $$15 = $$7 + $$14;
            $$12 += $$8.j();
            $$13 += $$8.l();
            $$11 = $$15;
            if (this.b($$0, $$1, $$2, $$6.d($$12, $$15, $$13), $$4)) {
               $$11 = $$15 + 1;
            }

            $$5.add(new dvd.a($$6.i(), 0, false));
         }

         $$14++;
         $$10--;
      }

      if ($$11 - $$7 > 1) {
         hx $$16 = new hx($$12, $$11, $$13);
         $$5.add(new dvd.a($$16, 0, false));
         $$5.add(new dvd.a($$16.c(2), 0, false));
      }
   }

   @Override
   protected boolean a(cto $$0, hx $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.j));
   }
}
