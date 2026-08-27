import java.util.Locale;

public class fbg extends gty {
   private static final wx a = wx.c("mco.backup.info.title");
   private static final wx b = wx.c("mco.backup.unknown");
   private final flz c;
   final ezq B;
   final fjn C = new fjn(this);
   private fbg.a D;

   public fbg(flz $$0, ezq $$1) {
      super(a);
      this.c = $$0;
      this.B = $$1;
   }

   @Override
   public void aN_() {
      this.C.a(a, this.p);
      this.D = this.C.c(new fbg.a(this.m));
      this.C.b(fga.a(ww.k, $$0 -> this.d()).a());
      this.c();
      this.C.a($$1 -> {
         ffy var10000 = this.c($$1);
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

   wx a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (wx)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : wx.b($$1));
      }
   }

   private wx a(String $$0) {
      try {
         return fcd.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private wx b(String $$0) {
      try {
         return fcd.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fgw<fbg.b> {
      public a(feb $$0) {
         super($$0, fbg.this.n, fbg.this.C.d(), fbg.this.C.c(), 36);
         if (fbg.this.B.e != null) {
            fbg.this.B.e.forEach(($$0x, $$1) -> this.b(fbg.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fgw.a<fbg.b> {
      private static final wx b = wx.c("mco.backup.entry.templateName");
      private static final wx c = wx.c("mco.backup.entry.gameDifficulty");
      private static final wx d = wx.c("mco.backup.entry.name");
      private static final wx e = wx.c("mco.backup.entry.gameServerVersion");
      private static final wx f = wx.c("mco.backup.entry.uploaded");
      private static final wx g = wx.c("mco.backup.entry.enabledPack");
      private static final wx h = wx.c("mco.backup.entry.description");
      private static final wx i = wx.c("mco.backup.entry.gameMode");
      private static final wx j = wx.c("mco.backup.entry.seed");
      private static final wx k = wx.c("mco.backup.entry.worldType");
      private static final wx l = wx.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fbg.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fbg.this.p, fbg.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private wx a(String $$0) {
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
      public wx a() {
         return wx.a("narrator.select", this.m + " " + this.n);
      }
   }
}
