import com.mojang.serialization.MapCodec;

public class ehw extends ehs {
   public static final MapCodec<ehw> a = ayh.l.fieldOf("chance").xmap(ehw::new, $$0 -> $$0.c);
   private final int c;

   private ehw(int $$0) {
      this.c = $$0;
   }

   public static ehw a(int $$0) {
      return new ehw($$0);
   }

   @Override
   protected boolean a(ehr $$0, azh $$1, iz $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public ehu<?> b() {
      return ehu.b;
   }
}
