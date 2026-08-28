import net.minecraft.server.MinecraftServer;

public class asy implements ajd {
   private static final xc b = xc.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final vv d;

   public asy(MinecraftServer $$0, vv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aja $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            akh $$1 = this.c.au();
            this.d.a(akl.d);
            if (this.c.am() && $$1 != null) {
               this.d.a(akl.b, new atb($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bm()) {
               this.d.a(ajm.d);
               xc $$2 = xc.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new ajj($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(aja $$0, boolean $$1) {
      this.d.a(ajm.d);
      if ($$0.b() != ac.b().e()) {
         xc $$2;
         if ($$0.b() < 754) {
            $$2 = xc.a("multiplayer.disconnect.outdated_client", ac.b().c());
         } else {
            $$2 = xc.a("multiplayer.disconnect.incompatible", ac.b().c());
         }

         this.d.a(new ajj($$2));
         this.d.a($$2);
      } else {
         this.d.a(ajm.b, new asz(this.c, this.d, $$1));
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
