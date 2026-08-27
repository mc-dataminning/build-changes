import net.minecraft.server.MinecraftServer;

public class arj implements dr {
   private static final String b = "Rcon";
   private static final vg c = vg.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public arj(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ds g() {
      ane $$0 = this.e.F();
      return new ds(this, emc.a($$0.T()), emb.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(vg $$0) {
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
