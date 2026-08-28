import com.mojang.serialization.MapCodec;

public class ehv extends ehr {
   public static final MapCodec<ehv> a = ayh.l.fieldOf("chance").xmap(ehv::new, $$0 -> $$0.c);
   private final int c;

   private ehv(int $$0) {
      this.c = $$0;
   }

   public static ehv a(int $$0) {
      return new ehv($$0);
   }

   @Override
   protected boolean a(ehq $$0, azh $$1, iz $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eht<?> b() {
      return eht.b;
   }
}
