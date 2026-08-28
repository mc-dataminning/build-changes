import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eja extends eiy {
   public static final MapCodec<eja> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  bqu.e.fieldOf("extra_branch_steps").forGetter($$0x -> $$0x.b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("place_branch_per_log_probability").forGetter($$0x -> $$0x.h),
                  bqu.d.fieldOf("extra_branch_length").forGetter($$0x -> $$0x.i),
                  kc.a(lv.f).fieldOf("can_grow_through").forGetter($$0x -> $$0x.j)
               )
            )
            .apply($$0, eja::new)
   );
   private final bqu b;
   private final float h;
   private final bqu i;
   private final jr<dhj> j;

   public eja(int $$0, int $$1, int $$2, bqu $$3, float $$4, bqu $$5, jr<dhj> $$6) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   @Override
   protected eiz<?> a() {
      return eiz.h;
   }

   @Override
   public List<ehg.a> a(dem $$0, BiConsumer<je, duo> $$1, azl $$2, int $$3, je $$4, egq $$5) {
      List<ehg.a> $$6 = Lists.newArrayList();
      je.a $$7 = new je.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         int $$9 = $$4.v() + $$8;
         if (this.b($$0, $$1, $$2, $$7.d($$4.u(), $$9, $$4.w()), $$5) && $$8 < $$3 - 1 && $$2.i() < this.h) {
            jj $$10 = jj.c.a.a($$2);
            int $$11 = this.i.a($$2);
            int $$12 = Math.max(0, $$11 - this.i.a($$2) - 1);
            int $$13 = this.b.a($$2);
            this.a($$0, $$1, $$2, $$3, $$5, $$6, $$7, $$9, $$10, $$12, $$13);
         }

         if ($$8 == $$3 - 1) {
            $$6.add(new ehg.a($$7.d($$4.u(), $$9 + 1, $$4.w()), 0, false));
         }
      }

      return $$6;
   }

   private void a(dem $$0, BiConsumer<je, duo> $$1, azl $$2, int $$3, egq $$4, List<ehg.a> $$5, je.a $$6, int $$7, jj $$8, int $$9, int $$10) {
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

            $$5.add(new ehg.a($$6.j(), 0, false));
         }

         $$14++;
         $$10--;
      }

      if ($$11 - $$7 > 1) {
         je $$16 = new je($$12, $$11, $$13);
         $$5.add(new ehg.a($$16, 0, false));
         $$5.add(new ehg.a($$16.c(2), 0, false));
      }
   }

   @Override
   protected boolean a(dem $$0, je $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.j));
   }
}
