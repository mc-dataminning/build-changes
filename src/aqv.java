import net.minecraft.server.MinecraftServer;

public class aqv implements ahq {
   private static final wi a = wi.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final vg c;

   public aqv(MinecraftServer $$0, vg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ahn $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            aiu $$1 = this.b.av();
            this.c.a(aiy.b);
            if (this.b.an() && $$1 != null) {
               this.c.a(aiy.a, new aqy($$1, this.c));
            } else {
               this.c.a(a);
            }
            break;
         case c:
            if (!this.b.bo()) {
               this.c.a(ahz.b);
               wi $$2 = wi.c("multiplayer.disconnect.transfers_disabled");
               this.c.a(new ahx($$2));
               this.c.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(ahn $$0, boolean $$1) {
      this.c.a(ahz.b);
      if ($$0.b() != aa.b().e()) {
         wi $$2;
         if ($$0.b() < 754) {
            $$2 = wi.a("multiplayer.disconnect.outdated_client", aa.b().c());
         } else {
            $$2 = wi.a("multiplayer.disconnect.incompatible", aa.b().c());
         }

         this.c.a(new ahx($$2));
         this.c.a($$2);
      } else {
         this.c.a(ahz.a, new aqw(this.b, this.c, $$1));
      }
   }

   @Override
   public void a(wi $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
