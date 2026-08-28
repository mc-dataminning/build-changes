import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eji extends ejo {
   public static final MapCodec<eji> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eji::new));

   public eji(brp $$0, brp $$1) {
      super($$0, $$1);
   }

   @Override
   protected ejp<?> a() {
      return ejp.d;
   }

   @Override
   protected void a(dgo $$0, ejo.b $$1, azh $$2, eiy $$3, int $$4, ejo.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      ji $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(azh $$0, int $$1, eiy $$2) {
      return 0;
   }

   @Override
   protected boolean a(azh $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
