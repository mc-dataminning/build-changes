import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eax extends eba {
   public static final Codec<eax> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eax::new));

   public eax(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ebb<?> a() {
      return ebb.c;
   }

   @Override
   public List<dzi.a> a(cxh $$0, BiConsumer<ib, dnb> $$1, axd $$2, int $$3, ib $$4, dys $$5) {
      ib $$6 = $$4.d();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.h(), $$5);
      a($$0, $$1, $$2, $$6.f(), $$5);
      a($$0, $$1, $$2, $$6.f().h(), $$5);
      ib.a $$7 = new ib.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new dzi.a($$4.b($$3), 0, true));
   }

   private void a(cxh $$0, BiConsumer<ib, dnb> $$1, axd $$2, ib.a $$3, dys $$4, ib $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
