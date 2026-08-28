import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eiz extends ejc {
   public static final MapCodec<eiz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eiz::new));

   public eiz(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ejd<?> a() {
      return ejd.c;
   }

   @Override
   public List<ehk.a> a(dep $$0, BiConsumer<jf, dus> $$1, azn $$2, int $$3, jf $$4, egu $$5) {
      jf $$6 = $$4.e();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.i(), $$5);
      a($$0, $$1, $$2, $$6.g(), $$5);
      a($$0, $$1, $$2, $$6.g().i(), $$5);
      jf.a $$7 = new jf.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new ehk.a($$4.b($$3), 0, true));
   }

   private void a(dep $$0, BiConsumer<jf, dus> $$1, azn $$2, jf.a $$3, egu $$4, jf $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
