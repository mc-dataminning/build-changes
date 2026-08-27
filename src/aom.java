import net.minecraft.server.MinecraftServer;

public class aom implements dq {
   private static final String b = "Rcon";
   private static final tf c = tf.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public aom(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public dr g() {
      akk $$0 = this.e.D();
      return new dr(this, ehd.a($$0.R()), ehc.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(tf $$0) {
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
