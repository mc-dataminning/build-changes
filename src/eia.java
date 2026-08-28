import com.mojang.serialization.MapCodec;

public class eia extends ehw {
   public static final MapCodec<eia> a = axm.l.fieldOf("chance").xmap(eia::new, $$0 -> $$0.c);
   private final int c;

   private eia(int $$0) {
      this.c = $$0;
   }

   public static eia a(int $$0) {
      return new eia($$0);
   }

   @Override
   protected boolean a(ehv $$0, aym $$1, ja $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public ehy<?> b() {
      return ehy.b;
   }
}
