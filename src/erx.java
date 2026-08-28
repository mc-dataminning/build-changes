import com.mojang.serialization.MapCodec;

public class erx extends ert {
   public static final MapCodec<erx> a = azg.m.fieldOf("chance").xmap(erx::new, $$0 -> $$0.c);
   private final int c;

   private erx(int $$0) {
      this.c = $$0;
   }

   public static erx a(int $$0) {
      return new erx($$0);
   }

   @Override
   protected boolean a(ers $$0, bai $$1, iw $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public erv<?> b() {
      return erv.b;
   }
}
