import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class een extends eel {
   public static final Codec<een> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  bor.e.fieldOf("extra_branch_steps").forGetter($$0x -> $$0x.b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("place_branch_per_log_probability").forGetter($$0x -> $$0x.h),
                  bor.d.fieldOf("extra_branch_length").forGetter($$0x -> $$0x.i),
                  jl.a(le.f).fieldOf("can_grow_through").forGetter($$0x -> $$0x.j)
               )
            )
            .apply($$0, een::new)
   );
   private final bor b;
   private final float h;
   private final bor i;
   private final ja<dde> j;

   public een(int $$0, int $$1, int $$2, bor $$3, float $$4, bor $$5, ja<dde> $$6) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   @Override
   protected eem<?> a() {
      return eem.h;
   }

   @Override
   public List<ect.a> a(daj $$0, BiConsumer<in, dqh> $$1, ayg $$2, int $$3, in $$4, ecd $$5) {
      List<ect.a> $$6 = Lists.newArrayList();
      in.a $$7 = new in.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         int $$9 = $$4.v() + $$8;
         if (this.b($$0, $$1, $$2, $$7.d($$4.u(), $$9, $$4.w()), $$5) && $$8 < $$3 - 1 && $$2.i() < this.h) {
            is $$10 = is.c.a.a($$2);
            int $$11 = this.i.a($$2);
            int $$12 = Math.max(0, $$11 - this.i.a($$2) - 1);
            int $$13 = this.b.a($$2);
            this.a($$0, $$1, $$2, $$3, $$5, $$6, $$7, $$9, $$10, $$12, $$13);
         }

         if ($$8 == $$3 - 1) {
            $$6.add(new ect.a($$7.d($$4.u(), $$9 + 1, $$4.w()), 0, false));
         }
      }

      return $$6;
   }

   private void a(daj $$0, BiConsumer<in, dqh> $$1, ayg $$2, int $$3, ecd $$4, List<ect.a> $$5, in.a $$6, int $$7, is $$8, int $$9, int $$10) {
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

            $$5.add(new ect.a($$6.i(), 0, false));
         }

         $$14++;
         $$10--;
      }

      if ($$11 - $$7 > 1) {
         in $$16 = new in($$12, $$11, $$13);
         $$5.add(new ect.a($$16, 0, false));
         $$5.add(new ect.a($$16.c(2), 0, false));
      }
   }

   @Override
   protected boolean a(daj $$0, in $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.j));
   }
}
