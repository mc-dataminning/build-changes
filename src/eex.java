import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eex extends eew {
   public static final MapCodec<eex> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eex::new));

   public eex(bpm $$0, bpm $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected efc<?> a() {
      return efc.e;
   }

   @Override
   protected void a(dcm $$0, efb.b $$1, ayo $$2, eel $$3, int $$4, efb.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + $$5.b() - 1 - $$9;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(ayo $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$0.a(2) == 0;
   }
}
