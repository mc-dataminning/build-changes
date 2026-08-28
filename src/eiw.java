import com.mojang.serialization.MapCodec;

public class eiw extends eis {
   public static final MapCodec<eiw> a = axv.l.fieldOf("chance").xmap(eiw::new, $$0 -> $$0.c);
   private final int c;

   private eiw(int $$0) {
      this.c = $$0;
   }

   public static eiw a(int $$0) {
      return new eiw($$0);
   }

   @Override
   protected boolean a(eir $$0, ayv $$1, jd $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eiu<?> b() {
      return eiu.b;
   }
}
