import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ego extends egn {
   public static final MapCodec<ego> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ego::new));

   public ego(bqp $$0, bqp $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egt<?> a() {
      return egt.e;
   }

   @Override
   protected void a(ddy $$0, egs.b $$1, azk $$2, egc $$3, int $$4, egs.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + $$5.b() - 1 - $$9;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(azk $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$0.a(2) == 0;
   }
}
