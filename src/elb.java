import net.minecraft.server.MinecraftServer;

public class elb implements eld<MinecraftServer> {
   final ahg a;

   public elb(ahg $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, elf<MinecraftServer> $$1, long $$2) {
      ahu $$3 = $$0.aC();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends eld.a<MinecraftServer, elb> {
      public a() {
         super(new ahg("function"), elb.class);
      }

      public void a(sn $$0, elb $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public elb a(sn $$0) {
         ahg $$1 = new ahg($$0.l("Name"));
         return new elb($$1);
      }
   }
}
