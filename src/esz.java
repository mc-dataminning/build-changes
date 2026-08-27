import net.minecraft.server.MinecraftServer;

public class esz implements eta<MinecraftServer> {
   final akh a;

   public esz(akh $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, etc<MinecraftServer> $$1, long $$2) {
      akw $$3 = $$0.aF();

      for (hp<ed> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends eta.a<MinecraftServer, esz> {
      public a() {
         super(new akh("function_tag"), esz.class);
      }

      public void a(ua $$0, esz $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public esz a(ua $$0) {
         akh $$1 = new akh($$0.l("Name"));
         return new esz($$1);
      }
   }
}
