import net.minecraft.server.MinecraftServer;

public class aok implements dr {
   private static final String b = "Rcon";
   private static final te c = te.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public aok(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ds g() {
      aki $$0 = this.e.D();
      return new ds(this, ehf.a($$0.R()), ehe.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(te $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean f_() {
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
