import net.minecraft.server.MinecraftServer;

public class aqd implements dt {
   private static final String b = "Rcon";
   private static final ur c = ur.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public aqd(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public du g() {
      ama $$0 = this.e.D();
      return new du(this, eji.a($$0.R()), ejh.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(ur $$0) {
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
      return this.e.k();
   }
}
