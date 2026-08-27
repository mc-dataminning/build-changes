import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eee extends eec {
   public static final Codec<eee> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  bnv.e.fieldOf("extra_branch_steps").forGetter($$0x -> $$0x.b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("place_branch_per_log_probability").forGetter($$0x -> $$0x.h),
                  bnv.d.fieldOf("extra_branch_length").forGetter($$0x -> $$0x.i),
                  jk.a(ld.f).fieldOf("can_grow_through").forGetter($$0x -> $$0x.j)
               )
            )
            .apply($$0, eee::new)
   );
   private final bnv b;
   private final float h;
   private final bnv i;
   private final iz<dcv> j;

   public eee(int $$0, int $$1, int $$2, bnv $$3, float $$4, bnv $$5, iz<dcv> $$6) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   @Override
   protected eed<?> a() {
      return eed.h;
   }

   @Override
   public List<eck.a> a(daa $$0, BiConsumer<im, dpy> $$1, ayd $$2, int $$3, im $$4, ebu $$5) {
      List<eck.a> $$6 = Lists.newArrayList();
      im.a $$7 = new im.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         int $$9 = $$4.v() + $$8;
         if (this.b($$0, $$1, $$2, $$7.d($$4.u(), $$9, $$4.w()), $$5) && $$8 < $$3 - 1 && $$2.i() < this.h) {
            ir $$10 = ir.c.a.a($$2);
            int $$11 = this.i.a($$2);
            int $$12 = Math.max(0, $$11 - this.i.a($$2) - 1);
            int $$13 = this.b.a($$2);
            this.a($$0, $$1, $$2, $$3, $$5, $$6, $$7, $$9, $$10, $$12, $$13);
         }

         if ($$8 == $$3 - 1) {
            $$6.add(new eck.a($$7.d($$4.u(), $$9 + 1, $$4.w()), 0, false));
         }
      }

      return $$6;
   }

   private void a(daa $$0, BiConsumer<im, dpy> $$1, ayd $$2, int $$3, ebu $$4, List<eck.a> $$5, im.a $$6, int $$7, ir $$8, int $$9, int $$10) {
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

            $$5.add(new eck.a($$6.i(), 0, false));
         }

         $$14++;
         $$10--;
      }

      if ($$11 - $$7 > 1) {
         im $$16 = new im($$12, $$11, $$13);
         $$5.add(new eck.a($$16, 0, false));
         $$5.add(new eck.a($$16.c(2), 0, false));
      }
   }

   @Override
   protected boolean a(daa $$0, im $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.j));
   }
}
