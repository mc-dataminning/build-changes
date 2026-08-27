import net.minecraft.server.MinecraftServer;

public class auw implements ed {
   private static final String b = "Rcon";
   private static final wx c = wx.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public auw(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ee g() {
      aqm $$0 = this.e.I();
      return new ee(this, euk.a($$0.U()), euj.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(wx $$0) {
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
