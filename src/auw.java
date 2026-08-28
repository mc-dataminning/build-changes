import net.minecraft.server.MinecraftServer;

public class auw implements ep {
   private static final String b = "Rcon";
   private static final wu c = wu.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public auw(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public eq g() {
      aqm $$0 = this.e.J();
      return new eq(this, ewf.a($$0.V()), ewe.a, $$0, 4, "Rcon", c, this.e, null);
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
