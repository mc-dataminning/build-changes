import net.minecraft.server.MinecraftServer;

public class awb implements ev {
   private static final String b = "Rcon";
   private static final xi c = xi.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public awb(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ew g() {
      arn $$0 = this.e.J();
      return new ew(this, ezn.a($$0.W()), ezm.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(xi $$0) {
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
   public boolean L_() {
      return this.e.m();
   }
}
