import net.minecraft.server.MinecraftServer;

public class ash implements ain {
   private static final wp b = wp.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final vi d;

   public ash(MinecraftServer $$0, vi $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aik $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            ajr $$1 = this.c.au();
            this.d.a(ajv.d);
            if (this.c.am() && $$1 != null) {
               this.d.a(ajv.b, new ask($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bm()) {
               this.d.a(aiw.d);
               wp $$2 = wp.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new ait($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(aik $$0, boolean $$1) {
      this.d.a(aiw.d);
      if ($$0.b() != ab.b().e()) {
         wp $$2;
         if ($$0.b() < 754) {
            $$2 = wp.a("multiplayer.disconnect.outdated_client", ab.b().c());
         } else {
            $$2 = wp.a("multiplayer.disconnect.incompatible", ab.b().c());
         }

         this.d.a(new ait($$2));
         this.d.a($$2);
      } else {
         this.d.a(aiw.b, new asi(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(vk $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
