import java.util.Locale;

public class ezd extends gru {
   private static final wi a = wi.c("mco.backup.info.title");
   private static final wi b = wi.c("mco.backup.unknown");
   private final fjx c;
   final exn y;
   final fhl z = new fhl(this);
   private ezd.a A;

   public ezd(fjx $$0, exn $$1) {
      super(a);
      this.c = $$0;
      this.y = $$1;
   }

   @Override
   public void aM_() {
      this.z.a(a, this.m);
      this.A = this.z.c(new ezd.a(this.j));
      this.z.b(fdy.a(wh.k, $$0 -> this.d()).a());
      this.c();
      this.z.a($$1 -> {
         fdw var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.A.b(this.k, this.z.d());
      this.z.a();
   }

   @Override
   public void d() {
      this.j.a(this.c);
   }

   wi a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (wi)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : wi.b($$1));
      }
   }

   private wi a(String $$0) {
      try {
         return faa.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private wi b(String $$0) {
      try {
         return faa.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends feu<ezd.b> {
      public a(fby $$0) {
         super($$0, ezd.this.k, ezd.this.z.d(), ezd.this.z.c(), 36);
         if (ezd.this.y.e != null) {
            ezd.this.y.e.forEach(($$0x, $$1) -> this.b(ezd.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends feu.a<ezd.b> {
      private static final wi b = wi.c("mco.backup.entry.templateName");
      private static final wi c = wi.c("mco.backup.entry.gameDifficulty");
      private static final wi d = wi.c("mco.backup.entry.name");
      private static final wi e = wi.c("mco.backup.entry.gameServerVersion");
      private static final wi f = wi.c("mco.backup.entry.uploaded");
      private static final wi g = wi.c("mco.backup.entry.enabledPack");
      private static final wi h = wi.c("mco.backup.entry.description");
      private static final wi i = wi.c("mco.backup.entry.gameMode");
      private static final wi j = wi.c("mco.backup.entry.seed");
      private static final wi k = wi.c("mco.backup.entry.worldType");
      private static final wi l = wi.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(ezd.this.m, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(ezd.this.m, ezd.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private wi a(String $$0) {
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
      public wi a() {
         return wi.a("narrator.select", this.m + " " + this.n);
      }
   }
}
