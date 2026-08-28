import net.minecraft.server.MinecraftServer;

public class awv implements ev {
   private static final String b = "Rcon";
   private static final xv c = xv.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public awv(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ew g() {
      ash $$0 = this.e.J();
      return new ew(this, fbs.a($$0.Y()), fbr.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(xv $$0) {
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
