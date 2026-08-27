import java.util.Locale;

public class enu extends ged {
   private static final te a = te.c("mco.backup.unknown");
   private final exv b;
   final emd c;
   private enu.a y;

   public enu(exv $$0, emd $$1) {
      super(te.c("mco.backup.info.title"));
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void c() {
   }

   @Override
   public void aE_() {
      this.d(esi.a(td.k, $$0 -> this.f.a(this.b)).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
      this.y = new enu.a(this.f);
      this.e(this.y);
      this.b(this.y);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.b);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.y.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
   }

   te a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (te)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : te.b($$1));
      }
   }

   private te a(String $$0) {
      try {
         return eoq.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return a;
      }
   }

   private te b(String $$0) {
      try {
         return eoq.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return a;
      }
   }

   class a extends ete<enu.b> {
      public a(eqn $$0) {
         super($$0, enu.this.g, enu.this.h, 32, enu.this.h - 64, 36);
         this.a(false);
         if (enu.this.c.e != null) {
            enu.this.c.e.forEach(($$0x, $$1) -> this.b(enu.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends ete.a<enu.b> {
      private static final te b = te.c("mco.backup.entry.templateName");
      private static final te c = te.c("mco.backup.entry.gameDifficulty");
      private static final te d = te.c("mco.backup.entry.name");
      private static final te e = te.c("mco.backup.entry.gameServerVersion");
      private static final te f = te.c("mco.backup.entry.uploaded");
      private static final te g = te.c("mco.backup.entry.enabledPack");
      private static final te h = te.c("mco.backup.entry.description");
      private static final te i = te.c("mco.backup.entry.gameMode");
      private static final te j = te.c("mco.backup.entry.seed");
      private static final te k = te.c("mco.backup.entry.worldType");
      private static final te l = te.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(enu.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(enu.this.i, enu.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private te a(String $$0) {
         return switch ($$0) {
            case "template_name" -> b;
            case "game_difficulty" -> c;
            case "name" -> d;
            case "game_server_version" -> e;
            case "uploaded" -> f;
            case "enabled_pack" -> g;
            case "description" -> h;
            case "game_mode" -> i;
            case "seed" -> j;
            case "world_type" -> k;
            default -> l;
         };
      }

      @Override
      public te a() {
         return te.a("narrator.select", this.m + " " + this.n);
      }
   }
}
