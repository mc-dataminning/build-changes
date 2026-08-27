import net.minecraft.server.MinecraftServer;

public class apw implements agu {
   private static final vq a = vq.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final uo c;

   public apw(MinecraftServer $$0, uo $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(agr $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            ahy $$1 = this.b.au();
            this.c.a(aic.b);
            if (this.b.am() && $$1 != null) {
               this.c.a(aic.a, new apz($$1, this.c));
            } else {
               this.c.a(a);
            }
            break;
         case c:
            if (!this.b.bm()) {
               this.c.a(ahd.b);
               vq $$2 = vq.c("multiplayer.disconnect.transfers_disabled");
               this.c.a(new ahb($$2));
               this.c.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(agr $$0, boolean $$1) {
      this.c.a(ahd.b);
      if ($$0.b() != aa.b().e()) {
         vq $$2;
         if ($$0.b() < 754) {
            $$2 = vq.a("multiplayer.disconnect.outdated_client", aa.b().c());
         } else {
            $$2 = vq.a("multiplayer.disconnect.incompatible", aa.b().c());
         }

         this.c.a(new ahb($$2));
         this.c.a($$2);
      } else {
         this.c.a(ahd.a, new apx(this.b, this.c, $$1));
      }
   }

   @Override
   public void a(vq $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
