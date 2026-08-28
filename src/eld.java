import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eld extends elg {
   public static final MapCodec<eld> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eld::new));

   public eld(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected elh<?> a() {
      return elh.c;
   }

   @Override
   public List<ejm.a> a(dgm $$0, BiConsumer<ji, dwv> $$1, azg $$2, int $$3, ji $$4, eiw $$5) {
      ji $$6 = $$4.e();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.i(), $$5);
      a($$0, $$1, $$2, $$6.g(), $$5);
      a($$0, $$1, $$2, $$6.g().i(), $$5);
      ji.a $$7 = new ji.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new ejm.a($$4.b($$3), 0, true));
   }

   private void a(dgm $$0, BiConsumer<ji, dwv> $$1, azg $$2, ji.a $$3, eiw $$4, ji $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
