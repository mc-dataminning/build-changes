import net.minecraft.server.MinecraftServer;

public class asr implements ajb {
   private static final xi b = xi.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final wc d;

   public asr(MinecraftServer $$0, wc $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aiy $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            akf $$1 = this.c.au();
            this.d.a(akj.d);
            if (this.c.am() && $$1 != null) {
               this.d.a(akj.b, new asu($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bm()) {
               this.d.a(ajk.d);
               xi $$2 = xi.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new aji($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(aiy $$0, boolean $$1) {
      this.d.a(ajk.d);
      if ($$0.b() != ab.b().e()) {
         xi $$2;
         if ($$0.b() < 754) {
            $$2 = xi.a("multiplayer.disconnect.outdated_client", ab.b().c());
         } else {
            $$2 = xi.a("multiplayer.disconnect.incompatible", ab.b().c());
         }

         this.d.a(new aji($$2));
         this.d.a($$2);
      } else {
         this.d.a(ajk.b, new ass(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(we $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
