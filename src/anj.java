import net.minecraft.server.MinecraftServer;

public class anj implements aex {
   private final MinecraftServer a;
   private final uc b;

   public anj(MinecraftServer $$0, uc $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(aew $$0) {
      if ($$0.f() != aev.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      } else {
         this.b.a(aev.b);
         this.b.a(new anq(this.a, this.b));
      }
   }

   @Override
   public void a(vb $$0) {
   }

   @Override
   public boolean c() {
      return this.b.k();
   }
}
