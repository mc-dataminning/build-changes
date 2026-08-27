import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ehq extends eho {
   public static final Codec<ehq> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  bpf.e.fieldOf("extra_branch_steps").forGetter($$0x -> $$0x.b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("place_branch_per_log_probability").forGetter($$0x -> $$0x.h),
                  bpf.d.fieldOf("extra_branch_length").forGetter($$0x -> $$0x.i),
                  jp.a(li.f).fieldOf("can_grow_through").forGetter($$0x -> $$0x.j),
                  Codec.BOOL.fieldOf("megabush").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, ehq::new)
   );
   private final bpf b;
   private final float h;
   private final bpf i;
   private final je<dfc> j;
   private final boolean k;

   public ehq(int $$0, int $$1, int $$2, bpf $$3, float $$4, bpf $$5, je<dfc> $$6, boolean $$7) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected ehp<?> a() {
      return ehp.h;
   }

   @Override
   public List<efw.a> a(dcg $$0, BiConsumer<ir, dtc> $$1, ayt $$2, int $$3, ir $$4, efg $$5) {
      List<efw.a> $$6 = Lists.newArrayList();
      ir.a $$7 = new ir.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         int $$9 = $$4.v() + $$8;
         if (this.b($$0, $$1, $$2, $$7.d($$4.u(), $$9, $$4.w()), $$5) && $$8 < $$3 - 1 && $$2.i() < this.h) {
            iw $$10 = iw.c.a.a($$2);
            int $$11 = this.i.a($$2);
            int $$12 = Math.max(0, $$11 - this.i.a($$2) - 1);
            int $$13 = this.b.a($$2);
            this.a($$0, $$1, $$2, $$3, $$5, $$6, $$7, $$9, $$10, $$12, $$13);
         }

         if ($$8 == $$3 - 1) {
            $$6.add(new efw.a($$7.d($$4.u(), $$9 + 1, $$4.w()), 0, false));
         }
      }

      return $$6;
   }

   private void a(dcg $$0, BiConsumer<ir, dtc> $$1, ayt $$2, int $$3, efg $$4, List<efw.a> $$5, ir.a $$6, int $$7, iw $$8, int $$9, int $$10) {
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

            if (this.k) {
               $$5.add(new efw.a($$6.i(), 0, false));
            }
         }

         $$14++;
         $$10--;
      }

      if ($$11 - $$7 > 1) {
         ir $$16 = new ir($$12, $$11, $$13);
         $$5.add(new efw.a($$16, 0, false));
         if (this.k) {
            $$5.add(new efw.a($$16.c(2), 0, false));
         }
      }
   }

   @Override
   protected boolean a(dcg $$0, ir $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.j));
   }
}
