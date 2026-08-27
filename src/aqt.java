import net.minecraft.server.MinecraftServer;

public class aqt implements aho {
   private static final wg a = wg.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final ve c;

   public aqt(MinecraftServer $$0, ve $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ahl $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            ais $$1 = this.b.av();
            this.c.a(aiw.b);
            if (this.b.an() && $$1 != null) {
               this.c.a(aiw.a, new aqw($$1, this.c));
            } else {
               this.c.a(a);
            }
            break;
         case c:
            if (!this.b.bo()) {
               this.c.a(ahx.b);
               wg $$2 = wg.c("multiplayer.disconnect.transfers_disabled");
               this.c.a(new ahv($$2));
               this.c.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(ahl $$0, boolean $$1) {
      this.c.a(ahx.b);
      if ($$0.b() != aa.b().e()) {
         wg $$2;
         if ($$0.b() < 754) {
            $$2 = wg.a("multiplayer.disconnect.outdated_client", aa.b().c());
         } else {
            $$2 = wg.a("multiplayer.disconnect.incompatible", aa.b().c());
         }

         this.c.a(new ahv($$2));
         this.c.a($$2);
      } else {
         this.c.a(ahx.a, new aqu(this.b, this.c, $$1));
      }
   }

   @Override
   public void a(wg $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
