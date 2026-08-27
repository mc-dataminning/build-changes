import net.minecraft.server.MinecraftServer;

public class ana implements aek {
   private static final ur a = ur.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final ts c;

   public ana(MinecraftServer $$0, ts $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aej $$0) {
      switch ($$0.f()) {
         case b:
            this.c.a(aei.b);
            if ($$0.a() != aa.b().e()) {
               ur $$1;
               if ($$0.a() < 754) {
                  $$1 = ur.a("multiplayer.disconnect.outdated_client", aa.b().c());
               } else {
                  $$1 = ur.a("multiplayer.disconnect.incompatible", aa.b().c());
               }

               this.c.a(new aer($$1));
               this.c.a($$1);
            } else {
               this.c.a(new anb(this.b, this.c));
            }
            break;
         case a:
            afh $$3 = this.b.aq();
            if (this.b.ai() && $$3 != null) {
               this.c.a(aei.a);
               this.c.a(new and($$3, this.c));
            } else {
               this.c.a(a);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      }
   }

   @Override
   public void a(ur $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }
}
