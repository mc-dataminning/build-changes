import com.mojang.serialization.MapCodec;

public class emi extends emx {
   public static final MapCodec<emi> a = bro.b(0, 256).fieldOf("count").xmap(emi::new, $$0 -> $$0.c);
   private final bro c;

   private emi(bro $$0) {
      this.c = $$0;
   }

   public static emi a(bro $$0) {
      return new emi($$0);
   }

   public static emi a(int $$0) {
      return a(brl.a($$0));
   }

   @Override
   protected int a(azh $$0, ji $$1) {
      return this.c.a($$0);
   }

   @Override
   public emu<?> b() {
      return emu.f;
   }
}
