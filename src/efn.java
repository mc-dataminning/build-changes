import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efn extends eft {
   public static final MapCodec<efn> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, efn::new));

   public efn(bpw $$0, bpw $$1) {
      super($$0, $$1);
   }

   @Override
   protected efu<?> a() {
      return efu.d;
   }

   @Override
   protected void a(ddc $$0, eft.b $$1, ayw $$2, efd $$3, int $$4, eft.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      jd $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(ayw $$0, int $$1, efd $$2) {
      return 0;
   }

   @Override
   protected boolean a(ayw $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
