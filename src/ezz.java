import java.util.Locale;

public class ezz extends gsq {
   private static final ws a = ws.c("mco.backup.info.title");
   private static final ws b = ws.c("mco.backup.unknown");
   private final fkt c;
   final eyj B;
   final fih C = new fih(this);
   private ezz.a D;

   public ezz(fkt $$0, eyj $$1) {
      super(a);
      this.c = $$0;
      this.B = $$1;
   }

   @Override
   public void aM_() {
      this.C.a(a, this.p);
      this.D = this.C.c(new ezz.a(this.m));
      this.C.b(feu.a(wr.k, $$0 -> this.d()).a());
      this.c();
      this.C.a($$1 -> {
         fes var10000 = this.c($$1);
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

   ws a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (ws)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : ws.b($$1));
      }
   }

   private ws a(String $$0) {
      try {
         return faw.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private ws b(String $$0) {
      try {
         return faw.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends ffq<ezz.b> {
      public a(fcu $$0) {
         super($$0, ezz.this.n, ezz.this.C.d(), ezz.this.C.c(), 36);
         if (ezz.this.B.e != null) {
            ezz.this.B.e.forEach(($$0x, $$1) -> this.b(ezz.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends ffq.a<ezz.b> {
      private static final ws b = ws.c("mco.backup.entry.templateName");
      private static final ws c = ws.c("mco.backup.entry.gameDifficulty");
      private static final ws d = ws.c("mco.backup.entry.name");
      private static final ws e = ws.c("mco.backup.entry.gameServerVersion");
      private static final ws f = ws.c("mco.backup.entry.uploaded");
      private static final ws g = ws.c("mco.backup.entry.enabledPack");
      private static final ws h = ws.c("mco.backup.entry.description");
      private static final ws i = ws.c("mco.backup.entry.gameMode");
      private static final ws j = ws.c("mco.backup.entry.seed");
      private static final ws k = ws.c("mco.backup.entry.worldType");
      private static final ws l = ws.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(ezz.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(ezz.this.p, ezz.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private ws a(String $$0) {
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
      public ws a() {
         return ws.a("narrator.select", this.m + " " + this.n);
      }
   }
}
