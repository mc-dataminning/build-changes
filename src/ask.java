import net.minecraft.server.MinecraftServer;

public class ask implements aiw {
   private static final xd b = xd.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final vx d;

   public ask(MinecraftServer $$0, vx $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ait $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            aka $$1 = this.c.au();
            this.d.a(ake.d);
            if (this.c.am() && $$1 != null) {
               this.d.a(ake.b, new asn($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bn()) {
               this.d.a(ajf.d);
               xd $$2 = xd.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new ajd($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(ait $$0, boolean $$1) {
      this.d.a(ajf.d);
      if ($$0.b() != ab.b().e()) {
         xd $$2;
         if ($$0.b() < 754) {
            $$2 = xd.a("multiplayer.disconnect.outdated_client", ab.b().c());
         } else {
            $$2 = xd.a("multiplayer.disconnect.incompatible", ab.b().c());
         }

         this.d.a(new ajd($$2));
         this.d.a($$2);
      } else {
         this.d.a(ajf.b, new asl(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(vz $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
