import net.minecraft.server.MinecraftServer;

public class anz implements afh {
   private static final vd a = vd.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final ue c;

   public anz(MinecraftServer $$0, ue $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(afg $$0) {
      switch ($$0.f()) {
         case b:
            this.c.a(aff.b);
            if ($$0.a() != aa.b().e()) {
               vd $$1;
               if ($$0.a() < 754) {
                  $$1 = vd.a("multiplayer.disconnect.outdated_client", aa.b().c());
               } else {
                  $$1 = vd.a("multiplayer.disconnect.incompatible", aa.b().c());
               }

               this.c.a(new afo($$1));
               this.c.a($$1);
            } else {
               this.c.a(new aoa(this.b, this.c));
            }
            break;
         case a:
            age $$3 = this.b.as();
            if (this.b.ak() && $$3 != null) {
               this.c.a(aff.a);
               this.c.a(new aoc($$3, this.c));
            } else {
               this.c.a(a);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      }
   }

   @Override
   public void a(vd $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }
}
