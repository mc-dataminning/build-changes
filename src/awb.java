import net.minecraft.server.MinecraftServer;

public class awb implements eh {
   private static final String b = "Rcon";
   private static final ww c = ww.b("Rcon");
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

   public ei g() {
      aro $$0 = this.e.J();
      return new ei(this, fdw.a($$0.aa()), fdv.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(ww $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean t_() {
      return true;
   }

   @Override
   public boolean u_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.e.m();
   }
}
