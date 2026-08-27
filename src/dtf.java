import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtf extends dtl {
   public static final Codec<dtf> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dtf::new));

   public dtf(bic $$0, bic $$1) {
      super($$0, $$1);
   }

   @Override
   protected dtm<?> a() {
      return dtm.d;
   }

   @Override
   protected void a(csg $$0, dtl.b $$1, ats $$2, dsv $$3, int $$4, dtl.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      ht $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(ats $$0, int $$1, dsv $$2) {
      return 0;
   }

   @Override
   protected boolean a(ats $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
