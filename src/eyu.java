import java.util.Locale;

public class eyu extends grl {
   private static final wg a = wg.c("mco.backup.info.title");
   private static final wg b = wg.c("mco.backup.unknown");
   private final fjo c;
   final exe y;
   final fhc z = new fhc(this);
   private eyu.a A;

   public eyu(fjo $$0, exe $$1) {
      super(a);
      this.c = $$0;
      this.y = $$1;
   }

   @Override
   public void aN_() {
      this.z.a(a, this.m);
      this.A = this.z.c(new eyu.a(this.j));
      this.z.b(fdp.a(wf.k, $$0 -> this.d()).a());
      this.c();
      this.z.a($$1 -> {
         fdn var10000 = this.c($$1);
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

   wg a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (wg)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : wg.b($$1));
      }
   }

   private wg a(String $$0) {
      try {
         return ezr.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private wg b(String $$0) {
      try {
         return ezr.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fel<eyu.b> {
      public a(fbp $$0) {
         super($$0, eyu.this.k, eyu.this.z.d(), eyu.this.z.c(), 36);
         if (eyu.this.y.e != null) {
            eyu.this.y.e.forEach(($$0x, $$1) -> this.b(eyu.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fel.a<eyu.b> {
      private static final wg b = wg.c("mco.backup.entry.templateName");
      private static final wg c = wg.c("mco.backup.entry.gameDifficulty");
      private static final wg d = wg.c("mco.backup.entry.name");
      private static final wg e = wg.c("mco.backup.entry.gameServerVersion");
      private static final wg f = wg.c("mco.backup.entry.uploaded");
      private static final wg g = wg.c("mco.backup.entry.enabledPack");
      private static final wg h = wg.c("mco.backup.entry.description");
      private static final wg i = wg.c("mco.backup.entry.gameMode");
      private static final wg j = wg.c("mco.backup.entry.seed");
      private static final wg k = wg.c("mco.backup.entry.worldType");
      private static final wg l = wg.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(eyu.this.m, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(eyu.this.m, eyu.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private wg a(String $$0) {
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
      public wg a() {
         return wg.a("narrator.select", this.m + " " + this.n);
      }
   }
}
