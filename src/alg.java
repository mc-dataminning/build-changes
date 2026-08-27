import net.minecraft.server.MinecraftServer;

public class alg implements ada {
   private final MinecraftServer a;
   private final sj b;

   public alg(MinecraftServer $$0, sj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(acz $$0) {
      if ($$0.f() != acy.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      } else {
         this.b.a(acy.b);
         this.b.a(new aln(this.a, this.b));
      }
   }

   @Override
   public void a(ti $$0) {
   }

   @Override
   public boolean c() {
      return this.b.k();
   }
}
