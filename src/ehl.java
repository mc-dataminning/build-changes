import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ehl extends eho {
   public static final Codec<ehl> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ehl::new));

   public ehl(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ehp<?> a() {
      return ehp.c;
   }

   @Override
   public List<efw.a> a(dcg $$0, BiConsumer<ir, dtc> $$1, ayt $$2, int $$3, ir $$4, efg $$5) {
      ir $$6 = $$4.d();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.h(), $$5);
      a($$0, $$1, $$2, $$6.f(), $$5);
      a($$0, $$1, $$2, $$6.f().h(), $$5);
      ir.a $$7 = new ir.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new efw.a($$4.b($$3), 0, true));
   }

   private void a(dcg $$0, BiConsumer<ir, dtc> $$1, ayt $$2, ir.a $$3, efg $$4, ir $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
