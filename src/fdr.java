import java.util.Locale;

public class fdr extends gwo {
   private static final wz a = wz.c("mco.backup.info.title");
   private static final wz b = wz.c("mco.backup.unknown");
   private final fob c;
   final fcc B;
   final flx C = new flx(this);
   private fdr.a D;

   public fdr(fob $$0, fcc $$1) {
      super(a);
      this.c = $$0;
      this.B = $$1;
   }

   @Override
   public void aT_() {
      this.C.a(a, this.o);
      this.D = this.C.c(new fdr.a(this.l));
      this.C.b(fik.a(wy.k, $$0 -> this.d()).a());
      this.c();
      this.C.a($$1 -> {
         fii var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.D.b(this.m, this.C.d());
      this.C.a();
   }

   @Override
   public void d() {
      this.l.a(this.c);
   }

   wz a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (wz)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : wz.b($$1));
      }
   }

   private wz a(String $$0) {
      try {
         return fen.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private wz b(String $$0) {
      try {
         return fen.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fjg<fdr.b> {
      public a(final fgm $$0) {
         super($$0, fdr.this.m, fdr.this.C.d(), fdr.this.C.c(), 36);
         if (fdr.this.B.e != null) {
            fdr.this.B.e.forEach(($$0x, $$1) -> this.b(fdr.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fjg.a<fdr.b> {
      private static final wz b = wz.c("mco.backup.entry.templateName");
      private static final wz c = wz.c("mco.backup.entry.gameDifficulty");
      private static final wz d = wz.c("mco.backup.entry.name");
      private static final wz e = wz.c("mco.backup.entry.gameServerVersion");
      private static final wz f = wz.c("mco.backup.entry.uploaded");
      private static final wz g = wz.c("mco.backup.entry.enabledPack");
      private static final wz h = wz.c("mco.backup.entry.description");
      private static final wz i = wz.c("mco.backup.entry.gameMode");
      private static final wz j = wz.c("mco.backup.entry.seed");
      private static final wz k = wz.c("mco.backup.entry.worldType");
      private static final wz l = wz.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fdr.this.o, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fdr.this.o, fdr.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private wz a(String $$0) {
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
      public wz a() {
         return wz.a("narrator.select", this.m + " " + this.n);
      }
   }
}
