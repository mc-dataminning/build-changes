import net.minecraft.server.MinecraftServer;

public class auu implements ep {
   private static final String b = "Rcon";
   private static final wu c = wu.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public auu(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public eq g() {
      aqk $$0 = this.e.I();
      return new eq(this, evz.a($$0.V()), evy.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(wu $$0) {
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
