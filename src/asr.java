import net.minecraft.server.MinecraftServer;

public class asr implements ajd {
   private final MinecraftServer b;
   private final vv c;

   public asr(MinecraftServer $$0, vv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aja $$0) {
      if ($$0.g() != aiz.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(ajm.b, new asz(this.b, this.c, false));
         this.c.a(ajm.d);
      }
   }

   @Override
   public void a(vx $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
