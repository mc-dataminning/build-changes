import net.minecraft.server.MinecraftServer;

public class asw implements ajb {
   private static final xa b = xa.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final vt d;

   public asw(MinecraftServer $$0, vt $$1) {
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
               this.d.a(akj.b, new asz($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bm()) {
               this.d.a(ajk.d);
               xa $$2 = xa.c("multiplayer.disconnect.transfers_disabled");
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

   private void a(aiy $$0, boolean $$1) {
      this.d.a(ajk.d);
      if ($$0.b() != ac.b().e()) {
         xa $$2;
         if ($$0.b() < 754) {
            $$2 = xa.a("multiplayer.disconnect.outdated_client", ac.b().c());
         } else {
            $$2 = xa.a("multiplayer.disconnect.incompatible", ac.b().c());
         }

         this.d.a(new ajh($$2));
         this.d.a($$2);
      } else {
         this.d.a(ajk.b, new asx(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(vv $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
