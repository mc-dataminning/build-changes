import net.minecraft.server.MinecraftServer;

public class aue implements du {
   private static final String b = "Rcon";
   private static final wi c = wi.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public aue(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public dv g() {
      apu $$0 = this.e.I();
      return new dv(this, esj.a($$0.U()), esi.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(wi $$0) {
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
