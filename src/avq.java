import net.minecraft.server.MinecraftServer;

public class avq implements ew {
   private static final String b = "Rcon";
   private static final wp c = wp.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public avq(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ex g() {
      ard $$0 = this.e.J();
      return new ex(this, fbx.a($$0.aa()), fbw.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(wp $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean t_() {
      return true;
   }

   @Override
   public boolean u_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.e.m();
   }
}
