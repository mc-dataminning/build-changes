import java.util.Locale;

public class fcm extends gvi {
   private static final xp a = xp.c("mco.backup.info.title");
   private static final xp b = xp.c("mco.backup.unknown");
   private final fnf c;
   final faw B;
   final fkt C = new fkt(this);
   private fcm.a D;

   public fcm(fnf $$0, faw $$1) {
      super(a);
      this.c = $$0;
      this.B = $$1;
   }

   @Override
   public void aM_() {
      this.C.a(a, this.p);
      this.D = this.C.c(new fcm.a(this.m));
      this.C.b(fhg.a(xo.k, $$0 -> this.d()).a());
      this.c();
      this.C.a($$1 -> {
         fhe var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.D.b(this.n, this.C.d());
      this.C.a();
   }

   @Override
   public void d() {
      this.m.a(this.c);
   }

   xp a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (xp)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : xp.b($$1));
      }
   }

   private xp a(String $$0) {
      try {
         return fdj.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private xp b(String $$0) {
      try {
         return fdj.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fic<fcm.b> {
      public a(final ffh $$0) {
         super($$0, fcm.this.n, fcm.this.C.d(), fcm.this.C.c(), 36);
         if (fcm.this.B.e != null) {
            fcm.this.B.e.forEach(($$0x, $$1) -> this.b(fcm.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fic.a<fcm.b> {
      private static final xp b = xp.c("mco.backup.entry.templateName");
      private static final xp c = xp.c("mco.backup.entry.gameDifficulty");
      private static final xp d = xp.c("mco.backup.entry.name");
      private static final xp e = xp.c("mco.backup.entry.gameServerVersion");
      private static final xp f = xp.c("mco.backup.entry.uploaded");
      private static final xp g = xp.c("mco.backup.entry.enabledPack");
      private static final xp h = xp.c("mco.backup.entry.description");
      private static final xp i = xp.c("mco.backup.entry.gameMode");
      private static final xp j = xp.c("mco.backup.entry.seed");
      private static final xp k = xp.c("mco.backup.entry.worldType");
      private static final xp l = xp.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fcm.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fcm.this.p, fcm.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private xp a(String $$0) {
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
      public xp a() {
         return xp.a("narrator.select", this.m + " " + this.n);
      }
   }
}
