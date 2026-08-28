import com.mojang.serialization.MapCodec;

public class emw extends ems {
   public static final MapCodec<emw> a = ayi.m.fieldOf("chance").xmap(emw::new, $$0 -> $$0.c);
   private final int c;

   private emw(int $$0) {
      this.c = $$0;
   }

   public static emw a(int $$0) {
      return new emw($$0);
   }

   @Override
   protected boolean a(emr $$0, azh $$1, ji $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public emu<?> b() {
      return emu.b;
   }
}
