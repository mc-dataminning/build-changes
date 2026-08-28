import net.minecraft.server.MinecraftServer;

public class asq implements aja {
   private static final xh b = xh.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final wb d;

   public asq(MinecraftServer $$0, wb $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aix $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            ake $$1 = this.c.au();
            this.d.a(aki.d);
            if (this.c.am() && $$1 != null) {
               this.d.a(aki.b, new ast($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bn()) {
               this.d.a(ajj.d);
               xh $$2 = xh.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new ajh($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(aix $$0, boolean $$1) {
      this.d.a(ajj.d);
      if ($$0.b() != ab.b().e()) {
         xh $$2;
         if ($$0.b() < 754) {
            $$2 = xh.a("multiplayer.disconnect.outdated_client", ab.b().c());
         } else {
            $$2 = xh.a("multiplayer.disconnect.incompatible", ab.b().c());
         }

         this.d.a(new ajh($$2));
         this.d.a($$2);
      } else {
         this.d.a(ajj.b, new asr(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(wd $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
