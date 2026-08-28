import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeh extends een {
   public static final MapCodec<eeh> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eeh::new));

   public eeh(bpy $$0, bpy $$1) {
      super($$0, $$1);
   }

   @Override
   protected eeo<?> a() {
      return eeo.d;
   }

   @Override
   protected void a(dcd $$0, een.b $$1, azg $$2, edx $$3, int $$4, een.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      iz $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(azg $$0, int $$1, edx $$2) {
      return 0;
   }

   @Override
   protected boolean a(azg $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
