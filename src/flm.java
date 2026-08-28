import java.util.Locale;

public class flm extends hol {
   private static final ww a = ww.c("mco.backup.info.title");
   private static final ww b = ww.c("mco.backup.unknown");
   private final fxi c;
   final fjw C;
   final fve D = new fve(this);
   private flm.a E;

   public flm(fxi $$0, fjw $$1) {
      super(a);
      this.c = $$0;
      this.C = $$1;
   }

   @Override
   public void aN_() {
      this.D.a(a, this.p);
      this.E = this.D.c(new flm.a(this.m));
      this.D.b(frq.a(wv.k, $$0 -> this.aK_()).a());
      this.c();
      this.D.a($$1 -> {
         fro var10000 = this.c($$1);
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

   ww a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (ww)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : ww.b($$1));
      }
   }

   private ww a(String $$0) {
      try {
         return fmh.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private ww b(String $$0) {
      try {
         return fmh.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fsm<flm.b> {
      public a(final fof $$0) {
         super($$0, flm.this.n, flm.this.D.d(), flm.this.D.c(), 36);
         if (flm.this.C.e != null) {
            flm.this.C.e.forEach(($$0x, $$1) -> this.b(flm.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fsm.a<flm.b> {
      private static final ww b = ww.c("mco.backup.entry.templateName");
      private static final ww c = ww.c("mco.backup.entry.gameDifficulty");
      private static final ww d = ww.c("mco.backup.entry.name");
      private static final ww e = ww.c("mco.backup.entry.gameServerVersion");
      private static final ww f = ww.c("mco.backup.entry.uploaded");
      private static final ww g = ww.c("mco.backup.entry.enabledPack");
      private static final ww h = ww.c("mco.backup.entry.description");
      private static final ww i = ww.c("mco.backup.entry.gameMode");
      private static final ww j = ww.c("mco.backup.entry.seed");
      private static final ww k = ww.c("mco.backup.entry.worldType");
      private static final ww l = ww.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(flm.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(flm.this.p, flm.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private ww a(String $$0) {
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
      public ww a() {
         return ww.a("narrator.select", this.m + " " + this.n);
      }
   }
}
