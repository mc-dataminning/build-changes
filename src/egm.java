import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class egm extends egt {
   private static final Codec<bps> b = bps.a
      .codec()
      .validate(
         $$0 -> $$0.b() - $$0.a() < 1
               ? DataResult.error(() -> "Need at least 2 blocks variation for the branch starts to fit both branches")
               : DataResult.success($$0)
      );
   public static final MapCodec<egm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  bpm.b(1, 3).fieldOf("branch_count").forGetter($$0x -> $$0x.h),
                  bpm.b(2, 16).fieldOf("branch_horizontal_length").forGetter($$0x -> $$0x.i),
                  bpm.a(-16, 0, b).fieldOf("branch_start_offset_from_top").forGetter($$0x -> $$0x.j),
                  bpm.b(-16, 16).fieldOf("branch_end_offset_from_top").forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, egm::new)
   );
   private final bpm h;
   private final bpm i;
   private final bps j;
   private final bps k;
   private final bpm l;

   public egm(int $$0, int $$1, int $$2, bpm $$3, bpm $$4, bps $$5, bpm $$6) {
      super($$0, $$1, $$2);
      this.h = $$3;
      this.i = $$4;
      this.j = $$5;
      this.k = bps.a($$5.a(), $$5.b() - 1);
      this.l = $$6;
   }

   @Override
   protected egu<?> a() {
      return egu.i;
   }

   @Override
   public List<efb.a> a(dcm $$0, BiConsumer<ja, dsl> $$1, ayo $$2, int $$3, ja $$4, eel $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);
      int $$6 = Math.max(0, $$3 - 1 + this.j.a($$2));
      int $$7 = Math.max(0, $$3 - 1 + this.k.a($$2));
      if ($$7 >= $$6) {
         $$7++;
      }

      int $$8 = this.h.a($$2);
      boolean $$9 = $$8 == 3;
      boolean $$10 = $$8 >= 2;
      int $$11;
      if ($$9) {
         $$11 = $$3;
      } else if ($$10) {
         $$11 = Math.max($$6, $$7) + 1;
      } else {
         $$11 = $$6 + 1;
      }

      for (int $$14 = 0; $$14 < $$11; $$14++) {
         this.b($$0, $$1, $$2, $$4.b($$14), $$5);
      }

      List<efb.a> $$15 = new ArrayList<>();
      if ($$9) {
         $$15.add(new efb.a($$4.b($$11), 0, false));
      }

      ja.a $$16 = new ja.a();
      jf $$17 = jf.c.a.a($$2);
      Function<dsl, dsl> $$18 = $$1x -> $$1x.b(dlu.i, $$17.o());
      $$15.add(this.a($$0, $$1, $$2, $$3, $$4, $$5, $$18, $$17, $$6, $$6 < $$11 - 1, $$16));
      if ($$10) {
         $$15.add(this.a($$0, $$1, $$2, $$3, $$4, $$5, $$18, $$17.g(), $$7, $$7 < $$11 - 1, $$16));
      }

      return $$15;
   }

   private efb.a a(dcm $$0, BiConsumer<ja, dsl> $$1, ayo $$2, int $$3, ja $$4, eel $$5, Function<dsl, dsl> $$6, jf $$7, int $$8, boolean $$9, ja.a $$10) {
      $$10.g($$4).c(jf.b, $$8);
      int $$11 = $$3 - 1 + this.l.a($$2);
      boolean $$12 = $$9 || $$11 < $$8;
      int $$13 = this.i.a($$2) + ($$12 ? 1 : 0);
      ja $$14 = $$4.a($$7, $$13).b($$11);
      int $$15 = $$12 ? 2 : 1;

      for (int $$16 = 0; $$16 < $$15; $$16++) {
         this.a($$0, $$1, $$2, $$10.c($$7), $$5, $$6);
      }

      jf $$17 = $$14.v() > $$10.v() ? jf.b : jf.a;

      while (true) {
         int $$18 = $$10.k($$14);
         if ($$18 == 0) {
            return new efb.a($$14.c(), 0, false);
         }

         float $$19 = (float)Math.abs($$14.v() - $$10.v()) / (float)$$18;
         boolean $$20 = $$2.i() < $$19;
         $$10.c($$20 ? $$17 : $$7);
         this.a($$0, $$1, $$2, $$10, $$5, $$20 ? Function.identity() : $$6);
      }
   }
}
