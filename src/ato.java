import net.minecraft.server.MinecraftServer;

public class ato implements dt {
   private static final String b = "Rcon";
   private static final vu c = vu.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public ato(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public du g() {
      apf $$0 = this.e.I();
      return new du(this, epr.a($$0.T()), epq.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(vu $$0) {
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
