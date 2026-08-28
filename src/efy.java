import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class efy extends egb {
   public static final MapCodec<efy> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, efy::new));

   public efy(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egc<?> a() {
      return egc.c;
   }

   @Override
   public List<eej.a> a(dbz $$0, BiConsumer<iz, drx> $$1, azc $$2, int $$3, iz $$4, edt $$5) {
      iz $$6 = $$4.d();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.h(), $$5);
      a($$0, $$1, $$2, $$6.f(), $$5);
      a($$0, $$1, $$2, $$6.f().h(), $$5);
      iz.a $$7 = new iz.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new eej.a($$4.b($$3), 0, true));
   }

   private void a(dbz $$0, BiConsumer<iz, drx> $$1, azc $$2, iz.a $$3, edt $$4, iz $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
