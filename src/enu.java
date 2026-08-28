import com.mojang.serialization.MapCodec;

public class enu extends enq {
   public static final MapCodec<enu> a = azn.m.fieldOf("chance").xmap(enu::new, $$0 -> $$0.c);
   private final int c;

   private enu(int $$0) {
      this.c = $$0;
   }

   public static enu a(int $$0) {
      return new enu($$0);
   }

   @Override
   protected boolean a(enp $$0, bam $$1, jh $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public ens<?> b() {
      return ens.b;
   }
}
