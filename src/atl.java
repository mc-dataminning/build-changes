import net.minecraft.server.MinecraftServer;

public class atl implements ajs {
   private static final xv b = xv.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final wp d;

   public atl(MinecraftServer $$0, wp $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ajp $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            akw $$1 = this.c.au();
            this.d.a(ala.d);
            if (this.c.am() && $$1 != null) {
               this.d.a(ala.b, new ato($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bm()) {
               this.d.a(akb.d);
               xv $$2 = xv.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new ajy($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(ajp $$0, boolean $$1) {
      this.d.a(akb.d);
      if ($$0.b() != ab.b().e()) {
         xv $$2;
         if ($$0.b() < 754) {
            $$2 = xv.a("multiplayer.disconnect.outdated_client", ab.b().c());
         } else {
            $$2 = xv.a("multiplayer.disconnect.incompatible", ab.b().c());
         }

         this.d.a(new ajy($$2));
         this.d.a($$2);
      } else {
         this.d.a(akb.b, new atm(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(wr $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
