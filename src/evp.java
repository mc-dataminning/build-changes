import java.util.Locale;

public class evp extends gob {
   private static final vs a = vs.c("mco.backup.info.title");
   private static final vs b = vs.c("mco.backup.unknown");
   private final fgh c;
   final etz v;
   final fdw w = new fdw(this);
   private evp.a x;

   public evp(fgh $$0, etz $$1) {
      super(a);
      this.c = $$0;
      this.v = $$1;
   }

   @Override
   public void aP_() {
      this.w.a(new fbr(a, this.i));
      this.x = this.w.c(new evp.a(this.f));
      this.w.b(fak.a(vr.k, $$0 -> this.d()).a());
      this.c();
      this.w.a($$1 -> {
         fai var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.x.b(this.g, this.h - this.w.b() - this.w.c());
      this.w.a();
   }

   @Override
   public void d() {
      this.f.a(this.c);
   }

   vs a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (vs)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : vs.b($$1));
      }
   }

   private vs a(String $$0) {
      try {
         return ewm.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private vs b(String $$0) {
      try {
         return ewm.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fbg<evp.b> {
      public a(eyk $$0) {
         super($$0, evp.this.g, evp.this.h - evp.this.w.b() - evp.this.w.c(), evp.this.w.c(), 36);
         if (evp.this.v.e != null) {
            evp.this.v.e.forEach(($$0x, $$1) -> this.b(evp.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fbg.a<evp.b> {
      private static final vs b = vs.c("mco.backup.entry.templateName");
      private static final vs c = vs.c("mco.backup.entry.gameDifficulty");
      private static final vs d = vs.c("mco.backup.entry.name");
      private static final vs e = vs.c("mco.backup.entry.gameServerVersion");
      private static final vs f = vs.c("mco.backup.entry.uploaded");
      private static final vs g = vs.c("mco.backup.entry.enabledPack");
      private static final vs h = vs.c("mco.backup.entry.description");
      private static final vs i = vs.c("mco.backup.entry.gameMode");
      private static final vs j = vs.c("mco.backup.entry.seed");
      private static final vs k = vs.c("mco.backup.entry.worldType");
      private static final vs l = vs.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(evp.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(evp.this.i, evp.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private vs a(String $$0) {
         return switch ($$0) {
            case "template_name" -> b;
            case "game_difficulty" -> c;
            case "name" -> d;
            case "game_server_version" -> e;
            case "uploaded" -> f;
            case "enabled_packs" -> g;
            case "description" -> h;
            case "game_mode" -> i;
            case "seed" -> j;
            case "world_type" -> k;
            default -> l;
         };
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public vs a() {
         return vs.a("narrator.select", this.m + " " + this.n);
      }
   }
}
