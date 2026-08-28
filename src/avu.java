import net.minecraft.server.MinecraftServer;

public class avu implements es {
   private static final String b = "Rcon";
   private static final xd c = xd.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public avu(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public et g() {
      arh $$0 = this.e.J();
      return new et(this, eys.a($$0.W()), eyr.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(xd $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean k_() {
      return true;
   }

   @Override
   public boolean v_() {
      return true;
   }

   @Override
   public boolean J_() {
      return this.e.m();
   }
}
