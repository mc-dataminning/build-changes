import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dtb extends dte {
   public static final Codec<dtb> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dtb::new));

   public dtb(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dtf<?> a() {
      return dtf.c;
   }

   @Override
   public List<drm.a> a(cqb $$0, BiConsumer<gw, dfj> $$1, asc $$2, int $$3, gw $$4, dqw $$5) {
      gw $$6 = $$4.d();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.h(), $$5);
      a($$0, $$1, $$2, $$6.f(), $$5);
      a($$0, $$1, $$2, $$6.f().h(), $$5);
      gw.a $$7 = new gw.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new drm.a($$4.b($$3), 0, true));
   }

   private void a(cqb $$0, BiConsumer<gw, dfj> $$1, asc $$2, gw.a $$3, dqw $$4, gw $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
