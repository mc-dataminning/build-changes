import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class edj extends edm {
   public static final Codec<edj> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, edj::new));

   public edj(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected edn<?> a() {
      return edn.c;
   }

   @Override
   public List<ebu.a> a(czm $$0, BiConsumer<id, dpi> $$1, axt $$2, int $$3, id $$4, ebe $$5) {
      id $$6 = $$4.d();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.h(), $$5);
      a($$0, $$1, $$2, $$6.f(), $$5);
      a($$0, $$1, $$2, $$6.f().h(), $$5);
      id.a $$7 = new id.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new ebu.a($$4.b($$3), 0, true));
   }

   private void a(czm $$0, BiConsumer<id, dpi> $$1, axt $$2, id.a $$3, ebe $$4, id $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
