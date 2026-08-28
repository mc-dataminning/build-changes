import net.minecraft.server.MinecraftServer;

public class awf implements ei {
   private static final String b = "Rcon";
   private static final xa c = xa.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public awf(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ej g() {
      ars $$0 = this.e.J();
      return new ej(this, ffq.a($$0.aa()), ffp.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(xa $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public boolean y_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.e.m();
   }
}
