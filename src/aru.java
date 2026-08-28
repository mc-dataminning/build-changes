import net.minecraft.server.MinecraftServer;

public class aru implements ail {
   private static final wy b = wy.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final vs d;

   public aru(MinecraftServer $$0, vs $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aii $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            ajp $$1 = this.c.av();
            this.d.a(ajt.b);
            if (this.c.an() && $$1 != null) {
               this.d.a(ajt.a, new arx($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bo()) {
               this.d.a(aiu.b);
               wy $$2 = wy.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new ais($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(aii $$0, boolean $$1) {
      this.d.a(aiu.b);
      if ($$0.b() != ab.b().e()) {
         wy $$2;
         if ($$0.b() < 754) {
            $$2 = wy.a("multiplayer.disconnect.outdated_client", ab.b().c());
         } else {
            $$2 = wy.a("multiplayer.disconnect.incompatible", ab.b().c());
         }

         this.d.a(new ais($$2));
         this.d.a($$2);
      } else {
         this.d.a(aiu.a, new arv(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(vu $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
