import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class efe extends efh {
   public static final MapCodec<efe> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, efe::new));

   public efe(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected efi<?> a() {
      return efi.c;
   }

   @Override
   public List<edp.a> a(dbf $$0, BiConsumer<io, drd> $$1, aym $$2, int $$3, io $$4, ecz $$5) {
      io $$6 = $$4.d();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.h(), $$5);
      a($$0, $$1, $$2, $$6.f(), $$5);
      a($$0, $$1, $$2, $$6.f().h(), $$5);
      io.a $$7 = new io.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new edp.a($$4.b($$3), 0, true));
   }

   private void a(dbf $$0, BiConsumer<io, drd> $$1, aym $$2, io.a $$3, ecz $$4, io $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
