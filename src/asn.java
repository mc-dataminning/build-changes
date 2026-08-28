import net.minecraft.server.MinecraftServer;

public class asn implements aje {
   private final MinecraftServer b;
   private final wf c;

   public asn(MinecraftServer $$0, wf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ajb $$0) {
      if ($$0.g() != aja.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(ajn.b, new asv(this.b, this.c, false));
         this.c.a(ajn.d);
      }
   }

   @Override
   public void a(wh $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
