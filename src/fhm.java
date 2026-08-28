import java.util.Locale;

public class fhm extends hfq {
   private static final xj a = xj.c("mco.backup.info.title");
   private static final xj b = xj.c("mco.backup.unknown");
   private final frw c;
   final ffx B;
   final fps C = new fps(this);
   private fhm.a D;

   public fhm(frw $$0, ffx $$1) {
      super(a);
      this.c = $$0;
      this.B = $$1;
   }

   @Override
   public void aR_() {
      this.C.a(a, this.p);
      this.D = this.C.c(new fhm.a(this.m));
      this.C.b(fmd.a(xi.k, $$0 -> this.aO_()).a());
      this.c();
      this.C.a($$1 -> {
         fmb var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.D.b(this.n, this.C.d());
      this.C.a();
   }

   @Override
   public void aO_() {
      this.m.a(this.c);
   }

   xj a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (xj)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : xj.b($$1));
      }
   }

   private xj a(String $$0) {
      try {
         return fih.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private xj b(String $$0) {
      try {
         return fih.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fmz<fhm.b> {
      public a(final fke $$0) {
         super($$0, fhm.this.n, fhm.this.C.d(), fhm.this.C.c(), 36);
         if (fhm.this.B.e != null) {
            fhm.this.B.e.forEach(($$0x, $$1) -> this.b(fhm.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fmz.a<fhm.b> {
      private static final xj b = xj.c("mco.backup.entry.templateName");
      private static final xj c = xj.c("mco.backup.entry.gameDifficulty");
      private static final xj d = xj.c("mco.backup.entry.name");
      private static final xj e = xj.c("mco.backup.entry.gameServerVersion");
      private static final xj f = xj.c("mco.backup.entry.uploaded");
      private static final xj g = xj.c("mco.backup.entry.enabledPack");
      private static final xj h = xj.c("mco.backup.entry.description");
      private static final xj i = xj.c("mco.backup.entry.gameMode");
      private static final xj j = xj.c("mco.backup.entry.seed");
      private static final xj k = xj.c("mco.backup.entry.worldType");
      private static final xj l = xj.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fhm.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fhm.this.p, fhm.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private xj a(String $$0) {
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
      public xj a() {
         return xj.a("narrator.select", this.m + " " + this.n);
      }
   }
}
