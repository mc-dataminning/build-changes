import java.util.Locale;

public class fjh extends hhp {
   private static final xv a = xv.c("mco.backup.info.title");
   private static final xv b = xv.c("mco.backup.unknown");
   private final ftr c;
   final fhr C;
   final frn D = new frn(this);
   private fjh.a E;

   public fjh(ftr $$0, fhr $$1) {
      super(a);
      this.c = $$0;
      this.C = $$1;
   }

   @Override
   public void aT_() {
      this.D.a(a, this.p);
      this.E = this.D.c(new fjh.a(this.m));
      this.D.b(fny.a(xu.k, $$0 -> this.aP_()).a());
      this.c();
      this.D.a($$1 -> {
         fnw var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.E.b(this.n, this.D.d());
      this.D.a();
   }

   @Override
   public void aP_() {
      this.m.a(this.c);
   }

   xv a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (xv)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : xv.b($$1));
      }
   }

   private xv a(String $$0) {
      try {
         return fkc.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private xv b(String $$0) {
      try {
         return fkc.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fov<fjh.b> {
      public a(final flz $$0) {
         super($$0, fjh.this.n, fjh.this.D.d(), fjh.this.D.c(), 36);
         if (fjh.this.C.e != null) {
            fjh.this.C.e.forEach(($$0x, $$1) -> this.b(fjh.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fov.a<fjh.b> {
      private static final xv b = xv.c("mco.backup.entry.templateName");
      private static final xv c = xv.c("mco.backup.entry.gameDifficulty");
      private static final xv d = xv.c("mco.backup.entry.name");
      private static final xv e = xv.c("mco.backup.entry.gameServerVersion");
      private static final xv f = xv.c("mco.backup.entry.uploaded");
      private static final xv g = xv.c("mco.backup.entry.enabledPack");
      private static final xv h = xv.c("mco.backup.entry.description");
      private static final xv i = xv.c("mco.backup.entry.gameMode");
      private static final xv j = xv.c("mco.backup.entry.seed");
      private static final xv k = xv.c("mco.backup.entry.worldType");
      private static final xv l = xv.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fjh.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fjh.this.p, fjh.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private xv a(String $$0) {
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
      public xv a() {
         return xv.a("narrator.select", this.m + " " + this.n);
      }
   }
}
