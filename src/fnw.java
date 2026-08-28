import java.util.Locale;

public class fnw extends hrc {
   private static final xg a = xg.c("mco.backup.info.title");
   private static final xg b = xg.c("mco.backup.unknown");
   private final fzq c;
   final fmg C;
   final fxm D = new fxm(this);
   private fnw.a E;

   public fnw(fzq $$0, fmg $$1) {
      super(a);
      this.c = $$0;
      this.C = $$1;
   }

   @Override
   public void aO_() {
      this.D.a(a, this.p);
      this.E = this.D.c(new fnw.a(this.m));
      this.D.b(fty.a(xf.k, $$0 -> this.aL_()).a());
      this.c();
      this.D.a($$1 -> {
         ftw var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.E.b(this.n, this.D.d());
      this.D.a();
   }

   @Override
   public void aL_() {
      this.m.a(this.c);
   }

   xg a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (xg)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : xg.b($$1));
      }
   }

   private xg a(String $$0) {
      try {
         return fos.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private xg b(String $$0) {
      try {
         return fos.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fuu<fnw.b> {
      public a(final fqq $$0) {
         super($$0, fnw.this.n, fnw.this.D.d(), fnw.this.D.c(), 36);
         if (fnw.this.C.e != null) {
            fnw.this.C.e.forEach(($$0x, $$1) -> this.b(fnw.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fuu.a<fnw.b> {
      private static final xg b = xg.c("mco.backup.entry.templateName");
      private static final xg c = xg.c("mco.backup.entry.gameDifficulty");
      private static final xg d = xg.c("mco.backup.entry.name");
      private static final xg e = xg.c("mco.backup.entry.gameServerVersion");
      private static final xg f = xg.c("mco.backup.entry.uploaded");
      private static final xg g = xg.c("mco.backup.entry.enabledPack");
      private static final xg h = xg.c("mco.backup.entry.description");
      private static final xg i = xg.c("mco.backup.entry.gameMode");
      private static final xg j = xg.c("mco.backup.entry.seed");
      private static final xg k = xg.c("mco.backup.entry.worldType");
      private static final xg l = xg.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fnw.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fnw.this.p, fnw.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private xg a(String $$0) {
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
      public xg a() {
         return xg.a("narrator.select", this.m + " " + this.n);
      }
   }
}
