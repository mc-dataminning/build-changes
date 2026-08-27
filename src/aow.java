import net.minecraft.server.MinecraftServer;

public class aow implements ds {
   private static final String b = "Rcon";
   private static final tl c = tl.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public aow(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public dt g() {
      akt $$0 = this.e.D();
      return new dt(this, ehh.a($$0.R()), ehg.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(tl $$0) {
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
