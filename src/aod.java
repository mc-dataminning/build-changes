import net.minecraft.server.MinecraftServer;

public class aod implements afk {
   private static final vf a = vf.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final ug c;

   public aod(MinecraftServer $$0, ug $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(afj $$0) {
      switch ($$0.f()) {
         case b:
            this.c.a(afi.b);
            if ($$0.a() != aa.b().e()) {
               vf $$1;
               if ($$0.a() < 754) {
                  $$1 = vf.a("multiplayer.disconnect.outdated_client", aa.b().c());
               } else {
                  $$1 = vf.a("multiplayer.disconnect.incompatible", aa.b().c());
               }

               this.c.a(new afr($$1));
               this.c.a($$1);
            } else {
               this.c.a(new aoe(this.b, this.c));
            }
            break;
         case a:
            agh $$3 = this.b.as();
            if (this.b.ak() && $$3 != null) {
               this.c.a(afi.a);
               this.c.a(new aog($$3, this.c));
            } else {
               this.c.a(a);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      }
   }

   @Override
   public void a(vf $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }
}
