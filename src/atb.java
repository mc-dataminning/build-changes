import net.minecraft.server.MinecraftServer;

public class atb implements dt {
   private static final String b = "Rcon";
   private static final vq c = vq.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public atb(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public du g() {
      aow $$0 = this.e.H();
      return new du(this, enz.a($$0.T()), eny.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(vq $$0) {
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
      return this.e.k();
   }
}
