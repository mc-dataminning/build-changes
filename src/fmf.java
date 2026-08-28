import java.util.Locale;

public class fmf extends hpj {
   private static final wy a = wy.c("mco.backup.info.title");
   private static final wy b = wy.c("mco.backup.unknown");
   private final fyb c;
   final fkp C;
   final fvx D = new fvx(this);
   private fmf.a E;

   public fmf(fyb $$0, fkp $$1) {
      super(a);
      this.c = $$0;
      this.C = $$1;
   }

   @Override
   public void aO_() {
      this.D.a(a, this.p);
      this.E = this.D.c(new fmf.a(this.m));
      this.D.b(fsj.a(wx.k, $$0 -> this.aL_()).a());
      this.c();
      this.D.a($$1 -> {
         fsh var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.E.b(this.n, this.D.d());
      this.D.a();
   }

   @Override
   public void aL_() {
      this.m.a(this.c);
   }

   wy a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (wy)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : wy.b($$1));
      }
   }

   private wy a(String $$0) {
      try {
         return fna.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private wy b(String $$0) {
      try {
         return fna.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends ftf<fmf.b> {
      public a(final foz $$0) {
         super($$0, fmf.this.n, fmf.this.D.d(), fmf.this.D.c(), 36);
         if (fmf.this.C.e != null) {
            fmf.this.C.e.forEach(($$0x, $$1) -> this.b(fmf.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends ftf.a<fmf.b> {
      private static final wy b = wy.c("mco.backup.entry.templateName");
      private static final wy c = wy.c("mco.backup.entry.gameDifficulty");
      private static final wy d = wy.c("mco.backup.entry.name");
      private static final wy e = wy.c("mco.backup.entry.gameServerVersion");
      private static final wy f = wy.c("mco.backup.entry.uploaded");
      private static final wy g = wy.c("mco.backup.entry.enabledPack");
      private static final wy h = wy.c("mco.backup.entry.description");
      private static final wy i = wy.c("mco.backup.entry.gameMode");
      private static final wy j = wy.c("mco.backup.entry.seed");
      private static final wy k = wy.c("mco.backup.entry.worldType");
      private static final wy l = wy.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(frv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fmf.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fmf.this.p, fmf.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private wy a(String $$0) {
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
      public wy a() {
         return wy.a("narrator.select", this.m + " " + this.n);
      }
   }
}
