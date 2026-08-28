import net.minecraft.server.MinecraftServer;

public class ave implements es {
   private static final String b = "Rcon";
   private static final wy c = wy.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public ave(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public et g() {
      aqt $$0 = this.e.I();
      return new et(this, eww.a($$0.V()), ewv.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(wy $$0) {
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
   public boolean U_() {
      return this.e.m();
   }
}
