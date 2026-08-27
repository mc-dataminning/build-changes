import net.minecraft.server.MinecraftServer;

public class atf implements dt {
   private static final String b = "Rcon";
   private static final vs c = vs.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public atf(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public du g() {
      apa $$0 = this.e.I();
      return new du(this, eov.a($$0.T()), eou.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(vs $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean l_() {
      return true;
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public boolean W_() {
      return this.e.m();
   }
}
