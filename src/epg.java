import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class epg extends epj {
   public static final MapCodec<epg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, epg::new));

   public epg(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected epk<?> a() {
      return epk.c;
   }

   @Override
   public List<eno.a> a(djs $$0, BiConsumer<iv, eat> $$1, azv $$2, int $$3, iv $$4, emy $$5) {
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

      return ImmutableList.of(new eno.a($$4.b($$3), 0, true));
   }

   private void a(djs $$0, BiConsumer<iv, eat> $$1, azv $$2, iv.a $$3, emy $$4, iv $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
