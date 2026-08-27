import net.minecraft.server.MinecraftServer;

public class auo implements eb {
   private static final String b = "Rcon";
   private static final ws c = ws.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public auo(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ec g() {
      aqe $$0 = this.e.I();
      return new ec(this, etf.a($$0.U()), ete.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(ws $$0) {
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
   public boolean U_() {
      return this.e.m();
   }
}
