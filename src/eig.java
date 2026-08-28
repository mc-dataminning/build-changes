import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eig extends eim {
   public static final MapCodec<eig> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eig::new));

   public eig(brp $$0, brp $$1) {
      super($$0, $$1);
   }

   @Override
   protected ein<?> a() {
      return ein.d;
   }

   @Override
   protected void a(dfs $$0, eim.b $$1, azu $$2, ehw $$3, int $$4, eim.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      jh $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(azu $$0, int $$1, ehw $$2) {
      return 0;
   }

   @Override
   protected boolean a(azu $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
