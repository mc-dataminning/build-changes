import net.minecraft.server.MinecraftServer;

public class aou implements ds {
   private static final String b = "Rcon";
   private static final tm c = tm.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public aou(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public dt g() {
      akr $$0 = this.e.D();
      return new dt(this, ehn.a($$0.R()), ehm.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(tm $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean j_() {
      return true;
   }

   @Override
   public boolean v_() {
      return true;
   }

   @Override
   public boolean T_() {
      return this.e.k();
   }
}
