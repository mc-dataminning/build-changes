import net.minecraft.server.MinecraftServer;

public class awa implements eu {
   private static final String b = "Rcon";
   private static final xh c = xh.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public awa(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ev g() {
      arm $$0 = this.e.J();
      return new ev(this, ezh.a($$0.W()), ezg.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(xh $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean l_() {
      return true;
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean L_() {
      return this.e.m();
   }
}
