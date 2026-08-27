import net.minecraft.server.MinecraftServer;

public class alt implements add {
   private static final tl a = tl.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final sm c;

   public alt(MinecraftServer $$0, sm $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(adc $$0) {
      switch ($$0.f()) {
         case b:
            this.c.a(adb.b);
            if ($$0.a() != aa.b().e()) {
               tl $$1;
               if ($$0.a() < 754) {
                  $$1 = tl.a("multiplayer.disconnect.outdated_client", aa.b().c());
               } else {
                  $$1 = tl.a("multiplayer.disconnect.incompatible", aa.b().c());
               }

               this.c.a(new adk($$1));
               this.c.a($$1);
            } else {
               this.c.a(new alu(this.b, this.c));
            }
            break;
         case a:
            aea $$3 = this.b.aq();
            if (this.b.ai() && $$3 != null) {
               this.c.a(adb.a);
               this.c.a(new alw($$3, this.c));
            } else {
               this.c.a(a);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      }
   }

   @Override
   public void a(tl $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }
}
