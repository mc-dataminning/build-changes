import net.minecraft.server.MinecraftServer;

public class arf implements aia {
   private static final ws a = ws.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final vq c;

   public arf(MinecraftServer $$0, vq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ahx $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            aje $$1 = this.b.av();
            this.c.a(aji.b);
            if (this.b.an() && $$1 != null) {
               this.c.a(aji.a, new ari($$1, this.c));
            } else {
               this.c.a(a);
            }
            break;
         case c:
            if (!this.b.bo()) {
               this.c.a(aij.b);
               ws $$2 = ws.c("multiplayer.disconnect.transfers_disabled");
               this.c.a(new aih($$2));
               this.c.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(ahx $$0, boolean $$1) {
      this.c.a(aij.b);
      if ($$0.b() != aa.b().e()) {
         ws $$2;
         if ($$0.b() < 754) {
            $$2 = ws.a("multiplayer.disconnect.outdated_client", aa.b().c());
         } else {
            $$2 = ws.a("multiplayer.disconnect.incompatible", aa.b().c());
         }

         this.c.a(new aih($$2));
         this.c.a($$2);
      } else {
         this.c.a(aij.a, new arg(this.b, this.c, $$1));
      }
   }

   @Override
   public void a(ws $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
