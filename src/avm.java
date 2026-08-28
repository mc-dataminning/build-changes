import net.minecraft.server.MinecraftServer;

public class avm implements eo {
   private static final String b = "Rcon";
   private static final xl c = xl.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public avm(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ep g() {
      arb $$0 = this.e.I();
      return new ep(this, evm.a($$0.V()), evl.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(xl $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean l_() {
      return true;
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean U_() {
      return this.e.m();
   }
}
