import java.util.Locale;

public class fkk extends hne {
   private static final wv a = wv.c("mco.backup.info.title");
   private static final wv b = wv.c("mco.backup.unknown");
   private final fwf c;
   final fiu C;
   final fub D = new fub(this);
   private fkk.a E;

   public fkk(fwf $$0, fiu $$1) {
      super(a);
      this.c = $$0;
      this.C = $$1;
   }

   @Override
   public void aN_() {
      this.D.a(a, this.p);
      this.E = this.D.c(new fkk.a(this.m));
      this.D.b(fqn.a(wu.k, $$0 -> this.aK_()).a());
      this.c();
      this.D.a($$1 -> {
         fql var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.E.b(this.n, this.D.d());
      this.D.a();
   }

   @Override
   public void aK_() {
      this.m.a(this.c);
   }

   wv a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (wv)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : wv.b($$1));
      }
   }

   private wv a(String $$0) {
      try {
         return flf.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private wv b(String $$0) {
      try {
         return flf.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends frj<fkk.b> {
      public a(final fnd $$0) {
         super($$0, fkk.this.n, fkk.this.D.d(), fkk.this.D.c(), 36);
         if (fkk.this.C.e != null) {
            fkk.this.C.e.forEach(($$0x, $$1) -> this.b(fkk.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends frj.a<fkk.b> {
      private static final wv b = wv.c("mco.backup.entry.templateName");
      private static final wv c = wv.c("mco.backup.entry.gameDifficulty");
      private static final wv d = wv.c("mco.backup.entry.name");
      private static final wv e = wv.c("mco.backup.entry.gameServerVersion");
      private static final wv f = wv.c("mco.backup.entry.uploaded");
      private static final wv g = wv.c("mco.backup.entry.enabledPack");
      private static final wv h = wv.c("mco.backup.entry.description");
      private static final wv i = wv.c("mco.backup.entry.gameMode");
      private static final wv j = wv.c("mco.backup.entry.seed");
      private static final wv k = wv.c("mco.backup.entry.worldType");
      private static final wv l = wv.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fkk.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fkk.this.p, fkk.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private wv a(String $$0) {
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
      public wv a() {
         return wv.a("narrator.select", this.m + " " + this.n);
      }
   }
}
