import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eju extends ejx {
   public static final MapCodec<eju> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eju::new));

   public eju(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ejy<?> a() {
      return ejy.c;
   }

   @Override
   public List<eif.a> a(dfl $$0, BiConsumer<jh, dvo> $$1, azv $$2, int $$3, jh $$4, ehp $$5) {
      jh $$6 = $$4.e();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.i(), $$5);
      a($$0, $$1, $$2, $$6.g(), $$5);
      a($$0, $$1, $$2, $$6.g().i(), $$5);
      jh.a $$7 = new jh.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new eif.a($$4.b($$3), 0, true));
   }

   private void a(dfl $$0, BiConsumer<jh, dvo> $$1, azv $$2, jh.a $$3, ehp $$4, jh $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
