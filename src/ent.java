import com.mojang.serialization.MapCodec;

public class ent extends enp {
   public static final MapCodec<ent> a = azn.m.fieldOf("chance").xmap(ent::new, $$0 -> $$0.c);
   private final int c;

   private ent(int $$0) {
      this.c = $$0;
   }

   public static ent a(int $$0) {
      return new ent($$0);
   }

   @Override
   protected boolean a(eno $$0, bam $$1, jh $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public enr<?> b() {
      return enr.b;
   }
}
