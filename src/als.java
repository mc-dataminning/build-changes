import net.minecraft.server.MinecraftServer;

public class als implements ade {
   private static final tn a = tn.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final so c;

   public als(MinecraftServer $$0, so $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(add $$0) {
      switch ($$0.f()) {
         case b:
            this.c.a(adc.b);
            if ($$0.a() != aa.b().e()) {
               tn $$1;
               if ($$0.a() < 754) {
                  $$1 = tn.a("multiplayer.disconnect.outdated_client", aa.b().c());
               } else {
                  $$1 = tn.a("multiplayer.disconnect.incompatible", aa.b().c());
               }

               this.c.a(new adl($$1));
               this.c.a($$1);
            } else {
               this.c.a(new alt(this.b, this.c));
            }
            break;
         case a:
            aeb $$3 = this.b.aq();
            if (this.b.ai() && $$3 != null) {
               this.c.a(adc.a);
               this.c.a(new alv($$3, this.c));
            } else {
               this.c.a(a);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      }
   }

   @Override
   public void a(tn $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }
}
