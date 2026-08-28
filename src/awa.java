import net.minecraft.server.MinecraftServer;

public class awa implements ew {
   private static final String b = "Rcon";
   private static final wv c = wv.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public awa(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ex g() {
      arn $$0 = this.e.J();
      return new ex(this, fcu.a($$0.aa()), fct.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(wv $$0) {
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
