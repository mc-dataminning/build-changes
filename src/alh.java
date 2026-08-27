import net.minecraft.server.MinecraftServer;

public class alh implements acv {
   private static final te a = te.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final sf c;

   public alh(MinecraftServer $$0, sf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(acu $$0) {
      switch ($$0.f()) {
         case b:
            this.c.a(act.b);
            if ($$0.a() != aa.b().e()) {
               te $$1;
               if ($$0.a() < 754) {
                  $$1 = te.a("multiplayer.disconnect.outdated_client", aa.b().c());
               } else {
                  $$1 = te.a("multiplayer.disconnect.incompatible", aa.b().c());
               }

               this.c.a(new adc($$1));
               this.c.a($$1);
            } else {
               this.c.a(new ali(this.b, this.c));
            }
            break;
         case a:
            ads $$3 = this.b.aq();
            if (this.b.ai() && $$3 != null) {
               this.c.a(act.a);
               this.c.a(new alk($$3, this.c));
            } else {
               this.c.a(a);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      }
   }

   @Override
   public void a(te $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }
}
