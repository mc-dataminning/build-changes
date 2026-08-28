import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehc extends ehb {
   public static final MapCodec<ehc> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ehc::new));

   public ehc(bqu $$0, bqu $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ehh<?> a() {
      return ehh.e;
   }

   @Override
   protected void a(dem $$0, ehg.b $$1, azl $$2, egq $$3, int $$4, ehg.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + $$5.b() - 1 - $$9;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(azl $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$0.a(2) == 0;
   }
}
