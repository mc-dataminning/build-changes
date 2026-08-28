import java.util.Locale;

public class fol extends hro {
   private static final xc a = xc.c("mco.backup.info.title");
   private static final xc b = xc.c("mco.backup.unknown");
   private final gaf c;
   final fmv C;
   final fyb D = new fyb(this);
   private fol.a E;

   public fol(gaf $$0, fmv $$1) {
      super(a);
      this.c = $$0;
      this.C = $$1;
   }

   @Override
   public void aS_() {
      this.D.a(a, this.p);
      this.E = this.D.c(new fol.a(this.m));
      this.D.b(fun.a(xb.k, $$0 -> this.aP_()).a());
      this.c();
      this.D.a($$1 -> {
         ful var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.E.b(this.n, this.D.d());
      this.D.a();
   }

   @Override
   public void aP_() {
      this.m.a(this.c);
   }

   xc a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (xc)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : xc.b($$1));
      }
   }

   private xc a(String $$0) {
      try {
         return fph.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private xc b(String $$0) {
      try {
         return fph.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fvj<fol.b> {
      public a(final frf $$0) {
         super($$0, fol.this.n, fol.this.D.d(), fol.this.D.c(), 36);
         if (fol.this.C.e != null) {
            fol.this.C.e.forEach(($$0x, $$1) -> this.b(fol.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fvj.a<fol.b> {
      private static final xc b = xc.c("mco.backup.entry.templateName");
      private static final xc c = xc.c("mco.backup.entry.gameDifficulty");
      private static final xc d = xc.c("mco.backup.entry.name");
      private static final xc e = xc.c("mco.backup.entry.gameServerVersion");
      private static final xc f = xc.c("mco.backup.entry.uploaded");
      private static final xc g = xc.c("mco.backup.entry.enabledPack");
      private static final xc h = xc.c("mco.backup.entry.description");
      private static final xc i = xc.c("mco.backup.entry.gameMode");
      private static final xc j = xc.c("mco.backup.entry.seed");
      private static final xc k = xc.c("mco.backup.entry.worldType");
      private static final xc l = xc.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fol.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fol.this.p, fol.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private xc a(String $$0) {
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
      public xc a() {
         return xc.a("narrator.select", this.m + " " + this.n);
      }
   }
}
