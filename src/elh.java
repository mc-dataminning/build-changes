import com.mojang.serialization.MapCodec;

public class elh extends eld {
   public static final MapCodec<elh> a = ayt.m.fieldOf("chance").xmap(elh::new, $$0 -> $$0.c);
   private final int c;

   private elh(int $$0) {
      this.c = $$0;
   }

   public static elh a(int $$0) {
      return new elh($$0);
   }

   @Override
   protected boolean a(elc $$0, azs $$1, jh $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public elf<?> b() {
      return elf.b;
   }
}
