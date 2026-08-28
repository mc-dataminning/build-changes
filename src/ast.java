import net.minecraft.server.MinecraftServer;

public class ast implements ajc {
   private static final xj b = xj.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final wd d;

   public ast(MinecraftServer $$0, wd $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aiz $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            akg $$1 = this.c.au();
            this.d.a(akk.d);
            if (this.c.am() && $$1 != null) {
               this.d.a(akk.b, new asw($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bm()) {
               this.d.a(ajl.d);
               xj $$2 = xj.c("multiplayer.disconnect.transfers_disabled");
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

   private void a(aiz $$0, boolean $$1) {
      this.d.a(ajl.d);
      if ($$0.b() != ab.b().e()) {
         xj $$2;
         if ($$0.b() < 754) {
            $$2 = xj.a("multiplayer.disconnect.outdated_client", ab.b().c());
         } else {
            $$2 = xj.a("multiplayer.disconnect.incompatible", ab.b().c());
         }

         this.d.a(new aji($$2));
         this.d.a($$2);
      } else {
         this.d.a(ajl.b, new asu(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(wf $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
