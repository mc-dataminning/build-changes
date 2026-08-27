import net.minecraft.server.MinecraftServer;

public class aop implements ds {
   private static final String b = "Rcon";
   private static final ti c = ti.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public aop(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public dt g() {
      akn $$0 = this.e.D();
      return new dt(this, ehi.a($$0.R()), ehh.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(ti $$0) {
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
