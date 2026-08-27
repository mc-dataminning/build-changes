import net.minecraft.server.MinecraftServer;

public class amu implements aek {
   private final MinecraftServer a;
   private final ts b;

   public amu(MinecraftServer $$0, ts $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(aej $$0) {
      if ($$0.f() != aei.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      } else {
         this.b.a(aei.b);
         this.b.a(new anb(this.a, this.b));
      }
   }

   @Override
   public void a(ur $$0) {
   }

   @Override
   public boolean c() {
      return this.b.k();
   }
}
