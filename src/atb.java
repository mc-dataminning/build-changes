import net.minecraft.server.MinecraftServer;

public class atb implements aji {
   private static final xk b = xk.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final we d;

   public atb(MinecraftServer $$0, we $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ajf $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            akm $$1 = this.c.au();
            this.d.a(akq.d);
            if (this.c.am() && $$1 != null) {
               this.d.a(akq.b, new ate($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bm()) {
               this.d.a(ajr.d);
               xk $$2 = xk.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new ajo($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(ajf $$0, boolean $$1) {
      this.d.a(ajr.d);
      if ($$0.b() != ab.b().e()) {
         xk $$2;
         if ($$0.b() < 754) {
            $$2 = xk.a("multiplayer.disconnect.outdated_client", ab.b().c());
         } else {
            $$2 = xk.a("multiplayer.disconnect.incompatible", ab.b().c());
         }

         this.d.a(new ajo($$2));
         this.d.a($$2);
      } else {
         this.d.a(ajr.b, new atc(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(wg $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
