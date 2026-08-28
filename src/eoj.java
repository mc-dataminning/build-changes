import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eoj extends eoi {
   public static final MapCodec<eoj> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eoj::new));

   public eoj(buh $$0, buh $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eoo<?> a() {
      return eoo.e;
   }

   @Override
   protected void a(dkp $$0, eon.b $$1, bai $$2, enx $$3, int $$4, eon.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + $$5.b() - 1 - $$9;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(bai $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$0.a(2) == 0;
   }
}
