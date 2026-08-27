import net.minecraft.server.MinecraftServer;

public class alr implements add {
   private static final tm a = tm.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final sn c;

   public alr(MinecraftServer $$0, sn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(adc $$0) {
      switch ($$0.f()) {
         case b:
            this.c.a(adb.b);
            if ($$0.a() != aa.b().e()) {
               tm $$1;
               if ($$0.a() < 754) {
                  $$1 = tm.a("multiplayer.disconnect.outdated_client", aa.b().c());
               } else {
                  $$1 = tm.a("multiplayer.disconnect.incompatible", aa.b().c());
               }

               this.c.a(new adk($$1));
               this.c.a($$1);
            } else {
               this.c.a(new als(this.b, this.c));
            }
            break;
         case a:
            aea $$3 = this.b.aq();
            if (this.b.ai() && $$3 != null) {
               this.c.a(adb.a);
               this.c.a(new alu($$3, this.c));
            } else {
               this.c.a(a);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      }
   }

   @Override
   public void a(tm $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }
}
