import net.minecraft.server.MinecraftServer;

public class arl implements aif {
   private static final wu b = wu.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final vp d;

   public arl(MinecraftServer $$0, vp $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aic $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            ajj $$1 = this.c.av();
            this.d.a(ajn.b);
            if (this.c.an() && $$1 != null) {
               this.d.a(ajn.a, new aro($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bo()) {
               this.d.a(aio.b);
               wu $$2 = wu.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new aim($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(aic $$0, boolean $$1) {
      this.d.a(aio.b);
      if ($$0.b() != aa.b().e()) {
         wu $$2;
         if ($$0.b() < 754) {
            $$2 = wu.a("multiplayer.disconnect.outdated_client", aa.b().c());
         } else {
            $$2 = wu.a("multiplayer.disconnect.incompatible", aa.b().c());
         }

         this.d.a(new aim($$2));
         this.d.a($$2);
      } else {
         this.d.a(aio.a, new arm(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(wu $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
