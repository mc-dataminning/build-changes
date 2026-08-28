import java.util.Locale;

public class fge extends hee {
   private static final xh a = xh.c("mco.backup.info.title");
   private static final xh b = xh.c("mco.backup.unknown");
   private final fqs c;
   final fep B;
   final fon C = new fon(this);
   private fge.a D;

   public fge(fqs $$0, fep $$1) {
      super(a);
      this.c = $$0;
      this.B = $$1;
   }

   @Override
   public void aS_() {
      this.C.a(a, this.p);
      this.D = this.C.c(new fge.a(this.m));
      this.C.b(fkz.a(xg.k, $$0 -> this.d()).a());
      this.c();
      this.C.a($$1 -> {
         fkx var10000 = this.c($$1);
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

   xh a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (xh)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : xh.b($$1));
      }
   }

   private xh a(String $$0) {
      try {
         return fha.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private xh b(String $$0) {
      try {
         return fha.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends flv<fge.b> {
      public a(final fja $$0) {
         super($$0, fge.this.n, fge.this.C.d(), fge.this.C.c(), 36);
         if (fge.this.B.e != null) {
            fge.this.B.e.forEach(($$0x, $$1) -> this.b(fge.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends flv.a<fge.b> {
      private static final xh b = xh.c("mco.backup.entry.templateName");
      private static final xh c = xh.c("mco.backup.entry.gameDifficulty");
      private static final xh d = xh.c("mco.backup.entry.name");
      private static final xh e = xh.c("mco.backup.entry.gameServerVersion");
      private static final xh f = xh.c("mco.backup.entry.uploaded");
      private static final xh g = xh.c("mco.backup.entry.enabledPack");
      private static final xh h = xh.c("mco.backup.entry.description");
      private static final xh i = xh.c("mco.backup.entry.gameMode");
      private static final xh j = xh.c("mco.backup.entry.seed");
      private static final xh k = xh.c("mco.backup.entry.worldType");
      private static final xh l = xh.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fge.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fge.this.p, fge.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private xh a(String $$0) {
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
      public xh a() {
         return xh.a("narrator.select", this.m + " " + this.n);
      }
   }
}
