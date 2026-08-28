import net.minecraft.server.MinecraftServer;

public class avp implements ew {
   private static final String b = "Rcon";
   private static final wo c = wo.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public avp(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ex g() {
      arc $$0 = this.e.J();
      return new ex(this, fay.a($$0.Z()), fax.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(wo $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean y_() {
      return true;
   }

   @Override
   public boolean z_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.e.m();
   }
}
