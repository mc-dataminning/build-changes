import net.minecraft.server.MinecraftServer;

public class alx implements dr {
   private static final String b = "Rcon";
   private static final sw c = sw.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public alx(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ds g() {
      aif $$0 = this.e.D();
      return new ds(this, eei.a($$0.R()), eeh.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(sw $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean e_() {
      return true;
   }

   @Override
   public boolean q_() {
      return true;
   }

   @Override
   public boolean N_() {
      return this.e.k();
   }
}
