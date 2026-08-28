import net.minecraft.server.MinecraftServer;

public class awe implements ev {
   private static final String b = "Rcon";
   private static final xl c = xl.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public awe(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ew g() {
      arq $$0 = this.e.J();
      return new ew(this, ezr.a($$0.W()), ezq.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(xl $$0) {
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
