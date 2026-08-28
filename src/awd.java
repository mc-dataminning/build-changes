import net.minecraft.server.MinecraftServer;

public class awd implements ev {
   private static final String b = "Rcon";
   private static final xj c = xj.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public awd(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ew g() {
      arp $$0 = this.e.J();
      return new ew(this, ezy.a($$0.X()), ezx.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(xj $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public boolean y_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.e.m();
   }
}
