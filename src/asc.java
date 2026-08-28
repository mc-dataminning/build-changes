import net.minecraft.server.MinecraftServer;

public class asc implements aiw {
   private static final xl a = xl.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final wj c;

   public asc(MinecraftServer $$0, wj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ait $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            aka $$1 = this.b.av();
            this.c.a(ake.b);
            if (this.b.an() && $$1 != null) {
               this.c.a(ake.a, new asf($$1, this.c));
            } else {
               this.c.a(a);
            }
            break;
         case c:
            if (!this.b.bo()) {
               this.c.a(ajf.b);
               xl $$2 = xl.c("multiplayer.disconnect.transfers_disabled");
               this.c.a(new ajd($$2));
               this.c.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(ait $$0, boolean $$1) {
      this.c.a(ajf.b);
      if ($$0.b() != aa.b().e()) {
         xl $$2;
         if ($$0.b() < 754) {
            $$2 = xl.a("multiplayer.disconnect.outdated_client", aa.b().c());
         } else {
            $$2 = xl.a("multiplayer.disconnect.incompatible", aa.b().c());
         }

         this.c.a(new ajd($$2));
         this.c.a($$2);
      } else {
         this.c.a(ajf.a, new asd(this.b, this.c, $$1));
      }
   }

   @Override
   public void a(xl $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
