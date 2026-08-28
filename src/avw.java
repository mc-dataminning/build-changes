import net.minecraft.server.MinecraftServer;

public class avw implements et {
   private static final String b = "Rcon";
   private static final xe c = xe.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public avw(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public eu g() {
      arj $$0 = this.e.J();
      return new eu(this, eyw.a($$0.W()), eyv.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(xe $$0) {
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
   public boolean K_() {
      return this.e.m();
   }
}
