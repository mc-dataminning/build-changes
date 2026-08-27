import net.minecraft.server.MinecraftServer;

public class ani implements aeq {
   private static final uv a = uv.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final tw c;

   public ani(MinecraftServer $$0, tw $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aep $$0) {
      switch ($$0.f()) {
         case b:
            this.c.a(aeo.b);
            if ($$0.a() != aa.b().e()) {
               uv $$1;
               if ($$0.a() < 754) {
                  $$1 = uv.a("multiplayer.disconnect.outdated_client", aa.b().c());
               } else {
                  $$1 = uv.a("multiplayer.disconnect.incompatible", aa.b().c());
               }

               this.c.a(new aex($$1));
               this.c.a($$1);
            } else {
               this.c.a(new anj(this.b, this.c));
            }
            break;
         case a:
            afn $$3 = this.b.as();
            if (this.b.ak() && $$3 != null) {
               this.c.a(aeo.a);
               this.c.a(new anl($$3, this.c));
            } else {
               this.c.a(a);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      }
   }

   @Override
   public void a(uv $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }
}
