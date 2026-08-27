import net.minecraft.server.MinecraftServer;

public class alm implements ada {
   private static final ti a = ti.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final sj c;

   public alm(MinecraftServer $$0, sj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(acz $$0) {
      switch ($$0.f()) {
         case b:
            this.c.a(acy.b);
            if ($$0.a() != aa.b().e()) {
               ti $$1;
               if ($$0.a() < 754) {
                  $$1 = ti.a("multiplayer.disconnect.outdated_client", aa.b().c());
               } else {
                  $$1 = ti.a("multiplayer.disconnect.incompatible", aa.b().c());
               }

               this.c.a(new adh($$1));
               this.c.a($$1);
            } else {
               this.c.a(new aln(this.b, this.c));
            }
            break;
         case a:
            adx $$3 = this.b.aq();
            if (this.b.ai() && $$3 != null) {
               this.c.a(acy.a);
               this.c.a(new alp($$3, this.c));
            } else {
               this.c.a(a);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      }
   }

   @Override
   public void a(ti $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }
}
