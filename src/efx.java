import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efx extends eft {
   public static final MapCodec<efx> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(bpw.b(0, 24).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, efx::new)
   );
   private final bpw b;

   public efx(bpw $$0, bpw $$1, bpw $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected efu<?> a() {
      return efu.c;
   }

   @Override
   protected void a(ddc $$0, eft.b $$1, ayw $$2, efd $$3, int $$4, eft.a $$5, int $$6, int $$7, int $$8) {
      int $$9 = 0;

      for (int $$10 = $$8; $$10 >= $$8 - $$6; $$10--) {
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$9, $$10, $$5.c());
         if ($$9 >= 1 && $$10 == $$8 - $$6 + 1) {
            $$9--;
         } else if ($$9 < $$7 + $$5.b()) {
            $$9++;
         }
      }
   }

   @Override
   public int a(ayw $$0, int $$1) {
      return super.a($$0, $$1) + $$0.a(Math.max($$1 + 1, 1));
   }

   @Override
   public int a(ayw $$0, int $$1, efd $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(ayw $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
