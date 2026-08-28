import net.minecraft.server.MinecraftServer;

public class avf implements es {
   private static final String b = "Rcon";
   private static final wz c = wz.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public avf(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public et g() {
      aqu $$0 = this.e.I();
      return new et(this, exc.a($$0.V()), exb.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(wz $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean k_() {
      return true;
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean M_() {
      return this.e.m();
   }
}
