import net.minecraft.server.MinecraftServer;

public class awh implements ej {
   private static final String b = "Rcon";
   private static final xc c = xc.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public awh(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ek g() {
      aru $$0 = this.e.J();
      return new ek(this, ffs.a($$0.aa()), ffr.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(xc $$0) {
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
