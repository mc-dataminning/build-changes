import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ehf extends ehi {
   public static final MapCodec<ehf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ehf::new));

   public ehf(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ehj<?> a() {
      return ehj.c;
   }

   @Override
   public List<efq.a> a(dda $$0, BiConsumer<jd, dta> $$1, ayv $$2, int $$3, jd $$4, efa $$5) {
      jd $$6 = $$4.d();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.h(), $$5);
      a($$0, $$1, $$2, $$6.f(), $$5);
      a($$0, $$1, $$2, $$6.f().h(), $$5);
      jd.a $$7 = new jd.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new efq.a($$4.b($$3), 0, true));
   }

   private void a(dda $$0, BiConsumer<jd, dta> $$1, ayv $$2, jd.a $$3, efa $$4, jd $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
