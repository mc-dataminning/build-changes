import net.minecraft.server.MinecraftServer;

public class aur implements ec {
   private static final String b = "Rcon";
   private static final wu c = wu.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public aur(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ed g() {
      aqh $$0 = this.e.I();
      return new ed(this, etp.a($$0.U()), eto.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(wu $$0) {
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
