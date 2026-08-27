import net.minecraft.server.MinecraftServer;

public class aoe implements afl {
   private static final vg a = vg.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final uh c;

   public aoe(MinecraftServer $$0, uh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(afk $$0) {
      switch ($$0.f()) {
         case b:
            this.c.a(afj.b);
            if ($$0.a() != aa.b().e()) {
               vg $$1;
               if ($$0.a() < 754) {
                  $$1 = vg.a("multiplayer.disconnect.outdated_client", aa.b().c());
               } else {
                  $$1 = vg.a("multiplayer.disconnect.incompatible", aa.b().c());
               }

               this.c.a(new afs($$1));
               this.c.a($$1);
            } else {
               this.c.a(new aof(this.b, this.c));
            }
            break;
         case a:
            agi $$3 = this.b.as();
            if (this.b.ak() && $$3 != null) {
               this.c.a(afj.a);
               this.c.a(new aoh($$3, this.c));
            } else {
               this.c.a(a);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      }
   }

   @Override
   public void a(vg $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }
}
