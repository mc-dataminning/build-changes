import net.minecraft.server.MinecraftServer;

public class aqa implements agy {
   private static final vs a = vs.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final uq c;

   public aqa(MinecraftServer $$0, uq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(agv $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            aic $$1 = this.b.av();
            this.c.a(aig.b);
            if (this.b.an() && $$1 != null) {
               this.c.a(aig.a, new aqd($$1, this.c));
            } else {
               this.c.a(a);
            }
            break;
         case c:
            if (!this.b.bo()) {
               this.c.a(ahh.b);
               vs $$2 = vs.c("multiplayer.disconnect.transfers_disabled");
               this.c.a(new ahf($$2));
               this.c.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(agv $$0, boolean $$1) {
      this.c.a(ahh.b);
      if ($$0.b() != aa.b().e()) {
         vs $$2;
         if ($$0.b() < 754) {
            $$2 = vs.a("multiplayer.disconnect.outdated_client", aa.b().c());
         } else {
            $$2 = vs.a("multiplayer.disconnect.incompatible", aa.b().c());
         }

         this.c.a(new ahf($$2));
         this.c.a($$2);
      } else {
         this.c.a(ahh.a, new aqb(this.b, this.c, $$1));
      }
   }

   @Override
   public void a(vs $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
