import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enf extends ene {
   public static final MapCodec<enf> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, enf::new));

   public enf(btl $$0, btl $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected enk<?> a() {
      return enk.e;
   }

   @Override
   protected void a(djn $$0, enj.b $$1, azv $$2, emt $$3, int $$4, enj.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + $$5.b() - 1 - $$9;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(azv $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$0.a(2) == 0;
   }
}
