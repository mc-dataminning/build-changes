import net.minecraft.server.MinecraftServer;

public class avq implements eo {
   private static final String b = "Rcon";
   private static final xp c = xp.b("Rcon");
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

   public ep g() {
      arf $$0 = this.e.I();
      return new ep(this, evs.a($$0.V()), evr.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(xp $$0) {
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
