import net.minecraft.server.MinecraftServer;

public class alb implements acv {
   private final MinecraftServer a;
   private final sf b;

   public alb(MinecraftServer $$0, sf $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(acu $$0) {
      if ($$0.f() != act.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      } else {
         this.b.a(act.b);
         this.b.a(new ali(this.a, this.b));
      }
   }

   @Override
   public void a(te $$0) {
   }

   @Override
   public boolean c() {
      return this.b.k();
   }
}
