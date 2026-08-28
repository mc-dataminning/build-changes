import net.minecraft.server.MinecraftServer;

public class asm implements aix {
   private static final xe b = xe.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final vy d;

   public asm(MinecraftServer $$0, vy $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aiu $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            akb $$1 = this.c.au();
            this.d.a(akf.d);
            if (this.c.am() && $$1 != null) {
               this.d.a(akf.b, new asp($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bn()) {
               this.d.a(ajg.d);
               xe $$2 = xe.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new aje($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(aiu $$0, boolean $$1) {
      this.d.a(ajg.d);
      if ($$0.b() != ab.b().e()) {
         xe $$2;
         if ($$0.b() < 754) {
            $$2 = xe.a("multiplayer.disconnect.outdated_client", ab.b().c());
         } else {
            $$2 = xe.a("multiplayer.disconnect.incompatible", ab.b().c());
         }

         this.d.a(new aje($$2));
         this.d.a($$2);
      } else {
         this.d.a(ajg.b, new asn(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(wa $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
