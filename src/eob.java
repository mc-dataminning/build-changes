import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eob extends eoe {
   public static final MapCodec<eob> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eob::new));

   public eob(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eof<?> a() {
      return eof.c;
   }

   @Override
   public List<emj.a> a(div $$0, BiConsumer<iu, dzo> $$1, azt $$2, int $$3, iu $$4, elt $$5) {
      iu $$6 = $$4.e();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.i(), $$5);
      a($$0, $$1, $$2, $$6.g(), $$5);
      a($$0, $$1, $$2, $$6.g().i(), $$5);
      iu.a $$7 = new iu.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new emj.a($$4.b($$3), 0, true));
   }

   private void a(div $$0, BiConsumer<iu, dzo> $$1, azt $$2, iu.a $$3, elt $$4, iu $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
