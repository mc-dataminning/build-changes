import net.minecraft.server.MinecraftServer;

public class arn implements aih {
   private static final wx a = wx.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final vv c;

   public arn(MinecraftServer $$0, vv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aie $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            ajl $$1 = this.b.av();
            this.c.a(ajp.b);
            if (this.b.an() && $$1 != null) {
               this.c.a(ajp.a, new arq($$1, this.c));
            } else {
               this.c.a(a);
            }
            break;
         case c:
            if (!this.b.bo()) {
               this.c.a(aiq.b);
               wx $$2 = wx.c("multiplayer.disconnect.transfers_disabled");
               this.c.a(new aio($$2));
               this.c.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(aie $$0, boolean $$1) {
      this.c.a(aiq.b);
      if ($$0.b() != aa.b().e()) {
         wx $$2;
         if ($$0.b() < 754) {
            $$2 = wx.a("multiplayer.disconnect.outdated_client", aa.b().c());
         } else {
            $$2 = wx.a("multiplayer.disconnect.incompatible", aa.b().c());
         }

         this.c.a(new aio($$2));
         this.c.a($$2);
      } else {
         this.c.a(aiq.a, new aro(this.b, this.c, $$1));
      }
   }

   @Override
   public void a(wx $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
