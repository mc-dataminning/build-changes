import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class epu extends epx {
   public static final MapCodec<epu> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, epu::new));

   public epu(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected epy<?> a() {
      return epy.c;
   }

   @Override
   public List<eob.a> a(dkd $$0, BiConsumer<iv, ebe> $$1, azx $$2, int $$3, iv $$4, enl $$5) {
      iv $$6 = $$4.e();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.i(), $$5);
      a($$0, $$1, $$2, $$6.g(), $$5);
      a($$0, $$1, $$2, $$6.g().i(), $$5);
      iv.a $$7 = new iv.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new eob.a($$4.b($$3), 0, true));
   }

   private void a(dkd $$0, BiConsumer<iv, ebe> $$1, azx $$2, iv.a $$3, enl $$4, iv $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
