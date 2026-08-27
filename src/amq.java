import net.minecraft.server.MinecraftServer;

public class amq implements aea {
   private static final ui a = ui.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final tj c;

   public amq(MinecraftServer $$0, tj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(adz $$0) {
      switch ($$0.f()) {
         case b:
            this.c.a(ady.b);
            if ($$0.a() != aa.b().e()) {
               ui $$1;
               if ($$0.a() < 754) {
                  $$1 = ui.a("multiplayer.disconnect.outdated_client", aa.b().c());
               } else {
                  $$1 = ui.a("multiplayer.disconnect.incompatible", aa.b().c());
               }

               this.c.a(new aeh($$1));
               this.c.a($$1);
            } else {
               this.c.a(new amr(this.b, this.c));
            }
            break;
         case a:
            aex $$3 = this.b.aq();
            if (this.b.ai() && $$3 != null) {
               this.c.a(ady.a);
               this.c.a(new amt($$3, this.c));
            } else {
               this.c.a(a);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      }
   }

   @Override
   public void a(ui $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }
}
