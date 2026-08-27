import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dny extends doe {
   public static final Codec<dny> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dny::new));

   public dny(bdc $$0, bdc $$1) {
      super($$0, $$1);
   }

   @Override
   protected dof<?> a() {
      return dof.d;
   }

   @Override
   protected void a(cms $$0, doe.b $$1, apf $$2, dno $$3, int $$4, doe.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      gu $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(apf $$0, int $$1, dno $$2) {
      return 0;
   }

   @Override
   protected boolean a(apf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
