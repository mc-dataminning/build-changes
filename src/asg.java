import net.minecraft.server.MinecraftServer;

public class asg implements aja {
   private static final xp b = xp.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final wk d;

   public asg(MinecraftServer $$0, wk $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aix $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            ake $$1 = this.c.av();
            this.d.a(aki.b);
            if (this.c.an() && $$1 != null) {
               this.d.a(aki.a, new asj($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bo()) {
               this.d.a(ajj.b);
               xp $$2 = xp.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new ajh($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(aix $$0, boolean $$1) {
      this.d.a(ajj.b);
      if ($$0.b() != aa.b().e()) {
         xp $$2;
         if ($$0.b() < 754) {
            $$2 = xp.a("multiplayer.disconnect.outdated_client", aa.b().c());
         } else {
            $$2 = xp.a("multiplayer.disconnect.incompatible", aa.b().c());
         }

         this.d.a(new ajh($$2));
         this.d.a($$2);
      } else {
         this.d.a(ajj.a, new ash(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(xp $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
