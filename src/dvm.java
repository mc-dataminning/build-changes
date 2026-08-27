import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvm extends dvs {
   public static final Codec<dvm> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dvm::new));

   public dvm(bjh $$0, bjh $$1) {
      super($$0, $$1);
   }

   @Override
   protected dvt<?> a() {
      return dvt.d;
   }

   @Override
   protected void a(cud $$0, dvs.b $$1, auw $$2, dvc $$3, int $$4, dvs.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      hx $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(auw $$0, int $$1, dvc $$2) {
      return 0;
   }

   @Override
   protected boolean a(auw $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
