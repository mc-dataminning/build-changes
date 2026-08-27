import net.minecraft.server.MinecraftServer;

public class auc implements dt {
   private static final String b = "Rcon";
   private static final wg c = wg.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public auc(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public du g() {
      aps $$0 = this.e.I();
      return new du(this, esa.a($$0.U()), erz.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(wg $$0) {
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
   public boolean U_() {
      return this.e.m();
   }
}
