import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class elx extends emf {
   public static final MapCodec<elx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  azn.m.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bsn.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, elx::new)
   );
   private final int b;
   private final bsn h;

   public elx(int $$0, int $$1, int $$2, int $$3, bsn $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected emg<?> a() {
      return emg.g;
   }

   @Override
   public List<ekl.a> a(dhn $$0, BiConsumer<jh, dxu> $$1, bam $$2, int $$3, jh $$4, ejv $$5) {
      jm $$6 = jm.c.a.a($$2);
      int $$7 = $$3 - 1;
      jh.a $$8 = $$4.k();
      jh $$9 = $$8.e();
      a($$0, $$1, $$2, $$9, $$5);
      List<ekl.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (eih.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new ekl.a($$8.j(), 0, false));
         }

         $$8.c(jm.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (eih.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new ekl.a($$8.j(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
