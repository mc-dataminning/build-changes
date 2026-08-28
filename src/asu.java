import net.minecraft.server.MinecraftServer;

public class asu implements aje {
   private static final xl b = xl.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final wf d;

   public asu(MinecraftServer $$0, wf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ajb $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            aki $$1 = this.c.au();
            this.d.a(akm.d);
            if (this.c.am() && $$1 != null) {
               this.d.a(akm.b, new asx($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bm()) {
               this.d.a(ajn.d);
               xl $$2 = xl.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new ajk($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(ajb $$0, boolean $$1) {
      this.d.a(ajn.d);
      if ($$0.b() != ab.b().e()) {
         xl $$2;
         if ($$0.b() < 754) {
            $$2 = xl.a("multiplayer.disconnect.outdated_client", ab.b().c());
         } else {
            $$2 = xl.a("multiplayer.disconnect.incompatible", ab.b().c());
         }

         this.d.a(new ajk($$2));
         this.d.a($$2);
      } else {
         this.d.a(ajn.b, new asv(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(wh $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
