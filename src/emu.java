import com.mojang.serialization.MapCodec;

public class emu extends emq {
   public static final MapCodec<emu> a = ayh.m.fieldOf("chance").xmap(emu::new, $$0 -> $$0.c);
   private final int c;

   private emu(int $$0) {
      this.c = $$0;
   }

   public static emu a(int $$0) {
      return new emu($$0);
   }

   @Override
   protected boolean a(emp $$0, azg $$1, ji $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public ems<?> b() {
      return ems.b;
   }
}
