import net.minecraft.server.MinecraftServer;

public class ari implements aic {
   private static final wu a = wu.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final vs c;

   public ari(MinecraftServer $$0, vs $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ahz $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            ajg $$1 = this.b.av();
            this.c.a(ajk.b);
            if (this.b.an() && $$1 != null) {
               this.c.a(ajk.a, new arl($$1, this.c));
            } else {
               this.c.a(a);
            }
            break;
         case c:
            if (!this.b.bo()) {
               this.c.a(ail.b);
               wu $$2 = wu.c("multiplayer.disconnect.transfers_disabled");
               this.c.a(new aij($$2));
               this.c.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(ahz $$0, boolean $$1) {
      this.c.a(ail.b);
      if ($$0.b() != aa.b().e()) {
         wu $$2;
         if ($$0.b() < 754) {
            $$2 = wu.a("multiplayer.disconnect.outdated_client", aa.b().c());
         } else {
            $$2 = wu.a("multiplayer.disconnect.incompatible", aa.b().c());
         }

         this.c.a(new aij($$2));
         this.c.a($$2);
      } else {
         this.c.a(ail.a, new arj(this.b, this.c, $$1));
      }
   }

   @Override
   public void a(wu $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
