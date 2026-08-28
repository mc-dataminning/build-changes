import net.minecraft.server.MinecraftServer;

public class asf implements aiz {
   private static final xo b = xo.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final wj d;

   public asf(MinecraftServer $$0, wj $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aiw $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            akd $$1 = this.c.av();
            this.d.a(akh.b);
            if (this.c.an() && $$1 != null) {
               this.d.a(akh.a, new asi($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bo()) {
               this.d.a(aji.b);
               xo $$2 = xo.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new ajg($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(aiw $$0, boolean $$1) {
      this.d.a(aji.b);
      if ($$0.b() != aa.b().e()) {
         xo $$2;
         if ($$0.b() < 754) {
            $$2 = xo.a("multiplayer.disconnect.outdated_client", aa.b().c());
         } else {
            $$2 = xo.a("multiplayer.disconnect.incompatible", aa.b().c());
         }

         this.d.a(new ajg($$2));
         this.d.a($$2);
      } else {
         this.d.a(aji.a, new asg(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(xo $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
