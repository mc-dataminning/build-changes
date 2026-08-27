import net.minecraft.server.MinecraftServer;

public class alj implements acx {
   private static final tf a = tf.c("disconnect.ignoring_status_request");
   private final MinecraftServer b;
   private final sg c;

   public alj(MinecraftServer $$0, sg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(acw $$0) {
      switch ($$0.f()) {
         case b:
            this.c.a(acv.b);
            if ($$0.a() != aa.b().e()) {
               tf $$1;
               if ($$0.a() < 754) {
                  $$1 = tf.a("multiplayer.disconnect.outdated_client", aa.b().c());
               } else {
                  $$1 = tf.a("multiplayer.disconnect.incompatible", aa.b().c());
               }

               this.c.a(new ade($$1));
               this.c.a($$1);
            } else {
               this.c.a(new alk(this.b, this.c));
            }
            break;
         case a:
            adu $$3 = this.b.aq();
            if (this.b.ai() && $$3 != null) {
               this.c.a(acv.a);
               this.c.a(new alm($$3, this.c));
            } else {
               this.c.a(a);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      }
   }

   @Override
   public void a(tf $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }
}
