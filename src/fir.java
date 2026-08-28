import java.util.Locale;

public class fir extends hlf {
   private static final wp a = wp.c("mco.backup.info.title");
   private static final wp b = wp.c("mco.backup.unknown");
   private final fum c;
   final fhb C;
   final fsi D = new fsi(this);
   private fir.a E;

   public fir(fum $$0, fhb $$1) {
      super(a);
      this.c = $$0;
      this.C = $$1;
   }

   @Override
   public void aR_() {
      this.D.a(a, this.p);
      this.E = this.D.c(new fir.a(this.m));
      this.D.b(fou.a(wo.k, $$0 -> this.aO_()).a());
      this.c();
      this.D.a($$1 -> {
         fos var10000 = this.c($$1);
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

   wp a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (wp)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : wp.b($$1));
      }
   }

   private wp a(String $$0) {
      try {
         return fjm.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private wp b(String $$0) {
      try {
         return fjm.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fpq<fir.b> {
      public a(final flk $$0) {
         super($$0, fir.this.n, fir.this.D.d(), fir.this.D.c(), 36);
         if (fir.this.C.e != null) {
            fir.this.C.e.forEach(($$0x, $$1) -> this.b(fir.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fpq.a<fir.b> {
      private static final wp b = wp.c("mco.backup.entry.templateName");
      private static final wp c = wp.c("mco.backup.entry.gameDifficulty");
      private static final wp d = wp.c("mco.backup.entry.name");
      private static final wp e = wp.c("mco.backup.entry.gameServerVersion");
      private static final wp f = wp.c("mco.backup.entry.uploaded");
      private static final wp g = wp.c("mco.backup.entry.enabledPack");
      private static final wp h = wp.c("mco.backup.entry.description");
      private static final wp i = wp.c("mco.backup.entry.gameMode");
      private static final wp j = wp.c("mco.backup.entry.seed");
      private static final wp k = wp.c("mco.backup.entry.worldType");
      private static final wp l = wp.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fir.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fir.this.p, fir.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private wp a(String $$0) {
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
      public wp a() {
         return wp.a("narrator.select", this.m + " " + this.n);
      }
   }
}
