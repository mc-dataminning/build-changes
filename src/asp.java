import net.minecraft.server.MinecraftServer;

public class asp implements ajb {
   private final MinecraftServer b;
   private final vt c;

   public asp(MinecraftServer $$0, vt $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aiy $$0) {
      if ($$0.g() != aix.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(ajk.b, new asx(this.b, this.c, false));
         this.c.a(ajk.d);
      }
   }

   @Override
   public void a(vv $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
