import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eqg extends eqj {
   public static final MapCodec<eqg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eqg::new));

   public eqg(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eqk<?> a() {
      return eqk.c;
   }

   @Override
   public List<eon.a> a(dkp $$0, BiConsumer<iw, ebq> $$1, bai $$2, int $$3, iw $$4, enx $$5) {
      iw $$6 = $$4.e();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.i(), $$5);
      a($$0, $$1, $$2, $$6.g(), $$5);
      a($$0, $$1, $$2, $$6.g().i(), $$5);
      iw.a $$7 = new iw.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new eon.a($$4.b($$3), 0, true));
   }

   private void a(dkp $$0, BiConsumer<iw, ebq> $$1, bai $$2, iw.a $$3, enx $$4, iw $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
