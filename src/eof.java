import net.minecraft.server.MinecraftServer;

public class eof implements eog<MinecraftServer> {
   final ajc a;

   public eof(ajc $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eoi<MinecraftServer> $$1, long $$2) {
      ajq $$3 = $$0.aF();

      for (hf<du> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends eog.a<MinecraftServer, eof> {
      public a() {
         super(new ajc("function_tag"), eof.class);
      }

      public void a(sy $$0, eof $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eof a(sy $$0) {
         ajc $$1 = new ajc($$0.l("Name"));
         return new eof($$1);
      }
   }
}
