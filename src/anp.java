import net.minecraft.server.MinecraftServer;

public class anp implements aex {
   private static final vb a = vb.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final uc c;

   public anp(MinecraftServer $$0, uc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aew $$0) {
      switch ($$0.f()) {
         case b:
            this.c.a(aev.b);
            if ($$0.a() != aa.b().e()) {
               vb $$1;
               if ($$0.a() < 754) {
                  $$1 = vb.a("multiplayer.disconnect.outdated_client", aa.b().c());
               } else {
                  $$1 = vb.a("multiplayer.disconnect.incompatible", aa.b().c());
               }

               this.c.a(new afe($$1));
               this.c.a($$1);
            } else {
               this.c.a(new anq(this.b, this.c));
            }
            break;
         case a:
            afu $$3 = this.b.as();
            if (this.b.ak() && $$3 != null) {
               this.c.a(aev.a);
               this.c.a(new ans($$3, this.c));
            } else {
               this.c.a(a);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      }
   }

   @Override
   public void a(vb $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }
}
