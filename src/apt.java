import net.minecraft.server.MinecraftServer;

public class apt implements dt {
   private static final String b = "Rcon";
   private static final ui c = ui.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public apt(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public du g() {
      alq $$0 = this.e.D();
      return new du(this, eif.a($$0.R()), eie.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(ui $$0) {
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
   public boolean U_() {
      return this.e.k();
   }
}
