import net.minecraft.server.MinecraftServer;

public class aqh implements dt {
   private static final String b = "Rcon";
   private static final ur c = ur.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public aqh(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public du g() {
      ame $$0 = this.e.F();
      return new du(this, eju.a($$0.S()), ejt.a, $$0, 4, "Rcon", c, this.e, null);
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
   public boolean V_() {
      return this.e.k();
   }
}
