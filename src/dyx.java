import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dyx extends dza {
   public static final Codec<dyx> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dyx::new));

   public dyx(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dzb<?> a() {
      return dzb.c;
   }

   @Override
   public List<dxi.a> a(cvt $$0, BiConsumer<hz, dlf> $$1, awo $$2, int $$3, hz $$4, dws $$5) {
      hz $$6 = $$4.d();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.h(), $$5);
      a($$0, $$1, $$2, $$6.f(), $$5);
      a($$0, $$1, $$2, $$6.f().h(), $$5);
      hz.a $$7 = new hz.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new dxi.a($$4.b($$3), 0, true));
   }

   private void a(cvt $$0, BiConsumer<hz, dlf> $$1, awo $$2, hz.a $$3, dws $$4, hz $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
