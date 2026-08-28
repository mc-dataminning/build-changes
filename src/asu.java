import net.minecraft.server.MinecraftServer;

public class asu implements aiz {
   private static final wy b = wy.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final vr d;

   public asu(MinecraftServer $$0, vr $$1) {
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
            akd $$1 = this.c.au();
            this.d.a(akh.d);
            if (this.c.am() && $$1 != null) {
               this.d.a(akh.b, new asx($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bm()) {
               this.d.a(aji.d);
               wy $$2 = wy.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new ajf($$2));
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
      this.d.a(aji.d);
      if ($$0.b() != ab.b().e()) {
         wy $$2;
         if ($$0.b() < 754) {
            $$2 = wy.a("multiplayer.disconnect.outdated_client", ab.b().c());
         } else {
            $$2 = wy.a("multiplayer.disconnect.incompatible", ab.b().c());
         }

         this.d.a(new ajf($$2));
         this.d.a($$2);
      } else {
         this.d.a(aji.b, new asv(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(vt $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
