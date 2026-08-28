import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efq extends efp {
   public static final MapCodec<efq> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, efq::new));

   public efq(bpw $$0, bpw $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected efv<?> a() {
      return efv.e;
   }

   @Override
   protected void a(ddc $$0, efu.b $$1, ayw $$2, efe $$3, int $$4, efu.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + $$5.b() - 1 - $$9;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(ayw $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$0.a(2) == 0;
   }
}
