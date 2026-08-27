import net.minecraft.server.MinecraftServer;

public class all implements add {
   private final MinecraftServer a;
   private final sn b;

   public all(MinecraftServer $$0, sn $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(adc $$0) {
      if ($$0.f() != adb.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      } else {
         this.b.a(adb.b);
         this.b.a(new als(this.a, this.b));
      }
   }

   @Override
   public void a(tm $$0) {
   }

   @Override
   public boolean c() {
      return this.b.k();
   }
}
