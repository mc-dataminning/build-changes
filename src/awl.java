import net.minecraft.server.MinecraftServer;

public class awl implements ev {
   private static final String b = "Rcon";
   private static final xk c = xk.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public awl(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ew g() {
      arx $$0 = this.e.J();
      return new ew(this, fbr.a($$0.Z()), fbq.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(xk $$0) {
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
