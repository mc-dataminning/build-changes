import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzc extends dzb {
   public static final Codec<dzc> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dzc::new));

   public dzc(bmh $$0, bmh $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dzh<?> a() {
      return dzh.e;
   }

   @Override
   protected void a(cxf $$0, dzg.b $$1, axd $$2, dyq $$3, int $$4, dzg.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + $$5.b() - 1 - $$9;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(axd $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$0.a(2) == 0;
   }
}
