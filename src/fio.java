import java.util.Locale;

public class fio extends hky {
   private static final wo a = wo.c("mco.backup.info.title");
   private static final wo b = wo.c("mco.backup.unknown");
   private final fui c;
   final fgy C;
   final fse D = new fse(this);
   private fio.a E;

   public fio(fui $$0, fgy $$1) {
      super(a);
      this.c = $$0;
      this.C = $$1;
   }

   @Override
   public void aR_() {
      this.D.a(a, this.p);
      this.E = this.D.c(new fio.a(this.m));
      this.D.b(fop.a(wn.k, $$0 -> this.aO_()).a());
      this.c();
      this.D.a($$1 -> {
         fon var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.E.b(this.n, this.D.d());
      this.D.a();
   }

   @Override
   public void aO_() {
      this.m.a(this.c);
   }

   wo a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (wo)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : wo.b($$1));
      }
   }

   private wo a(String $$0) {
      try {
         return fjj.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private wo b(String $$0) {
      try {
         return fjj.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fpm<fio.b> {
      public a(final flh $$0) {
         super($$0, fio.this.n, fio.this.D.d(), fio.this.D.c(), 36);
         if (fio.this.C.e != null) {
            fio.this.C.e.forEach(($$0x, $$1) -> this.b(fio.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fpm.a<fio.b> {
      private static final wo b = wo.c("mco.backup.entry.templateName");
      private static final wo c = wo.c("mco.backup.entry.gameDifficulty");
      private static final wo d = wo.c("mco.backup.entry.name");
      private static final wo e = wo.c("mco.backup.entry.gameServerVersion");
      private static final wo f = wo.c("mco.backup.entry.uploaded");
      private static final wo g = wo.c("mco.backup.entry.enabledPack");
      private static final wo h = wo.c("mco.backup.entry.description");
      private static final wo i = wo.c("mco.backup.entry.gameMode");
      private static final wo j = wo.c("mco.backup.entry.seed");
      private static final wo k = wo.c("mco.backup.entry.worldType");
      private static final wo l = wo.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fio.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fio.this.p, fio.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private wo a(String $$0) {
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
      public wo a() {
         return wo.a("narrator.select", this.m + " " + this.n);
      }
   }
}
