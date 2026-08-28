import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehz extends eif {
   public static final MapCodec<ehz> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ehz::new));

   public ehz(brm $$0, brm $$1) {
      super($$0, $$1);
   }

   @Override
   protected eig<?> a() {
      return eig.d;
   }

   @Override
   protected void a(dfl $$0, eif.b $$1, azv $$2, ehp $$3, int $$4, eif.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      jh $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(azv $$0, int $$1, ehp $$2) {
      return 0;
   }

   @Override
   protected boolean a(azv $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
