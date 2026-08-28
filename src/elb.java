import com.mojang.serialization.MapCodec;

public class elb extends ekx {
   public static final MapCodec<elb> a = ays.m.fieldOf("chance").xmap(elb::new, $$0 -> $$0.c);
   private final int c;

   private elb(int $$0) {
      this.c = $$0;
   }

   public static elb a(int $$0) {
      return new elb($$0);
   }

   @Override
   protected boolean a(ekw $$0, azr $$1, jg $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public ekz<?> b() {
      return ekz.b;
   }
}
