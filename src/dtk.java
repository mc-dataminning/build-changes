import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtk extends dtq {
   public static final Codec<dtk> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dtk::new));

   public dtk(big $$0, big $$1) {
      super($$0, $$1);
   }

   @Override
   protected dtr<?> a() {
      return dtr.d;
   }

   @Override
   protected void a(csl $$0, dtq.b $$1, atw $$2, dta $$3, int $$4, dtq.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      hx $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(atw $$0, int $$1, dta $$2) {
      return 0;
   }

   @Override
   protected boolean a(atw $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
