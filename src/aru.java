import net.minecraft.server.MinecraftServer;

public class aru implements aio {
   private static final xe a = xe.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final wc c;

   public aru(MinecraftServer $$0, wc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ail $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            ajs $$1 = this.b.av();
            this.c.a(ajw.b);
            if (this.b.an() && $$1 != null) {
               this.c.a(ajw.a, new arx($$1, this.c));
            } else {
               this.c.a(a);
            }
            break;
         case c:
            if (!this.b.bo()) {
               this.c.a(aix.b);
               xe $$2 = xe.c("multiplayer.disconnect.transfers_disabled");
               this.c.a(new aiv($$2));
               this.c.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(ail $$0, boolean $$1) {
      this.c.a(aix.b);
      if ($$0.b() != ab.b().e()) {
         xe $$2;
         if ($$0.b() < 754) {
            $$2 = xe.a("multiplayer.disconnect.outdated_client", ab.b().c());
         } else {
            $$2 = xe.a("multiplayer.disconnect.incompatible", ab.b().c());
         }

         this.c.a(new aiv($$2));
         this.c.a($$2);
      } else {
         this.c.a(aix.a, new arv(this.b, this.c, $$1));
      }
   }

   @Override
   public void a(xe $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
