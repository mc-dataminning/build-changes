import java.util.Locale;

public class fhf extends hff {
   private static final xl a = xl.c("mco.backup.info.title");
   private static final xl b = xl.c("mco.backup.unknown");
   private final frp c;
   final ffq B;
   final fpl C = new fpl(this);
   private fhf.a D;

   public fhf(frp $$0, ffq $$1) {
      super(a);
      this.c = $$0;
      this.B = $$1;
   }

   @Override
   public void aS_() {
      this.C.a(a, this.p);
      this.D = this.C.c(new fhf.a(this.m));
      this.C.b(flw.a(xk.k, $$0 -> this.aP_()).a());
      this.c();
      this.C.a($$1 -> {
         flu var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.D.b(this.n, this.C.d());
      this.C.a();
   }

   @Override
   public void aP_() {
      this.m.a(this.c);
   }

   xl a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (xl)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : xl.b($$1));
      }
   }

   private xl a(String $$0) {
      try {
         return fia.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private xl b(String $$0) {
      try {
         return fia.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fms<fhf.b> {
      public a(final fjx $$0) {
         super($$0, fhf.this.n, fhf.this.C.d(), fhf.this.C.c(), 36);
         if (fhf.this.B.e != null) {
            fhf.this.B.e.forEach(($$0x, $$1) -> this.b(fhf.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fms.a<fhf.b> {
      private static final xl b = xl.c("mco.backup.entry.templateName");
      private static final xl c = xl.c("mco.backup.entry.gameDifficulty");
      private static final xl d = xl.c("mco.backup.entry.name");
      private static final xl e = xl.c("mco.backup.entry.gameServerVersion");
      private static final xl f = xl.c("mco.backup.entry.uploaded");
      private static final xl g = xl.c("mco.backup.entry.enabledPack");
      private static final xl h = xl.c("mco.backup.entry.description");
      private static final xl i = xl.c("mco.backup.entry.gameMode");
      private static final xl j = xl.c("mco.backup.entry.seed");
      private static final xl k = xl.c("mco.backup.entry.worldType");
      private static final xl l = xl.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fhf.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fhf.this.p, fhf.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private xl a(String $$0) {
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
      public xl a() {
         return xl.a("narrator.select", this.m + " " + this.n);
      }
   }
}
