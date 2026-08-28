import net.minecraft.server.MinecraftServer;

public class arv implements aim {
   private static final wz b = wz.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final vt d;

   public arv(MinecraftServer $$0, vt $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aij $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            ajq $$1 = this.c.av();
            this.d.a(aju.d);
            if (this.c.an() && $$1 != null) {
               this.d.a(aju.b, new ary($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bo()) {
               this.d.a(aiv.d);
               wz $$2 = wz.c("multiplayer.disconnect.transfers_disabled");
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

   private void a(aij $$0, boolean $$1) {
      this.d.a(aiv.d);
      if ($$0.b() != ab.b().e()) {
         wz $$2;
         if ($$0.b() < 754) {
            $$2 = wz.a("multiplayer.disconnect.outdated_client", ab.b().c());
         } else {
            $$2 = wz.a("multiplayer.disconnect.incompatible", ab.b().c());
         }

         this.d.a(new ait($$2));
         this.d.a($$2);
      } else {
         this.d.a(aiv.b, new arw(this.c, this.d, $$1));
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
