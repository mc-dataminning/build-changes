import net.minecraft.server.MinecraftServer;

public class asn implements aiz {
   private final MinecraftServer b;
   private final vr c;

   public asn(MinecraftServer $$0, vr $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aiw $$0) {
      if ($$0.g() != aiv.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(aji.b, new asv(this.b, this.c, false));
         this.c.a(aji.d);
      }
   }

   @Override
   public void a(vt $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
