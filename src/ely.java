import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ely extends emg {
   public static final MapCodec<ely> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  azn.m.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bso.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, ely::new)
   );
   private final int b;
   private final bso h;

   public ely(int $$0, int $$1, int $$2, int $$3, bso $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected emh<?> a() {
      return emh.g;
   }

   @Override
   public List<ekm.a> a(dho $$0, BiConsumer<jh, dxv> $$1, bam $$2, int $$3, jh $$4, ejw $$5) {
      jm $$6 = jm.c.a.a($$2);
      int $$7 = $$3 - 1;
      jh.a $$8 = $$4.k();
      jh $$9 = $$8.e();
      a($$0, $$1, $$2, $$9, $$5);
      List<ekm.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (eii.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new ekm.a($$8.j(), 0, false));
         }

         $$8.c(jm.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (eii.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new ekm.a($$8.j(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
