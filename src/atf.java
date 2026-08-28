import net.minecraft.server.MinecraftServer;

public class atf implements ajk {
   private static final xg b = xg.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final vv d;

   public atf(MinecraftServer $$0, vv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ajh $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            ako $$1 = this.c.au();
            this.d.a(aks.d);
            if (this.c.am() && $$1 != null) {
               this.d.a(aks.b, new ati($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bm()) {
               this.d.a(ajt.d);
               xg $$2 = xg.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new ajq($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(ajh $$0, boolean $$1) {
      this.d.a(ajt.d);
      if ($$0.b() != ac.b().e()) {
         xg $$2;
         if ($$0.b() < 754) {
            $$2 = xg.a("multiplayer.disconnect.outdated_client", ac.b().c());
         } else {
            $$2 = xg.a("multiplayer.disconnect.incompatible", ac.b().c());
         }

         this.d.a(new ajq($$2));
         this.d.a($$2);
      } else {
         this.d.a(ajt.b, new atg(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(vx $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
