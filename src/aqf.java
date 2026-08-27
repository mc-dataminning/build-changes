import net.minecraft.server.MinecraftServer;

public class aqf implements ahc {
   private static final vu a = vu.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final us c;

   public aqf(MinecraftServer $$0, us $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(agz $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            aig $$1 = this.b.av();
            this.c.a(aik.b);
            if (this.b.an() && $$1 != null) {
               this.c.a(aik.a, new aqi($$1, this.c));
            } else {
               this.c.a(a);
            }
            break;
         case c:
            if (!this.b.bo()) {
               this.c.a(ahl.b);
               vu $$2 = vu.c("multiplayer.disconnect.transfers_disabled");
               this.c.a(new ahj($$2));
               this.c.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(agz $$0, boolean $$1) {
      this.c.a(ahl.b);
      if ($$0.b() != aa.b().e()) {
         vu $$2;
         if ($$0.b() < 754) {
            $$2 = vu.a("multiplayer.disconnect.outdated_client", aa.b().c());
         } else {
            $$2 = vu.a("multiplayer.disconnect.incompatible", aa.b().c());
         }

         this.c.a(new ahj($$2));
         this.c.a($$2);
      } else {
         this.c.a(ahl.a, new aqg(this.b, this.c, $$1));
      }
   }

   @Override
   public void a(vu $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
