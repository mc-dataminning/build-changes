import java.util.Locale;

public class fcj extends gvf {
   private static final xo a = xo.c("mco.backup.info.title");
   private static final xo b = xo.c("mco.backup.unknown");
   private final fnc c;
   final fat B;
   final fkq C = new fkq(this);
   private fcj.a D;

   public fcj(fnc $$0, fat $$1) {
      super(a);
      this.c = $$0;
      this.B = $$1;
   }

   @Override
   public void aM_() {
      this.C.a(a, this.p);
      this.D = this.C.c(new fcj.a(this.m));
      this.C.b(fhd.a(xn.k, $$0 -> this.d()).a());
      this.c();
      this.C.a($$1 -> {
         fhb var10000 = this.c($$1);
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

   xo a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (xo)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : xo.b($$1));
      }
   }

   private xo a(String $$0) {
      try {
         return fdg.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private xo b(String $$0) {
      try {
         return fdg.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fhz<fcj.b> {
      public a(final ffe $$0) {
         super($$0, fcj.this.n, fcj.this.C.d(), fcj.this.C.c(), 36);
         if (fcj.this.B.e != null) {
            fcj.this.B.e.forEach(($$0x, $$1) -> this.b(fcj.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fhz.a<fcj.b> {
      private static final xo b = xo.c("mco.backup.entry.templateName");
      private static final xo c = xo.c("mco.backup.entry.gameDifficulty");
      private static final xo d = xo.c("mco.backup.entry.name");
      private static final xo e = xo.c("mco.backup.entry.gameServerVersion");
      private static final xo f = xo.c("mco.backup.entry.uploaded");
      private static final xo g = xo.c("mco.backup.entry.enabledPack");
      private static final xo h = xo.c("mco.backup.entry.description");
      private static final xo i = xo.c("mco.backup.entry.gameMode");
      private static final xo j = xo.c("mco.backup.entry.seed");
      private static final xo k = xo.c("mco.backup.entry.worldType");
      private static final xo l = xo.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fcj.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fcj.this.p, fcj.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private xo a(String $$0) {
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
      public xo a() {
         return xo.a("narrator.select", this.m + " " + this.n);
      }
   }
}
