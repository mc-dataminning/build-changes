import com.mojang.serialization.MapCodec;

public class egv extends egr {
   public static final MapCodec<egv> a = axn.j.fieldOf("chance").xmap(egv::new, $$0 -> $$0.c);
   private final int c;

   private egv(int $$0) {
      this.c = $$0;
   }

   public static egv a(int $$0) {
      return new egv($$0);
   }

   @Override
   protected boolean a(egq $$0, aym $$1, io $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public egt<?> b() {
      return egt.b;
   }
}
