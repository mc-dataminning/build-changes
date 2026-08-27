import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dum extends dus {
   public static final Codec<dum> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dum::new));

   public dum(biq $$0, biq $$1) {
      super($$0, $$1);
   }

   @Override
   protected dut<?> a() {
      return dut.d;
   }

   @Override
   protected void a(cte $$0, dus.b $$1, auf $$2, duc $$3, int $$4, dus.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      hv $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(auf $$0, int $$1, duc $$2) {
      return 0;
   }

   @Override
   protected boolean a(auf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
